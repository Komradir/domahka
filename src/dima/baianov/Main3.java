package dima.baianov;

public class Main3 {
    public static void main(String[] args) {
        double число = 5;
        String день_недели;
        if(число == 1 ){
            день_недели = "понедельник";
        } else if (число == 2) {
            день_недели = "вторник";
        } else if (число == 3) {
            день_недели = "среда";
        } else if (число == 4) {
            день_недели = "четверг";
        } else if (число == 5) {
            день_недели = "пятница";
        } else if (число == 6 || число == 7 ) {
            день_недели = "Выходной";
        } else {
            день_недели = "не день недели";
        }
        System.out.println(день_недели);
    }
}
