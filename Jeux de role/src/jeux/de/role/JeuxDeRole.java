/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jeux.de.role;

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
        Monstres ratman = new Monstres (20, 20, 20, true);
        Goblins golum = new Goblins (25,25,25,true,50);
        Mages druidi = new Mages(30, 50, 25, true, true);
      while ((Diogo.getPv() >0) && (ratman.getVie())){
          if (ratman.getVie()){
      
         Diogo.jouer(ratman);
        ratman.jouer(Diogo);
          }
        Diogo.win(ratman);
        ratman.loose(Diogo) ;    
         }
      if (golum.getVie()){
        Diogo.jouer(golum);
        golum.jouer(Diogo);
          }
        Diogo.win(golum);
        golum.loose(Diogo) ;   
         

       if (druidi.getVie()){
          
         Diogo.jouer(druidi);
        druidi.jouer(Diogo);
        }
       Diogo.win(druidi);
       druidi.loose(Diogo) ;
     
    }
}


   
      
    

    

