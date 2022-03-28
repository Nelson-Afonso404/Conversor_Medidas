package conversor;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Conversor {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat formatador = new DecimalFormat("#0.0000000");
		double n1, medida;
		System.out.println("digite o valor a ser convertido:");
		n1 = input.nextDouble();
		System.out.println(" qual a medida?"
				+ "\n (1) Km "
				+ "\n (2) Hm "
				+ "\n (3) Dam "
				+ "\n (4) M "
				+ "\n (5) Dm "
				+ "\n (6) Cm "
				+ "\n (7) Mm ");
		medida = input.nextDouble();
		if (medida == 1) {
			System.out.println(n1 + "Km" + " convertido em:");
			System.out.println(formatador.format(n1*10) + "hm");
			System.out.println(formatador.format(n1*100) + "dam");
			System.out.println(formatador.format(n1*1000) + "m");
			System.out.println(formatador.format(n1*10000) + "dm");
			System.out.println(formatador.format(n1*100000) + "cm");
			System.out.println(formatador.format(n1*1000000) + "mm");
		}else if (medida == 2) {
			System.out.println(n1 + "Hm" + " convertido em:");
			System.out.println(formatador.format(n1/10) + "km");
			System.out.println(formatador.format(n1*10) + "dam");
			System.out.println(formatador.format(n1*100) + "m");
			System.out.println(formatador.format(n1*1000) + "dm");
			System.out.println(formatador.format(n1*10000) + "cm");
			System.out.println(formatador.format(n1*100000) + "mm");
		}else if (medida == 3) {
			System.out.println(n1 + "Dam" + " convertido em:");
			System.out.println(formatador.format(n1/100) + "km");
			System.out.println(formatador.format(n1/10) + "hm");
			System.out.println(formatador.format(n1*10) + "m");
			System.out.println(formatador.format(n1*100) + "dm");
			System.out.println(formatador.format(n1*1000) + "cm");
			System.out.println(formatador.format(n1*10000) + "mm");
		}else if (medida == 4) {
			System.out.println(n1 + "M" + " convertido em:");
			System.out.println(formatador.format(n1/1000) + "km");
			System.out.println(formatador.format(n1/100) + "hm");
			System.out.println(formatador.format(n1/10) + "dam");
			System.out.println(formatador.format(n1*10) + "dm");
			System.out.println(formatador.format(n1*100) + "cm");
			System.out.println(formatador.format(n1*1000) + "mm");
		}else if (medida == 5) {
			System.out.println(n1 + "Dm" + " convertido em:");
			System.out.println(formatador.format(n1/10000) + "km");
			System.out.println(formatador.format(n1/1000) + "hm");
			System.out.println(formatador.format(n1/100) + "dam");
			System.out.println(formatador.format(n1/10) + "m");
			System.out.println(formatador.format(n1*10) + "cm");
			System.out.println(formatador.format(n1*100) + "mm");
		}else if (medida == 6) {
			System.out.println(n1 + "Cm" + " convertido em:");
			System.out.println(formatador.format(n1/100000) + "km");
			System.out.println(formatador.format(n1/10000) + "hm");
			System.out.println(formatador.format(n1/1000) + "dam");
			System.out.println(formatador.format(n1/100) + "m");
			System.out.println(formatador.format(n1/10) + "dm");
			System.out.println(formatador.format(n1*10) + "mm");
		}else if (medida == 7) {
			System.out.println(n1 + "Mm" + " convertido em:");
			System.out.println(formatador.format(n1/100000) + "km");
			System.out.println(formatador.format(n1/10000) + "hm");
			System.out.println(formatador.format(n1/1000) + "dam");
			System.out.println(formatador.format(n1/100) + "m");
			System.out.println(formatador.format(n1/10) + "dm");
			System.out.println(formatador.format(n1/10) + "cm");
		}else {
			System.out.println("digite uma operação válida");
		}
		//fechando o input
		input.close();
	}

}