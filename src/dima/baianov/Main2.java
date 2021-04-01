package dima.baianov;

import java.util.*;
import java.util.Scanner;
public class Main2 {
    public static void main(String[] args){

        System.out.println("Введите число:");


        double i = new Scanner(System.in).nextInt();



//       true && true == true
//       true && false == false
//
//        true || false == true
//        5 > 10 == false
//        5 < 10 && 5 > 2 == true


        if(0 < i && i < 10){
            System.out.println("Положительное число меньше 10");
        }
        else {
            System.out.println("Положительное число больше 10 или отрицательное");
        }
    }
}
