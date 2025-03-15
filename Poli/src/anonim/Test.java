package anonim;
                    // обычная реализация
// class My{
//     public void show(){
//         System.out.println("I'm showing you something");
//     }
// }

// class Another extends My{   // обычный класс наследует другой класс
//     @Override                  // и переопределяет метод
//     public void show(){
//         System.out.println("The other shows you something");
//     }
// }


                        // интерфейс
interface AbleToEat {
    public void eat();    
}

                // реализация при помощи класса реализующий интерфейс 
// class Animal implements AbleToEat{

//     @Override
//     public void eat() {
//        System.out.println("Animal is eating");
//     }

// }



public class Test {
    public static void main(String[] args) {

                        // обычная реализация
        // My m = new My();        // обычный класс наследует другой класс и переопределяет метод
        // m.show();
        // Another an = new Another();
        // an.show();

        // My manonim = new My(){   // анонимный класс расширяет класс My
        //     public void show(){
        //         System.out.println("Anonim shows you something");
        //     }
        // };
        // manonim.show();

                            // реализация при помощи класса реализующий интерфейс 
        // AbleToEat ab = new Animal();     
        // ab.eat();

                                        // создание анонимного класса из интерфейса
        AbleToEat abl = new AbleToEat() {        // создание анонимного класса из интерфейса
            public void eat(){
                System.out.println("Some eating");
            }
        };
        abl.eat();



    }
}
