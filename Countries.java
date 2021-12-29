class Countries{
static void displaycountries(String []countries)
{
for(int index=0;index<countries.length;index=index+1){
System.out.println("countries are:"+countries[index]);
}
System.out.println();
}
public static void main(String []args){
String countries[]={"China","Nepal","Russia","Thailand","Singapore"};
displaycountries(countries);
countries[3]="INDIA";
displaycountries(countries);
}
}
