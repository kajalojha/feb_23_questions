package Feb_23_WordProcessor_Linkedlist;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Scanner;

public class Most_FrequentChar
{
    public void countFrequent(String str , int c)
    {
        if(str==null || str.isEmpty())
        {
            return ;
        }
        char[] ch = str.toCharArray();
        Arrays.sort(ch);
        int maxcount = 1;
        char maxchar = ch[0];
        int currentCount = 1;


      for(int i=1;i<ch.length;i++)
      {
          if(ch[i]==ch[i-1])
          {
             currentCount++;
          }
          else
          {
              currentCount = 1;
          }
          if(currentCount > maxcount)
          {
              maxcount = currentCount;
              maxchar = ch[i];
          }

      }

        //System.out.println(maxchar  + "has maximum occurance " + maxcount);
        System.out.println(maxchar + " " + "has maximum occurance " );
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the string :");
        String string = sc.nextLine();
        int count =0 ;
        Most_FrequentChar mostfre = new Most_FrequentChar();
        mostfre.countFrequent( string, count);

    }
}
