package bean;

/**
 * @author zhou_gc@suixingpay.com
 * @description
 * @date 2020/1/9 10:42
 */



public class Person {

    private String name;

    private int age;

    public Person (String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override public String toString() {
        return "Person{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
