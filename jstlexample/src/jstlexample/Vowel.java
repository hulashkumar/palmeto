package jstlexample;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Vowel {
	public static int checkVowel(String s) {
		String s1="aeiou";
		int n=s.length(),count=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(s.charAt(i)==s1.charAt(j))
				count++;
			}
		}
		return count;
	}

	/**
	 * @param args
	 */
	public static void main(Main[] args) {
		// TODO Auto-generated method stub
		Scanner sb=new Scanner(System.in);
		String s=sb.nextLine();
		int max=0,n1;
		StringTokenizer sb1=new StringTokenizer(s," ");
		while(sb1.hasMoreElements()) {
			String s2=sb1.nextToken();
			//n1=checkVowel(s1);
			//if(n1>max)
				//max=n1;
		
		System.out.println(Vowel.checkVowel(s2));
		}
	}

}
