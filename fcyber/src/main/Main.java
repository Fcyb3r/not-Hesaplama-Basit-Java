package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		double not1, not2, not3;
		double total;
		String sonuc;

		System.out.println("|Not hesaplama java|");
		System.out.println("1.notu giriniz");
		not1 = giris.nextDouble();
		System.out.println("2.notu giriniz");
		not2 = giris.nextDouble();
		System.out.println("3.notu giriniz");
		not3 = giris.nextDouble();

		total = not1 + not2 + not3;
		total /= 3;

		if (total < 45) {
			sonuc = "Zayif";

		} else if (total < 55) {
			sonuc = "Gecer";

		} else if (total < 70) {
			sonuc = "Orta";

		} else if (total < 85) {

			sonuc = "Iyi";

		} else {

			sonuc = "Pekiyi";

		}

		System.out.println("Ortalama:" + total);
		System.out.println("Buna gore sonuc:" + sonuc);

	}
}
