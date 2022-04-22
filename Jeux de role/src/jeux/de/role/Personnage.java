/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeux.de.role;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Aflokkat
 */
public class Personnage {
   private double pv;
    protected double degats;
    private double armure;
    private double defense;
    private Armes epee;
    private Armures bouclier;
    
    
    public Personnage(double pv, double degats, double armure){
        this.pv = pv;
        this.degats = degats;
        this.armure = armure;
        this.defense = armure;
    }
        
        public  Personnage()
    {
        this.pv = 100;
        this.degats = 20;
        this.armure = 100;
    }
    
    
    public double getPv(){
        return this.pv;
    }
    public double getDegats(){
        if (epee!=null){
        return this.degats+ epee.getDegats();
        }
        else{
            return this.degats;
        }
    }
    public double getArmure()
    {
        if (bouclier!=null){
        return this.armure + bouclier.getArmure();}
        else{
            return this.armure;
        }
    }
     public void setPv(double pv)
     {
         this.pv = pv;
     }
    public void setDegats(double degats)
    {
        this.degats = degats;
        
        
    }
    public void setArmure (double armure)
    {
        this.armure = armure;
    }
   
    public void attaquer(Monstres m){
       armure = defense;
        m.setPv(m.getPv()-this.degats);
    }
    public void parer(){
      armure = defense;
               this.armure=this.defense*2;
    }
    
    public  String toString(){
        return ("vous commencez avec " + pv + " points de vie et" + armure + "de points d'armure");
    }
    public void jouer(Monstres m){
        System.out.println("taper 1 pour attaquer ou 2 pour parer");
        Scanner choix = new Scanner(System.in);
        int i = choix.nextInt();
        if (i==1){
             System.out.println("le monstre a " +m.getPv() + "points de vie");
            attaquer(m);
            System.out.println("le monstre a " +m.getPv() + "points de vie");
        }
         if (i==2){
             System.out.println("le monstre a " + m.getPv() + "points de vie");
            parer();
            
         }
System.out.println(m);            
        }
    public void win(Monstres m) {
        if (m.getPv()<=0){
            
            epee = new Armes ("sword", 20);
            bouclier = new Armures ("rondache",20);
            System.out.println("vous avez gagner, Bravo, vous trouvez une epee qui vous offre 20 degats suplementaire!!!");
            System.out.println("excellent! vous avez trouver une armure(bouclier) qui vous offre 20 points d armure supplementaire!!!");
        }
    }
        public void choix(){
        System.out.println(" vous etes devant un precipice, taper 1 pour sauter ou 2 pour trouver un autre chemin");
        Scanner choix = new Scanner(System.in);
        int i = choix.nextInt(3);
        if (i==1){
            System.out.println("mauvais choix, vous mourrez") ; 
            this.pv = 0;
    }
        if(i==2){
            System.out.println("vous continuez mais le detour vous fait perdre 20 pv");
            this.pv-= 20;
            System.out.println("il vous reste" + getPv());
    }
        }
}
        
            
      
      
        
        
    
               
          

