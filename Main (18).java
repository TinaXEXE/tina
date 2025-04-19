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
        
        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();
        
        System.out.print("Введите второе число: ");
        int secondNumber = scanner.nextInt();
        
        int min = Math.min(firstNumber, secondNumber);
        
        System.out.println("Меньшее число: " + min);
    }
}
