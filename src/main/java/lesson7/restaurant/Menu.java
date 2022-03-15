package lesson7.restaurant;

//Создать класс Меню, в котором реализовать возможность добавления Блюд в Меню (по примеру как на занятии мы добавляли Отзывы к Товару)
public class Menu {
    private Dish[] menus = new Dish[1000]; //максимальное кол-во блюд

    public Dish[] getMenus() {
        return menus;
    }

    public void setMenus(Dish[] menus) {
        this.menus = menus;
    }

    public void addDish(Dish dish1) {
        for (int i = 0; i < menus.length; i++) {
            //если ячейка занята, чтобы не затирать ячейку, пишем проверку
            if (menus[i] == null) {
                menus[i] = dish1;
                break;
            }
        }
    }
}



