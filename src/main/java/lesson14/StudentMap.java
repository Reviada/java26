package lesson14;

import java.util.Map;
import java.util.TreeMap;

public class StudentMap {
    public static void main(String[] args) {

        Student student = new Student("Ivan", "Ivanov", 24);
        Student student1 = new Student("Vasy", "Pupkin", 34);
        Student student2 = new Student("Gamer", "Simpson", 45);
        Student student5 = new Student("Ivan", "Ivanov", 24);
        //1.// Map<Student, Integer> studentMap = new HashMap<>();
        //Map<Integer, Student> studentMap = new TreeMap<>();
        //2 делаем анонимный класс и сортируем по возрасту
//        Map<Student, Integer> studentMap = new TreeMap<>(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });
        //3 с помощью лямбда выражения сортируем по возрасту
        Map<Student, Integer> studentMap = new TreeMap<>((o1, o2) -> o1.getAge() - o2.getAge());
       //Map<Student, Integer> studentMap = new TreeMap<>((o1, o2) -> {o1.getAge() - o2.getAge()}; .....{  по имени });

//        studentMap.put(2,student);
//        studentMap.put(1,student);
//        studentMap.put(5,student);
//        studentMap.put(7,student);
        studentMap.put(student, 4);
        studentMap.put(student1, 5);
        studentMap.put(student2, 3);
//1        studentMap.putIfAbsent(student5, 3);//сравнивает, если есть уже такой ученик, то не затирает
        // studentMap.remove(student1);//удалить студента
        //studentMap.put(student5, 3); перезатрет оценку с 4 на 3
        //System.out.println(studentMap.hashCode());
//        System.out.println(studentMap.keySet());//остает множество ключей
//        System.out.println(studentMap.containsValue(3));//проверяет если ли такое студент по ключу или по значению
        System.out.println(studentMap);
        //System.out.println(studentMap.get(student));//возвращает значение по ключу

//        for (Map.Entry<Student,Integer> st: studentMap.entrySet()){ // чтобы пройтись по HashMap
//            System.out.println("Key = " +st.getKey() + "value = " + st.getValue());

    }

}

