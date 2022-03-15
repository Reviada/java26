package lesson13;

public class StringUtilsImpl implements StringUtils {
    @Override
    //Возвращает результат деления number1 на number2
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("number1 == null || number2 == null");
        }
        double num1;
        double num2;
        try {
            //преобразовываем String в double
            num1 = Double.parseDouble(number1);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number1 - не число!");
        }

        try {
            //преобразовываем String в double
            num2 = Double.parseDouble(number2);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("number2 - не число!");
        }

        if (num2 == 0.00) {
            throw new ArithmeticException("number2- это 0!Нельзя делить на 0");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        return new int[0];
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        return new double[0];
    }
}
