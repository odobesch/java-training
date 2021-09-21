import java.io.*;
import java.util.Scanner;

public class FilesRun {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String path = "C:\\Kurs\\";
		String answer = "";
		String eraseFile;

		File dir = new File(path);
		File[] fList = dir.listFiles();
		if (dir.exists()) {
			for (File file : fList) {
				System.out.println(file.getName());
			}

		}

		do {
			System.out.println("Chcete smazat nejaky soubor? (y/n)");
			answer = sc.next();
			if (answer.equals("y")) {
				System.out.println("Zadejte nazev souboru ke smazani:");
				eraseFile = sc.next();
				File fileToErase = new File(path + eraseFile);
				if (fileToErase.exists()) {
					//fileToErase.delete();
					System.out.printf("Soubor %s smazan", eraseFile);
				} else {
					System.out.println("Zadany soubor neexistuje");
				}
			}
			else if (answer.equals("n")) {
				System.out.println("Rozhodli jste se nemazat nic");
				break;
			}
			else {
				System.out.println("Zadejte y pro smazani souboru");
			}
		} while (answer.equals("y") || !answer.equals("n"));
		
		/*
		 * for (File file : fList) { System.out.println(file.getName()); }
		 */
	}

}
