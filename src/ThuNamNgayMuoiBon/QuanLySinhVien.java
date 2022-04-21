//package ThuNamNgayMuoiBon;
//
//import java.util.Arrays;
//
//public class QuanLySinhVien implements QuanLy<SinhVien1> {
//    private SinhVien1[] DanhSach1 = new SinhVien1[3];
//    private int size = 0;
//
//// khai báo ,  khởi tạo thêm 1 mảng rỗng
////   sau khi bị xoá bớt phần tử dùng để xếp lại các phần tử vào mảng mới này .
//    private SinhVien1[] DanhSachXoaa;
//
//
//
//    @Override
//    public void Them(SinhVien1 sinhVien) {
//        DanhSach1[size]= sinhVien;
//        size++;}
//
//    @Override
//    public void Sua(String id, SinhVien1 sinhVien) {
//        DanhSach1[Timkiemm(id)]=sinhVien;}
//
//
//    @Override
//    public int Timkiemm(String id) {
//        for (int i = 0; i < size; i++) {
//            if (id == DanhSach1[i].getId()){
//                return i;
//            }
//        }
//        return -1;
//    }
//
//
//    @Override
//    public void Hienthi() {}
//
////    tạo main vòng lặp để hiển thị
//    @Override
//    public void print() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(DanhSach1[i]);
//        }
//    }
//
////    xoá đi phần tử theo vị trí [i] trong mảng .
//
//    @Override
//    public void Xoa(String id) {
//        DanhSachXoaa = new SinhVien1[size-1];
//        int viTri1 = Timkiemm(id);
//        if (viTri1 != -1 ){
//            for (int i = 0; i < DanhSachXoaa.length; i++) {
//                DanhSachXoaa[i]= DanhSach1[i];
//            }
//            for (int i = viTri1 ; i < size - 1; i++){
//                DanhSachXoaa[i] = DanhSach1[i + 1];
//            }
//        } else {
//            System.out.println("Khong tim thay!");
//        }
//
//    }
//
////    sắp xếp theo tứ tự ví dụ (id)
//    @Override
//    public void Sapxep() {
//        int[] SinhVien1 = new int[0];
//        Arrays.sort(SinhVien1);
//        }
//
//
//
//    @Override
//    public void print2() {
//        for (int i = 0; i < size; i++) {
//            System.out.println(DanhSach1[i]);
//        }
//    }
//
//
//
//
//
//    public static void main(String[] args) {
//        QuanLySinhVien ql = new QuanLySinhVien();
//        System.out.println("DANH SÁCH SINH VIÊN ĐƯỢC TẠO ");
//        SinhVien1 sv1= new SinhVien1("131", " Hoang Van cach","18", 5 );
//        SinhVien1 sv2= new SinhVien1("132", " toan Van Bach","19",7);
//        SinhVien1 sv3= new SinhVien1("133", " moan Van ach","20",8);
//        ql.Them(sv1);
//        ql.Them(sv2);
//        ql.Them(sv3);
//        System.out.println("KHU VỰC HIỂN THỊ---->");
//
//        System.out.println("vị trí trong mảng :" + ql.Timkiemm("133"));
//        ql.print();
//
//        System.out.println(" sửa chữa , thay đổi thông tin");
//        SinhVien1 sv4= new SinhVien1("134","Phung Nam Thu","25",4);
//        ql.Sua("132", sv4);
//        ql.print();
//
//        System.out.println(" xoá bớt phần tử :");
//        ql.Xoa("133");
//        ql.print2();
//
//        System.out.println("----Sau khi sap xep-----" );
//        ql.Sapxep();
//
//
//
//
//
//    }
//
//}
