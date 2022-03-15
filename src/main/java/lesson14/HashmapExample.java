package lesson14;

import java.util.HashMap;
import java.util.Map;

public class HashmapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
//ключ - паспортные данные, стринг-это значение
        map.put(433,"Petr Petrov");
                //put- значение
//map - хранит ключи только разные
       // map.put(null,"Ivan Ivanov");//null будет лежать в нулевой корзине
        //map.put(null,null);
        map.put(null,"Ivan Ivanov");//null будет лежать в нулевой корзине
        //первое значение затирается с одинаковым ключем
        System.out.println(map);
    }
}
