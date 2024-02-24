package Feb_23_WordProcessor_Linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Moving_Avg_calculator
{
    public static int[] calc_mov_avg(int size , int[] vect , int window_size)
    {
     List<Integer> result = new ArrayList<>();
     int windowsum=0;
     // calculate sum of first window
        for(int i=0;i<window_size;i++)
        {
            windowsum += vect[i];
        }
        result.add(windowsum/window_size);
        // calculate the sum of subsequest windows
      for(int i= window_size ;i<size;i++)
        {
            windowsum = windowsum-vect[i -window_size]+vect[i];
            result.add(windowsum/window_size);
        }
      // convert list<integer>to int[]
      int [] resultArray = new int[result.size()];
      for(int i=0;i<result.size();i++)
      {
          resultArray[i] = result.get(i);
      }
      return  resultArray;
    }
    public static void main(String[] args)
    {
       Scanner sc = new Scanner(System.in);
//        int size = 4;
//        int [] vect = {1,2,3,4};
//        int w_size= 3 ;
        System.out.println(" enter the size of input vector ");
        int size = sc.nextInt();
        int [] vect = new int[size];
        System.out.println("enter the element in vector");
        for (int i=0;i<size;i++)
        {
             vect[i] = sc.nextInt();
        }
        System.out.println("enter the window size ");
        int w_size = sc.nextInt();
     int [] result =  calc_mov_avg(size , vect ,w_size);
        //System.out.println("length" + result.length);
        System.out.println("result " + result.length);

//        for(int num : result)
//        {
//            System.out.println(num);
//        }

    }
}
