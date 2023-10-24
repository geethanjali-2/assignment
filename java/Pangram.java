import java.io.*;
import java.util.*;
public class Pangram {
	public static boolean isPangram(String str)
	{
		boolean[] res = new boolean[26];
		int index = 0;
		for (int i = 0; i < str.length(); i++) {
			if ('A' <= str.charAt(i)&& str.charAt(i) <= 'Z')
				index = str.charAt(i) - 'A';
			else if ('a' <= str.charAt(i)&& str.charAt(i) <= 'z')
				index = str.charAt(i) - 'a';
			else
				continue;
			res[index] = true;
		}
		for (int i = 0; i <= 25; i++)
			if (res[i] == false)
				return false;
		return true;
	}
	public static void main(String[] args)
	{
		String str;
	    Scanner sc=new Scanner(System.in);
	    System.out.print("Enter string: ");
	    str=sc.nextLine();
		if (isPangram(str) == true)
			System.out.print(str + " is a pangram");
		else
			System.out.print(str +" is not a pangram");
	}
}


