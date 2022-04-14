package Bai1HocSinhVoLong;

public class HocSinh {

//   đây là thuộc tính : giới tính , tên tuổi
//    phương thức : chào , hỏi , nói
    private String Ten;
    private int Tuoi;
    private String GioiTinh;
    private double DiemToan;
    private double DieemHoa;
    private  double TongDiem;
    private double DiemLy;

    //    mô tả hành động với kiểu
    public void anuong(){
        System.out.println(" như con heo ");
    }

    public void lambaitap(){
        System.out.println(" đầy đủ ");
    }


//    (1) bắt đầu cách khai báo hàm tạo

//    tạo hàm tạo không đối:
//    mục đích là khi goi (psvm) main(chính) không phải khai lại thuộc tính
    public HocSinh() {
//        { khu vực có thể sữa đổi viết nội dung của hàm tạo}
        System.out.println(" tao mot hoc sinh");
    }

//    hàm tạo có đối:
//    dùng đến phương thức hay thuộc tính nào thì mới cần gọi ra .
//    không nhất thiết phải gọi tất cả
//    khi thuộc tính được gọi thì sẽ hiển thị khi đc gọi cả hàm classs.
    public HocSinh(String Ten , int Tuoi , String GioiTinh , double DiemToan , double DiemHoa, double DiemLy){
        this.Ten = Ten;
        this.Tuoi=Tuoi;
        this.GioiTinh=GioiTinh;
        this.DiemToan= DiemToan;
        this.DieemHoa = DiemHoa;
        this.DiemLy = DiemLy;
        this.TongDiem= TongDiem;
//        có thể trực tiếp tính toán ở trong hàm này luôn
//        TongDiem = this.DiemToan + this.DieemHoa;
    };
//    (1) kết thúc cách khai báo hàm tạo


// thông qua get và set để gọi khi dùng hình thức (mức truy cập) bao gói (private)
//     (private) khi không thông qua get vs set thì các class khác không gọi đc
//    thông qua get và set để lấy ra hoặc thay đổi giá trị của
//     từng thuộc tính từng , từng class.
    public String getTen() {return Ten;}
    public void setTen(String ten) {Ten = ten;}

//    thay đổi giá trị
    public int getTuoi() {return Tuoi;}
    public void setTuoi(int tuoi) {Tuoi = 20;}

//    thay đôi giá trị
    public String getGioiTinh() {return GioiTinh;}
    public void setGioiTinh(String gioiTinh) {GioiTinh = "Nam";}

    public double getDiemToan() {return DiemToan;}
    public void setDiemToan(double diemToan) {DiemToan = diemToan;}

    public double getDieemHoa() {return DieemHoa;}
    public void setDieemHoa(double dieemHoa) {DieemHoa = dieemHoa;}

// phương thức tính toán theo cấu trúc hàm gọi thuộc tính qua (get) (1)
    public double getTongDiem(){return TongDiem = DiemToan+DieemHoa;}
    public void setTongDiem(double TongDiem){TongDiem=TongDiem;}


////    phương thức rổng tính toán trực tiếp (2)
//    public void TongDiem(){
//        System.out.println(DieemHoa+DiemToan);
//    }


    @Override
    public String toString() {
        return "HocSinh{" +
                "Ten='" + Ten + '\'' +
                ", Tuoi=" + Tuoi +
                ", GioiTinh='" + GioiTinh + '\'' +
                ", DiemToan=" + DiemToan +
                ", DieemHoa=" + DieemHoa +
                ", TongDiem=" + TongDiem +
                '}';
    }
}

// nếu không đê public thì ta có thể tao nhiều hàm thoải mái
// nếu để public chúng ta phải để giống tên của tên fai
class Main{
    public static void main(String[] args) {
//truyền trực tiếp tham số vào (new) HocSinh
        HocSinh hs = new HocSinh();
//        truyền tham số cho thuộc tính bằng cách gọi rồi truyền
        hs.setDiemToan(4);
        hs.setDieemHoa(5);
        hs.setTen("nguyen van hung");

////        hiển thị (2)
//        hs.TongDiem();

//        hiển thị lấy ra (1)
        System.out.println("ten cua hoc sinh :"+ hs.getTen()+"\t" +"tong diem :" + hs.getTongDiem());
    }
}
