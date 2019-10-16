import java.util.Scanner;

public class latihan_ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int angka;

		System.out.println("masukan angka");
		angka = input.nextInt();

		if (angka % 2 == 0) {
			System.out.println("Maka angka adalah genap");
			// untuk mengecek angka prima
			boolean prima = true;
			for (int i = 2; i < angka; i++) {
				if ((angka % i) == 0) {
					prima = false;
					break;
				}
			}
			if (prima == true) {

				System.out.println("dan bilangan PRIMA ");

			} else {

				System.out.println("dan bukan bilangan PRIMA ");
			}

		} else if (angka % 2 != 0) {
			// untuk mengecek angka prima
			System.out.println("Maka angka adalah ganjil");
			
			boolean prima = true;
			for (int i = 2; i < angka; i++) {
				if ((angka % i) == 0) {
					prima = false;
					break;
				}
			}
			if (prima == true) {

				System.out.println("dan bilangan PRIMA ");

			} else {

				System.out.println("dan bukan bilangan PRIMA ");
			}

		}
	}
}
