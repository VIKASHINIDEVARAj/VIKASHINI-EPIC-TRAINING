package OOPs;
class Parent
{
    int a=10;
    void printData(int a,int b)
    {
        System.out.println("Class A");
    }
}
class Child1 extends Parent
{
    int a=30;
    void printData(int a)
    {
        System.out.println("Class B");
    }
}
class Child2 extends Child1
{
    int a=40;
    void printData(int a, int b,int c)
    {
        System.out.println("Class C");
    }
}
public class MultilevelInheritance //multilevel inheritance
{
    public static  void main(String[] args)
    {
        Child1 child1_Obj=new Child1();
        Child2 child2_Obj= new Child2();
        child1_Obj.printData(27,26);
        child1_Obj.printData(10);//displays by method parameters
        //using child class
        child2_Obj.printData(30,40,50);
        child2_Obj.printData(30,40);
        child2_Obj.printData(50);

    }
}






























































//Idhu Method Overloading across Inheritance. Nee pass panra arguments count-ah vechu compiler correct method-ah thedi call pannikudhu.
//last child class ku mattu object create panni access panni