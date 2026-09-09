public class StudentGrading {

    public static void main(String[] args) {

        Student student1 = new HighSchoolStudent("Ysay", 710.0);
        Student student2 = new CollegeStudent("Seth", 14.50);
        Student student3 = new GraduateStudent("Baron", 15.00);

        System.out.println(student1.student + " GWA: " + student1.calculateGPA());
        System.out.println(student2.student + " GPA: " + student2.calculateGPA());
        System.out.println(student3.student + " GPA: " + student3.calculateGPA());
        
    }
}

class Student {
    String student;
    double grade;
    Student(String student, double grade) {
        this.student = student;
        this.grade = grade;
    }

    double calculateGPA() {
        return 0;
    }
}

class HighSchoolStudent extends Student {
    HighSchoolStudent(String student, double grade) {
        super(student, grade);
    }

    @Override
    double calculateGPA() {
        return grade / 8;
    }
}

class CollegeStudent extends Student {
    CollegeStudent(String student, double grade) {
        super(student, grade);
    }

    @Override
    double calculateGPA() {
        return grade / 10;
    }
}

class GraduateStudent extends CollegeStudent {
    GraduateStudent(String student, double grade) {
        super(student, grade);
    }

    @Override 
    double calculateGPA() {
        return super.calculateGPA();
    }
}