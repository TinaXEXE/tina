/*
Welcome to JDoodle!

You can execute code here in 88 languages. Right now you’re in the Java IDE.

  1. Click the orange Execute button ▶ to execute the sample code below and see how it works.

  2. Want help writing or debugging code? Type a query into JDroid on the right hand side ---------------->

  3.Try the menu buttons on the left. Save your file, share code with friends and open saved projects.

Want to change languages? Try the search bar up the top.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void rotateArray(int[] arr, int shift) {
        int n = arr.length;
        shift %= n;           // приводим сдвиг к диапазону длины массива
        reverse(arr, 0, n - 1);          // переворот всего массива
        reverse(arr, 0, shift - 1);     // переворот первой части массива
        reverse(arr, shift, n - 1);     // переворот второй части массива
    }
    
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start++] = arr[end];
            arr[end--] = temp;
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Размер массива: ");
        int size = scanner.nextInt();
        
        int[] array = new int[size];
        
        for (int i = 0; i < size; i++) {
            System.out.print("Элемент [" + i + "] : ");
            array[i] = scanner.nextInt();
        }
        
        System.out.print("На сколько позиций сдвинуть элементы массива? (+ вправо, - влево): ");
        int rotationSteps = scanner.nextInt(); // колво2 шагов поворота
        
        rotateArray(array, rotationSteps);
        
        System.out.println("Массив после поворота:");
        System.out.println(Arrays.toString(array));
    }
}