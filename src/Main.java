import java.time.LocalDate;

public class Main {

    public static void checkYear(int annum) {
        if ((annum % 4) == 0 && (annum % 100 != 0)) {
            System.out.println(annum + " год является високосным");
        } else if ((annum % 400) == 0) {
            System.out.println(annum + " год является високосным");
        } else {
            System.out.println(annum + " год не является високосным");
        }

    }

    public static void version(char OS, int deviceYear) {
        String nameOS;
        if (OS == '0') {
            nameOS = "iOS";
        } else {
            nameOS = "Android";
        }
        int currentYear = LocalDate.now().getYear();
        if (deviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для " + nameOS);
        } else System.out.println("Установите обычную версию приложения для " + nameOS);

    }

    public static int Delivery(int distance) {
        int days=0;
        if (distance <= 20) {
            days = 1;
        } else if (distance > 20 && distance <= 60) {
            days = 2;
        } else if (distance > 60 && distance <= 100) {
            days = 3;
        }
        return days;
    }


    public static void main(String[] args) {
        System.out.println("Задача 1");
        int year = 2000;
        checkYear(year);

        System.out.println();

        System.out.println("Задача 2");
        char clientOSS = '0';
        int clientDeviceYear = 2024;
        version(clientOSS, clientDeviceYear);

        System.out.println();

        System.out.println("Задача 3");
        int deliveryDistance = 101;
        int totalDays = Delivery(deliveryDistance);
        if (deliveryDistance<=100) {
        System.out.println("Для доставки потребуется " + totalDays + " суток");
    } else { System.out.println("Доставки нет");
        }
    }
}
