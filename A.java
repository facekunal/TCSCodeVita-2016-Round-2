//package j;

import java.util.*;
class A {
	
	public static String reverseString(String input){
		return new StringBuilder(input).reverse().toString();
	}
	
		public static Scanner scn=new Scanner(System.in);
	public static void main(String[] args){
		
		String op = scn.nextLine();
		String es=null;
		
		
		
		
		
		if(op.equals("E")){
			String s = scn.nextLine();
			
			String id=scn.nextLine();
			
			es=(id.length()+"");
			es+="-"+id;
			
			
			//pick chars and convert to hex
			for (int i = 0; i < s.length(); i++) {

				String hex = reverseString(Integer.toHexString(s.charAt(i)).toUpperCase());
				es+="-"+hex;
			}
			System.out.print(es);
		}
		else{
			
			es=scn.nextLine();
			StringTokenizer st=new StringTokenizer(es,"-");
			st.nextToken();//first
			System.out.println(st.nextToken()+"");//second
			
			
			while(st.hasMoreTokens()){
				String t= reverseString(st.nextToken());
				int k = Integer.parseInt(t,16);
				System.out.print((char)k);
				
			}
			
		}
		
	}
}
