
class Cars{
static void displaymodels(String []models)
{
for(int index=0;index<models.length;index=index+1){
System.out.println("models are:"+models[index]);
}
System.out.println();
}
public static void main(String []args){
String models[]={"Fortuner","Innova","Audi","Toyota","Ford"};
displaymodels(models);
models[3]="BMW";
displaymodels(models);
}
}
