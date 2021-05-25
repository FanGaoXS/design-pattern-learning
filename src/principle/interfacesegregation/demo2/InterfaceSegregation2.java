package principle.interfacesegregation.demo2;

/**
 * Created with IntelliJ IDEA.
 *
 * @Auther: 吴青珂
 * @Date: 2021/05/25/17:38
 * @Description:
 */
public class InterfaceSegregation2 {
    public static void main(String[] args) {

        A a = new A();
        a.doOperation1(new B());
        a.doOperation2(new B());
        a.doOperation3(new B());

        C c = new C();
        c.doOperation1(new D());
        c.doOperation4(new D());
        c.doOperation5(new D());
    }
}

//接口1
interface Interface1 {
    void operation1();
}

//接口2
interface Interface2 {
    void operation2();
    void operation3();
}

//接口3
interface Interface3 {
    void operation4();
    void operation5();
}

class B implements Interface1,Interface2{

    @Override
    public void operation1() {
        System.out.println("B 实现了operation1");
    }

    @Override
    public void operation2() {
        System.out.println("B 实现了operation2");
    }

    @Override
    public void operation3() {
        System.out.println("B 实现了operation3");
    }
}

class D implements Interface1,Interface3{

    @Override
    public void operation1() {
        System.out.println("D 实现了operation1");
    }

    @Override
    public void operation4() {
        System.out.println("D 实现了operation4");
    }

    @Override
    public void operation5() {
        System.out.println("D 实现了operation5");
    }
}

class A {
    public void doOperation1(Interface1 i){
        i.operation1();
    }
    public void doOperation2(Interface2 i){
        i.operation2();
    }
    public void doOperation3(Interface2 i){
        i.operation3();
    }
}

class C {
    public void doOperation1(Interface1 i){
        i.operation1();
    }
    public void doOperation4(Interface3 i){
        i.operation4();
    }
    public void doOperation5(Interface3 i){
        i.operation5();
    }
}
