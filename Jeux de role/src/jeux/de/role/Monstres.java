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
public class Monstres {
   protected double pv;
    protected double degats;
    private double armure;
    private boolean vie;
    private double defense;
    public Monstres(double pv, double degats, double armure, boolean vie){
        this.pv = pv;
        this.degats = degats;
        this.vie = true;
        this.armure = armure;
        this.defense = armure;
    }
        
        public Monstres(){
            this.pv =100;
            this.degats = 20;
            this.armure = 50;
            this.vie = true;
            
        }
        public double getPv(){
            return this.pv;
        }
        public double getDegats(){
            return this.degats;
        }
        public double getArmure(){
            return this.armure;
        }
        public boolean getVie(){
            return this.vie;
        }
        public void setPv(double pv){
          
            this.pv =pv;
            if (pv<=0){
                this.vie = false;
            }
        }
        public void setDegats(double degats){
            this.degats = degats;
        }
        public void setArmure(double armure){
            this.armure = armure;
        }
        public void setVie(boolean vie){
            
            this.vie = vie;  
        }
        public void attaquer(Personnage p){
            armure = defense;
            p.setPv(p.getPv()-this.degats);
        }
        public void parrer(){
            armure = defense;
            this.armure=this.defense*2;   
        }
        public void jouer(Personnage p){
            
            Random choix = new Random();
            int i = choix.nextInt(100);
            if(i<50)
                attaquer(p);
                else
                parrer();
            
                        }
                public  String toString(){
        return ("vous perdez" + degats + "points de vie et" + armure + "de points d'armure, le monstre a" + pv);
            }
                public void loose(Personnage p){
                    if (p.getPv()<=0)
                    System.out.println("vous avez perdu");
                }
        }
    
            
    

