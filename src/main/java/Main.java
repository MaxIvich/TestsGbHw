import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    // Задача 1: Задайте значения M и N. Напишите программу, которая выведет все чётные
    // натуральные числа в промежутке от M до N с помощью рекурсии.
    //
    // M = 1; N = 5 -> "2, 4"
    // M = 4; N = 8 -> "4, 6, 8"
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
        if (a!=b) {
            if (a % 2 == 0) {
            System.out.println(a);
            task11(a + 1, b);
            } else task11(a + 1, b);
        }
    }

    // Задача 2: Задайте значения M и N. Напишите программу, которая найдёт сумму
    // натуральных элементов в промежутке от M до N с помощью рекурсии.
    //
    // M = 1; N = 15 -> 120
    // M = 4; N = 8 -> 30
    static int a = 0;
    public static void test2(int n, int m){
        a = a +n;
        if (n!=m){
            test2(n+1,m);
        }else System.out.println(a);
    }
    public static void main(String[] args) {
        int N = 1;
        int M = 15;
       task1(N,M);
       task11(N,M);
       test2(N,M);

    }
}
