/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeux.de.role;

/**
 *
 * @author Aflokkat
 */
public class Armures {
    private String nom;
    private double armure;
    
    public Armures (String nom, double armure){
        this.nom = nom;
        this.armure = armure;
       }
    public String getNom(){
        return this.nom;
         }
    public double getArmure(){
        return this.armure;
    }
    public void setNom (String nom){
       this.nom = nom;
       }
    public void setArmure (double armure){
        this.armure = armure;
    }
    
}
