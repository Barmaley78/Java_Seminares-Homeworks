/*3 Напишите метод, который принимает на вход строку (String) 
и определяет является ли строка палиндромом (возвращает boolean значение).
*/

import java.lang.StringBuilder;
import java.util.Scanner;

public class zad3 {
    private static Scanner scan = new Scanner(System.in);
public static void main(String[] args) {
    System.out.printf("Введите строку: ");
        String str1 = scan.next();
    String str2 = reverseStr(str1);

    if (str2.equals(str1)) {
        System.out.println("Строка является палиндромом");
        } else {
            System.out.println("Строка не является палиндромом");
        }
}

public static String reverseStr(String str) {
    return new StringBuilder(str).reverse().toString();
  }

}