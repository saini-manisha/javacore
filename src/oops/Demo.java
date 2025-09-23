package oops;

public class Demo {

    public static void main(String[] args){
        Student s1;
        s1=new Student();
        s1.studentName="Ram";
        s1.studentId=123;
        s1.studentCity="narnaul";

        s1.study();
        s1.showFullDetails();


        Student s2=new Student(1,"manisha","narnaul");
        s2.studentId=234;
        s2.studentName="manisha";
        s2.studentCity="narnaul";

        s2.showFullDetails();

        Dog d1=new Dog();

        d1.eating();
        d1.speak();
    }
}
