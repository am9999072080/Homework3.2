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
        int OperationSystem = 0;
        if (OperationSystem == 0) {
            System.out.println("Для iOS — «Установите версию приложения для iOS по ссылке");
        }
        if (OperationSystem == 1) {
            System.out.println("Для Android — «Установите версию приложения для Android по ссылке");
        }
    }

    public static void task2() {
        System.out.println("Задача-2");
        int OperationSystem = 0;
        int releaseOfThePhone = 2014;
        if (OperationSystem == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            if (OperationSystem == 1) {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
            if (releaseOfThePhone < 2015) {
                System.out.println("Для пользователей телефонов позже 2015 года выпуска и нужно вывести обычное предложение об установке приложения");
                if (releaseOfThePhone == 2015) {
                    System.out.println("Для года создания телефона используйте переменную clientDeviceYear, в которой необходимо указать 2015 год");
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
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("Потребуется дней: " + deliveryDistance + " срок доставки");
        }
        if (20 < deliveryDistance && deliveryDistance < 60) {
            System.out.println("Потребуется дней: " + deliveryDistance + " срок доставки");
        }
        if (60 <= deliveryDistance && deliveryDistance < 1000) {
            System.out.println("Потребуется дней: " + deliveryDistance + " срок доставки");
        } else {
            System.out.println("Свыше 100 км доставки нет");
        }
    }

    public static void task5() {
        System.out.println("Задача-5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
            case 2:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
            case 3:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
            case 4:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
            case 5:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону весна");
            case 6:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
            case 7:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
            case 8:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону лето");
            case 9:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
            case 10:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
            case 11:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону осень");
            case 12:
                System.out.println(monthNumber + "-й месяц принадлежит к сезону зима");
                break;
            default:
                if (monthNumber > 12) {
                    System.out.println(monthNumber + "-ого месяца нету в году");
                }
        }
    }
}