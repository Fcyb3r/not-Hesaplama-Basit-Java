package main;

import java.util.Scanner;

public class Main {
	//Normalde 3 not vardi babam sayesinde 8 e kadar cıkardim.Saygilar Mustafa abi
	public static void main(String[] args) {

		Scanner giris = new Scanner(System.in);
		double not1, not2, not3, not4, not5, not6, not7, not8;
		double total;
		String sonuc;

		System.out.println("|Not hesaplama java|");
		System.out.println("1.notu giriniz");
		not1 = giris.nextDouble();
		System.out.println("2.notu giriniz");
		not2 = giris.nextDouble();
		System.out.println("3.notu giriniz");
		not3 = giris.nextDouble();
		System.out.println("4.notu giriniz");
		not4 = giris.nextDouble();
		System.out.println("5.notu giriniz");
		not5 = giris.nextDouble();
		System.out.println("6.notu giriniz");
		not6 = giris.nextDouble();
		System.out.println("7.notu giriniz");
		not7 = giris.nextDouble();
		System.out.println("8.notu giriniz");
		not8 = giris.nextDouble();

		total = not1 + not2 + not3 + not4 + not5 + not6 + not7 + not8;
		total /= 8;

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