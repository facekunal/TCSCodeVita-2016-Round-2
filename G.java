//package j;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;
import java.util.StringTokenizer;

import j.D.FastReader;

 class G {
	
	
	static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
    
    public static int min(int a,int b){
    	return a<b? a:b;
    }
    
 
    
    public static BigInteger pow(BigInteger a,BigInteger n, BigInteger m){
    	BigInteger ret= new BigInteger("1");
    	BigInteger z=new BigInteger("0");
    	
    	
    	
    	a=a.mod(m);
    	
    	
    	while(n.compareTo(z)==1){
    		
    		//System.out.println(": "+n);
    		
    		BigInteger temp =n.mod(new BigInteger("2"));
    		if(temp.equals(new BigInteger("1"))){
    			ret= ret.multiply(a);
    			//System.out.println("hello");
    		}
    		
    		a=a.multiply(a).mod(m);
    		
    		n=n.shiftRight(1);
    		
    	}
    	
    	
    	return ret;
    }

    
    public static boolean checkPrime(int a){
    	
    	if(a==2) return false;
    	if(a==1)return false;
    	
    	for(int i=3;i<= Math.sqrt(a);i++){
    		if(a%i==0) return false;
    	}
    	return true;
    }
    
	public static void main(String[] args) throws IOException{
		// FastReader scn=new FastReader();
		 Scanner scn= new Scanner(System.in);
		 String filePath=scn.nextLine();
		 
		 
		 BufferedReader f = new BufferedReader(new FileReader(filePath));
		 
		 
		 
		int t=Integer.parseInt(f.readLine());
		int b,p;
		BigInteger x= new BigInteger("0");
		
		
		
		while(t-->0){
			
			//read three ints
			StringTokenizer st= new StringTokenizer(f.readLine());
			b=Integer.parseInt(st.nextToken());
			
			x=new BigInteger(st.nextToken());
			
			p=Integer.parseInt(st.nextToken());
			
			
			if(checkPrime(p)){

				//System.out.println(b+" "+x+" "+p );
				
				
				
				//System.out.println(x);
				
				//b^x
				x=pow(new BigInteger(b+""),x,new BigInteger(p+""));
				
				
				//print
				System.out.println(x.mod(new BigInteger("10")));
			}
			else System.out.println(-1);
		}
		
		
	}
	
}
