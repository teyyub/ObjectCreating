public class NewInstance {
    public static void main(String[] args) {
        try
        {
            Class cls = Class.forName("NewInstance");
            NewInstance obj =  (NewInstance) cls.newInstance();
            NewInstance obj1 =  (NewInstance) cls.newInstance();
            // TODO: 7/19/2021
            /*
                new ile olan objectlerin xasseleri burdada
                odenilirmi bunada baxmaq lazimdir qeyd kimi qalsin
                asagida iki numune yoxlayiram
                bura aglimiza gelen cavablari yazaq
            * **/
            System.out.println(obj==obj1);
            System.out.println(obj.equals(obj1));
            obj.print();

            NewInstance n1 = new NewInstance();
            NewInstance n2 = new NewInstance();
            System.out.println(n1.equals(n2));
            System.out.println(n1==n2);
        }
        catch (ClassNotFoundException | InstantiationException | IllegalAccessException e)
        {
            e.printStackTrace();
        }
    }
    void print(){
        System.out.println("test printing");
    }
}
