package PeoPle;

public class TestKhupho {
    public static void main(String[] args) {
        KhuPho khuPho = new KhuPho();
        Family family1 = new Family();
        PeoPle peoPle1 = new PeoPle("kk", "12", "sv", "12345");
        family1.setDiachi("hn");
       family1.add(peoPle1);
        khuPho.add(family1);
        khuPho.display();

    }
    }