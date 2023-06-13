import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int km;
        double perKm = 2.2, total = 10;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of distance in km's");
        km = input.nextInt();
        total += km * perKm;
        total = (total < 20) ? 20 : total;
        System.out.println("total amount => " + total);
    }
}
