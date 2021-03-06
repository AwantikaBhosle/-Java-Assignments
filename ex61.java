//Write a JAVA program to swap first and last digits of any number.
//Sample Output:
//Input any number: 12345
//The number after swapping the first and last digits are: 52341

import java.util.Scanner;
class SwapFirstAndLastDigit {
	public static void main(String args[]) {
		int n, f, l, r = 0, tmp, swap, c, d;
		Scanner s = new Scanner(System.in);
		System.out.print("Input any number:");
		n = s.nextInt();
		tmp = n;
		l = n % 10;
		while (n > 10) {
			n = n / 10;
		}
		f = n;
		n = tmp / 10;
		while (n > 10) {
			c = n % 10;
			r = r * 10 + c;
			n = n / 10;
		}
		swap = l;
		while (r > 0) {
			d = r % 10;
			swap = swap * 10 + d;
			r = r / 10;
		}
		swap = swap * 10 + f;
		System.out.println("The number after swapping first and last digits are:" + swap);
	}
}
