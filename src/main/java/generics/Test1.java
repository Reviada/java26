package generics;

import java.util.ArrayList;

//у дженериков есть стирание версий
public class Test1 {
    // 2.вариант   public void test(ArrayList<String> t) {
    //String a = t.get(0);
//        System.out.println(t);
//    }

    public void test(ArrayList<Integer> arrayList) {
        System.out.println(arrayList);
    }
}