package lesson8;

public class Animal {//по умол Exstends Object -методы все есть
    private int age;// возраст животного
    private String poroda;//порода животного

    public Animal() {
    }

    public Animal(int age, String poroda) {
        this.age = age;
        this.poroda = poroda;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }
//перепреоделяем метод equals для правильного сравнения
    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;

        Animal animal = (Animal) o;

        if (age != animal.age)
            return false;
        return poroda != null ? poroda.equals(animal.poroda) : animal.poroda == null;
    }

    @Override
    //hashCode - возвращает какое-то число
    public int hashCode() {
        int result = age;
        result = 31 * result + (poroda != null ? poroda.hashCode() : 0);
        return result;
    }
//метод String  переопределяем

    @Override
    public String toString() {
        return "Животное {" +
                "возраст=" + age +
                ", порода ='" + poroda + '\'' +
                '}';
    }

    public void voice(){
        System.out.println("Животное кричит");
    }
}
