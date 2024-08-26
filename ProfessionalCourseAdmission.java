import java.util.Scanner;

public class ProfessionalCourseAdmission {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        int[] mathsMarks = new int[numStudents];
        int[] physicsMarks = new int[numStudents];
        int[] chemistryMarks = new int[numStudents];

        System.out.println("Enter the marks for each subject for each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Student " + (i + 1) + ":");
            System.out.print("Mathematics: ");
            mathsMarks[i] = scanner.nextInt();
            System.out.print("Physics: ");
            physicsMarks[i] = scanner.nextInt();
            System.out.print("Chemistry: ");
            chemistryMarks[i] = scanner.nextInt();
        }

        System.out.println("\nList of eligible candidates:");

        for (int i = 0; i < numStudents; i++) {
            if ((mathsMarks[i] >= 60 && physicsMarks[i] >= 50 && chemistryMarks[i] >= 40 &&
                    (mathsMarks[i] + physicsMarks[i] + chemistryMarks[i]) >= 200) ||
                    (mathsMarks[i] + physicsMarks[i] >= 150)) {
                System.out.println("Student " + (i + 1));
            }
        }

        scanner.close();
    }
}
