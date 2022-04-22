package CacThiSinhThiDH;

import java.util.ArrayList;
import java.util.List;

public class phuongThucQuanLy implements QuanLyTuyenSinh<QuanLyThiSinhDuThi>{
    private List<QuanLyThiSinhDuThi>quanLyThiSinhDuThiList = new ArrayList<QuanLyThiSinhDuThi>();

    @Override
    public void themMoiThiSinh(QuanLyThiSinhDuThi quanLyThiSinhDuThi) {
        this.quanLyThiSinhDuThiList.add(quanLyThiSinhDuThi);
    }

    @Override
    public void htThongTinThiSinhvaKhoithi() {
        for(int i=0; i <quanLyThiSinhDuThiList.size() ; i ++){
            System.out.println(quanLyThiSinhDuThiList.get(i));
        }

    }

    @Override
    public int timKiemTheoSBD(int soBaoDanh) {
        for(int i = 0 ; i < quanLyThiSinhDuThiList.size() ; i ++){
            if(this.quanLyThiSinhDuThiList.get(i).getSoBaoDanh()== soBaoDanh){
                return i;
            }
        }
        return -1;

    }

    @Override
    public int thoatChuongTrinh() {
  System.exit(0);
  return 0;
    }
}
