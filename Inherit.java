class Nokia{
int x,y;
Nokia(){
System.out.println("parents is executed");
}
void f1(){
System.out.println("parent function1 is executed");
}
void f2(){
System.out.println("parent function 2 is executed");
}
}
class Nokia2 extends Nokia
{
int z;
void f3()
{
System.out.println("child fun1 is executed");
}
Nokia2(){
System.out.println("child constructor is executed");
}
}
class Inherit{
public static void main(String args[]){
Nokia2 n1=new Nokia2();
}
}

