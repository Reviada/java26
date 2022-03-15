package lesson7.dns;

import java.util.Date;

public class Otziv {
    private Date dateOfPubl;//дата публикации метод Date
    private int rate;//рейтинг
    private String mainText;//тест отзыва
    private String userName;//имя пользователя

    //пустой конструктор
    public Otziv() {
    }

    //конструктор с параметрами
    public Otziv(int rate, String mainText, String userName) {
        this.dateOfPubl = new Date();//текущая дата
        this.rate = rate;
        this.mainText = mainText;
        this.userName = userName;
    }
//генерируем неттеры и сеттеры со всеми параметрами

    public Date getDateOfPubl() {
        return dateOfPubl;
    }

    public void setDateOfPubl(Date dateOfPubl) {
        this.dateOfPubl = dateOfPubl;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public String getMainText() {
        return mainText;
    }

    public void setMainText(String mainText) {
        this.mainText = mainText;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}