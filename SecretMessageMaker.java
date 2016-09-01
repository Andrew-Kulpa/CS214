public class SecretMessageMaker
{
	public static void main(String[]args)
	{
		System.out.print("Text: ");
		String plaintext = StdIn.readLine();
		
		String cyphertext = "";
		int i = 0;
		while (i < plaintext.length())
		{
			char c = plaintext.charAt(i);
			int intc = (int)c + 1;
			cyphertext = cyphertext + (char)intc;
			i++;
		}
		System.out.println(cyphertext);
	}
}