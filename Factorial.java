class Factorial{
static int printFactorial(int number,int fact){
for(int num=1;num<=number;num=num+1){
fact=fact*num;
}
return fact;
}
public static void main(String []args){
int numbers[]={1,2,3,4,5,6,7};
for(int index=0;index<numbers.length;index=index+1){
int resp=printFactorial(numbers[index],1);
System.out.println("Factorial of "+numbers[index]+" is: "+resp);
}
}
}