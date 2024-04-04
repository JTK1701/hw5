import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("1 задача");
        System.out.println(" ");
        System.out.println("Введите 0, если у вас iOS, или 1, если у вас android.");
        Scanner os = new Scanner(System.in);
        int operSys = os.nextInt();
        switch (operSys) {
            case 1:
                System.out.println("Уствновите приложение для андроид.");
                break;
            case 0:
                System.out.println("Установите приложение для яблока");
                break;
            default:
                System.out.println("Вы ввели что-то не то.");
        }
        System.out.println(" ");
        System.out.println("2 задача");
        Scanner os2 = new Scanner(System.in);
        System.out.println("Введите 0, если у вас эппл, версии ос до 15 года и 1, если после. 2, если у вас андроид версии до 15 года или 3, если после.");
        byte os15 = os2.nextByte();
        switch (os15) {
            case 0:
                System.out.println("Установите приложение для iOS.");
                break;
            case 1:
                System.out.println("Установите облегченную версию для iOS по ссылке.");
                break;
            case 2:
                System.out.println("Установите приложение для android.");
                break;
            case 3:
                System.out.println("Установите облегченную версию для android по ссылке.");
                break;
            default:
                System.out.println("Вы ввели что-то не то.");
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
            visokosnyi = 3;
        } else if (year100 == 0) {
            visokosnyi = 1;
        } else if (year400 == 0 || year4 == 0) {
            visokosnyi = 0;
        }
        switch (visokosnyi) {
            case 1:
                System.out.println("Этот год не является високосным.");
                break;
            case 0:
                System.out.println("Этот год является високосным.");
                break;
            default:
                System.out.println("Вы ввели год до 1584.");
                break;
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
                System.out.println("Вы ввели недопустимое значение ");
        }
    }
}