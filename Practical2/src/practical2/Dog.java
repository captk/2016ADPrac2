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
public class Dog {

    private int regNum = -1;
    private String dogBreed = "unknown";
    private String name = "unknown";
    private HashSet<String> owner;
    static private int total = 0;
    private int sequence;

    public int getSequence() {
        return sequence;
    }

    public HashSet<String> getOwner() {
        return owner;
    }

    public void addOwner(String owner1) {
        this.owner.add(owner1);
    }

    public String toString() {
        return "Dog " + name + ", Class = " + dogBreed + ", #owners " + owner.size() + ", Registration # = "
                + regNum + ", Sequence # = " + sequence;
    }

    public int getRegNum() {
        return regNum;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public String getName() {
        return name;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Dog() {
        owner = new HashSet();
        total++;
        sequence = total;
    }

    public Dog(String dName, String dBreed, int dnum) {
        name = dName;
        dogBreed = dBreed;
        regNum = dnum;
        owner = new HashSet();
        total++;
        sequence = total;
    }

    public static void printTotal() {
        System.out.println("Total number of dogs bred: " + total);
    }
}
