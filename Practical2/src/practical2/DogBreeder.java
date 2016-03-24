/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

/**
 *
 * @author k
 */
public class DogBreeder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Starting dog application");
        
        Dog.printTotal();
        
        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog( "Fluffy", "Poodle", 3496);
        
        System.out.println(myDog1);
        System.out.println(myDog2);
        
        myDog1.setName("Fido");
        myDog1.addOwner("Anne");
        myDog1.addOwner("Bob");
        myDog2.addOwner("Martha");
        
        System.out.println(myDog1);
        System.out.println(myDog1.getName());
        System.out.println(myDog2.getName());
        
        Dog.printTotal();
        
        // TODO code application logic here
    }
    
}
