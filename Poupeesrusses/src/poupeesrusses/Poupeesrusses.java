package poupeesrusses;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aflokkat
 */

   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


/**
 *
 * @author Aflokkat
 */

public class Poupeesrusses {
    private int taille;
    private Poupeesrusses contenant;
    private Poupeesrusses contenue;
    
    public Poupeesrusses() {}
public Poupeesrusses (int taille, Poupeesrusses p1, Poupeesrusses p2){

        this.taille = taille;
        this.contenue = p1;
        this.contenant = p2;
        p1.setContenue(this);
        p2.setContenant(this);
        
} 
public Poupeesrusses (int taille){
    this.taille= taille;
}
        
 public int getTaille()
 {
     return this.taille;
 }
  public Poupeesrusses getcontenue()
  {
      return this.contenue;
  }
  
   public Poupeesrusses getContenant()
   {
       return this.contenant;
   }
   public void setTaille(int taille)
   {
       this.taille= taille;
   }
   public void setContenue(Poupeesrusses contenue)
   {
       this.contenue = contenue;
   }
   public void setContenant(Poupeesrusses contenant)
   {  
       this .contenant = contenant;      
   }
   public String toString()
   {
       if(this.contenue!=null)
   {
       return ""+taille + "["+this.contenue.toString()+"]";
   }
       else{
           return "";
       }
  
   }
}