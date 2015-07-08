import java.util.Scanner;


public class MessageEncrypter {
	
private int shift;
	
	public Encrypt (int shift){
		shiftAmount(shift);
	}
	
public void shiftAmount (int shift){
	shift = -1;
	shift = -shift;
	this.shift = shift % 26;
	
}
public String encode(String clear){
	if (clear == null)
		return "";
	
	char[] letter = clear.toLowerCase().toCharArray();
	for (int i = 0; i < letter.length; i++) {
		if(letter[i] < 'a' || letter[i] > 'z') 
			continue;
		letter[i] = Character.toUpperCase(letter[i]);
		letter[i] += shift;
		if(letter[i] > 'Z') {
			letter[i] -= 'Z';
			letter[i] += ('A' - 1);	

	}
	
}
	return new String (letter);
	
}

	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int shift = 0;
		
		Encrypt project = new Encrypt(shift);
		String choice = "y";
		
		while(choice.equalsIgnoreCase("y")){
		System.out.println("Enter msg");
		String messageEntered = sc.nextLine();
		String encryptedMessage = project.encode(messageEntered);
		System.out.println(encryptedMessage);
		System.out.println("Would you like to decrypt message?");
		String continueMessage = sc.nextLine(); 
		if( continueMessage.equalsIgnoreCase("y")){
			continue; 
		}
			else if(continueMessage.equalsIgnoreCase("n")){
				System.out.println("goodbye!");
				System.exit(0);
			}
			else
				System.out.println("invalid Data");
			
		
		
}
}
}
}