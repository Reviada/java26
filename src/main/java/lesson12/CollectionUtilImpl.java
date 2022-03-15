package lesson12;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class CollectionUtilImpl implements CollectionUtils {
    @Override
    //Объединение двух коллекций с дубликатами+
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        //добавляем всех из коллекции а
        result.addAll(a);
        result.addAll(b);
        return result;
    }

    @Override
    //Объединение двух коллекций без дубликатов+
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>();
        result.addAll(a);
        result.addAll(b);

        return result;
    }

    @Override
    //Пересечение двух коллекций с дубликатами+

    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>();
        result.addAll(a);
        result.addAll(b);
        result.retainAll(a);
        result.retainAll(b);
        return result;
    }
// второй вариант
//      for(int num: a){
//        if(b.contain(num)){
//          result.add(num)
//   }
// }
//       for(int num: b){
//         if(a.contain(num)){
//           result.add(num)
//  }
// }



    @Override
    // //Пересечение двух коллекций без дубликатов(пересечение-те элементы, которые одновременно в А и В) +
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        HashSet<Integer> result = new HashSet<>(a);
        result.addAll(a);
        result.addAll(b);
        result.retainAll(a);
        result.retainAll(b);

        return result;

    }

    @Override
    //Разность двух коллекций+
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        LinkedList<Integer> result = new LinkedList<>(a);
        HashSet<Integer> result2 = new HashSet<>(a);
        result2.retainAll(b);
        result.addAll(b);
        result.removeAll(result2);
        return result;
    }
}

