package lesson4;

public class Main2 {
    public static void main(String[] args) {
        String text = "Hello";//неизменяемый объект
                text = text + "!!!";//создан другой объект
        System.out.println(text);
    }
}
