package PeoPle;

import danhSach.Student;

public class Test {
    public static void main(String[] args) {
        Family family = new Family();

        family.add(new PeoPle("hoang van nam","23","sv","123"));

        PeoPle peoPle1=new PeoPle("hoang van nam","23","sv","123");
        family.add(peoPle1);

        family.add(new PeoPle("le thi hoa","12","hs","124"));

        family.setDiachi("thanh hoa");
        family.noihienthi();





        family.add(peoPle1);
        family.add(new PeoPle("nam thi thai","18","cong nhan","125"));



        family.noihienthi();


        System.out.println("tim theo id :");
        System.out.println(family.timkiemm("124"));
        family.noihienthi();

        System.out.println("sau khi xoa");
        family.xoa("123");
        family.noihienthi();
        PeoPle peoPle5=new PeoPle("kk","12","cv","123");
        family.suaa("124",peoPle5);
        family.noihienthi();







    }

}
