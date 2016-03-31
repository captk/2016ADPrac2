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
public class DogSequenceAfter20 implements DogCondition {

    @Override
    public boolean judge(Dog d) {
        //Returns true if dog's sequence number is greater than 20
        if (d.getSequence() > 20){
            return true;
        }
        return false;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
