package CanBo;

public class HaShiRu {
    public static void main(String[] args) {
        QuanLyCanBo quanLyCanBo = new QuanLyCanBo();

        quanLyCanBo.themCanBo(new CanBo("nguyen van A" , 25 ,"nam", "hn"));
        quanLyCanBo.themCanBo(new CongNhan(" nguyen van d",26,"nam","LAO CAI","3"));
        quanLyCanBo.themCanBo(new kySu("nguyen thi c" ,18 ,"nữ" , "NINH BÌNH","ĐAO ĐẤT"));
        quanLyCanBo.hienThi();
    }
}
