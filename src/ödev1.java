package dersler;

import java.math.*;
import java.util.Scanner;
public class ödev1 {

    public static void main(String[] args){
        Scanner giris = new Scanner(System.in);
        int a,b,c;
        double delta,x1,x2;
        System.out.println("İkinci dereceden denklemin köklerini bulma");
        System.out.println("ax^2+bx+c=0\n");
        System.out.print("a değerini giriniz:");
        a = giris.nextInt();
        System.out.print("b değerini giriniz:");
        b = giris.nextInt();
        System.out.print("c değerini giriniz:");
        c= giris.nextInt();

        delta = b*b-4*a*c;
        if (delta<0){
            System.out.println("Delta<0 Kök yoktur");
        }
        else if (delta == 0) {
            x1 = (-b+Math.sqrt(delta)/10)/2*a;
            System.out.println("Delta = 0 ve iki eşit kök vardır="+x1);
        }
        else if (delta>0){
            x1=(-b+Math.sqrt(delta)/10)/2*a;
            x2=(-b-Math.sqrt(delta)/10)/2*a;
            System.out.println("Delta>0 ve 2 farklı kök vardır");
            System.out.println("x1="+x1+"  x2="+x2);
        }
    }
}
