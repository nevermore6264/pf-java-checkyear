import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Input a year : ");
        int year = scanner.nextInt();

        if (checkYear(year)) {
            System.out.printf("Leap year", year);
        } else {
            System.out.printf("Not leap year", year);
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
