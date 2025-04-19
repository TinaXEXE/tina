/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numberToGuess = random.nextInt(100) + 1; 
        int attemptsLeft = 10;
        
        System.out.println("ВАУ!Это же игра 'Угадай число за 10 попыток или умрешь'!");
        System.out.println("Я задала число от 1 до 100! Попробуйте его угадать. У тебя есть 10 попыток, чтобы его угадать.");
        
        while (attemptsLeft > 0) {
            System.out.print("Введи предположение: ");
            int guess = scanner.nextInt();
            
            if (guess == numberToGuess) {
                System.out.println("Поздравляю, мамина гордость! Удача сжалилась над вами! Ты угадал число за " + (11 - attemptsLeft) + " попыток.");
                break;
            } else if (guess < numberToGuess) {
                System.out.println("Ой-ей, кажется ты полный невдуплёныш. Загаданное число больше вашего предположения. Попробуйте еще раp~");
            } else {
                System.out.println("Вау, какой же ты неудачник. Загаданное число меньше вашего предположения. Попробуйте еще раз~");
            }
            
            attemptsLeft--;
            if (attemptsLeft > 0) {
                System.out.println("Попыток осталось: " + attemptsLeft);
            } else {
                System.out.println("К сожалению, ты полный неудачник!! Ха-ха ты исчерпал все попытки и сдох. Загаданное число было: " + numberToGuess);
            }
        }
        
        scanner.close(); // Закрываем сканнер, чтобы избежать утечек ресурсов
    }
}