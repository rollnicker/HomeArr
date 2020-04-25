package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Сколько элементов: ");
        int size = input.nextInt();
        int matrix[] = new int[size];
        System.out.println("Введите числа в массив: ");

        for (int i = 0; i < size; i++) {
                matrix[i] = input.nextInt();
        }
        System.out.println("Если числа первой строки умножить на 2 то получится:  ");
        for (int i = 0; i < size; i++) {
            System.out.println(matrix[i] * 2 + " ");
        }
    }
}