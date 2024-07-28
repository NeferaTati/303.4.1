import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your filing status (single, married filing jointly, married filing separately, head of household): ");

        String status = scanner.nextLine().toLowerCase();

        System.out.println("Enter your taxable income: ");

        double income = scanner.nextDouble();

        double tax = 0;

        switch (status) {

            case "single":

                if (income <= 8350) {

                    tax = income * 0.10;

                } else if (income <= 33950) {

                    tax = 835 + (income - 8350) * 0.15;

                } else if (income <= 82250) {

                    tax = 4675 + (income - 33950) * 0.25;

                } else if (income <= 171550) {

                    tax = 16750 + (income - 82250) * 0.28;

                } else if (income <= 372950) {

                    tax = 41754 + (income - 171550) * 0.33;

                } else {

                    tax = 108216 + (income - 372950) * 0.35;

                }

                break;

            case "married filing jointly":

                if (income <= 16700) {

                    tax = income * 0.10;

                } else if (income <= 67900) {

                    tax = 1670 + (income - 16700) * 0.15;

                } else if (income <= 137050) {

                    tax = 9350 + (income - 67900) * 0.25;

                } else if (income <= 208850) {

                    tax = 26650 + (income - 137050) * 0.28;

                } else if (income <= 372950) {

                    tax = 46742 + (income - 208850) * 0.33;

                } else {

                    tax = 101086 + (income - 372950) * 0.35;

                }

                break;

            case "married filing separately":

                if (income <= 8350) {

                    tax = income * 0.10;

                } else if (income <= 33950) {

                    tax = 835 + (income - 8350) * 0.15;

                } else if (income <= 68525) {

                    tax = 4675 + (income - 33950) * 0.25;

                } else if (income <= 104425) {

                    tax = 13325 + (income - 68525) * 0.28;

                } else if (income <= 186475) {

                    tax = 23371 + (income - 104425) * 0.33;

                } else {

                    tax = 50543 + (income - 186475) * 0.35;

                }

                break;

            case "head of household":

                if (income <= 11950) {

                    tax = income * 0.10;

                } else if (income <= 45500) {

                    tax = 1195 + (income - 11950) * 0.15;

                } else if (income <= 117450) {

                    tax = 6227 + (income - 45500) * 0.25;

                } else if (income <= 190200) {

                    tax = 24215 + (income - 117450) * 0.28;

                } else if (income <= 372950) {

                    tax = 44517 + (income - 190200) * 0.33;

                } else {

                    tax = 104667 + (income - 372950) * 0.35;

                }

                break;

            default:

                System.out.println("Invalid filing status");

                return;

        }

        System.out.println("The tax is: " + tax);

    }

}c