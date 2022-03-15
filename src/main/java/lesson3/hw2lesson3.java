package lesson3;
//вывести все гласные буквы в массиве
public class hw2lesson3 {
    public static void main(String[] args) {
        char[] symbol = {'ф', 'а', 'и', 'в', 'е', 'ц', 'у',};
        char[] vowels = {'а', 'у', 'и', 'е', 'ё', 'ю', 'я', 'ы', 'о', 'э',};
        for (int i = 0; i < symbol.length; i++) {
            for (int j = 0; j < vowels.length; j++)
                if (symbol[i] == vowels[j]) {

                    System.out.print(symbol[i] + " ");
                }
        }
    }
}