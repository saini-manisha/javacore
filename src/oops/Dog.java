package oops;

public class Dog extends Animal {

    int x=4;

    public Dog(){
        System.out.println("Dog constructor called");
    }

    public void speak(){

        System.out.println(super.x);
        System.out.println(this.x);

    }

}
