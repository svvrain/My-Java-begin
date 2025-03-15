package poli2;

import java.util.ArrayList;
import java.util.List;

public class Test {
   
public static void main(String[] args) {

                    // 1 вариант

    // Animal an = new Animal();
    // Dog dog = new Dog();
    // an.eat();
    // dog.eat();
    // dog.bark();

    // Animal a = dog;
    // a.eat();

                    // 2 вариант

    // Animal an2 = new Dog();
    // an2.eat();
    // Dog dog2 = (Dog)an2;
    // dog2.bark();


                                // так не получится
    // Animal animal = new Animal();
    // Dog d = (Dog)animal;  // так не получится
    // d.bark();
     
            // ------------------------------
            // Дженерики

    List <Animal> list = new ArrayList <>();
    list.add(new Animal(1));
    list.add(new Animal(2));
    list.add(new Animal(3));
    
    Test.show(list);  
    System.out.println();

            // WildCard(тоже дженерики)

    List <Dog> list2 = new ArrayList <>();
    list2.add(new Dog(4));
    list2.add(new Dog(5));
    list2.add(new Dog(6));
    
    Test.show(list2); 
    
                                // Оператор instanceof пример -> o instanceof Object
//     Object o = new Object();
//        System.out.println( o instanceof Object);

    }

    private static void show(List <? extends Animal> list){   // (List <? super Animal> list) super - это выше по наследованию
        for(Animal a : list){                           // (Object a : list) - тип объекта должен быть Object
            a.eat();
           System.out.println(a.id);

           if(a instanceof Dog){  //проверка принадлежности к классу Dog 
            Dog x=(Dog)a;               // down-кастинг(явное,нисходящее приведение типа Animal к Dog)
            System.out.println(x.id);       
            x.bark();
           }
            
           }
        }
    
}
