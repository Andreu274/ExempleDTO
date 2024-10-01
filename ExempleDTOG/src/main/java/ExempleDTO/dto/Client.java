package ExempleDTO.dto;


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;


public class Client {
    private String DNI;
    private String nom;
    private String cognoms;
    private Date date;
    private String illa;
    private static Set<String> dnis = new HashSet<>();

    public Client(String DNI, String nom, String cognoms, Date date, String illa) {
        if (dnis.contains(DNI)) {
            JOptionPane.showMessageDialog(null, "El DNI ja existeix: " + DNI, "DNI duplicat", JOptionPane.ERROR_MESSAGE);
            return;
             
        } 
        
        this.DNI = DNI;
        this.nom = nom;
        this.cognoms = cognoms;
        this.date = date;
        this.illa = illa;
        
        dnis.add(DNI);
        
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

    public String[] toArrayString() {
        String[] s = new String[5];
        s[0] = DNI;
        s[1] = nom;
        s[2] = cognoms;
        s[3] = (date != null) ? date.toString() : "";
        s[4] = illa;
        return s;
    }

    @Override
    public String toString() {
        return "Client{" + "DNI='" + DNI + '\'' +
                ", nom='" + nom + '\'' +
                ", cognoms='" + cognoms + '\'' +
                ", date=" + date +
                ", illa='" + illa + '\'' +
                '}';
    }
    
    
}
