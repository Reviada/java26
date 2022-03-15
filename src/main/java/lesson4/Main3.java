package lesson4;

public class Main3 {
    public static void main(String[] args) {
        String password = "Dhfk52kj4kh";
        //когда обращение к типу String (общие методы)
        int countChars = password.length();
        //обращение к названию
        if (countChars < 8) {
            System.out.println("Символов меньше 8 !!!");
            return;//останавливаем
        }
        String alfabetUpper = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
        //алфавит с большой букквы .toUpperCase()
        int countUpperLetters = 0;
        for (int i = 0; i < password.length(); i++) {
            char currentCharFromPassword = password.charAt(i);
            //проверяем символ (char) текущий символ из пароля берем = пароль.номер позиции т.к. ссылочный тип
            if (alfabetUpper.contains(currentCharFromPassword + " ")) {
                //contains -а содержался ли? " "-преобразовали в String (иначе красным)
                countUpperLetters++;
            }
        }
        if (countUpperLetters != 0) {
            System.out.println("Пароль не содержит заглавную букву!!!" );
            //НЕ РАБОТАЕТ
            return;
        }
    }
}




