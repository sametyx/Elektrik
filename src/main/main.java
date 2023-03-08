package main;

public class main {

	public static void main(String[] args) {
		java.util.Scanner cevap= new java.util.Scanner(System.in);
		
		System.out.println("Lutfen kac kwh elektrik yaktiginizi girin: ");
		double yakilan = cevap.nextInt();
		
		double vergiOrani=0;
		
		if(yakilan<100) {vergiOrani=0;}
		else if(yakilan>=100&&yakilan<300) {vergiOrani=5;}
		else if(yakilan>=300&&yakilan<500) {vergiOrani=10;}
		else {vergiOrani=15;}

		double vergitutari=yakilan*(vergiOrani/100);
		double odenecek=yakilan+yakilan*(vergiOrani/100);
		
		System.out.printf("Yaktiginiz kwh: %.2f%n"
				+ "Vergisiz odeyeceginiz tutar: %.2f%n"
				+ "Vergi Tutari: %.2f%n"
				+ "Totalde odeyeceginiz tutar: %.2f%n",yakilan,yakilan,vergitutari,odenecek);
	}

}
