package task0411;

/* 
Время года
Напиши метод checkSeason. По номеру месяца, метод должен определить время года (зима, весна, лето, осень) и вывести на экран.

Пример для номера месяца 2:
зима

Пример для номера месяца 5:
весна


Requirements:
1. Программа должна выводить текст на экран.
2. Метод main не должен вызывать функцию System.out.println или System.out.print.
3. Метод main должен вызывать метод checkSeason.
4. Метод checkSeason должен быть static void, и иметь только один параметр int.
5. Метод checkSeason должен выводить текст на экран согласно заданию.*/

public class Solution {
    public static void main(String[] args) {
        checkSeason(12);
        checkSeason(4);
        checkSeason(7);
        checkSeason(10);
        checkSeason(23);
    }

    public static void checkSeason(int month) {
        //напишите тут ваш код
        switch (month) {
            case 1 -> System.out.println("Январь");
            case 2 -> System.out.println("Февраль");
            case 3 -> System.out.println(("Март"));
            case 4 -> System.out.println("Апрель");
            case 5 -> System.out.println("Май");
            case 6 -> System.out.println("Июнь");
            case 7 -> System.out.println(("Июль"));
            case 8 -> System.out.println("Август");
            case 9 -> System.out.println("Сентябрь");
            case 10 -> System.out.println("Октябрь");
            case 11 -> System.out.println(("Ноябрь"));
            case 12 -> System.out.println("Декабрь");
            default -> System.out.println("Нет такого месяца, пожалуйста по напиште номер месяца");
        }



    }
}