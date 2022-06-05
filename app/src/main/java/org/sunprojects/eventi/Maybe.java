package org.sunprojects.eventi;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author sunil
 * @param <T>
 */
public class Maybe<T> {
    private final List<T> value;
    
    public Maybe(){
        this.value = new LinkedList<>(); // Empty List, so length = 0 
    }
    
    public Maybe(T value) {
        this.value = new LinkedList<>();
        this.value.add(value); // List has 1 element, so length = 1
    }
    
    public boolean isPresent() {
        return value.size() == 1; // returns false if Empty List, true otherwise
    }
    
    public T getValue() throws Exception {
        if(value.isEmpty())
            throw new IllegalValueAccessException("Value is empty/absent. Only access value, if isPresent is true.");
        
        return value.get(0);
    }
}