package class1;

public class ClassStart5 {

    static void main() {
        Student student1 = new Student();
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

        Student[] students = new Student[] {student1,student2,student3};

        for(int i = 0; i < students.length; i++){
            System.out.println(students[i].name + students[i].age + students[i].grade);
        }

        for (Student s : students) { // iter(향상된 for문)
            System.out.println(s.name + s.age + s.grade);
        }


        System.out.println(students[0].name + students[0].age + students[0].grade);
        System.out.println(students[1].name + students[1].age + students[1].grade);
        System.out.println(students[2].name + students[2].age + students[2].grade);
        
    }
}
