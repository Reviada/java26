package lesson13;

public class Person {
    private int age;
    private String name;
//гененируем конструкторы, методы get  и  set
    public Person() {
    }

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws UncurrentAgeException {//на лампочку и добавить сообщение
        //генерируем exceptions
        if (age < 0 || age > 150) {
            throw new UncurrentAgeException("age < 0 || age > 150");
            //throw - выбросить причину ошибки
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
