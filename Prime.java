# prime
                                                                              import java.io.*;
import java.util.*;
import java.lang.*;
public class Prime
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n,m,count =0;
    n=sc.nextInt();
    m=n/2;
    for(int i=2;i<m;i++)
    {
      if(n%i==0)
      {
        count=1;
        break;
      }
      else
      {
        count=0;
      } 
    }
    if(count==1)  
    {
      System.out.println("It is not a prime number");
    }
    else
    {
      System.out.println("It is a prime number");
    }     
  }           }
