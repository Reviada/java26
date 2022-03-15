package lesson7.restaurant;

//dish - блюдо
public class Dish {
    private String name;//название блюда
    private String ingredients;//ингредиенты
    private double weight;//вес
    private double price;//цена
    private String foto;//фото

    //создан конструктор
    public Dish() {
    }

    public Dish(String name, String ingredients, double weight, double price, String foto) {
        this.name = name;
        this.ingredients = ingredients;
        this.weight = weight;
        this.price = price;
        this.foto = foto;
    }

    //созданы геттеры и сеттеры
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIngredients() {
        return ingredients;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

  //  public void addMenu(Dish dish1) {
    }

