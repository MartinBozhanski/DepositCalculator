import java.util.Scanner;

public class DepositCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double amount = Double.parseDouble(scanner.nextLine());
        int term =Integer.parseInt(scanner.nextLine());
        double interest = Double.parseDouble(scanner.nextLine());

        double sum = amount + term * ((amount*(interest*0.01))/12);

        System.out.println(sum);
    }
}
