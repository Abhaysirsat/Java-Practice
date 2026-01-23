// import java.util.*;

class Student{
    int id;
    int roll;
    String name;

    Student(int a, int b, String s){
        this.id = a;
        this.roll = b;
        this.name = s;
    }

    void show(){
        System.out.println("ID:" + id);
        System.out.println("Roll:" + roll);
        System.out.println("Name:" + name);    
    }

    public static void main (String args[]){
        Student s = new Student(1001,60,"XYZ");
        s.show();

    }
}