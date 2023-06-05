package sunday;

class A{
    int i;
}
class B extends A{
    String name;
    public B(){
        int i =5;
        String name = "Rakesh";
        System.out.print(+i+ " "+name);

    }
    public B(String N){
        String name = "N";
        System.out.print(""+name);
    }
}
public class Instance{
    public static void main (String []args){
        B obj = new B();


    }
}












