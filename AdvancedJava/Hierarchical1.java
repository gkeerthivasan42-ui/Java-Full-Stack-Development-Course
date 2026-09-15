class GrandFather
{
void dis()
{
    System.out.println("grandfather class");
}
}
class Appa extends GrandFather
{
    int cash=50000;
    void dis()
    {
        super.dis();
        System.out.println("Appa class");
    }
}
class Son1 extends Appa
{
    void dis()
    {
        super.dis();
        System.out.println("son1 access father cash "+cash);
    }
}
class Son2 extends Appa{
    void dis()
    {
        super.dis();
        System.out.println("son2 access father cash "+cash);
    }
}
public class Hierarchical1 {
    public static void main(String[] args) {

    Son1 s1=new Son1();   
    Son2 s2=new Son2();   
    s1.dis();
    s2.dis();

    }
}