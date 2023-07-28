//Inheritance
//Encapsulation
//Overriding
class Parent{
    public int x;
    void print(){
        System.out.println(x:"Print Parent");
    }
}

class A extends Parent{

    @Override
    void print() {
        System.out.println(x:"Print A");
    }

    void test(){
        print();
        x=5;
    }
}

class B extends A {
    void test2() {
        print();
    }
    
}

public class App extends Parent {
    
    public static void main(String[] args) throws Exception {
        Parent parent = new Parent();
        parent.print();

        A a = new A();
        a.print();
    }
}