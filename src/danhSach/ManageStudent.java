package danhSach;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ManageStudent {
    ArrayList<Student> students;

    public ManageStudent() {
        this.students = new ArrayList<>();
    }

    public void add(Student student){
        students.add(student);
    }

    public void fhienthi(){
        for(int i =0 ; i<students.size();i ++){
            System.out.println(students.get(i));
        }
        System.out.println("---------------");
    }


    public int timkiem (int id){
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }

    public void sua ( int id , Student student){
        int indexOfStudent=timkiem(id);
        if(indexOfStudent == -1){
            System.out.println("khong co");
        } else{
            students.set(indexOfStudent,student);
        }
    }

    public void xoa (int id){
        int indexOfStudent=timkiem(id);
        if(indexOfStudent == -1){
        } else{
            students.remove(indexOfStudent);
        }
    }

    public void sapxep(){
        Collections.sort(this.students);
    }

}
