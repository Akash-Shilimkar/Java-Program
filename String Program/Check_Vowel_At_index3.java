package string_program;

import java.util.Scanner;

public class Check_Vowel_At_index3 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String s[] = new String[5];
	
	System.out.println("Enter the five Names : ");
	for(int i=0;i<s.length;i++)
	{
		s[i] = sc.next();
	}
	
	for(int i=0;i<s.length;i++)
	{
		char result = s[i].charAt(3);
		if(result =='a' ||result =='e' ||result =='i'||result =='o'||result =='u' ||
		   result =='A' ||result =='E' ||result =='I'||result =='O'||result =='U' )
		{
			System.out.println();
			System.out.println("In " +s[i]+" Vowel is present at index 3,"+"Vowel is : " +s[i].charAt(3));
		}
	}
	
}
}
