/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q1;

import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Le Anh Tuan - CE180905
 */
public class MyCarp implements ICarp {

    @Override
    public int f1(List<Carp> t) {
        int count = 0;
        for (Carp carp : t) {
            if (carp.getPond().length() >= 2 && Character.isDigit(carp.getPond().charAt(1))) {
                count++;
            }
        }
        return count;  
    }
    
    @Override
    public void f2(List<Carp> t) {
        for (Carp carp : t) {
            String pond = carp.getPond();
            if (pond.equals(new StringBuilder(pond).reverse().toString())) {
                carp.setState(99);
                break;
            }
        }
    }
    
    @Override
    public void f3(List<Carp> t) {
        if (t.size() >= 5) {
            List<Carp> sublist = t.subList(0, 5);
            sublist.sort(Comparator.comparingInt(Carp::getState));
        }
    }
    
}