public class Main {
    public static void main(String[] args) {

        System.out.println("Задаа-1 Домашнее задание №1");

        int contribution = 15_000;
        int piggyBank = 0;
        int month = 0;

        while (piggyBank <= 2_459_000) {

            piggyBank += piggyBank / 100;
            piggyBank += contribution;

            System.out.println("Месяц " + month + " , сумма накоплений равна " + piggyBank + " рублей");
            month++;
        }
        System.out.println();

        System.out.println("Задаа-2 Домашнее задание №1");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        for (i =10; i > 0; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("Задаа-3 Домашнее задание №1");

        int population = 12_000_000;
        int birthRate = 17;
        int mortality = 8;
        int growth = (birthRate - mortality);

        for (int a = 0; a <= 10; a++) {
            population += population * growth / 1000;
        }
        System.out.println(population);

        System.out.println();
        System.out.println("Задаа-1 Домашнее задание №2");
        System.out.println("вариант 1");

        int initialAmount = 15_000;
        int savings = 0;

        for (int b = 0; savings <= 12_000_000; b++) {
            savings += savings *7 / 100;
            savings += initialAmount;
            if (b % 5 ==0) {
                System.out.println("месяц " + b + " промежуточные накопления " + savings);
            }
            System.out.println("месяц " + b + " накоплено " + savings);
        }
        System.out.println(savings);

        System.out.println();
        System.out.println("вариант 2");

        int initialAmount1 = 15_000;
        int savings1 = 0;
        int b1 = 0;

        while (savings1 <= 12_000_000) {
            b1++;
            savings1 += savings1 *7 / 100;
            savings1 += initialAmount1;
            if (b1 % 5 ==0) {
                System.out.println("месяц " + b1 + " промежуточные накопления " + savings1);
            }
            System.out.println("месяц " + b1 + " накоплено " + savings1);
        }
        System.out.println(savings);

        System.out.println();
        System.out.println("Задаа-2 Домашнее задание №2");
        System.out.println("вариант 1");

        int initialAmountc = 15_000;
        int savingsc = 0;

        for (int c = 0; savingsc <= 12_000_000; c++) {
            savingsc += savingsc *7 / 100;
            savingsc += initialAmountc;
            if (c % 6 ==0) {
                System.out.println("месяц " + c + " промежуточные накопления " + savingsc);
            }
        }

        System.out.println();
        System.out.println("вариант 2");

        int initialAmountc1 = 15_000;
        int savingsc1 = 0;
        int c1 = 0;

        while (savingsc1 <= 12_000_000) {
            c1++;
            savingsc1 += savingsc1 *7 / 100;
            savingsc1 += initialAmountc1;
            if (c1 % 6 ==0) {
                System.out.println("месяц " + b1 + " промежуточные накопления " + savingsc1);
            }
        }

        System.out.println();
        System.out.println("Задаа-3 Домашнее задание №2");
        System.out.println("вариант 1");

        int initialAmountd = 15_000;
        int savingsd = 0;
        int d = 0;

        for ( ; d < 12 * 9; d++) {
            savingsd += savingsd *7 / 100;
            savingsd += initialAmountd;
            if (d % 6 == 0) {
                System.out.println("месяц " + d + " промежуточные накопления " + savingsd);
            }
        }
        System.out.println(savingsd);

        System.out.println();
        System.out.println("вариант 2");

        int initialAmountd1 = 15_000;
        int savingsd1 = 0;
        int d1 = 0;

        while (d1 < 12 * 9) {
            d1++;
            savingsd1 += savingsd1 *7 / 100;
            savingsd1 += initialAmountd1;
            if (d1 % 6 == 0) {
                System.out.println("месяц " + d1 + " промежуточные накопления " + savingsd1);
            }
        }
        System.out.println(savingsd1);

        System.out.println();
        System.out.println("Задаа-4 Домашнее задание №2");
        System.out.println("вариант 1");

        for (int k = 2; k < 31; k = k + 7) {
            System.out.println("Сегодня пятница " + k + " декабря 2022 года. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("вариант 2");

        int friday = 2;
        for (int k1 = 0; k1 <= 31; k1++) {
            if (k1 % 7 == friday) {
                System.out.println("Сегодня пятница " + k1 + " декабря 2022 года. Необходимо подготовить отчет");
            }
        }

        System.out.println();
        System.out.println("вариант 3");

        int friday1 = 2;
        int k2 = 0;

        while (k2 <= 31) {
            k2++;
            if (k2 % 7 == friday1) {
                System.out.println("Сегодня пятница " + k2 + " декабря 2022 года. Необходимо подготовить отчет");
            }
        }

        System.out.println();
        System.out.println("Задаа-1 Домашнее задание №3");
        System.out.println("вариант 1");

        int ourYear = 2022;
        int beforeOurYear = ourYear - 200;
        int afterOurYear = ourYear + 100;

        for (int year = 0; year <= afterOurYear; year += 79) {
            if (year >= beforeOurYear && year <= afterOurYear) {
                System.out.println(year);
            }
        }

        System.out.println();
        System.out.println("вариант 2");

        int ourYear1 = 2022;
        int beforeOurYear1 = ourYear1 - 200;
        int afterOurYear1 = ourYear1 + 100;
        int year1 = 0;

        while (year1 <= afterOurYear1) {
            year1 += 79;
            if (year1 >= beforeOurYear1 && year1 <= afterOurYear1) {
                System.out.println(year1);
            }
        }

        System.out.println();
        System.out.println("Задаа-2 Домашнее задание №3");

        int n = 2;
        for (int q = 1; q <= 10; q++) {
            System.out.println(n + " * " + q + " = " + n * q);
        }














    }
}