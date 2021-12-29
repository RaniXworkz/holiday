class Animals{
static void displayanimals(String []animals)
{
for(int index=0;index<animals.length;index=index+1){
System.out.println("animals are:"+animals[index]);
}
System.out.println();
}
public static void main(String []args){
String animals[]={"Lion","Elephant","","Fox","Giraffe","Gorilla"};
displayanimals(animals);
animals[2]="Tiger";
displayanimals(animals);
}
}
