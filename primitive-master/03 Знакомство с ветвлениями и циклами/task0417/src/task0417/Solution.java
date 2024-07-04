package task0417;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Существует ли пара?
Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2

Requirements:
1. Программа должна считывать числа c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если два числа равны между собой, необходимо вывести числа на экран.
4. Если все три числа равны между собой, необходимо вывести все три.
5. Если нет равных чисел, ничего не выводить.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа: ");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        int num3 = Integer.parseInt(br.readLine());

        if (num1 == num2 & num2 == num3) {
            System.out.println(num1+ " " + num2 + " " + num3);
        } else if (num1 == num2) {
            System.out.println(num1+ " " + num2);
        } else if (num1 == num3) {
            System.out.println(num1+ " " + num3);
        } else if (num2 == num3) {
            System.out.println(num2+ " " + num3);
        }
    }
}