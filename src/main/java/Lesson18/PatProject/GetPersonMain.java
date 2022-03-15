package PatProject;

public class GetPersonMain {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        try {
            Person person = personService.sendRequestToRandomUserApi();
            System.out.println(person);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
