package danhSach;

public class Main {
    public static void main(String[] args) {
        ManageStudent manageStudent= new ManageStudent();

        manageStudent.add(new Student(123,"hoang van nam",24));
        manageStudent.add(new Student(121,"ngo van ha",16));
        manageStudent.add(new Student(122,"le thi hong",25));
        manageStudent.add(new Student(124,"trinh xuan quyet",18));
        manageStudent.fhienthi();

        System.out.println(manageStudent.timkiem(124));

        manageStudent.sua(121, new Student(126, "nguyen van quang" ,14));
        System.out.println("sau khi sua" );
        manageStudent.fhienthi();

        System.out.println("sau khi xoa");
        manageStudent.xoa(124);
        manageStudent.fhienthi();

        System.out.println("sau khi sap xep :");
        manageStudent.sapxep();
        manageStudent.fhienthi();

    }
}
