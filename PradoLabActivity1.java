import java.util.Scanner;

public class PradoLabActivity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a binary string (0 and 1 only): ");
        String input = scanner.nextLine();

        String state = "q0";

        for (int i = 0; i < input.length(); i++) {
            char symbol = input.charAt(i);

            switch (state) {
                case "q0":
                    if (symbol == '0') state = "q1";
                    else if (symbol == '1') state = "q0";
                    break;

                case "q1":
                    if (symbol == '0') state = "q1";
                    else if (symbol == '1') state = "q2";
                    break;

                case "q2":
                    if (symbol == '0') state = "q1";
                    else if (symbol == '1') state = "q0";
                    break;

            }
        }

        if (state.equals("q2")){
            System.out.println("Accepted");
        } else {
            System.out.println("Rejected");
        }

        scanner.close();
    }
}
