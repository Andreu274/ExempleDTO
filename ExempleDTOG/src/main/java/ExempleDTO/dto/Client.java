/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExempleDTO.dto;

import java.util.Arrays;
import java.util.Date;

/**
 *
 * @author Maqrok
 */
public class Client 
{
    private String nom;
    private String cognoms;
    private Date date;
    private String illa;

    public Client(String nom, String cognoms, Date date, String illa) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.date = date;
        this.illa = illa;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public Date getDate() {
        return date;
    }

    public String getIlla() {
        return illa;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setIlla(String illa) {
        this.illa = illa;
    }
    
    public String[] toArrayString()
    {
         String[] s = new String[4];
         s[0] = nom;
         s[1] = cognoms;
         s[2] = date.toString();
         s[3] = illa;
         
         return s;
    }
}
