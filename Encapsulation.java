class encap{
private String name;

//Getter
public String getName(){
return name;
}

//setter
public void setName(String newName){
this.name = newName;
}
public static void main(String args[]){
encap e = new encap();
e.setName("Rahul Tripathi"); 	//Set the value of the name variable 
System.out.println(e.getName());
}
}
