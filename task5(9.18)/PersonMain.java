package task5;

public class PersonMain {
    public static void main(String[] args) {
 
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        Person p4 = new Person();
        Person p5 = new Person();

    
        p1.setName("이진");
        p1.setAge(26);

        p2.setName("최정민");
        p2.setAge(23);

        p3.setName("이승이");
        p3.setAge(25);

        p4.setName("정소영");
        p4.setAge(26);

        p5.setName("손큰솔");
        p5.setAge(25);

      
        System.out.println(p1.getName() + " / " + p1.getAge());
        System.out.println(p2.getName() + " / " + p2.getAge());
        System.out.println(p3.getName() + " / " + p3.getAge());
        System.out.println(p4.getName() + " / " + p4.getAge());
        System.out.println(p5.getName() + " / " + p5.getAge());
    }
}