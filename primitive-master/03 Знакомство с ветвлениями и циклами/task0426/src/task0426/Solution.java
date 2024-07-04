package task0426;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Ярлыки и числа
Ввести с клавиатуры целое число. Вывести на экран его строку-описание следующего вида:
"отрицательное четное число" - если число отрицательное и четное,
"отрицательное нечетное число" - если число отрицательное и нечетное,
"ноль" - если число равно 0,
"положительное четное число" - если число положительное и четное,
"положительное нечетное число" - если число положительное и нечетное.

Пример для числа 100:
положительное четное число

Пример для числа -51:
отрицательное нечетное число


Requirements:
1. Программа должна считывать число c клавиатуры.
2. Программа должна использовать команду System.out.println() или System.out.print().
3. Если число отрицательное и четное, вывести "отрицательное четное число".
4. Если число отрицательное и нечетное, вывести "отрицательное нечетное число".
5. Если число равно 0, вывести "ноль".
6. Если число положительное и четное, вывести "положительное четное число".
7. Если число положительное и нечетное, вывести "положительное нечетное число".
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        if (t == 0) {
            System.out.println("Ноль");}
        if (t <0 & t % 2 ==0){
            System.out.println("Отрицательное, четное число");}
        if (t < 0 & t % 2 !=0){
            System.out.println("Отрицательное, нечетное число");}
        if (t>0 & t % 2 ==0){
            System.out.println("Положительное, четное число");}
        if (t>0 & t % 2 !=0){
            System.out.println("Положительное, нечетное число");}





    }
}
