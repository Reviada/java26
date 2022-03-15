package lesson4;

public class Main5 {
    public static void main(String[] args) {
        String email = "ivanov_ivangmail.com";

        if (!email.contains("@")) {
            System.out.println("Нет собачки в эл.адресе!!!");

            // if (email.indexOf("@") == -1) {
            //indexOff отдает какое-то значение
            System.out.println(email + "Нет собачки в эл.адресе");
        } else {
            System.out.println("Собачка есть");
        }
//        if (!email.contains("@")){
//            System.out.println("Нет собачки в эл.адресе!!!");

    }
}

