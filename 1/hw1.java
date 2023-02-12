// Написать программу вычисления n-ого треугольного числа. 

import java.util.Scanner;

public class hw1 {
    private static Scanner input = new Scanner(System.in);
public static void main(String[] args) {
    int number = getNumberByUser("Введите номер числа треугольника: ");
    System.out.print(number + "-ое число треугольника равно " + triangeNumber(number));
}

// расчет n-ного числа треугольника
public static Integer triangeNumber(int num){
    return num*(num+1)/2;
}

// ввод числа
public static int getNumberByUser(String text) {
    System.out.print(text);
    return input.nextInt();
  }
}
