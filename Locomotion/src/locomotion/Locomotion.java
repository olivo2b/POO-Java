/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package locomotion;

/**
 *
 * @author Aflokkat
 */
public class Locomotion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Voitures renault  = new Voitures( "clio", 40, "opel", 4);
    Vehicules  akira =  new Motos ("otarie", 50, "rouge");
    
    renault.demarrer();
    renault.caracteristiques();
    }
}
    
