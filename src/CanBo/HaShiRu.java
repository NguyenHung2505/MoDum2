package CanBo;

import java.util.Scanner;

public class HaShiRu {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        quanLyCanBo.themCanBo(new CanBo("nguyen van A" , 25 ,"nam", "hn"));
        quanLyCanBo.themCanBo(new CongNhan(" nguyen van d",26,"nam","LAO CAI","3"));
        quanLyCanBo.themCanBo(new kySu("nguyen thi c" ,18 ,"nữ" , "NINH BÌNH","ĐAO ĐẤT"));
        quanLyCanBo.hienThi();

        System.out.println(" nhập tên cán bộ muốn tìm");
        String hoVaTen =sc.nextLine();
        System.out.println(quanLyCanBo.tim(hoVaTen));




        System.out.println(" nhập 0 để thoát chương trình");
         sc.nextInt();
        System.out.println(quanLyCanBo.thoat());



    }
}
