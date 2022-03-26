/*
*Question: Sorting a list of numbers
*/


class numSort{
public static void main(String args[]){
int number[] = {55,60,56,43,82,45};
int n = number.length;
System.out.print("Given list: ");
for(int i=0; i<n; i++){
System.out.print(" "+number[i]);
}
System.out.println("\n");

//SORTING BEGINS
for(int i=0; i<n; i++){
for(int j=i+1; j<n; j++){
if(number[i] < number[j]){

//INTERCHANGE VALUE
int temp = number[i];
number[i] = number[j];
number[j] = temp;
}
}
} //SORTING ENDS

System.out.print("Sorted list: ");
for(int i = 0;i<n;i++){
System.out.print(" "+number[i]);
}
System.out.println(" ");
}
}
