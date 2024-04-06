import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        System.out.println(" ");
        System.out.println("Введите 0, если у вас iOS, или 1, если у вас android.");
        Scanner os = new Scanner(System.in);
        int clientOs = os.nextInt();
        switch (clientOs) {
            case 1:
                System.out.println("Уствновите приложение для Android по ссылке.");
                break;
            case 0:
                System.out.println("Установите приложение для iOS по ссылке.");
                break;
            default:
                System.out.println("Вы ввели что-то не то.");
        }
        System.out.println(" ");
        System.out.println("2 задача");
        Scanner os2 = new Scanner(System.in);
        System.out.println("Введите 0, если у вас эппл, и 1 если у вас Android ");
        int clientOs2 = os2.nextInt();
        if (clientOs2 < 0 || clientOs2 > 1) {
            System.out.println("Вы ввели некорректное значение");
            System.exit(0);
        }
        Scanner yearOs = new Scanner(System.in);
        System.out.println("В каком году выпущено ваше устройство?");
        int yearOfSystem = yearOs.nextInt();
        short lightVersion = 2015;
        if (clientOs2 > 1 || clientOs2 < 0) {
            System.out.println("Вы ввели что-то не то");
        } else if (clientOs2 == 0 && yearOfSystem < lightVersion) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOs2 == 0 && yearOfSystem >= lightVersion) {
            System.out.println("установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOs2 == 1 && yearOfSystem < lightVersion) {
            System.out.println("Установите версию для Android по ссылке");
        } else if (clientOs2 == 1 && yearOfSystem >= lightVersion){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        System.out.println(" ");
        System.out.println("3 задача");
        System.out.println("Введите любой год после 1584 г.");
        Scanner yearV = new Scanner(System.in);
        int year = yearV.nextInt();
        int year400 = year % 400;
        int year100 = year % 100;
        int year4 = year % 4;
        int visokosnyi = 1;
        if (year < 1584) {
            System.out.println("Вы ввели год до 1584");
        } else if (year400 == 0 || year4 == 0 && year100 != 0) {
            System.out.println("Этот год является високосным");
        } else {
            System.out.println("Этот год не является високосным");
        }

        System.out.println(" ");
        System.out.println("4 задача");
        System.out.println("Введите расстояние от банка до вас.");
        Scanner distance = new Scanner(System.in);
        int deliveryDistance = distance.nextInt();
        int deliveryTime = 0;
        if (deliveryDistance <= 20) {
            deliveryTime = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryTime = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryTime = 3;
        } else if (deliveryDistance > 100) {
            deliveryTime = 4;
        }
        switch (deliveryTime) {
            case 1:
                System.out.println("Потребуется дней - " + deliveryTime);
                break;
            case 2:
                System.out.println("Потребуется дней - " + deliveryTime);
                break;
            case 3:
                System.out.println("Потребуется дней - " + deliveryTime);
                break;
            case 4:
                System.out.println("В зоне свыше 100 километров, доставка не осуществляется");
                break;
            default:
                System.out.println("Введены некорректные данные.");
        }
        System.out.println(" ");
        System.out.println("5 задача");
        System.out.println("Введите номер месяца.");
        Scanner month = new Scanner(System.in);
        byte monthNumber = month.nextByte();
        if (monthNumber < 0 || monthNumber > 12) {
            System.out.println("Вы ввели недопустимое значение");
        }
        switch (monthNumber) {
            case 1:
                System.out.println("Сейчас зима");
                break;
            case 2:
                System.out.println("Сейчас зима");
                break;
            case 3:
                System.out.println("Сейчас весна");
                break;
            case 4:
                System.out.println("Сейчас весна");
                break;
            case 5:
                System.out.println("Сейчас весна");
                break;
            case 6:
                System.out.println("Сейчас лето");
                break;
            case 7:
                System.out.println("Сейчас лето");
                break;
            case 8:
                System.out.println("Сейчас лето");
                break;
            case 9:
                System.out.println("Сейчас осень");
                break;
            case 10:
                System.out.println("Сейчас осень");
                break;
            case 11:
                System.out.println("Сейчас осень");
                break;
            case 12:
                System.out.println("Сейчас зима");
                break;
            default:
        }
    }
}