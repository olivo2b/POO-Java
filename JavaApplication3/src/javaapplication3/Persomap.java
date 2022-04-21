/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Aflokkat
 */
public class Persomap{
    private String name;
    private int x;
    private int y;
    private String direction;
    
    
public Persomap() {}
public Persomap (String name, int x, int y, String direction){
        this.name = name;
        this.x = x;
        this.y = y;
        this.direction = direction;}
        
 public String getName()
 {
     return this.name;    
}
 public int getX(){
     return this.x;
 }
 public int getY(){
     return this.y;
             
 }
 public String getDirection() {
     return this.direction;
 }
 
public void setName(String name)
{
    this.name = name;
}
public void setX(int x)
        
{
    this.x = x;
}
public void setY (int y)
{
    this.y = y;
}
public void setDirection (String direction)
{
    this.direction = direction;
}
public void deplacer( int dist){
        if (this.direction.equals ("nord"))

    y  = y + dist;
    

        if (this.direction.equals ("sud"))

    y = y - dist; 
    
        if (this.direction.equals ("ouest"))
        
    x = x- dist;
      
        if (this.direction.equals("est"))
    x = x + dist;
               
    
}
public String toString()
{
    return (name+" " + x+" "+y+" " +direction);
    
}

}

