import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        /*int len1 =  A.length();
        int len2 = B.length();
        int len = len1+len2;*/
        System.out.println(A.length()+B.length());  //calculate the length of string
        //Determine if A is lexicographically larger than  B(i.e.: does B come before A in the dictionary?).
        if(A.compareTo(B)< 0){
            System.out.println("No");
        }
        else if(A.compareTo(B)> 0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
      //Capitalize the first letter in A and B and print them on a single line, separated by a space
        String C = A.substring(0, 1).toUpperCase() + A.substring(1);
        String D = B.substring(0, 1).toUpperCase() + B.substring(1);
        System.out.println(C+" "+D);
    }
}
