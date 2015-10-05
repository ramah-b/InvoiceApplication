
import java.util.Scanner;
import java.lang.Math;

public class InvoiceProg {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		double taxRate, subTotal=0, taxTotal=0, tempPrice;
		
		double[] priceArray = new double [100];
		
		
		int j, i = 0;

		System.out.println("Invoice Application");
		System.out.print("Tax Rate? ");
		taxRate = keyboard.nextDouble();

		System.out
				.println("Enter the list of prices. When finished, enter 0.0 ");

		do {
			System.out.print("Price # " + (i+1) + ": ");
			tempPrice = keyboard.nextDouble();
			if (tempPrice != 0.0) {
				priceArray[i] = tempPrice;
				i++;
			}

		} while (tempPrice != 0);
		
		keyboard.close();

		System.out.println("\n\n\n--------------------------------------\n\n\nReceipt");
		
		for (j=0; j<=i; j++){
			System.out.println(priceArray[j]);
			subTotal += priceArray[j];
			taxTotal += priceArray[j] * taxRate;
		}
		
		System.out.printf("%.2f subTotal %n", subTotal);
		System.out.printf("%.3f tax %n", taxTotal);
		System.out.printf("%.2f grand total", (subTotal + taxTotal));

		
		
		
		
	}

}
