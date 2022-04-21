/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author Aflokkat
 */

    public class Personne {
    private String nom;
    private String mail;
    private int num;

    public Personne() {}
    public Personne(String nom, String mail, int num){
        this.nom = nom;
        this.mail = mail;
        this.num = num;
    }

    public String getNom()
    {
        return this.nom;
    }

    public String getMail()
    {
        return this.mail;
    }

    public int getNum()
    {
        return this.num;
    }

    public void setNom(String nom)
    {
         this.nom = nom;
    }

    public void setMail(String mail)
    {
        this.mail = mail;
    }

    public void setNum(int num)
    {
         this.num =num;
    }


    public String sendMail()
    {
        return("envoyer un mail a : "+this.mail+" numéro Client: " +this.num);
    }
}

