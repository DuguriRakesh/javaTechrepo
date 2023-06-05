class Y {
    static int i;
    public static int cal(){
        return 45;

    }
    static{
        i = cal();
    }
}
class Static{
    public static void main (String []args){
        // A obj = new A();
        System.out.print(Y.cal());


    }
}


