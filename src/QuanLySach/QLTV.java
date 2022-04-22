package QuanLySach;

import java.util.ArrayList;
import java.util.List;

public class QLTV implements QuanLySach<QuanLyCacTaiLieu>{
    private List<QuanLyCacTaiLieu> quanLyCacTaiLieuList = new ArrayList<QuanLyCacTaiLieu>();


    @Override
    public void themMoiTaiLieu(QuanLyCacTaiLieu quanLyCacTaiLieu) {
        this.quanLyCacTaiLieuList.add(quanLyCacTaiLieu);

    }

    @Override
    public void hienThiThongTinTaiLieu() {
        for(int i=0; i <quanLyCacTaiLieuList.size() ; i ++){
            System.out.println(quanLyCacTaiLieuList.get(i));
        }

    }

    @Override
    public int timKiemTaiLieuTheoLoai(String maTaiLieu) {
        for (int i = 0; i < quanLyCacTaiLieuList.size(); i++) {
            if(this.quanLyCacTaiLieuList.get(i).getMaTaiLieu() == maTaiLieu){
                return i;
            }
        }
        System.out.println("không có trong tài liệu này !");
        return -1;
    }

    @Override
    public int thoatKhoiChuongTrinh() {
        System.exit(0);
        return 0;

    }
}
