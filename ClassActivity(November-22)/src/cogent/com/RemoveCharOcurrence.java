package cogent.com;

/**
 * @author samuelkawuma
 *Nov 23, 2022
 *4:40:50 PM
 */

public class RemoveCharOcurrence {



	static void removeChar(String s, char c)
	{
		int j =0;
		int  count = 0;
		int n = s.length();
		char []t = s.toCharArray();
		for (int i = j = 0; i < n; i++)
		{
			if (t[i] != c)
				t[j++] = t[i];
			else
				count++;
		}

		while(count > 0)
		{
			t[j++] = '\0';
			count--;
		}

		System.out.println(t);
	}

	// Driver Code
	public static void main(String[] args)
	{
		String s = "greetings";
		removeChar(s, 'e');
	}

}


