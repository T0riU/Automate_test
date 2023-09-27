class MyCode {
    public static void main (String[] args) {

//        A a = new A();
        //B ba = new A();
         A ab = new B();
        // B b = new B();

         ab.print();
         //ab.print2();
    }
}

class A {

    A() {
        System.out.println("Сlass A");
    }

    public void print() {
        System.out.println("Method from A");
    }
}

class B extends A {

    B() {
        System.out.println("Сlass B");
    }

    public void print() {
        System.out.println("Method from B");
    }

    public void print2() {
        System.out.println("Print2");
    }
}
