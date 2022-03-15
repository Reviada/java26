package lesson7;

public class Person1 {
    //1- поля класса
    private int age;
    private String name;
    private String surname;
    //2- конструкторы (не более 12 можно сделать)

    public Person1() {

    }

    public Person1(int age, String surname, String name) {
        this.age = age;
        this.surname = surname;
        this.name = name;
    }

    public Person1(String surname, String name) {
        this.surname = surname;
        this.name = name;
    }
        //3 - методы
//Создаем автоматически сеттеры Generate-> Setter(все выбрать)
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getAge(){//создан вручную
        return  this.age;
    }

    public String getName() {//создан автоматически Generate-> Getter(все выбрать)
        return name;
    }

    public String getSurname() {//создан автоматически
        return surname;
    }
}
