import java.util.*;
/* 

Problem Statement-
Write Java program which accept String from user and display 
below pattern. 
Input : Hello 
Output : H # # # # 
         H e # # # 
         H e l # # 
         H e l l # 
         H e l l o      
*/
class Pattern 
{
     public void Pattern(String str)
     {
          char[] ch = str.toCharArray();
          for(int i = 0; i < str.length(); i++)
          {
               for(int j = 0 ;j < str.length(); j++)
               {       
                    if(j<=i)
                    System.out.print( ch[j]+"\t");  
                    else
                    System.out.print( "#"+"\t");  
               }
               System.out.println();
          }
     }
}
class helper
{
     public static void main(String arg[])
     {
          Pattern obj = new Pattern();
          Scanner sobj = new Scanner(System.in);
          System.out.println("Enter String:");
          String row = sobj.nextLine();
          obj.Pattern(row);
          System.gc();
     }
}