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
        
        System.out.print("Введите количество членов прогрессии: ");
        int n = scanner.nextInt();
        
        System.out.print("Введите первый член прогрессии: ");
        int firstTerm = scanner.nextInt();
        
        System.out.print("Введите разность прогрессии: ");
        int difference = scanner.nextInt();
        
        // Вычисляем сумму первых N членов
        double sum = calculateArithmeticProgressionSum(n, firstTerm, difference);
        
        // Выводим результат
        System.out.println("Сумма первых " + n + " членов арифметической прогрессии равна: " + sum);
    }
    
    private static double calculateArithmeticProgressionSum(int n, int firstTerm, int difference) {
        // Формула суммы первых N членов: Sn = n/2 * (2a + (n-1)d)
        return n / 2.0 * (2 * firstTerm + (n - 1) * difference);
    }
}