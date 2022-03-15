package PatProject;

import java.time.LocalDate;
import java.util.Objects;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;
    private String emale;
    private LocalDate bod;
    private String country;

    public Person(String firstName, String lastName, String gender, String emale, LocalDate bod, String country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.emale = emale;
        this.bod = bod;
        this.country = country;
    }

    public Person() {
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmale() {
        return emale;
    }

    public void setEmale(String emale) {
        this.emale = emale;
    }

    public LocalDate getBod() {
        return bod;
    }

    public void setBod(LocalDate bod) {
        this.bod = bod;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && Objects.equals(gender, person.gender) && Objects.equals(emale, person.emale) && Objects.equals(bod, person.bod) && Objects.equals(country, person.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, gender, emale, bod, country);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", emale='" + emale + '\'' +
                ", bod=" + bod +
                ", country='" + country + '\'' +
                '}';
    }
}
