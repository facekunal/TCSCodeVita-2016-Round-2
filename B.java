//package j;

import java.util.Scanner;

class B {

	public static Scanner scn= new Scanner(System.in);
	
	public static void main(String [] args){
		int n=scn.nextInt();
		
		String s= scn.next();
		
		boolean flag=false;
		int c=0;
		for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i)=='R'){
				flag=false;
				c++;
			}
			else{
				if(flag==false)c++;
				flag=true;
			}
		}
		
		System.out.println(c-1);
		
		
	}
}
