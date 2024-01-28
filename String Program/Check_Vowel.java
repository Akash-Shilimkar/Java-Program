package string_program;

import java.util.Scanner;

public class Check_Vowel {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count=0;

  //User Input
	System.out.println("Enter the Name");
	String s =sc.nextLine();
	
	for(int i=0;i<s.length();i++)
	{
    //Separate the charater from String. 
		char result = s.charAt(i); 

    //Check Separated char is vowel or not.
		if(result =='a' ||result =='e' ||result =='i'||result =='o'||result =='u' ||
		   result =='A' ||result =='E' ||result =='I'||result =='O'||result =='U' )
		{
      //if it is vowel then count is increase by 1.
			count++;
		}
	}

  //Print the total count of vowel present in given name.
	System.out.println("In "+ s + " total present vowel is : "+count);
  
}
}
