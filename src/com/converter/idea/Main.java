package com.converter.idea;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        int choice = input.nextInt();
        switch (choice) {

            case 1:
                System.out.println("Выберите единицу измерения: 1 - кг; 2 - центнер; 3 - тонна");
                int massa = input.nextInt();
                switch (massa) {
                    case 1:
                        System.out.println("Введите число");
                        int count2 = input.nextInt();

                        System.out.println("Результат:");
                        int kg = 1;
                        System.out.println("Кг:" + count2 * kg);

                        double с = 100;
                        double сrezult = count2 / с;
                        String convertс = String.format("%.4f", сrezult);
                        System.out.println("Центнер:" + convertс);

                        double tonna = 0.001;
                        double tonnarezult = count2 * tonna;
                        String converttonna = String.format("%.4f", tonnarezult);
                        System.out.println("Тонна:" + converttonna);
                        break;

                    case 2:
                        System.out.println("Введите число");
                        int count3 = input.nextInt();

                        System.out.println("Результат:");
                        int с2 = 1;
                        System.out.println("Центнер:" + count3 * с2);

                        int kg2 = 100;
                        int kg2rezult = count3 * kg2;
                        System.out.println("Кг:" + kg2rezult);

                        double tonna2 = 0.1;
                        double tonna2rezult = count3 * tonna2;
                        String converttonna2 = String.format("%.1f", tonna2rezult);
                        System.out.println("Тонна:" + converttonna2);
                        break;

                    case 3:
                        System.out.println("Введите число");
                        int count4 = input.nextInt();

                        System.out.println("Результат:");
                        int tonna3 = 1;
                        System.out.println("Тонна:" + count4 * tonna3);

                        int c3 = 10;
                        int c3rezult = count4 * c3;
                        System.out.println("Центнер:" + c3rezult);

                        int kg3 = 1000;
                        int kg3rezult = count4 * kg3;
                        System.out.println("Кг:" + kg3rezult);
                        break;

                    default:
                        System.out.println("Вы выбрали неверное значение. Начните заново!");
                }

                break;

            case 2:
                System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
                int s = input.nextInt();
                switch (s) {
                    case 1:
                        System.out.println("Введите число");
                        int count = input.nextInt();

                        System.out.println("Результат:");
                        int metr = 1;
                        System.out.println("Метры:" + count * metr);

                        double mil = 1609.34;
                        double milrezult = count / mil;
                        String convertmil = String.format("%.3f", milrezult);
                        System.out.println("Мили:" + convertmil);

                        double yard = 0.914;
                        double yardrezult = count / yard;
                        String convertyard = String.format("%.2f", yardrezult);
                        System.out.println("Ярды:" + convertyard);

                        double ft = 0.3048;
                        double ftrezult = count / ft;
                        String convertft = String.format("%.2f", ftrezult);
                        System.out.println("Футы:" + convertft);
                        break;

                    case 2:
                        System.out.println("Введите число");
                        int count5 = input.nextInt();

                        System.out.println("Результат:");
                        int mil2 = 1;
                        System.out.println("Мили:" + count5 * mil2);

                        double metr2 = 1609.34;
                        double metr2rezult = count5 * metr2;
                        String convertmetr2 = String.format("%.3f", metr2rezult);
                        System.out.println("Метры:" + convertmetr2);

                        int yard2 = 1760;
                        int yard2rezult = count5 * yard2;
                        System.out.println("Ярды:" + yard2rezult);

                        int ft2 = 5280;
                        int ft2rezult = count5 * ft2;
                        System.out.println("Футы:" + ft2rezult);
                        break;

                    case 3:
                        System.out.println("Введите число");
                        int count6 = input.nextInt();

                        System.out.println("Результат:");
                        int yard3 = 1;
                        System.out.println("Ярды:" + count6 * yard3);

                        double metr3 = 0.91;
                        double metr3rezult = count6 * metr3;
                        String convertmetr3 = String.format("%.3f", metr3rezult);
                        System.out.println("Метры:" + convertmetr3);

                        double mil3 = 0.00057;
                        double mil3rezult = count6 * mil3;
                        String convertmil3 = String.format("%.4f", mil3rezult);
                        System.out.println("Мили:" + convertmil3);

                        int ft3 = 3;
                        int ft3rezult = count6 * ft3;
                        System.out.println("Футы:" + ft3rezult);
                        break;

                    case 4:
                        System.out.println("Введите число");
                        int count7 = input.nextInt();

                        System.out.println("Результат:");
                        int ft4 = 1;
                        System.out.println("Футы:" + count7 * ft4);

                        double metr4 = 0.3;
                        double metr4rezult = count7 * metr4;
                        String convertmetr4 = String.format("%.2f", metr4rezult);
                        System.out.println("Метры:" + convertmetr4);

                        double mil4 = 0.00019;
                        double mil4rezult = count7 * mil4;
                        String convertmil4 = String.format("%.4f", mil4rezult);
                        System.out.println("Мили:" + convertmil4);

                        double yard4 = 0.33;
                        double yard4rezult = count7 * yard4;
                        String convertyard4 = String.format("%.2f", yard4rezult);
                        System.out.println("Ярды:" + convertyard4);
                        break;

                    default:
                        System.out.println("Вы выбрали неверное значение. Начните заново!");
                }
        }

    if (choice > 2 || choice < 1) {
    System.out.println("Вы выбрали неверное значение. Начните заново!");
}
    }
}
