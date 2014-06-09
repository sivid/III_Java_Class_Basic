package homework_1;
public class Comment {
	public static void main(String[] args) {
		int score = 90;				// yay for no boundary checks
		String behavior = "¤þ";		
		if (behavior.equals("¥Ò")) {
			System.out.print("Good behaviors!");			
		}
		if (behavior.equals("¤A")){
			System.out.print("OK-ish behaviors!");
		}
		if (behavior.equals("¤þ")){
			System.out.print("Umm behaviors!");
		}
		if (score >= 80){
			System.out.println("  Good grades!");
		}
			else if (score >= 60){
				System.out.println("  Ok-ish grades!");
			}
			else {
				System.out.println("  Your grades could use some improvement..");
			}
	}
}
