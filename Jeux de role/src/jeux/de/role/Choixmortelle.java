/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeux.de.role;

import java.util.Scanner;



/**
 *
 * @author Aflokkat
 */
public class Choixmortelle {
    private String nom;
    private boolean activation;
public Choixmortelle (String nom, boolean activation){
    this.nom = nom;
    this.activation = true;  
}
    public String getNom(){
        return this.nom;
    }
    public boolean getActivation(){
        return this.activation;
    }
    public void setNom (String nom){
        this.nom = nom;
    }
    public void SetActivation (boolean activation){
        this.activation = activation;
    }
    
        public void choix(Personnage p){
        System.out.println("taper 1 pour sauter ou 2 pour trouver un autre chemin");
        Scanner choix = new Scanner(System.in);
        int i = choix.nextInt(2);
        if (i==1){
            System.out.println("mauvais choix, vous mourrez") ; 
            p.setPv(0);
    }
        if(i==2){
            System.out.println("vous continuez");
        }
        }
}
