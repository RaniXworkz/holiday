class Apps{
static void displayapps(String []apps)
{
for(int index=0;index<apps.length;index=index+1){
System.out.println("apps are:"+apps[index]);
}
System.out.println();
}
public static void main(String []args){
String apps[]={"Pubg","Amazon","Flipkart","Contacts","Myntra"};
displayapps(apps);
apps[2]="Whatsapp";
displayapps(apps);
}
}
