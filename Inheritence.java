
package practiceprograms;

class Animals{
    String name;
    int age;
    
    void Animals(){
        name = "Tiger";
        age = 30;
        System.out.println(name +"\n" +age);
    }
    void Animals(String name){
        this.name = name;
        age = 30;
        System.out.println(name +"\n" +age);
    }
    void Animals(String name, int age){
        this.name = name;
        this.age = age;
        System.out.println(name +"\n" +age);
    }
    
    public void message(){
        System.out.println("SAVE ANIMALS!");
    }
    public void fav_animal(String animals){
        System.out.println("Favourite animal is: " +animals);
    }
}

class Dog extends Animals{
    String breed;
    int age1;
    
    void Dog(){
        breed = "Labra";
        age1 = 10;
        System.out.println(breed +"\n" +age1);
    }
    void Dog(String breed, int age){
        this.breed = breed;
        this.age1 = age;
        System.out.println(breed +"\n" +age1);
    }
    @Override
    public void message(){
        System.out.println("DOGS ARE MOST LOYAL ANIMAL!");
    }
    public void fav_breed(String breeds){
        System.out.println("Favourite breed og Dogs is: " +breeds);
    }
}

interface Cat{
    void legs();
    void habit();
}

class Elephant extends Animals implements Cat{
    @Override
    public void legs(){
        System.out.println("Cats have 4 legs.");
    }
    @Override
    public void habit(){
        System.out.println("Cats are not so hygienic.");
    }
    public void message2(){
        System.out.println("FEED CATS!!!");
    }
}

public class Inheritence {
    
   public static void main(String args[]){
       Animals ani = new Animals();
       ani.message();
       ani.fav_animal("Cat");
     
       Dog d = new Dog();
       d.Dog();
       d.message();
       
       Cat c = new Elephant();
       c.habit();
       c.legs();
   }
}
