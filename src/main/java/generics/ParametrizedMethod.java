package generics;

public class ParametrizedMethod {
    public static void main(String[] args) {
        Method method = new Method();
        Double print = method.print(43.6);


    }
}

class Method {//печатает и возвращает тип

    public <T> T print(T t) {
        System.out.println(t);
        return t;
    }
}