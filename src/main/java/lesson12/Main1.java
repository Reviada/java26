package lesson12;

import java.util.HashSet;

//HashSet -> интерфейс Collection ->Set
//дубляж не сохраняется, порядок не соблюдается
public class Main1 {
    public static void main(String[] args) {
        HashSet<String> strings = new HashSet<>();
        //используется для поиска уникальных данных
        //Hash - хранятся как хэш коллекция(по механизму хэширования), узнать есть ли какая-то такая же
        strings.add("qqq");
        strings.add("ttt");
        strings.add("rrr");
        strings.add("ttt");
        strings.add("nnn");
        System.out.println(strings);
    }
}
