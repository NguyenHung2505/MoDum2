package BoMayQuanLy;

import java.util.ArrayList;
import java.util.List;

public class QuanLyNguoi implements QuanLy<Nguoi>{
    private List<Nguoi>nguoiList = new ArrayList<Nguoi>();

    @Override
    public void them(Nguoi nguoi) {
        this.nguoiList.add(nguoi);
    }

    @Override
    public void hienThi() {
        for(int i = 0 ; i < nguoiList.size(); i ++){
            System.out.println(this.nguoiList.get(i));
        }

    }

    @Override
    public int viTri(int maN) {
        for(int i = 0 ; i < nguoiList.size();i++){
            if(this.nguoiList.get(i).getMaN()== maN){
                return i;
            }
        }
        return -1;
    }
}
