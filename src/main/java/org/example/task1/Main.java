package org.example.task1;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;


public class Main {
    public static void main(String[] args) {

//    Напишите программу, которая использует Stream API для обработки списка чисел.
//    Программа должна вывести на экран среднее значение всех четных чисел в списке.

        List<Integer> List = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        var average = List.stream().filter(x -> x % 2 == 0).mapToInt(x -> x).average().getAsDouble();
        System.out.println("среднее значение всех четных чисел равно "+ average);
    }
}




