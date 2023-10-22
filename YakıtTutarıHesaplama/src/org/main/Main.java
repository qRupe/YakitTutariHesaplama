package org.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Kilometre başı yakıt tüketimi(Örn:0,05): ");
		float kilometreBasıYakıt = scanner.nextFloat();
		System.out.print("Yapılan kilometre: ");
		float yapılanKilometre = scanner.nextFloat();
		float toplamYakıtTuketimi = kilometreBasıYakıt * yapılanKilometre;
		
		System.out.print("Anlık yakıt fiyatı(Örn: 35,60): ");
		float yakıtFiyatı = scanner.nextFloat();
		float odenecekTutar = toplamYakıtTuketimi * yakıtFiyatı;
		
		System.out.println("Ödenecek tutar: " + odenecekTutar);
		
	}
}
