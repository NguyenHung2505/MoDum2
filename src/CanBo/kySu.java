package CanBo;

public class kySu extends CanBo{
    private String nganhDaoTao;

    public kySu() {}

    public kySu(String hoVaTen, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoVaTen, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;}

    public String getNganhDaoTao() {return nganhDaoTao;}
    public void setNganhDaoTao(String nganhDaoTao) {this.nganhDaoTao = nganhDaoTao;}

    @Override
    public String toString() {
        return super.toString() + "kySu{" +
                "nganhDaoTao='" + nganhDaoTao + '\'' +
                '}';
    }
}
