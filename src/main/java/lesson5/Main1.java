package lesson5;

// проверяем 1 или много собачек в мейле
public class Main1 {
    public static void main(String[] args) {
        String email = "skdjfh@hkjhkkj.codf";
        String[] splitByDog = email.split("@");
        if (splitByDog.length == 1) {
            System.out.println("Не имеет собачек");
            return;
        }
        if (splitByDog.length > 2) {
            System.out.println("Эмейл содержит больше , чем 1 собачку");
            return;
        }
        if (email.startsWith(".") ||
                //там где начинается точка
              email.endsWith(".") ||
                //там где кончается
                splitByDog[0].endsWith(".") ||
                splitByDog[1].startsWith(".")){
            System.out.println("В эмейле точка не в нужном месте");
            return;
    }
}
}