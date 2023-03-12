class Complex{
    int real,imag;
public Complex(int real,int imag){
    this.real=real;
    this.imag=imag;
}    
 public void printComplex(){
     System.out.println("Complex Number= "+real+"+"+imag+"i");
 }
 //static method to add 2 numbers
 public static int addComplex(int a,int b){
 return a+b;
 
 }
 //static method to subtract 2 numbers
 public static int subComplex(int x,int y){
 return x-y;
 
 }
 
}


class Main {
  public static void main(String[] args) {
    Complex num=new Complex(1,5);
      
        num.printComplex();
        //calling static method and print the result
        int sum=Complex.addComplex(5,6);
        int sub=Complex.subComplex(10,5);
        System.out.println("sum="+sum+"\n"+"sub="+sub);
  
  }
}
