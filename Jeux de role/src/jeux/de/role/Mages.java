/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeux.de.role;
import java.util.Random;
/**
 *
 * @author Aflokkat
 */
public class Mages extends Monstres {
    private boolean regeneration;
    
public Mages (double pv, double degats, double armure, boolean vie, boolean regeneration, String nom){
    super(pv, degats, armure, vie, nom);
    this.regeneration = regeneration;
}
public boolean getRegeneration(){
    return this.regeneration;
}
 public void setRegeneration (boolean regeneration){
     this.regeneration = regeneration;
 }
 public void regen(){
     if(this.pv >=10){
    this.pv = pv*1.2;
     }
 }
 public void attaquer(Personnage p){
     
        Random result = new Random();
        int i = result.nextInt(2);
        if (i==1) {
            System.out.println("le mage a " + this.pv + "points de vie");
     regen();
     attaquer(p);
 }
        if (i==2){
            System.out.println("le mage a " + this.pv + "points de vie");
    attaquer(p);
            
        }
        
 }
     
     
         
         
     }
 

