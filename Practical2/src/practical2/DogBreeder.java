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

        DogRegister register = new DogRegister();

        System.out.println("Starting dog application");

        Dog.printTotal();

        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);

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

        register.addDog(myDog1);
        register.addDog(myDog2);

        //breed army of dogs
        for (int i = 1; i  <=  5000; i++) {
            register.addDog(new Dog(Integer.toString(i), 
                    Integer.toString(i % 5), i));
        }

        Dog.printTotal();
        
        System.out.println(register);
        System.out.println(register.getDog(49));
        System.out.println(register.getDog(1));
        System.out.println(register.getDog(50000));
        
        //canine culling
        for (int i = 500; i <2000; i++){
            System.out.println("Dog deleted:");
            System.out.println(register.deleteDog(i));
        }
        
        Dog.printTotal();
        System.out.println(register.deleteDog(9000));
        System.out.println(register);
        // TODO code application logic here
    }

}
