//package j;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
//public
class D
{
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
 
    public static void main(String[] args)
    {
        FastReader scn=new FastReader();
    
        
        int m=scn.nextInt();
        int n=scn.nextInt();
        
        int arr[][] = new int[m][n];
        
        //fill matrix
        for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				arr[i][j]=scn.nextInt();
			}
		}
         
        String pat=scn.nextLine().trim();
       
       //cc
        
        int count=0;
        //horizontal
        for(int i=0;i<m;i++){
        	String s="";
        	for(int j=0;j<n;j++){
        		s+=""+arr[i][j];     		
        	}
        	
        	//System.out.println("string : "+s);
        	//check for pattern
        	int prev=-1;
    		for(int k=0;k<s.length();k++){
    			int index= s.indexOf(pat,k);
    			
    			if(index>=0 && index!=prev){
    				
    				count++; //System.out.println("line "+i+"when k "+k);
    			}
    			prev=index;
    		}
        	
        }
        //System.out.println(count);
        
        //vertical
        for(int i=0;i<n;i++){
        	String s="";
        	for(int j=0;j<m;j++){
        		s+=""+arr[j][i];     		
        	}
        	
        	//System.out.println("string : "+s);
        	//check for pattern
        	int prev=-1;
    		for(int k=0;k<s.length();k++){
    			int index= s.indexOf(pat,k);
    			if(index>=0 && index != prev){
    				count++; //System.out.println("line "+i+"when k "+k);
    			}
    			prev=index;
    		}
        	
        }
        
      // System.out.println(count); 
        
        //diagonally
        int d= min(m,n);
        
        
        /*
        for (int i = 0; i < d; i++) {
        	s+=arr[i][i];
		}
        
        for (int i = 0; i < d; i++) {
        	int index= s.indexOf(pat,i);
			if(index>=0){
				count++; //System.out.println("when k "+i);
			}
        }
        */
        
        for (int k = 0; k < n; k++) {
			int i=0; int j=k;
			
			String s="";
			while(i<m && j<n){
				s+=arr[i][j]; i++;j++;
			}
			
			//check for pattern
			int prev=-1;
    		for(int l=0;l<s.length();l++){
    			int index= s.indexOf(pat,l);
    			if(index>=0 && index!=prev){
    				count++; //System.out.println("line "+i+"when k "+k);
    			}
    			prev=index;
    		}
			
		}
        
        for (int k = 1; k < m; k++) {
			int i=k; int j=0;
			
			String s="";
			while(i<m && j<n){
				s+=arr[i][j]; i++;j++;
			}
			
			//check for pattern
			int prev=-1;
    		for(int l=0;l<s.length();l++){
    			int index= s.indexOf(pat,l);
    			if(index>=0 && index!=prev){
    				count++; //System.out.println("line "+i+"when k "+k);
    			}
    			prev=index;
    		}
			
		}
        
        
        
        if(pat.length()==1)count/=3;
        
        System.out.println(count); 
        
        
       
    }
}
