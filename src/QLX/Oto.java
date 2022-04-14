package QLX;

public class Oto extends Phuongtien {
        private int SoCho;

        public Oto() {};

        public Oto(String hang, String mau, String ten, int gia, int soCho) {
            super(hang, mau, ten, gia);
            this.SoCho = soCho;
        }

        public int getSoCho() {return SoCho;}
        public void setSoCho(int soCho) {SoCho = soCho;}


    @Override
    public String toString() {
        return "Oto{" + super.toString()+
                "SoCho=" + SoCho +
                '}';
    }
}


