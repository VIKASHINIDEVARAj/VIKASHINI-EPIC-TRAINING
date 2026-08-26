package OOPs;
class ClassA
{
    int a=10;
    void printData(int a,int b)
    {
        System.out.println("Class A");
    }
}
class ClassB extends ClassA
{
    int a=30;
    void printData(int a)
    {
        System.out.println("Class B");
    }
}
public class Inheritance
{
    public static  void main(String[] args)
    {
         ClassB bObj=new ClassB();
        System.out.println(bObj.a);
        bObj.printData(10,20);//displays by method parameters

    }

}
