package OOPs;
class classa
{
    int a=500;
}
class classb extends classa
{
    int b=50;
}
class classc extends classa
{
    int c=90;
}
class classd extends classb
{
    int d=75;
}
class classe extends classc
{
    int e=85;
}
class classf extends classe
{
    int f=1101;
}
public class Hybrid
{
    public static void main(String[] args)
    {
        classd cd = new classd();
        classf cf = new classf();
        System.out.println(cd.b);
        System.out.println(cd.a);
        System.out.println(cf.e);
        System.out.println(cf.c);
        System.out.println(cf.a);

    }
}