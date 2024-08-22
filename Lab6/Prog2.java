/*Write a program to perform following operations on user entered strings and a character –
    i) Change the case of the string
    ii) Reverse the string
    iii) Compare two strings
    iv) Insert one string into another string
    v) Convert the string to upper case and lower case
    vi) Check whether the character is present in the string and at which position
    vii) Check whether the string is palindrome or not.
    viii) Check the number of word, vowel and consonant in the string*/

package Lab6;

import java.util.Scanner;

public class Prog2 {
	
	String chCase(String str) {
		int len = str.length();
		String mod = "";
		char ch='\0';
		for (int i=0;i<len;i++) {
			ch = str.charAt(i);
			if (ch>=97 && ch<=122)
				mod = mod + (char)(ch-32);
			else if (ch>=65 && ch<=90)
				mod = mod + (char)(ch+32);
			else mod = mod + ch;
		}
		return(mod);
	}
	
	String rev(String str) {
		int len = str.length()-1;
		String mod = "";
		while(len>=0) {
			mod = mod + str.charAt(len--);
		}
		return(mod);
	}
	
	int comp(String s1,String s2) {
		return(s1.compareTo(s2));
	}
	
	String ins(String s1,String s2) {
		String mod="";
		mod = s1.substring(0,s1.length()/2) + s2 + s1.substring(s1.length()/2);
		return(mod);
	}
	
	void upLoCase(String str) {
		int len = str.length();
		String mod = "";
		char ch='\0';
		//Uppercase
		for (int i=0;i<len;i++) {
			ch = str.charAt(i);
			if (ch>=97 && ch<=122)
				mod = mod + (char)(ch-32);
			else mod = mod + ch;
		}
		System.out.println("In Uppercase: "+mod);
		//Lowercase
		mod = "";
		for (int i=0;i<len;i++) {
			ch = str.charAt(i);
			if (ch>=65 && ch<=90)
				mod = mod + (char)(ch+32);
			else mod = mod + ch;
		}
		System.out.println("In Lowercase: "+mod);
	}
	
	
	void find(String str,char ch) {
		for (int i=0;i<str.length();i++) {
			if (ch==str.charAt(i)) {
				System.out.println(ch+" present at index "+i);
				return;
			}
		}
		System.out.println(ch+" not present");
	}
	
	boolean palin(String str) {
		if (str.compareToIgnoreCase(rev(str))==0)
			return(true);
		else return(false);
	}
	
	void count(String str) {
		int words = 0,vow = 0,con = 0;
		char ch = '\0';
		str = str.trim().toLowerCase()+" ";
		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
				vow++;
			else if (ch == ' ')
				words++;
			else if (ch >= 97 && ch <= 122)
				con++;
		}
		System.out.println("Number of Words: "+words);
		System.out.println("Number of Vowels: "+vow);
		System.out.println("Number of Consonants: "+con);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Prog2 pr = new Prog2();
		System.out.print("Enter a String/Character: ");
		String str1 = sc.nextLine();
		System.out.print("Enter a String/Character: ");
		String str2 = sc.nextLine();
		System.out.println("After Case Change: "+pr.chCase(str1));
		System.out.println("After Reversing: "+pr.rev(str1));
		System.out.println("Comparison of the 2 Strings: "+pr.comp(str1, str2));
		System.out.println("After inserting String 2 in 1: "+pr.ins(str1,str2));
		pr.upLoCase(str1);
		pr.find(str1,str2.charAt(0));
		System.out.println("Is String 1 is Palindrome? "+pr.palin(str1));
		pr.count(str1);
		sc.close();
	}

}