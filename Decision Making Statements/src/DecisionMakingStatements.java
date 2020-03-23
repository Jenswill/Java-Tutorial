
public class DecisionMakingStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 40;
		if(score > 50) {
		System.out.println("Pass!");
		}
		else {
			System.out.println("Fail!");
		}
		
		int number = 1;
		switch(number) {
		case 0:
			System.out.println("Zero");
			break;
		case 1:
			System.out.println("One");
			break;
		case 2:
			System.out.println("Two");
			break;
		case 3:
			System.out.println("Three");
			break;
		default:
			System.out.println("More than Three");
				
		}
	}

}
