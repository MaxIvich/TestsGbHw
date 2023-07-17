import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Задача 1: Задайте значения M и N. Напишите программу, которая выведет все чётные
    // натуральные числа в промежутке от M до N с помощью рекурсии.
    //
    // M = 1; N = 5 -> "2, 4"
    // M = 4; N = 8 -> "4, 6, 8"

    // Задача 2: Задайте значения M и N. Напишите программу, которая найдёт сумму
    // натуральных элементов в промежутке от M до N с помощью рекурсии.
    //
    // M = 1; N = 15 -> 120
    // M = 4; N = 8 -> 30
    public boolean is(int a ){
        return true;

    }


    public static void task1(int a , int b){
        ArrayList<Integer> arr= new ArrayList();
        for (int i = a; i <= b; i++) {
            if(i % 2==0){
                arr.add(i);
            }
        }
        System.out.println(arr);

    }


    public static void task11(int a ,int b){
        ArrayList<Integer> arr= new ArrayList();
        int c = a;
       while (true){
           if(a % 2 == 0){
               arr.add(a);
               c++;
               break;
           }


       }
        System.out.println(arr);


    }
    public static void main(String[] args) {
        //task1(1,8);
        task11(1,8);

    }
}
