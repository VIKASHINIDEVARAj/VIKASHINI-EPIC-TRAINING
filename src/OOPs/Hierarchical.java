package OOPs;
class classA
{
    int a=500;
}
class classB extends classA
{
    int b=50;
}
class classC extends classA
{
    int c=90;
}
class classD extends classB
{
    int d=30;
    void Dclass(int i){
        System.out.println("D CLASS");
    }
}
class classE extends classB
{
    int e=100;
    void Eclass(int i,int j){
        System.out.println("E CLASS");
    }
}
class classF extends classC
{
    int f=20;
    void Fclass(int i, int j, int k){
        System.out.println("F CLASS");
    }
}
public class Hierarchical
{
    public static void main(String[] args)
    {
       classB cb = new classB();
       classC cc = new classC();
       classF cf = new classF();
       classE ce = new classE();
       classD cd = new classD();
        System.out.println("B:"+cb.a);
        System.out.println("B:"+cb.b);
        System.out.println("C:"+cc.a);
        System.out.println("C:"+cc.c);
        cf.Fclass(15,16,17);
        ce.Eclass(23,24);
        cd.Dclass(3);
    }
}
