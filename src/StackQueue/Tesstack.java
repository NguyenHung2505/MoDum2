package StackQueue;

import java.util.Scanner;
import java.util.Stack;

public class Tesstack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String>stackChuoi = new Stack<String>();

//        stackChuoi.push("đưa gtri vào")==> đưa gtri vào stack
//        stackChuoi.pop()==> lấy gtri ra , xoá khỏi stack
//        stackChuoi.peek()==> lấy gtri ra, nhưng không xoá khỏi stack
//        stackChuoi.clear();==> xoá tất cả các phần tử trong stack
//        stackChuoi.contains("giatri")==> xác định gtri có tồn tại trong stack hay không
//        stackChuoi.size()==> độ lớn của stack

//        đảo ngược chuỗi

        System.out.println("nhập vào chuỗi: ");
        String s = sc.nextLine();

        for(int i = 0; i <s.length(); i ++){
            stackChuoi.push(s.charAt(i)+"");
        }
        System.out.println("chuỗi đảo ngược -- lấy ra: ");
        for(int i = 0 ; i <s.length();i ++){
            System.out.print(stackChuoi.pop());
        }


        System.out.println();
//        chuyển từ hệ thập phân sang hệ nhị phân
        Stack<String> stackSoDu = new Stack<String>();
        System.out.println("nhập 1 số nguyen từ bàn phím");
        int x = sc.nextInt();
        while (x>0){
            int soDu = x%2;
            stackSoDu.push(soDu + "");
            x = x/2;
        }
        System.out.println("số nhị phân là : ");
        int n = stackSoDu.size();
        for(int i = 0 ; i < n ; i ++){
            System.out.print(stackSoDu.pop());
        }



    }
}
