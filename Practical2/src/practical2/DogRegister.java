/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author k
 */
public class DogRegister {

    //gonna be lazy and use HashSet all day
    //welp, this thing can't be a set so i'll use
    //arraylists
    private ArrayList<Dog> register;

    public DogRegister() {
        this.register = new ArrayList();
    }

    public void addDog(Dog dog) {
        register.add(dog);
    }

    //slow af. Don't care.
    public Dog getDog(int seqNo) {
        for (Dog dog : register) {
            if (dog.getSequence() == seqNo) {
                return dog;
            }
        }
        return null;
    }

    //also slow af. Still don't care
    //Deletes dogs by their sequence number
    public Dog deleteDog(int seqNo) {
        for (Dog dog : register) {
            if (dog.getSequence() == seqNo) {
                register.remove(dog);
                return dog;
            }
        }
        return null;
    }

    //lawl, gonna return a HashSet. I'm so lazy...
    public Collection<Dog> getDogsWhoseNameContains(String charSequence) {
        HashSet<Dog> dogPile = new HashSet();

        for (Dog dog : register) {
            if (dog.getName().contains(charSequence)) {
                dogPile.add(dog);
            }
        }

        return dogPile;
    }

    //God damn this method to hell
    //This method will use the DogComparator to sort the arraylist by breed
    public void groupByBreed() {
        this.register.sort(new DogComparator());
    }

    public String toString() {
        return "Register has " + register.size() + " dogs.";
    }

    public void printDogBreed() {
        for (Dog aDog : this.register) {
            System.out.println(aDog.getDogBreed());
        }
    }
}
