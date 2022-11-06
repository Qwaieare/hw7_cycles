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

        for (int populationChange = 0; populationChange <= 10; populationChange++) {
            population += population * growth / 1000;
        }
        System.out.println(population);

        System.out.println();
        System.out.println("Задаа-1 Домашнее задание №2");
        System.out.println("вариант 1");

        int initialAmount = 15_000;
        int savings = 0;

        for (int monthOfAccumulation = 0; savings <= 12_000_000; monthOfAccumulation++) {
            savings += savings *7 / 100;
            savings += initialAmount;
            if (monthOfAccumulation % 5 ==0) {
                System.out.println("месяц " + monthOfAccumulation + " промежуточные накопления " + savings);
            }
            System.out.println("месяц " + monthOfAccumulation + " накоплено " + savings);
        }
        System.out.println(savings);

        System.out.println();
        System.out.println("вариант 2");

        int initialAmount1 = 15_000;
        int savings1 = 0;
        int monthOfAccumulation1 = 0;

        while (savings1 <= 12_000_000) {
            monthOfAccumulation1++;
            savings1 += savings1 *7 / 100;
            savings1 += initialAmount1;
            if (monthOfAccumulation1 % 5 ==0) {
                System.out.println("месяц " + monthOfAccumulation1 + " промежуточные накопления " + savings1);
            }
            System.out.println("месяц " + monthOfAccumulation1 + " накоплено " + savings1);
        }
        System.out.println(savings);

        System.out.println();
        System.out.println("Задаа-2 Домашнее задание №2");
        System.out.println("вариант 1");

        int initialAmountc = 15_000;
        int savingsc = 0;

        for (int monthOfAccumulation2 = 0; savingsc <= 12_000_000; monthOfAccumulation2++) {
            savingsc += savingsc *7 / 100;
            savingsc += initialAmountc;
            if (monthOfAccumulation2 % 6 ==0) {
                System.out.println("месяц " + monthOfAccumulation2 + " промежуточные накопления " + savingsc);
            }
        }

        System.out.println();
        System.out.println("вариант 2");

        int initialAmountc1 = 15_000;
        int savingsc1 = 0;
        int monthOfAccumulation3 = 0;

        while (savingsc1 <= 12_000_000) {
            monthOfAccumulation3++;
            savingsc1 += savingsc1 *7 / 100;
            savingsc1 += initialAmountc1;
            if (monthOfAccumulation3 % 6 ==0) {
                System.out.println("месяц " + monthOfAccumulation3 + " промежуточные накопления " + savingsc1);
            }
        }

        System.out.println();
        System.out.println("Задаа-3 Домашнее задание №2");
        System.out.println("вариант 1");

        int initialAmountd = 15_000;
        int savingsd = 0;
        int monthOfAccumulation4 = 0;

        for ( ; monthOfAccumulation4 < 12 * 9; monthOfAccumulation4++) {
            savingsd += savingsd *7 / 100;
            savingsd += initialAmountd;
            if (monthOfAccumulation4 % 6 == 0) {
                System.out.println("месяц " + monthOfAccumulation4 + " промежуточные накопления " + savingsd);
            }
        }
        System.out.println(savingsd);

        System.out.println();
        System.out.println("вариант 2");

        int initialAmountd1 = 15_000;
        int savingsd1 = 0;
        int monthOfAccumulation5 = 0;

        while (monthOfAccumulation5 < 12 * 9) {
            monthOfAccumulation5++;
            savingsd1 += savingsd1 *7 / 100;
            savingsd1 += initialAmountd1;
            if (monthOfAccumulation5 % 6 == 0) {
                System.out.println("месяц " + monthOfAccumulation5 + " промежуточные накопления " + savingsd1);
            }
        }
        System.out.println(savingsd1);

        System.out.println();
        System.out.println("Задаа-4 Домашнее задание №2");
        System.out.println("вариант 1");

        for (int dateFriday = 2; dateFriday < 31; dateFriday = dateFriday + 7) {
            System.out.println("Сегодня пятница " + dateFriday + " декабря 2022 года. Необходимо подготовить отчет");
        }

        System.out.println();
        System.out.println("вариант 2");

        int friday = 2;
        for (int dateFriday1 = 0; dateFriday1 <= 31; dateFriday1++) {
            if (dateFriday1 % 7 == friday) {
                System.out.println("Сегодня пятница " + dateFriday1 + " декабря 2022 года. Необходимо подготовить отчет");
            }
        }

        System.out.println();
        System.out.println("вариант 3");

        int friday1 = 2;
        int dateFriday2 = 0;

        while (dateFriday2 <= 31) {
            dateFriday2++;
            if (dateFriday2 % 7 == friday1) {
                System.out.println("Сегодня пятница " + dateFriday2 + " декабря 2022 года. Необходимо подготовить отчет");
            }
        }

        System.out.println();
        System.out.println("вариант 4");

        int dateFriday3 = 2;

        while (dateFriday3 < 31) {
            dateFriday3 += 7;
            System.out.println("Сегодня пятница " + dateFriday3 + " декабря 2022 года. Необходимо подготовить отчет");
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

        int number = 2;
        for (int calculation = 1; calculation <= 10; calculation++) {
            System.out.println(number + " * " + calculation + " = " + number * calculation);
        }














    }
}