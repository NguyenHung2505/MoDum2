package GiaiPhuongTrinh;

import java.util.Scanner;

public class TimSoNguyenTo {
    public static void main(String[] args) {
        int n;
        boolean ok = true;

        Scanner sc = new Scanner(System.in);
        System.out.println("nhập n : " );
        n = sc.nextInt();

        for ( int i = 2 ; i < n -1 ; i ++){
            if (n%2 == 0){
                ok = false;
                break;
            }
        }
        if ( ok == true) {
            System.out.println("" + n + " SNT");
        } else {
            System.out.println("" +n + "khong phai snt");
        }

    }

}
