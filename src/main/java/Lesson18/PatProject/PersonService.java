package PatProject;

import org.json.JSONObject;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.ZonedDateTime;

//отправляем http запрос
public class PersonService {
    public Person sendRequestToRandomUserApi() throws IOException, InterruptedException {
        HttpClient httpClient = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("https://randomuser.me/api"))
                .build();

        //httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        Person person = parseJsonResponseToPerson(response.body());
        return person;
    }

    //парсим
    public Person parseJsonResponseToPerson(String data) {
        JSONObject fullJsonObject = new JSONObject(data)
                .getJSONArray("results")
                .getJSONObject(0);
        Person person = new Person();
        JSONObject dob = fullJsonObject.getJSONObject("dob");
        ZonedDateTime zonedDateTime = ZonedDateTime.parse(dob.getString("data"));
        JSONObject name = fullJsonObject.getJSONObject("name");
        JSONObject location = fullJsonObject.getJSONObject("location");


        person.setFirstName(name.getString("first"));
        person.setLastName(name.getString("last"));
        person.setGender(fullJsonObject.getString("gender"));
        person.setBod(zonedDateTime.toLocalDate());
        person.setCountry(location.getString("country"));
        return person;
    }
}
