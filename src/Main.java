import java.text.NumberFormat;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principle:");
        int principle = scanner.nextInt();

        System.out.print("Annual Interest Rate:");
        double rate = scanner.nextDouble();

        System.out.print("Period (years):");
        int period = scanner.nextInt();

        double r = rate/100/12;
        double n = period *12;
        double power = Math.pow((1+r), n);

        double mortgage =principle*r*power/(power-1);
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.print("Mortgage: " +mortgageFormatted);
    }
    }
