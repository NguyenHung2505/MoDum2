package PeoPle;

import java.util.ArrayList;

public class KhuPho {
    ArrayList<Family> KhuPholist;


    public KhuPho() {
        this.KhuPholist = new ArrayList<>();
    }
    public void add(Family family) {
        KhuPholist.add(family);
    }
    public void display() {
        for (int i = 0; i < KhuPholist.size() ; i++) {
            System.out.println(KhuPholist.get(i));

        }
    }

    public int timKiem(String diachi){
        for(int i=0;i<KhuPholist.size();i++){
            if(this.KhuPholist.get(i).getDiachi().equals(diachi)){
                return i;
            }
        }
        return -1;
    }


    public void edit(String sothanhvien, Family family) {

        int indexOfFammily = family.timkiemm("sothanhvien");
        if (indexOfFammily == -1) {
            System.out.println("không có");
        }else {
            KhuPholist.set(indexOfFammily,family);
        }

    }
    public void delete(String name) {
        int indexOfFamily = -1;
        for(int i = 0; i< KhuPholist.size();i++){
            indexOfFamily = KhuPholist.get(i).timkiemm("id");
        }

        if (indexOfFamily == -1) {
            System.out.println("không có");
        }else {
            KhuPholist.remove(indexOfFamily);
        }
    }
}
