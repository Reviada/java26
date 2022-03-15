package lesson7.restaurant;

public class Main {
    public static void main(String[] args) {
        Dish dish1 = new Dish();
        dish1.setName("Спагетти с сыром");
        dish1.setIngredients("спагетти, сыр, овощи");
        dish1.setPrice(550);
//dish1.setFoto();
        dish1.setWeight(250);

        Dish dish2 = new Dish();
        dish2.setName("Суп Том Ям");
        dish2.setIngredients("курица,молоко кокосовое, креветки, шампиьоны");
        dish2.setPrice(750);
//dish2.setFoto();
        dish2.setWeight(400);

        Menu menu = new Menu();
        menu.addDish(dish1);
        menu.addDish(dish2);
        System.out.println(dish1);
    }
}
