public class SecretMessage
{
	public static void main(String[]args)
	{
		System.out.print("Password: ");
		String password = StdIn.readString();
		
		//if (password.equals("secret42"))
		//{
			String cyphertext = "Ipqfgvmmz!uijt!xpslt/"; //UiF!njeufsn!fybn!xjmm!ibwf!5!rvftujpot/
			String plaintext = "";
			int i = 0;
			while (i < cyphertext.length())
			{
				char c = cyphertext.charAt(i);
				int intc = (int)c - 1;
				plaintext = plaintext + (char)intc;
				i++;
		 }
			System.out.println(plaintext); 
		//}
	}
}