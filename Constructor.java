import java.util.*;
class cons1{
int dob;
String name;

cons1(int year,String Name){
dob = year;
name = Name;
}
public static void main(String[]args){

int x;
String y;
Scanner sc = new Scanner(System.in);
try{
System.out.print("Enter your year of birth: ");
x=sc.nextInt();
System.out.print("Enter your name: ");
y = sc.next();
cons1 c = new cons1(x, y);
System.out.println("====Record====\nYear   :  Name \n===================");
System.out.println(c.dob+"   :  "+c.name);
}
catch(InputMismatchException e){
System.out.println("please enter correct input");
System.out.println("Exception raise = "+e);
}
}
}
