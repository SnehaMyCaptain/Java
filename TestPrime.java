import java.util.Scanner;

class TestPrime{
public static void main(String[] args){
Scanner s=new Scanner(System.in);
System.out.println("Please insert a number");
int num=s.nextInt();
boolean isPrime = true;
for(int i=2;i<num;i++){
if(num%i==0){
isPrime= false;
break;
}
}
if(isPrime){
System.out.println(num+"\t""is prime number");
}
else{
System.out.println(num+"\t""is not prime number");
}
}
}













