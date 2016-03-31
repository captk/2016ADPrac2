/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practical2;

import java.util.Comparator;

/**
 *Something that compares the dog breeds
 * @author k
 */
public class DogComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        return ((Dog)o1).getDogBreed().compareTo(((Dog)o2).getDogBreed());
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
