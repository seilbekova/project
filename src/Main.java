
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Aruzhan", "1", "IT");
        Student s2 = new Student("Dias", "2", "CS");
        Student s3 = new Student("Alina", "3", "SE");
        Student s4 = new Student("Miras", "4", "IT");
        Student s5 = new Student("Dana", "5", "CS");

        s1.setGpa(3.8);
        s2.setGpa(3.1);
        s3.setGpa(3.9);
        s4.setGpa(2.7);
        s5.setGpa(3.6);

        s1.addCredits(90);
        s2.addCredits(70);
        s3.addCredits(100);
        s4.addCredits(60);
        s5.addCredits(85);

        Student[] arr = {s1, s2, s3, s4, s5};

        System.out.println("All students:");
        for (Student s : arr) {
            System.out.println(s);
        }
        System.out.println();

        System.out.println("Top student: " + getTopStudent(arr));
        System.out.println("Honors students: " + countHonors(arr));
        System.out.println("Total credits: " + totalCredits(arr));
        System.out.println();

        Course javaCourse = new Course("Java Programming", "Dr. Smith", 10);
        javaCourse.addStudent(s1, 0);
        javaCourse.addStudent(s2, 1);
        javaCourse.addStudent(s3, 2);
        javaCourse.addStudent(s4, 3);
        javaCourse.addStudent(s5, 4);

        System.out.println("Course: " + javaCourse);
        System.out.println("Highest credit student: " + javaCourse.highestCreditStudent().getName());
        System.out.println("Course average GPA: " + String.format("%.2f", javaCourse.courseAverageGPA()));
    }

    public static Student getTopStudent(Student[] arr) {
        Student best = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i].getGpa() > best.getGpa()) best = arr[i];
        }
        return best;
    }

    public static int countHonors(Student[] arr) {
        int count = 0;
        for (Student s : arr) {
            if (s.isHonors()) count++;
        }
        return count;
    }

    public static int totalCredits(Student[] arr) {
        int total = 0;
        for (Student s : arr) {
            total += s.getCredits();
        }
        return total;
    }
}
