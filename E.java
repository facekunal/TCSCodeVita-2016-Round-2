import java.io.*;
import java.util.Scanner;
import java.lang.*;4
class E
{
 static void printBase(char base[],long n,char f, int p )
 {
  String code="";
  int temp,i;
  long n1;
  char c; 
  for(i=2;i<=36;i++)
 {
  code="";
  n1=n;
  while(n1!=0)
  {
   temp=(int)n1%i;
   code=code+base[temp];
   n1=n1/i;
  }
  c=code.charAt(p);
  if(c==f)
  {
   System.out.print(i+" ");
  }
  
 }
 }
 public static void main(String... s)
 {
  unsigned long n;
  char f='3';
  int i,p=1;
  Scanner s1=new Scanner(System.in); 
  char base[]=new char[36];
  for(i=0;i<=9;i++)
   base[i]=(char)(i+48);
  for(i=10;i<=35;i++)
   base[i]=(char)(i+55);
   n=s1.nextLong(); 
 
  f=s1.next().charAt(0);
  f=Character.toUpperCase(f);
  
  p=s1.nextInt();
  String s2=n+"";
  len=s2.length();
  if(p<=len&&p>=0)
  {
   printBase(base,n,f,p); 
  }     
 }

}