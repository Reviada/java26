package lesson7;

public class Person {
    //1- поля класса
    private int age;
    private String name;
    private String surname;

    // 2 - конструкторы (особый метод, который вызывается в момент создания объета, после слова NEW)
    // создание конструктора: модификатор доступа / вход наш Person (fn F4- провалится в этот метод)
    //записываются конструкторы от меньшего к большему по кол-ву параметров (елочкой)

    public Person() {

    }

    public Person(String surname, String name) {
        this.surname =  surname;
        this.name = name;
    }
    public Person(int age,String surname,String name){
        this.age = age;
        this.surname= surname;
        this.name =name;

    }
// генерация сеттеров (устанавливают назначения полей)
    //геттеры- достают
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge(){
       // в теле геттера () ничего нет, потому что это вопрос
        return this.age;
    }

    public String getName() {
        return name;
        //автоматически прописывает, если не видно значит конфликтов нет, если будет, то пропишет this
    }

    public String getSurname() {
        return surname;
    }
    // - методы

}

