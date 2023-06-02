import java.time.LocalDate;

public class Main {

    public static void checkAndPrintLeapYear(int year) {
        if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год - невисокосным год");
        }
    }

    public static void checkPhoneOs(int os, int clientDeviceYear) {
        int currentYear = LocalDate.now().getYear();
        if (clientDeviceYear >= currentYear) {
            if (os == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (os == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }

    public static void calculateDeliveryTime(int deliveryDistance) {
        int days = 1;
        if (deliveryDistance <= 100) {
            days += 2;
            if (deliveryDistance <= 60) {
                days -= 1;
                if (deliveryDistance <= 20) {
                    days -= 1;
                }
            }
            System.out.println("Потребуется дней на доставку: " + days);
        } else {
            System.out.println("Приносим свои извенения, доставка в отдаленные районы не осуществляется :(");
        }
    }


    public static void main(String[] args) {
//        Задание 1
        System.out.println("Задание 1");
        int year = 2020;
        checkAndPrintLeapYear(year);
//       Задание 2
        System.out.println("Задание 2");
        int clientDeviceYear = 2023;
        int clientOs = 0;
        checkPhoneOs(clientOs, clientDeviceYear);
//        Задание 3
        System.out.println("Задание 3");
        int deliveryDistance =95;
        calculateDeliveryTime(deliveryDistance);

    }
}