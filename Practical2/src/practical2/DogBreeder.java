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

        System.out.println("\nAdding two dogs");
        Dog myDog1 = new Dog();
        Dog myDog2 = new Dog("Fluffy", "Poodle", 3496);

        System.out.println(myDog1);
        System.out.println(myDog2);

        System.out.println("\nSetting some dog parameters");
        myDog1.setName("Fido");
        myDog1.addOwner("Anne");
        myDog1.addOwner("Bob");
        myDog2.addOwner("Martha");

        System.out.println(myDog1);
        System.out.println(myDog1.getName());
        System.out.println(myDog2.getName());

        Dog.printTotal();
        
        System.out.println("\nAdding two dogs to register");
        register.addDog(myDog1);
        register.addDog(myDog2);

        //breed army of dogs
        System.out.println("\nBreeding an army of dogs");
        for (int i = 1; i  <=  50; i++) {
            register.addDog(new Dog(Integer.toString(i), 
                    Integer.toString(i % 5), i));
        }

        Dog.printTotal();
        
        System.out.println(register);
        
        System.out.println("\nGetting some dogs from register");
        System.out.println(register.getDog(4));
        System.out.println(register.getDog(1));
        System.out.println(register.getDog(50000));
        
        //canine culling
        System.out.println("\nCulling dogs");
        for (int i = 5; i <30; i++){
            System.out.println("Dog deleted:");
            System.out.println(register.deleteDog(i));
        }
        
        Dog.printTotal();
        System.out.println(register.deleteDog(9000));
        System.out.println(register);
        
        System.out.println("\nTesting the existence of some dogs");
        System.out.println(register.getDogsWhoseNameContains("2198"));
        System.out.println(register.getDogsWhoseNameContains("234"));
        System.out.println(register.getDogsWhoseNameContains("0"));
        System.out.println(register.getDogsWhoseNameContains("21980"));
        
        System.out.println("\nSorting dog register by breed");
        register.groupByBreed();
        register.printDogBreed();
        // TODO code application logic here
    }

}
