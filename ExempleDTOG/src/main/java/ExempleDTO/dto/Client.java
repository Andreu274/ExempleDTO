/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ExempleDTO.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author Miquel
 */
public class Client {
    private String dni;
    private String nom;
    private String cognom;
    private Date date;
    private String illa;
    private static Set<String> dniSet = new HashSet<>();

    public Client(String DNI, String nom, String cognoms, Date date, String illa) {
        if (dniSet.contains(DNI)) {
            JOptionPane.showMessageDialog(null, "El DNI ja existeix: " + DNI , "DNI DUPLICAT", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        this.dni = DNI;
        this.nom = nom;
        this.cognom = cognoms;
        this.date = date;
        this.illa = illa;
        
        dniSet.add(DNI);

    }
    
    public Client(String dni, String nom, String cognom) {
        this.nom = nom;
        this.cognom = cognom;
        this.dni = dni;
    }
    

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognom;
    }

    public void setCognoms(String cognom) {
        this.cognom = cognom;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getIlla() {
        return illa;
    }

    public void setIlla(String illa) {
        this.illa = illa;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
    } 
    
    public String[] toArrayString(){
        String[] s = new String[5];
        s[0] = dni;
        s[1] = nom;
        s[2] = cognom;
        s[3] = date.toString();
        s[4] = illa;
        return s;
    }
}
