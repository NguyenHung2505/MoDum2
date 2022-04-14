package HinhHoc;

import java.util.Scanner;

public class Testhinhhoc {
    public static void main(String[] args) {

        System.out.println("nhap vao bán kính :");
        Scanner sc = new Scanner(System.in);
        double bankinh = sc.nextDouble();

        System.out.println("nhap chieu cao h:");
        Scanner sa = new Scanner(System.in);
        double h = sa.nextDouble();


        hinhtron ht = new hinhtru(bankinh,"1", h);
        System.out.println(ht.dienTich());

        hinhtru htr = new hinhtru(bankinh,"2", h);
        System.out.println(htr.tTich());
    }

}
