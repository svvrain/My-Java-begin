package abstractny;

public abstract class Abstr {           // Отличие абстрактного класса от интерфейса в том что абстрактный класс может иметь реализованные методы,
    String name = "Field_abstr_class";  // а также поля класса, но класс может наследовать только один абстракный класс, а интерфейсов может реализовать множество.
    public void sound(){
        System.out.println("sound");
    }
    public abstract void abs();
}

class Akter extends Abstr{
    public void abs(){
        System.out.println("Akter sounds");
    }
}


class Test{
    public static void main(String[] args) {
        Akter akt = new Akter();
        akt.abs();
        akt.name = "Vasya";
        System.out.println(akt.name);
        Abstr abstr = new Abstr(){    // создание анонимного класса от абстрактного класса
            public void abs(){
                System.out.println("Anonim");
            }
        };
        abstr.abs();
    }
}
