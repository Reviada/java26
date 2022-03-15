package Lesson10;

public class Matrix implements IMatrix {
    //определяем поля класса (информация об объекте)
    //чтобы узнать в чем объявлять (double или int), промотаем дальше и посмотрим  например вот этот(public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException)-вернуть значение double
    private double[][] numbers;

    public Matrix(int rows, int cols) {//строчки и колонки(столбцы)
        //создаем на переменную numbers двумерный массив
        numbers = new double[rows][cols];
    }

    //пишем конструктор ,который вызывает двумерный массив
    public Matrix(double[][] numbers) {
        this.numbers = numbers;
    }

    //Возвращает количество столбцов матрицы(нужны данные для двумерного массива)
    //	 * @return количество столбцов матрицы
    @Override
    public int getRows() {
        return numbers.length;
    }

    @Override
    //вернуть кол-во колонок(столбцов) (numbers[0] - ссылка на 0 строку)
    public int getColumns() {
        return this.numbers[0].length;
    }

    @Override

    public double getValueAt(int rowIndex, int colIndex) throws IndexOutOfBoundsException {
        if (this.getRows() <= rowIndex) {
            System.out.println("У нас нет такого кол-ва строк");
            return -1;//надо хоть что-то вернуть, поэтому ставим -1
        }
        //если выбросится Exception, то строчки "return -1;" не будет уже
        if (this.getColumns() <= colIndex) {
            System.out.println("У нас нет такого кол-ва колонок");
            return -1;
        }
        return this.numbers[rowIndex][colIndex];

    }

    @Override
    public void setValueAt(int rowIndex, int colIndex, double value) throws IndexOutOfBoundsException {
        if (this.getRows() <= rowIndex) {
            System.out.println("У нас нет такого количества строк");
            return;
        }
        if (this.getColumns() <= colIndex) {
            System.out.println("У нас нет такого количества колонок");
            return;
        }
        this.numbers[rowIndex][colIndex] = value;

    }

    @Override
    //метод сложения
    public IMatrix add(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //this - matrix1
        //otherMatrix - matrix2
        //Сделать проверку можно ли складывать матрицы(они д.б.одинаковые)
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы складывать нельзя! Кол-во строк не совпадает");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы складывать нельзя! Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) + otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    public IMatrix sub(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //this - matrix1
        //otherMatrix - matrix2
        //Сделать проверку можно ли вычитать матрицы(они д.б.одинаковые)
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы вычитать нельзя! Кол-во строк не совпадает");
            return null;
        }
        if (otherMatrix == null) {
            System.out.println("Матрицы вычитать нельзя! Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, this.getValueAt(i, j) - otherMatrix.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    //произведение матриц (умножение)
    public IMatrix mul(IMatrix otherMatrix) throws IllegalArgumentException, NullPointerException {
        //this - matrix1
        //otherMatrix - matrix2
        //Сделать проверку можно ли находить произведение матриц(они д.б.одинаковые)
        if (this.getRows() != otherMatrix.getRows()) {
            System.out.println("Матрицы умножать нельзя! Кол-во строк не совпадает");
            return null;
        }
        if (this.getColumns() != otherMatrix.getColumns()) {
            System.out.println("Матрицы умножать нельзя! Кол-во колонок не совпадает");
            return null;
        }

        Matrix result = new Matrix(this.getRows(), otherMatrix.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                for (int k = 0; k < otherMatrix.getColumns(); k++) {
                    result.setValueAt(i, j, this.getValueAt(i, k) * otherMatrix.getValueAt(j, k));
                }
            }
        }
        return result;
    }

    @Override
    //Возвращает произведение текущей матрицы на число 2(например) Умножение на число
    public IMatrix mul(double value) {

        Matrix valueNum = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                valueNum.setValueAt(i, j, this.getValueAt(i, j) * value);
            }
        }
        return valueNum;
    }

    @Override
    //транспонирование матрицы
    public IMatrix transpose() {
        Matrix result = new Matrix(this.getColumns(), this.getRows());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(j, i, this.getValueAt(i, j));
            }
        }
        return result;
    }

    @Override
    //Заполняет текущю матрицу заданным значением
    public IMatrix fillMatrix(double value) {

        Matrix result = new Matrix(this.getRows(), this.getColumns());
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                result.setValueAt(i, j, 100);
            }
        }
        return result;
    }


    @Override
    //Вычисляет детерминант матрицы НАЙТИ В ИНЕТЕ
    public double determinant() {
        return 0;
    }

    @Override
    //Проверяет является ли текущая матрица нулевой+
    public boolean isNullMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (numbers[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override
//Проверяет является ли текущая матрица единичной (i и j по диагонали должны быть равны )
    public boolean isIdentityMatrix() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                if (i == j) {
                    if (numbers[i][j] != 1) {
                        return false;
                    }
                } else {
                    if (numbers[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    @Override
    //Проверяет является ли текущая матрица квадратной+
    public boolean isSquareMatrix() {
        if (this.getRows() != this.getColumns()) {
            System.out.println("Матрица не квадратная! Количество строк не равно количеству колонок!");
            return false;
        }
        System.out.println("Матрица квадратная!");
        return true;
    }
    @Override
    public void printToConsole() {
        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                System.out.print(this.getValueAt(i, j) + "  ");
            }
            System.out.println();
        }
    }
}

