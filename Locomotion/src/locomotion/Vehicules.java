/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package locomotion;

/**
 *
 * @author Aflokkat
 */
public class Vehicules {
    private String nom;
    private int km;
    
public Vehicules( String nom, int km){
    this.nom= nom;
    this.km = km;
}
public String getNom(){
    return this.nom;
}
public int getKm(){
    return this.km;
}
    

public void demarrer(){
   System.out.println("le vehicule a " + getKm() + "km");
   }

}

