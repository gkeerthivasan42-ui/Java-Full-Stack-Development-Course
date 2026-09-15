interface Parent1
{
    int cash=100;
    void show1();
}
interface Parent2
{
    String property="car";
    void show2();
}
public class InterFaceDemo implements Parent1,Parent2{
    public static void main(String[] args) {
        InterFaceDemo ifd=new InterFaceDemo();
        ifd.show1();
        ifd.show2();
    }
    public void show1(){        
        System.out.println("this is interface override method:"+cash);
    }
    public void show2(){
            System.out.println("this is interface override method:"+property);
    }
}