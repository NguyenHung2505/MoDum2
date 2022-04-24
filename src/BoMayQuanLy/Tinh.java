package BoMayQuanLy;

public class Tinh {
    private int id;
    private String name;
    private int danSo;
    private int gdp;

    public Tinh() {}

    public Tinh(int id, String name, int danSo, int gdp) {
        this.id = id;
        this.name = name;
        this.danSo = danSo;
        this.gdp = gdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public int getGdp() {
        return gdp;
    }

    public void setGdp(int gdp) {
        this.gdp = gdp;
    }

    @Override
    public String toString() {
        return "Tinh{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", danSo=" + danSo +
                ", gdp=" + gdp +
                '}';
    }
}
