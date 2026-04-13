package org.example;

public class Homework_1 {
    static void main() {
        String name = "Иван";
        String jobTitle = "Кассир-шаурмист";
        int ratePerShift = 1000;
        int countShift = 5;
        int award = 2000;
        int fine = 500;
        int priceShawarma = 1750;
        int countSoldShawarma = 50;

        int salaryWithoutBonus = countShift * ratePerShift;
        int totalSalary = salaryWithoutBonus + award - fine;
        int revenue = priceShawarma * countSoldShawarma;

        System.out.println("Сотрудник: " + name);
        System.out.println("Должность: " + jobTitle);
        System.out.println("Оплата за смены: " + salaryWithoutBonus);
        System.out.println("Премия: " + award);
        System.out.println("Штраф: " + fine);
        System.out.println("Итоговая зарплата: " + totalSalary);
        System.out.println("Шаур-выручка: " + revenue);
    }
}
