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
    private String adre�a;

    public Biblioteca(String nom, String adre�a) {
        this.nom = nom;
        this.adre�a = adre�a;
    }

    public String getNom() {
        return nom;
    }

    public String getAdre�a() {
        return adre�a;
    }

    @Override
    public String toString() {
        return "Biblioteca: " +  nom +  adre�a ;
    }

    /*
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.nom);
        hash = 79 * hash + Objects.hashCode(this.adre�a);
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
        return Objects.equals(this.adre�a, other.adre�a);
    }
    
    
    
}
