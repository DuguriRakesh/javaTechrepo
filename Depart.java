abstract class Depart {
    public abstract int getDepartSize();
}

class HRDepartment extends Depart {

    public int getDepartSize() {
        int a = 10;
        System.out.println("The department size: " + a);
        return a;
    }
}

class size {
    public static void main(String[] args) {
        HRDepartment siz = new HRDepartment();
        siz.getDepartSize();
    }
}