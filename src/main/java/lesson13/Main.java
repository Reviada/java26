package lesson13;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
       //а давайте попробуем -try
        try {
            person.setAge(170);
            System.out.println("kjh");
        } catch (Exception e) {//перехватываем тип, не переименовываем, стобы проверить больше Exception
            e.printStackTrace();
        }
        System.out.println("Все хорошо");
    }
    //checked от unchecked , про FINALY- всегда ли отработает блок?(когда не отработает блок finaly java) на собеседовании
}
