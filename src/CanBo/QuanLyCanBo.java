package CanBo;

import ConNguoi.Hito;
import QLX.XeMay;

import java.util.ArrayList;
import java.util.List;

public class QuanLyCanBo implements QuanLy<CanBo>{
    private List<CanBo> canBoList = new ArrayList<CanBo>();


    @Override
    public void themCanBo(CanBo canBo) {
        this.canBoList.add(canBo);

    }

    @Override
    public int tim(String ten) {
        for (int i = 0 ; i < canBoList.size() ; i ++){
            if (this.canBoList.get(i).getHoVaTen()==ten){
                return i;
            }
        }
        return -1;

    }

    @Override
    public void hienThi() {
        for (int i = 0; i < canBoList.size(); i++) {
        System.out.println(canBoList.get(i));
    }
    }

    @Override
    public void thoat(CanBo canBo) {
        System.exit(0);


    }
}
