package BoMayQuanLy;

public class Nguoi {
    private int id;
    private String name;
    private int tuoi;
    private Tinh tinh;

    public Nguoi() {}

    public Nguoi(int id, String name, int tuoi, Tinh tinh) {
        this.id = id;
        this.name = name;
        this.tuoi = tuoi;
        this.tinh = tinh;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public Tinh getTinh() {
        return tinh;
    }

    public void setTinh(Tinh tinh) {
        this.tinh = tinh;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tuoi=" + tuoi +
                ", tinh=" + tinh +
                '}';
    }
}
