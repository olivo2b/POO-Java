/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jeux.de.role;
import java.util.ArrayList;

/**
 *
 * @author Aflokkat
 */
public class JeuxDeRole {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Personnage Diogo = new Personnage ();
        Monstres ratman = new Monstres (20, 20, 20, true,"ratman");
        Goblins golum = new Goblins (25,25,25,true,50, "golum" );
        Mages druidi = new Mages(30, 50, 25, true, true, "druide");
        Monstres bigboss = new Monstres (100, 50, 50, true, "bigboss");
        ArrayList<Monstres> mobs = new ArrayList();
      mobs.add(ratman);
      mobs.add(golum);
      mobs.add(druidi);
      mobs.add(bigboss);
       System.out.println(Diogo);
       System .out.println("");
       System .out.println(mobs.get(0));
        System .out.println("");
      while ((Diogo.getPv() >0) && (mobs.size()>0)){
      if (mobs.get(0).getVie()){
     
        Diogo.jouer( mobs.get(0));
        mobs.get(0).jouer(Diogo);
          }
        Diogo.win( mobs.get(0));
        System.out.println(Diogo);
        mobs.get(0).loose(Diogo) ;  
        mobs.remove(0);
        if(mobs.size() ==1){
        System .out.println("");
        Diogo.choix();
         
         }
     if ((mobs.size()==0)&& (Diogo.getPv()>0)){
         System.out.println("vous avez gagné la partie");
     }
    }
    } 
    }



   
      
    

    

