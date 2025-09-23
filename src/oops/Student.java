package oops;
//
//Constructor overloading
//        1. No. of argu different
//        2. type of argu different
//        3. order of argu may different

/*
 Method overloading:
  having multiple methods in same class with same name
          1. No. of argu different
//        2. type of argu different
//        3. order of argu may different

this keyword

  refer current invoking object
  this() -> for calling current class construction from inside different constructor of same class.


  Inheritance

  it is the mechanism in java by which one class is allowed to inherit the features of another class.

three name of parent
  Parent class
  super class
  base class

  three name of child
  child class
  sub class
  derived class

  types of inheritance

  1.single inheritance
  A
  ^
  |
  B
  2. multilevel inheritance
  A (grand class)
  ^
  |
  B (parent class, this class is child and parent also this is why this is multilevel inheritance )
  ^
  |
  C (child class)

  3. Hierarchical inheritance

     A
  ^  ^ ^
  |  | |
  B  C D

  4. multiple inheritance (not support in java with the help of class but it does support with the interface)

  5. Hybrid inheritance(mixture of inheritance, combination of inheritance , if multiple inheritance involve then hybrid will not support using class but interfaces can support)
  6. cyclic inheritance (not support in java)

Super keyword

super keyword refer to immediate parent

super() user to call parent class constructor from inside child class constructor

overriding:
 Method overriding

 MohanLal eat(){}(overridden method)

 ^
 |
 Shyam eat(){}  (overriding method)


 // public >protected> default >private

 Encapsulation
    Wrapping of the data members and member methods in a single unit.
    data hiding
    security













 */



class Student {
    //instance variable
    int studentId;
    String studentName;
    String studentCity;

    public Student(){
        this(96);
        System.out.println("creating object");
    }

    public Student(int st){
        System.out.println("Parameterized constructoer having one int parameter");
    }

    public Student(int studentid,String name,String city){
        studentId=studentid;
        studentName=name;
        studentCity=city;
    }
    //Behaviour : member methods
    public void study(){
        System.out.println(studentName+ "is studing");
    }

    public void study(float f){
        System.out.println("method overloading");
    }

    public void showFullDetails(){
        System.out.println("My name is "+ studentName);
        System.out.println("My id is "+ studentId);
        System.out.println("My city is "+studentCity);
    }
}
