package CacThiSinhThiDH;

public class Chay {
    public static void main(String[] args) {
        phuongThucQuanLy phuongThucQuanLy1=new phuongThucQuanLy();
        phuongThucQuanLy1.themMoiThiSinh(new QuanLyThiSinhDuThi(123,"nguyen van a","hn",2));
        phuongThucQuanLy1.themMoiThiSinh(new QuanLyThiSinhDuThi(124,"nguyen van b","hn2",4));
        phuongThucQuanLy1.themMoiThiSinh(new QuanLyThiSinhDuThi(125,"nguyen van c","hn3",5));
        phuongThucQuanLy1.themMoiThiSinh(new QuanLyThiSinhDuThi(126,"nguyen van d","hn4",3));
        phuongThucQuanLy1.htThongTinThiSinhvaKhoithi();
    }


}
