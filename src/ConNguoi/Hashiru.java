package ConNguoi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Hashiru {
    public static void main(String[] args) {
        Kazoku kazoku = new Kazoku();
        List<Kazoku>kazokuList=new ArrayList<Kazoku>();
        Scanner so=new Scanner(System.in);
        Scanner chu= new Scanner(System.in);
        int luachon = 0;
        do{
            System.out.println("--->manu<---");
            System.out.println("chọn chức năng");
            System.out.println(
               "1. Thêm người vào List .\n" +
                       "2. In List người ra màn hình.\n" +
                       "3. xoá người khỏi list.\n" +
                       "4. Tìm kiếm người theo số cmnd.\n" +
                       "5. Xuất ra danh sách người có tuổi từ cao đến thấp.\n"+
                       "0. Thoát chương trình "
            );
                        luachon = so.nextInt();
            if (luachon==1){
                System.out.println("nhập tên người :" ); String ten = chu.nextLine();
                System.out.println("nhập tuổi người :" ); int tuoi = so.nextInt();
                System.out.println("nhập công việc người :" ); String cv = chu.nextLine();
                System.out.println("nhập số cmnd người :" ); int cmnd = so.nextInt();
                System.out.println("nhập địa chỉ : "); String diaChi = chu.nextLine();
                Hito ht = new Hito(ten,tuoi,cv,cmnd);
                kazoku.setDiaChi(diaChi);
                kazoku.add(ht);
            }else if(luachon==2){
//                2. In List người ra màn hình
                kazoku.hienThi();

            }else if(luachon==3){
                System.out.println("nhập tên người xoá :");
                String name = chu.nextLine();
                kazoku.xoaa(name);

            }else if(luachon==4){

            }else if(luachon==5){

            }

            }while(luachon!=0);

    }



}
