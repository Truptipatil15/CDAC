import java.util.Scanner;

public class PassFail {
    public static void main(String[] args) {
		int failCount = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the grade for Subject 1: ");
        int subject1 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 2: ");
        int subject2 = scanner.nextInt();

        System.out.print("Enter the grade for Subject 3: ");
        int subject3 = scanner.nextInt();
		
        if (subject1 <= 40) {
            failCount++;
        }
        if (subject2 <= 40) {
            failCount++;
        }
        if (subject3 <= 40) {
            failCount++;
        }

        if (failCount == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails in " + failCount + " subjects.");
        }
    }
}
