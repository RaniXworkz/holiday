class Bikes{
static void displaymodels(String []models)
{
for(int index=0;index<models.length;index=index+1){
System.out.println("models are:"+models[index]);
}
System.out.println();
}
public static void main(String []args){
String models[]={"Duke","Aprilia","TVS","Yamaha","RoyalEnfield"};
displaymodels(models);
models[2]="KTM";
displaymodels(models);
}
}
