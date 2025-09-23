package oops;

public class Parent {

    //overridden method
    public void m1(){
        System.out.println("I am m1 of parent");

    }
}

class Child extends Parent{

    //overriding method
     // overriding is the process when child class is not with the method  body of the parent class then class redefine the body of the parent method this procss is called method overridng
    // co-varient return types are allowed
    // co-varient
    // accessiblity in child can increase but cannot decrease


    public void m1(){
        System.out.println("i am m1 of child");
    }

}
