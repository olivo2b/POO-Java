/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locomotion;

/**
 *
 * @author Aflokkat
 */
public class Voitures extends Vehicules {
    private String marque;
    private int nombre_de_roues;

public Voitures (String nom, int km, String marque, int nombre_de_roues){
super(nom, km);
this.marque = marque;
this.nombre_de_roues = nombre_de_roues;
}
            
public void caracteristiques(){
    System.out.println("le vehicule a " + nombre_de_roues + "roues, sa marque est" + marque);
}    
            
            
    
}
