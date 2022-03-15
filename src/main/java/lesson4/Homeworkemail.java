package lesson4;

public class Homeworkemail {
    public static void main(String[] args) {
        String email = "ivanov_ivangmailcom";

        if (!email.contains("@")) {
            System.out.println("1)ERROR! Нет собачки в эл.адресе");
//        } else {
//            System.out.println("Собачка есть");
//        }
            if (!email.contains(".")) {
                System.out.println("2)ERROR! адрес не содержит '.'");
            }
        }
    }
}

