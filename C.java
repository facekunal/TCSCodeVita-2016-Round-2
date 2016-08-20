import java.util.StringTokenizer;
import java.util.Scanner;

class C{
 static int pal(int x)
 {
  int y,rev=0,temp;
  y=x;
  while(y!=0)
  {
   temp=y%10;
   rev=rev*10+temp;
   y=y/10;
  }
  if(rev==x)
  {
   return 1;
  }
  else 
  {
   return 0;
  }
 }
static void calc(int x,int y,int dist)
{
int tempx1=0, tempy1=0, tempCost=0, x1=0, y1=0,cost=0, count=0,tempCount,i,j,ispal=0;
if(dist<=y-x)
{
//loop from start index to end index 
for(i=x;i<=y;i++)
 {
  tempCount=0;
  ispal=pal(i);
  //if number is palendrome
  if(ispal==1)
  {
   tempx1=i; 
   for(j=tempx1;j<tempx1+dist;j++)
   {
    //case when available dist will be less than given dist
    if(j>y)
    {
     break;
    }
    
    ispal=pal(j);
    if(ispal==1)
    {
     tempy1=j;
     tempCount++;
  //   System.out.println("tmp"+tempCount); 
    // System.out.println("tmpy1"+tempy1+"tmpx1"+tempx1);
    }
   } 
  }
  else
  {
   continue;
  }
  
  tempCost=tempy1-tempx1; 
  if(cost==0)
  {
   cost=tempCost;
  }
  if(tempCount>=count)
  {    
   //System.out.println("tmpcst"+tempCost);
   if(tempCost<=cost)
   {
    if(tempCost==cost && tempCount==count)
    {
     continue;
    }
    cost=tempCost;
    x1=tempx1;
    y1=tempy1;
    count=tempCount; 
    //System.out.println("x1"+x1+"y1"+y1);
   }
  } 
 }
}
 System.out.print(count+","+x1+","+y1);

}
public static void main(String... arg)
{

//Take input, send to calc
int x,y,dist;
Scanner s1=new Scanner(System.in);
String s=s1.nextLine();
StringTokenizer st=new StringTokenizer(s,",");
x=Integer.parseInt(st.nextToken());
y=Integer.parseInt(st.nextToken());
dist=Integer.parseInt(st.nextToken());

calc(x,y,dist);

}

}