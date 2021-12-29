class Locations{
static void displaylocations(String []locations)
{
for(int index=0;index<locations.length;index=index+1){
System.out.println("locations are:"+locations[index]);
}
System.out.println();
}
public static void main(String []args){
String locations[]={"Vijaynagar","RRnagar","Basaveshwarnagar","Vidyanagar"};
displaylocations(locations);
locations[2]="RAJAJINAGAR";
displaylocations(locations);
}
}
