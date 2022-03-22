/*Design a class in java to represent a bank account. include the following members:
data members:
name
account number
type
balance amount

Methods:
to assign initial values
to deposit an amount
to withdraw an amount after checking balance
to display the name and balance
*/
//Solution

import java.util.*;
class bank_account{
String name,type;
long account_number;
double balance_amount;

bank_account(String n,long a,String t,double b)
{
name = n;
account_number = a;
type = t;
balance_amount = b;
}

void deposit(double d){
if(d>0){
balance_amount = balance_amount+d;
}
else{
System.out.println("Invalid amount");
}
}

void withdraw(double w){
if(w>0 && w<=balance_amount){
balance_amount = balance_amount-w;
}
else{
System.out.println("Invalid amount");
}
}
void display(){
System.out.println("Name: "+name);
System.out.println("Balance: "+balance_amount);
} 
}
class myClass{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
String n;
String t;
long a;
double b;
System.out.print("Enter Name: ");
n=sc.nextLine();
System.out.print("Enter Account Number: ");
a=sc.nextLong();
System.out.print("Enter Account Type: ");
t=sc.nextLine();
System.out.print("Enter Balance: ");
b=sc.nextDouble();
bank_account bank = new bank_account(n,a,t,b);
bank.display();
System.out.println("Enter ammount to be deposit: ");
double d = sc.nextDouble();
bank.deposit(d);
bank.display();
System.out.println("Enter ammount to be withdrawn: ");
double w = sc.nextDouble();
bank.withdraw(w);
bank.display();
}
}
