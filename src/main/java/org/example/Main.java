package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        while (true)
        {
            try
            {
                Scanner in = new Scanner(System.in);
                System.out.print("Введите первое целое число: "); var num1 = in.nextInt();
                System.out.print("Введите второе целое число: "); var num2 = in.nextInt();
                sum(num1, num2);
                break;
            }
            catch (InputMismatchException exception)
            {
                System.out.println("Некорректный тип данных");
            }
        }

        try
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите число месяца: "); var num = in.nextInt();
            getMonth(num);
        }
        catch (InputMismatchException exception)
        {
            System.out.println("Некорректный тип данных");
        }
    }

    public static boolean getMonth(int num)
    {
        String[] months = { "январь", "февраль", "март", "апрель",
                "май", "июнь", "июль", "август",
                "сентябрь", "октябрь", "ноябрь", "декабрь" };
        int[] dom = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        try
        {
            System.out.println("Месяц: " + months[num - 1] + '\n'
                    + "Количество дней: " + dom[num - 1]);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Недопустимое число: " + num);
            return false;
        }
        return true;
    }

    public static int sum(int num1, int num2)
    {
        System.out.println("Сумма: " + (num1 + num2));
        return (num1 + num2);
    }
}