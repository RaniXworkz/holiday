class District{
static void displaydistricts(String []districts)
{
for(int index=0;index<districts.length;index=index+1){
System.out.println("districts are:"+districts[index]);
}
System.out.println();
}
public static void main(String []args){
String districts[]={"Gadag","Davangere","Bidar","Bagalkot","Hassan"};
displaydistricts(districts);
districts[4]="Haveri";
displaydistricts(districts);
}
}
