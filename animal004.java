
class Animal {
    void eat() {
        System.out.println("eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("barking");
    }
}


public class animal004{
    public static void main(String[] args) {
        Animal a = new Animal(); 
        a.eat(); 
        
        Dog d = new Dog(); 
       
        d.bark(); 
    }
}

