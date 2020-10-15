package data;

import java.util.ArrayList;
import java.util.List;

import Entidades.Persona;

public class Personadata {
    List<Persona> lis= new ArrayList<Persona>();
    int id=0;
    public void create(Persona p ) {
        p.setId(++id);
        lis.add(p);
        
    }
    public List<Persona> list(String filter){
       
        return lis;
        
    }

    public Persona get(int id){
        int index=0;
        for(Persona d : lis){
            if(d.getId() == id ){
                return lis.get(index);
            }
            index++;
        }
        return null;
    }

    
    public void update(Persona p) {
        int index=0;
        
        for(Persona d: lis) {
            if(d.getId() == p.getId()){
                //d = p
                lis.set(index, p);
                
            }
        }   index++;
        
        
    }

    public void delete( int id) {
        for(Persona d : lis){
            if(id == d.getId()){
                lis.remove(d);
                //System.out.println("Eliminado "+ d.getName());;
            }
        }
                
    }
}

