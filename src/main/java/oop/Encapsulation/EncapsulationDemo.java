package oop.Encapsulation;

public class EncapsulationDemo {
    public static void main(String[] args){
        Student student = new Student();

        //access to private attribute
        String stuName = student.getName();
        System.out.println("Student Name : " + (stuName != null ? stuName : "No Name yet!"));

        //modify private attribute
        student.setName("Moe");
        System.out.println("Updated Student Name : " + student.getName());
    }
}
