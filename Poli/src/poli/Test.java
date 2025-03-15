package poli;
public class Test {
public static void main(String[] args) {
    Person p = new Person("Bob");
    Animals an = new Animals(1);
    Info in1 = new Person("Jhon");
    Info in2 = new Animals(2);

    p.show();
    an.show();
    System.out.println();
    in1.show();
    in2.show();
    System.out.println();
    System.out.println(p.age);

}
}
