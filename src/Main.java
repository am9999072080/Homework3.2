public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    public static void task1() {
        System.out.println("Задача-1");
        int operationSystem = 0;
        if (operationSystem == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача-2");
        int operationSystem = 0;
        int releaseOfThePhone = 2014;
        if (operationSystem == 0) {
            if (operationSystem == 0) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else {
            if (operationSystem == 1) {
                if (operationSystem == 1) {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите версию приложения для Android по ссылке");
                }
            }
        }
    }

    public static void task3() {
        System.out.println("Задача-3");
        int year = 2021;
        boolean allYear = (year % 4 == 0) && ((year % 400 == 0 || (year % 100 != 0)));
        if (allYear) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }

    public static void task4() {
        System.out.println("Задача-4");
        int deliveryDistance = 100;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
            System.out.println("Для доставки потребуется дней:  " + deliveryDays);
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача-5");
        int monthNumber = 3;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Некоректный ввод");
        }
        }
    }
