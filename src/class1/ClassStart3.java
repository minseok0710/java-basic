package class1;

public class ClassStart3 {

    static void main() {
        Student student1;
        student1 = new Student();
        student1.name = "학생1";
        student1.age = 15;
        student1.grade = 90;

        Student student2 = new Student();
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        Student student3 = new Student();
        student3.name = "학생3";
        student3.age = 17;
        student3.grade = 70;

        System.out.println(student1.name + student1.age + student1.grade);
        System.out.println(student2.name + student2.age + student2.grade);
        System.out.println(student3.name + student3.age + student3.grade);
    }
}
