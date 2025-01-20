/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prestecinterbibliotecari;

import java.util.Objects;

/**
 *
 * @author docto
 */
public class Biblioteca {
    private String nom;
    private String adreça;

    public Biblioteca(String nom, String adreça) {
        this.nom = nom;
        this.adreça = adreça;
    }

    public String getNom() {
        return nom;
    }

    public String getAdreça() {
        return adreça;
    }

    @Override
    public String toString() {
        return "Biblioteca: " +  nom +  adreça ;
    }

    /*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.adreça);
        return hash;
    }
*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Biblioteca other = (Biblioteca) obj;
        if (!Objects.equals(this.nom, other.nom)) {
            return false;
        }
        return Objects.equals(this.adreça, other.adreça);
    }
    
    
    
}
