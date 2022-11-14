package org.generation.italy.security;

import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {

		/*
		 * Ciao Ragazzi e Ragazze, esercizio di oggi è un (insicurissimo) Password
		 * Generator nome del repo: java-password-generator Create un nuovo progetto
		 * java chiamato java-password-generator Aggiungete un package
		 * org.generation.italy.security Aggiungete una classe PasswordGenerator che
		 * contiene un metodo main Il programma deve fare quanto segue: salvare in
		 * opportune variabili il nome, cognome, colore preferito e data di nascita di
		 * un utente suddivisa in giorno, mese e anno in numero generare (e stampare a
		 * video) una password concatenando nome, cognome, colore preferito e somma di
		 * giorno, mese e anno di nascita, separate dal carattere - Esempio: ho un
		 * utente che si chiama Pinco Pallo, nato il 12/05/1994, il cui colore preferito
		 * è il magenta La sua password sarà Pinco-Pallo-magenta-2011 Buon lavoro
		 * :faccia_leggermente_sorridente:
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("Inserire nome ");
		String strName = sc.nextLine();
		System.out.println("Inserire cognome ");
		String strLastName = sc.nextLine();
		System.out.println("Inserire colore preferito ");
		String strColor = sc.nextLine();
		System.out.println("Inserire giorno di nascita ");
		int day = sc.nextInt();
		System.out.println("Inserire mese di nascita ");
		int month = sc.nextInt();
		System.out.println("Inserire anno di nascita ");
		int year = sc.nextInt();

		int sum = day + month + year;

		System.out.println("Password generata: " + strName + '-' + strLastName + '-' + strColor + '-' + sum);

	}
}