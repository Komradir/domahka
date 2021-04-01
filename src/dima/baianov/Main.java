package dima.baianov;

import java.util.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){


        System.out.println("Введите число:");
        int a = new Scanner(System.in).nextInt();



        if(a%2==0){
            System.out.println("Число "+a+" - четное");
        }
        else {
            System.out.println("Число "+a+" - нечетное");
        }
    }
}