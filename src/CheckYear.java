import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input a year : ");
        int yearbefore = scanner.nextInt();
        System.out.println("Input a year : ");
        int yearafter = scanner.nextInt();
        for (int i = yearbefore; i < yearafter; i++) {
            if (checkYear(i)) {
                System.out.println("Year " + i + " has 366 days");
            } else {
                System.out.println("Year " + i + " has 365 days");
            }
        }
    }

    public static boolean checkYear(int year) {
        boolean check4 = year % 4 == 0;
        if (check4) {
            boolean check100 = year % 100 == 0;
            if (check100) {
                boolean check400 = year % 400 == 0;
                if (check400) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }
}
