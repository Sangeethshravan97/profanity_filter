/* 
author details  
name : SANGEETH SHRAVAN S 
email id: sangeeth209@gmail.com
*/


import java.util.Scanner;
public class textFilter {
    public static void main(String args[])
    {

     Scanner read = new Scanner(System.in);

     System.out.println("Enter the message : ");

     String check[]={"fuck","bitch","ass","faggot"};
     String line = read.nextLine();
     String Str[]=line.split(" ");
     int count=0;
     String x="";
     String message="";
     String newLine="";

     for (int i=0 ; i<Str.length; i++)
     {
    for(int j=0;j<check.length;j++)     
     {
      if(Str[i].equals(check[j]))
      {
        count++;
        int n=0;   
        x=check[j];
         
        do{
             newLine+="*";
               n++;
           }while(n<x.length());
  
       Str[i]=Str[i].replace(x,newLine);
    
       }
     newLine="";
    }
    }
     System.out.println("Number of uncensored words found: "+count);


   for (int l=0 ; l<Str.length; l++){
     
      message+=Str[l];
      message+=" "; 
    } 

    System.out.println("Filtered message : " +message);

    }
}
