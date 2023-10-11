/*C. Check if the input is pangram or not. (Pangram is a sentence that contains all the 
alphabets from a-z */
import java.io.*; 
import java.util.*;
public class Panagram {
public static void main(String[] args)
{
    Scanner Keybord=new Scanner(System.in);
    System.out.println("Enter the String to check Panagram or not");
    String str=Keybord.nextLine();
    str=str.toLowerCase();
    // TreeSet<Character> ts=new TreeSet<Character>();
    // for(int i=0;i<str.length();i++)
    // {
    //     if(str.charAt(i)!=' ')
    //     {
    //         ts.add(str.charAt(i));
    //     }
    // }
    // if(ts.size()==26)
    //     System.out.println("Its a Panagram");
    // else
    //     System.out.println("Its not a Panagram");
    // }
    /*C. Check if the input is pangram or not. (Pangram is a sentence that contains all the 
alphabets from a-z */
    boolean allLetter=true;
    for(char c='a';c<='z';c++){
        if(!str.contains(String.valueOf(c))){
            allLetter=false;
            break;
        }
    }
    if(allLetter)
        System.out.println("Its a Panagram");
    else
        System.out.println("Its not a Panagram");
}
}
