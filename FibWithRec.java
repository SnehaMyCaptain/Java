class FibWithRec{  
 static int a=0,b=1,c=0;    
 static void printFibonacci(int i){    
    if(i>0){    
         c = a + b;    
         a = b;    
         b = c;    
         System.out.print(" "+c);   
         printFibonacci(i-1);    
     }    
 }    
 public static void main(String args[]){    
  int i=10;    
  System.out.print(a+" "+b);//printing 0 and 1    
  printFibonacci(i-2);//n-2 because 2 numbers are already printed   
 }  
}  