/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

import java.util.HashSet;

/**
 *
 * @author k
 */
public class DogRegister {
    //gonna be lazy and use HashSet all day
    private HashSet<Dog> register;

    public DogRegister() {
        this.register = new HashSet();
    }
    
    public void addDog(Dog dog){
        register.add(dog);
    }
    
    //slow af. Don't care.
    public Dog getDog(int seqNo){
        for (Dog dog: register){
            if (dog.getSequence() == seqNo){
                return dog;
            }
        }
        return null;
    }
    
    public String toString(){
        return "Register has " + register.size() + " dogs.";
    }
}
