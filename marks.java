import java.util.Scanner;
public class marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take marks as String input
        System.out.print("Enter marks for Subject 1: ");
        String mark1 = sc.nextLine();

        System.out.print("Enter marks for Subject 2: ");
        String mark2 = sc.nextLine();

        System.out.print("Enter marks for Subject 3: ");
        String mark3 = sc.nextLine();

        // Convert Strings to Integers
        int m1 = Integer.parseInt(mark1);
        int m2 = Integer.parseInt(mark2);
        int m3 = Integer.parseInt(mark3);

        // Calculate total
        int total = m1 + m2 + m3;

        // Display result
        System.out.println("\nTotal Marks = " + total);

        sc.close();
    }
}
