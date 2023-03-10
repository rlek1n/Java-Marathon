package day1.task4;

/**
 * Объявите переменную типа int, имя переменной - year. Присвойте этой
 * переменной значение 1980. Используя цикл while или for, выведите в столбик строки вида
 * “Олимпиада X года”, где X - это число, которое принимает значения, начиная от 1980
 * до 2020 с шагом увеличения равным 4.
 * То есть на первой итерации цикла, X равен 1980, а на каждой следующей итерации,
 * значение X увеличивается на 4. Строки такого вида выводятся до тех пор, пока
 * значение X не станет больше 2020.
 */
public class Main {
    public static void main(String[] args) {
        int year = 1980;
        while (year <= 2020) {
            System.out.printf("Олимпиада %d года\n", year);
            year += 4;
        }
    }
}
