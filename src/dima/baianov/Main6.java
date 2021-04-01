package dima.baianov;

public class Main6 {
    public static void main(String[] args) {

        int n = 1;
        do {
            if(n%5==0 ) {
                System.out.println(n++);
            }else {
                n++;
            }

        } while (n <= 100);



    }
}

