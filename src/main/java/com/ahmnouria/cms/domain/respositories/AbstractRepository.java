package com.ahmnouria.cms.domain.respositories;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class AbstractRepository<T> {

    private final List<T> elements = new ArrayList<>(); 

    public void delete(T entity) {
        final Iterator<T> iterator = elements.iterator(); 
        while(iterator.hasNext()) {
         final T next = iterator.next(); 
         if(next.equals(entity)) {
             iterator.remove();
             break; 
         }
        }
    }


    public T save(T entity) {
        this.elements.add(entity);
        return entity;  
    }    

    public List<T> findAll() {
        return this.elements; 
    }

    public T findOne(String id) {
        return this.elements.stream().filter(el -> el.equals(id)).findFirst().get();
    }
}
