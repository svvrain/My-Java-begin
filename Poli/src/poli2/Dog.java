package poli2;

public class Dog extends Animal {
    public Dog(int id){
        super(id);
    }
    public void bark(){
        System.out.println("Dog is barking");
    }
    public void eat(){
        System.out.println("Dog is eating");
    }
}
