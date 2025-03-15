package poli;
public class Person implements Info{
   String name;
   int age=5;
   public Person(String name){
    this.name=name;
   }
@Override
public void show() {
  
    System.out.println(name);
  }
}
    

