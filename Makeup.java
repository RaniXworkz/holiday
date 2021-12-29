class Makeup{
static void Makeuptools(String []Makeupkits)
{
for(int index=0;index<Makeupkits.length;index=index+1){
System.out.println("Makeupkits are:"+Makeupkits[index]);
}
System.out.println();
}
public static void main(String []args){
String Makeupkits[]={"Foundation","Eyeliner","Kajal","BBcream","Lipstick"};
Makeuptools(Makeupkits);
Makeupkits[3]="Mascara";
Makeuptools(Makeupkits);
}
}
