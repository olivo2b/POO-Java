/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeux.de.role;

/**
 *
 * @author Aflokkat
 */
public class Armes {
    private String nom;
    private double degats;
    public Armes (String nom,double degats){
        this.nom = nom;
        this.degats = degats;
    }
        
    public String getNom(){
        return this.nom;
    }
    public double getDegats(){
        return this.degats;
    }
    public void setNom(String nom){
        this.nom = nom;    
    }
    public void setDegats(double degats)  {
        this.degats  = degats;
    }
    
        }
    
    

