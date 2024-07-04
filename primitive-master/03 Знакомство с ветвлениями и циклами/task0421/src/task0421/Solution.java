package task0421;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Настя или Настя?
Ввести с клавиатуры два имени, и если имена одинаковые вывести сообщение "Имена идентичны".
Если имена разные, но их длины равны - вывести сообщение - "Длины имен равны".
Если имена и длины имен разные - ничего не выводить.


Requirements:
1. Программа должна считывать две строки c клавиатуры.
2. Программа должна содержать System.out.println() или System.out.print()
3. Если имена одинаковые вывести сообщение "Имена идентичны"
4. Если имена разные, но их длины равны , вывести сообщение "Длины имен равны"
5. Если имена и длины имен разные - ничего не выводить.*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите 2 имени : ");
        String s = br.readLine();
        String s2 = br.readLine();
        if (s == s2) {
            System.out.println("Имена идентичны!");
        }
        long count = s.chars().filter(Character::isLetter).count();
        long count2 = s2.chars().filter(Character::isLetter).count();
        if (count == count2) {
            System.out.println("Длины имен равны!");
        }



    }
}
