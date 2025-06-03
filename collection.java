import java.util.*;
class A{
    public A(){
        ArrayList<String> AL=new ArrayList<>();
        AL.add("vishnu");
        AL.add("sumanth");
        AL.add("naveen");
        AL.add("hemanth");
        System.out.println(AL);
    }
}
class B extends A{
    public B(){
        LinkedList<Integer> LL=new LinkedList<>();
        LL.add(3393);
        LL.add(3366);
        LL.add(3390);
        LL.add(3370);
        System.out.println(LL);
    }
}
class C extends B{
    public C(){
        HashMap<Integer,String> HS=new HashMap<>();
        HS.put(54,"praveen");
        HS.put(84,"vamsi");
        HS.put(67,"saketh");
        HS.put(94,"viswa");
        System.out.println(HS);
    }
}
class D extends C{
    public D(){
        HashSet<String> HM=new HashSet<>();
        HM.add("ganga");
        HM.add("tharun");
        HM.add("prasanth");
        HM.add("anju");
        System.out.println(HM);
    }
}
public class main1{
    public static void main(String[] args){
        A obja=new A();
        B objb=new B();
        C objc=new C();
        D objd=new D();
    }
}
