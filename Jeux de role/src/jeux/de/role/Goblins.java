/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jeux.de.role;

/**
 *
 * @author Aflokkat
 */
public class Goblins extends Monstres {
    private double critical_attack;
    
public Goblins (double pv, double degats, double armure, boolean vie, double critical_attack, String nom){
    super(pv, degats, armure, vie, nom);
    this.critical_attack = critical_attack;
}
public double getCritical_attack(){
    return this.critical_attack;
}
public void setCritical_attack(double critical_attack){
    this.critical_attack = critical_attack;
}

public void big_attack(){
    System.out.println("le goblin a " + this.pv + "points de vie");
this.critical_attack = getDegats()*2;    
}
public void  jouer(){
    big_attack();
}
}
