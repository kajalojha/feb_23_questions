package Feb_23_WordProcessor_Linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Node
{
    char data ;
    Node nextnode;
    public Node(char data)
    {
        this.data=data;
    }
}
class LinkedList
{
    Node head;
    public LinkedList(String str)
    {
        if(str==null || str.isEmpty())
        {
            head = null;
        }
        else
        {
            head = new Node(str.charAt(0));
             Node currentNode = head;
             for(int i=1;i<str.length();i++)
             {
                 currentNode.nextnode=new Node(str.charAt(i));
                 currentNode = currentNode.nextnode;
             }
        }
    }
    public  String String_List_Slice(int start , int end)
    {
        StringBuilder result = new StringBuilder();
        Node current = head;// traverse from the head of linklist
        //traverse until the starting index
        for(int i=0;i<start && current != null ;i++)
        {
            current = current.nextnode;
        }
        while(current!=null && start<end)
        {
            result.append(current.data);
            current = current.nextnode;
            start++;
        }
        return  result.toString();
    }

}

public class Word_Processor
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the stringlist");
        String stringlist = sc.nextLine();
        System.out.println("enter the start index");
        int start = sc.nextInt();
        System.out.println("enter the end index ");
        int end = sc.nextInt();
        LinkedList linkedList = new LinkedList(stringlist); // create linked of stringlist
        String result = linkedList.String_List_Slice( start,end);
        System.out.println(result);
    }
}
