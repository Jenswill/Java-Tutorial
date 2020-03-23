package looping;

public class looping {
 
	public static void main(String[] args) {
		
		// While statement test
		int i = 1;
		while (i <= 3) {
			System.out.println(i);
			i++;
		}
		// difference between do while and while loops
		int score = 10; int score2 = 9;
		do {
			System.out.println(score);
			score++;
		} while (score <= 5);
			
			while (score2 <= 5) {
				System.out.println(score2);
				score2++;
		}
			// for statement
			for (int n = 1; n <= 3; n++) {
				System.out.println(n);
			}
			// enhanced for statement
			int[] numbers = {7,15,8};
			for (int l : numbers) {
				System.out.println(l);				
			}
			
				// break vs continue in for loop
			for (int s = 1; s <= 3; s++) {
				if (s == 2) {
					break;
				}
				System.out.println(s);
			}
			for (int a = 4; a <= 6; a++) {
				if (a==5) {
					continue;
				}
			System.out.println(a);
			}
	}

}
