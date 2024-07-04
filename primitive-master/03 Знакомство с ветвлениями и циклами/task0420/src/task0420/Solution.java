package task0420;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.


Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна выводить числа на экран.
3. Программа должна выводить три числа разделенных пробелами.
4. Программа должна выводить числа в порядке убывания.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите числа с клавиатуры: ");
        int t = Integer.parseInt(br.readLine());
        int t2 = Integer.parseInt(br.readLine());
        int t3 = Integer.parseInt(br.readLine());

        int max = t;
        if (t2 > max) {
            max = t2;}
        if (t3 > max) {
            max = t3;}

        int min = t;
        if (t2 < min) {
            min = t2;}
        if (t3 < min) {
            min = t3;}

        int mid = t+t2+t3-min-max;
        System.out.println(max+ " " +mid+ " " +min);
    }
}
