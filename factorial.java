import java.util.*;
class factorial{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
   System.out.print("Enter the number: ");
   int num = sc.nextInt();
   int fact=1;
   if(num<0){
    System.out.println("Factorial does't exist of negative number!!!"); 
   }
   else{
     for(int i = 1;i <= num; i++){
      fact = fact*i; 
     }
   }
   System.out.print("Factorial of "+num+" is "+fact);
 }
}
