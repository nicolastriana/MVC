package Modelo;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Labing I5
 */
public class BD {
    
    private ArrayList<Persona> personas;
    
    public BD() {
        this.personas = new ArrayList<>();
        this.personas.add(new Persona("Laura","Parada"));
        this.personas.add(new Persona("Diana","P"));        
        this.personas.add(new Persona("N","M"));        
    }
    
    public void addPersona (Persona persona){
        this.personas.add(persona);
    }
    
    public ArrayList<Persona> getPersona(){
        return personas;
    }
}
