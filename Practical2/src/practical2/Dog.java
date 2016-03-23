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
public class Dog {
    
    private int regNum = -1;
    private String dogBreed = "unknown";
    private String name = "unknown";
    
    
    public String toString(){
        return "Dog " + name + ", Class = " + dogBreed + ", Registration # = "
                + regNum;
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
    }
    
    public Dog(String dName, String dBreed, int dnum){
        name = dName;
        dogBreed = dBreed;
        regNum = dnum;
    }
}
