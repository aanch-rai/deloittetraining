package Day8;

import java.util.StringTokenizer;

public class StringTokenDemo
{
	public static void main(String[] args)
	{
		String value = "Need to tokenize this";
		StringTokenizer tokenizer = new StringTokenizer(value, "o");
		System.out.println(tokenizer.countTokens());
		
	}

}
