package dima.baianov;

public class Maim4 {
    public static void main(String[] args) {
        int x = 6;
        switch (x) {
            case 1:
                System.out.println("Понедельник");
                break;
            case 2:
                System.out.println("Вторник");
                break;
            case 3:
                System.out.println("Среда");
                break;
            case 4:
                System.out.println("Четверг");
                break;
            case 5:
                System.out.println("Пятница");
                break;
            case 6:
            case 7:
                System.out.println("Выходной");

                break;
            default:
                System.out.println("Неправильно введено число");
                break;
        }
    }
}

