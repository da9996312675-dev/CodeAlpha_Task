import java.util.ArrayList;
import java.util.Scanner;

public class studentgradetracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        // Input
        for (int i = 0; i < n; i++) {

            System.out.print("Enter Student Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Marks: ");
            int mark = sc.nextInt();
            sc.nextLine();

            names.add(name);
            marks.add(mark);
        }

        // Calculation
        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        for (int i = 0; i < marks.size(); i++) {

            total = total + marks.get(i);

            if (marks.get(i) > highest) {
                highest = marks.get(i);
            }

            if (marks.get(i) < lowest) {
                lowest = marks.get(i);
            }
        }

        double average = (double) total / n;

        // Output
        System.out.println("\n------ Student Report ------");

        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i) + " : " + marks.get(i));
        }

        System.out.println("----------------------------");
        System.out.println("Average Marks : " + average);
        System.out.println("Highest Marks : " + highest);
        System.out.println("Lowest Marks  : " + lowest);

        sc.close();
    }
}