class Student {
    int idNumber;
    int hoursEarned;
    int pointsEarned;
    double gpa;

    public Student() {
        assignValues(9999, 0, 0); 
        gpa = 4.0;
    }

    public Student(int idNumber, int hoursEarned, int pointsEarned) {
        assignValues(idNumber, hoursEarned, pointsEarned);
    }

    void assignValues(int idNumber, int hoursEarned, int pointsEarned) {
        this.idNumber = idNumber;
        this.hoursEarned = hoursEarned;
        this.pointsEarned = pointsEarned;
        calculateGPA();
    }

    void calculateGPA() {
        if (hoursEarned != 0) {
            gpa = (double) pointsEarned / hoursEarned;
        } else {
            gpa = 0.0;
        }
    }

    void display() {
        System.out.println("Student ID: " + idNumber);
        System.out.println("Credit Hours Earned: " + hoursEarned);
        System.out.println("Points Earned: " + pointsEarned);
        System.out.println("GPA: " + gpa);
    }
}

public class Activity2_Verdad_ShowStudent {
	public static void main(String[] args) {	
		Student student0 = new Student();
        student0.display();
        System.out.println();

        Student student1 = new Student(1234, 15, 48);
        System.out.println("Student 1:");
        student1.display();
        System.out.println();	
        
        Student student2 = new Student(1235, 20, 50);
        System.out.println("Student 2:");
        student2.display();
        System.out.println();       
	}
}