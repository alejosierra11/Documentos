/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurasdedatos.cap2.listas;

import java.util.ArrayList;

/**
 *
 * @author tusk
 */
public class Cola {
    private ArrayList<Object> fifo=new ArrayList();
    
    public void offer(Object o){
    fifo.add(o);
    }
    
    public Object peek(){
        if(!(fifo.isEmpty())){
        return fifo.get(0);
        }else{
        return null;
        }
    }
    public Object poll(){
    if(!(fifo.isEmpty())){
        Object o= fifo.get(0);
        return o;
        }else{
        return null;
        }
    }
}
