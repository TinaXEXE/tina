/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Запрашиваем размеры матриц
        System.out.print("Введите размер первой матрицы (m x n): ");
        int m1 = getValidInteger(scanner); // число строк
        int n1 = getValidInteger(scanner); // число столбцов

        System.out.print("Введите размер второй матрицы (n x p): ");
        int n2 = getValidInteger(scanner); // число строк должно совпадать с числом столбцов первой матрицы
        if (n1 != n2) {
            System.out.println("Плаки-плаки! Количество столбцов первой матрицы должно равняться количеству строк второй.");
            return;
        }
        int p2 = getValidInteger(scanner); // число столбцов

        // Создаем матрицы
        double[][] matrixA = new double[m1][n1];
        double[][] matrixB = new double[n2][p2];

        // Вводим элементы первой матрицы
        System.out.println("Введите элементы первой матрицы:");
        for (int i = 0; i < m1; i++) {
            for (int j = 0; j < n1; j++) {
                matrixA[i][j] = getValidDouble(scanner);
            }
        }

        // Вводим элементы второй матрицы
        System.out.println("Введите элементы второй матрицы:");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < p2; j++) {
                matrixB[i][j] = getValidDouble(scanner);
            }
        }

        // Перемножаем матрицы
        double[][] resultMatrix = multiplyMatrices(matrixA, matrixB);

        // Выводим результат
        System.out.println("Результат умножения матриц:");
        printMatrix(resultMatrix);
    }

    // Функция для ввода целых чисел с проверкой
    private static int getValidInteger(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                int value = Integer.parseInt(input);
                if (value > 0) { // Проверяем, что значение положительное
                    return value;
                } else {
                    System.out.print("Введено отрицательное число. Не будь криворуким и попробуй снова: ");
                }
            } catch (NumberFormatException e) {
                System.out.print("Некорректный ввод. Не будь криворуким и попробуй снова: ");
            }
        }
    }

    // Функция для ввода вещественных чисел с проверкой
    private static double getValidDouble(Scanner scanner) {
        while (true) {
            try {
                String input = scanner.nextLine();
                double value = Double.parseDouble(input);
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Некорректный ввод. Не будь криворуким и попробуй снова: ");
            }
        }
    }

    // Функция для перемножения матриц
    private static double[][] multiplyMatrices(double[][] a, double[][] b) {
        int rowsA = a.length;
        int colsA = a[0].length;
        int rowsB = b.length;
        int colsB = b[0].length;

        double[][] result = new double[rowsA][colsB];

        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsB; j++) {
                for (int k = 0; k < colsA; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        return result;
    }

    // Функция для вывода матрицы
    private static void printMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double element : row) {
                System.out.printf("%10.2f ", element);
            }
            System.out.println();
        }
    }
}