class Hotel{
static String[] displayItems(String []items)
{
for(int index=0;index<items.length;index=index+1){
System.out.println("Items are:"+items[index]);
}
System.out.println();
return items;
}
public static void main(String []args){
String items[]={"idli","vada","dosa","puri","tea","coffe"};
displayItems(items);
items[2]="Uppit";
displayItems(items);
}
}



