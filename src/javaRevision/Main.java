package javaRevision;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args){
        // using implementation
//        Bird eagleObject=new Eagle();
//        eagleObject.canFly("hello");

        //using anonymous class

//        Bird eagleObject=new Bird(){
//            public void canFly(String val){
//                System.out.println("Eagle bird implementation");
//
//            }
//        };
//
//        eagleObject.canFly("vertical");


        // using lambda expression

//        Bird eagleObject =(String val)->{
//            System.out.println("Eagle bird implementation");
//
//        };
//
//        eagleObject.canFly("vertical");

        // consumer functional interface

//        Consumer<Integer> loggingObject= (Integer val)->{
//            System.out.println("logging "+val);
//        };
//        loggingObject.accept(10);

        // supplier functional interface

//        Supplier<String> isEvenNumber= ()->{
//            return "this is the cat is resturing";
//        };
//        System.out.println(isEvenNumber.get());

        // Function functional interface
//
//        Function<Integer,String> integerToString= (Integer num)->{
//            String output=num.toString();
//            return output;
//        };
//
//        System.out.println(integerToString.apply(64));

        // Predicate
//        Predicate<Integer> isEven=(Integer val)->{
//            if(val%2==0){
//                return true;
//            }
//            return false;
//        };
//        System.out.println(isEven.test(4));

//        Class eagleClass = Eagle.class;
//        System.out.println(eagleClass.getName());
//        System.out.println(eagleClass.getModifiers());
//        System.out.println(Modifier.toString(eagleClass.getModifiers()));

//        Class eagleClass = Eagle.class;
//        Method[] methods= eagleClass.getDeclaredMethods();
//
//        for(Method method: methods){
//            System.out.println("Method name: "+method.getName());
//            System.out.println("return type: "+method.getReturnType());
//            System.out.println("Class name: "+ method.getDeclaringClass());
//            System.out.println("************");
//        }

//        Class eagleClass = Eagle.class;
//        Field[] fields= eagleClass.getDeclaredFields();
//
//        for(Field field: fields){
//            System.out.println("FieldName: "+ field.getName());
//            System.out.println("Type: "+ field.getType());
//            System.out.println("Modifier: "+Modifier.toString(field.getModifiers()));
//
//        Class eagleClass = Eagle.class;
//        Eagle eagleObj = new Eagle();
//        try{
//
//        Field field = eagleClass.getDeclaredField("canSwim");
//        field.set(eagleObj,"eaglebrownbreed");
////        System.out.println(eagleObj.canSwim);
      //  }
//        catch (Exception e){
//
//        }
//        Map<Integer,String> map=new HashMap<>();
//        map.put(1,"a");
//        map.put(2,"b");
//        map.forEach((Integer key ,String value)-> System.out.println("key: "+key+" value: "+value));

        MonitorLockEx obj= new MonitorLockEx();
        Thread t1= new Thread(()->{obj.task1();});
        Thread t2=new Thread(()->{obj.task1();});
        Thread t3=new Thread(()->{obj.task3();});

        t1.start();
        t2.start();
        t3.start();


    }


}

class MonitorLockEx{
    public synchronized  void task1(){
        try{
            System.out.println("inside task1"+ Thread.currentThread().getName());
            Thread.sleep(1000);
        }
        catch (Exception e){

        }
    }
     public void task2(){
         System.out.println("task2, but before sybcgronized");
         synchronized (this){
             System.out.println("task2, inside synchronized");
         }
     }

     public void task3(){
         System.out.println("task3");
     }
}
