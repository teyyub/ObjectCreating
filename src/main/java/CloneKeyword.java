public class CloneKeyword implements Cloneable{
    private String name ="test";
    private int age =35;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        CloneKeyword ck  = new CloneKeyword();
        ck.print();
        try {
            CloneKeyword ck2  = (CloneKeyword) ck.clone();
            ck2.print();
            CloneKeyword ck3  = (CloneKeyword) ck.clone();
            ck3.age =45;
            ck3.print();
            ck2.print();

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }

    void print(){
        System.out.println(name);
        System.out.println(age);

    }
}
