public class Main {
    public static void main(String[] args) {

        
        Animal a1 = new Animal("Buddy", "Alice", 5);
        Animal a2 = new Animal("Buddy", "Alice", 5);
        Animal a3 = new Animal("Max", "Bob", 3);

        System.out.println(a1);               
        System.out.println(a1.equals(a2));    
        System.out.println(a1.equals(a3));    

        
        Dog d1 = new Dog("Rex", "John", 4, "Labrador");
        Dog d2 = new Dog("Rex", "John", 4, "Labrador");
        Dog d3 = new Dog("Rex", "John", 4, "Poodle");

        System.out.println(d1);               
        System.out.println(d1.equals(d2));    
        System.out.println(d1.equals(d3));    

        
        try {
            Animal bad = new Animal("Cat", "Eve", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}


