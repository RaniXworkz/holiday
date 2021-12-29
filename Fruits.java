class Fruits{
static void displayfruits(String []fruits)
{
for(int index=0;index<fruits.length;index=index+1){
System.out.println("fruits are:"+fruits[index]);
}
System.out.println();
}
public static void main(String []args){
String fruits[]={"Apple","kiwi","Mango","Orange","Strawberry"};
displayfruits(fruits);
fruits[4]="Jackfruit";
displayfruits(fruits);
}
}
