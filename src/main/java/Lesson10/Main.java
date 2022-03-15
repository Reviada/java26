package Lesson10;

public class Main {
    public static void main(String[] args) {
//        //    создаем объект 1 задание
//        Matrix matrix = new Matrix(3, 4);
// тестируем 1 метод 26стр
//
//        System.out.println("1.Возвращает количество строк матрицы:  " + matrix.getRows());
//        System.out.println("2.Возвращает количество столбцов матрицы:  " + matrix.getColumns());
//
//        //matrix.setValueAt(0, 0, 12);//подходит для единажды названия

        double[][] forMatrix1 = {
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0},};
        {1, 0, 0},
        {0, 1, 0},
        {0, 0, 1},};

//                {3, 5, 4},
//                {4, 7, 3},
//                {11, 3, 4},
//                {2, 6, 1},};
        Matrix matrix1 = new Matrix(forMatrix1);
        //вторая матрица для сложения,вычитания, умножения и т.п. матриц
        double[][] forMatrix2 = {
//                {0, 0, 0},
//                {0, 0, 0},
//                {0, 0, 0},};

                {8, 6, 12},
                {5, 7, 8},
                {4, 8, 5},
                {8, 5, 1},};
        Matrix matrix2 = new Matrix(forMatrix2);
//вызываем метод сложения+
//        System.out.println("Сложение:  ");
//        IMatrix matrixAdd = matrix1.add(matrix2);
//        matrixAdd.printToConsole();
//вызываем метод разности+
//        System.out.println("Разность:  ");
//        IMatrix matrixSub = matrix1.sub(matrix2);
//        matrixSub.printToConsole();
//вызываем метод произведение+
//        System.out.println("Произведение:  ");
//        IMatrix matrixMul = matrix1.mul(matrix2);
//        matrixMul.printToConsole();
//Возвращает произведение текущей матрицы на число+
//        System.out.println("Произведение текущей первой матрицы на число 2:  ");
//        IMatrix matrixMul1 = matrix1.mul(2);
//        matrixMul1.printToConsole();
//
//        System.out.println("Произведение текущей второй матрицы на число 2:  ");
//        IMatrix matrixMul2 = matrix2.mul(2);
//        matrixMul2.printToConsole();
//Возвращает транспонированную матрицу по отношению к текущей+
//        System.out.println("транспонированная матрица первая по отношению к текущей:  ");
//        IMatrix matrixTranspose = matrix1.transpose();
//        matrixTranspose.printToConsole();
//
//        System.out.println("транспонированная матрица вторая по отношению к текущей:  ");
//        IMatrix matrixTranspose2 = matrix2.transpose();
//        matrixTranspose2.printToConsole();

//Заполняет текущю матрицу заданным значением+
//        System.out.println("Заполняет текущю матрицу заданным значением:  ");
//        IMatrix fillMatrix = matrix1.fillMatrix(60);
//        fillMatrix.printToConsole();
//Вычисляет детерминант матрицы-
        //  System.out.println("Вычисляет детерминант матрицы :  ");
//Проверяет является ли текущая матрица нулевой
//        System.out.println("Является ли  матрица (а) нулевой? :  ");
//        boolean isNullMatrix = matrix1.isNullMatrix();
//        System.out.println("Матрица a "+isNullMatrix);
//
//        System.out.println("Является ли  матрица (b) нулевой?:  ");
//        boolean isNullMatrix2 = matrix2.isNullMatrix();
//        System.out.println("Матрица b " + isNullMatrix2);


//Проверяет является ли текущая матрица единичной
//        System.out.println("Является ли текущая матрица (a) единичной:  ");
//        boolean isIdentityMatrix = matrix1.isIdentityMatrix();
//        System.out.println(isIdentityMatrix);
//
//        System.out.println("Является ли текущая матрица (b) единичной:  ");
//        boolean isIdentityMatrix2 = matrix2.isIdentityMatrix();
//        System.out.println(isIdentityMatrix2);

//Проверяет является ли текущая матрица квадратной+
        System.out.println("Является ли  матрица (а) квадратной:  ");
        boolean isSquareMatrix = matrix1.isSquareMatrix();
        System.out.println(isSquareMatrix);

        System.out.println("Является ли  матрица (b) квадратной:  ");
        boolean isSquareMatrix2 = matrix2.isSquareMatrix();
        System.out.println(isSquareMatrix2);


    }
}
