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
        
        System.out.print("Введите целое число: ");
        int number = Math.abs(scanner.nextInt()); 
        
        int evenCount = 0;   // crjkmrj чётных цифр
        int oddCount = 0;    // сколько нечётных цифр
        
        while (number > 0) {  
            int digit = number % 10;      // берем последнюю цифру числа
            
            if (digit % 2 == 0) {         // смотрим является ли цифра чётной
                evenCount++;
            } else {
                oddCount++;               // если цифра нечётная
            }
            
            number /= 10;                 // удаляем последнюю цифру
        }
        
        System.out.println("Количество чётных цифр: " + evenCount);
        System.out.println("Количество нечётных цифр: " + oddCount);
    }
}
