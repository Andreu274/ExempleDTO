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
    private String DNI;
    private String nom;
    private String cognoms;
    private Date date;
    private String illa;

    public Client(String DNI, String nom, String cognoms, Date date, String illa) {
        this.DNI = DNI;
        this.nom = nom;
        this.cognoms = cognoms;
        this.date = date;
        this.illa = illa;
    }
    
    public Client(String DNI, String nom, String cognoms) {
        this.DNI = DNI;
        this.nom = nom;
        this.cognoms = cognoms;
        
    }

    public String getDNI() {
        return DNI;
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

    public void setDNI(String DNI) {
        this.DNI = DNI;
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
         String[] s = new String[5];
         s[0] = DNI;
         s[1] = nom;
         s[2] = cognoms;
         s[3] = date.toString();
         s[4] = illa;
         
         return s;
    }
}
