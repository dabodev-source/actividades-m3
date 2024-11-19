/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;


/**
 *
 * @author docto
 */
public class Persona {
    String nom;
    int edad;
    double altura;
    double pes;
    String sexe;
    String nacionalitat;

    public Persona(String nom, int edad, double altura, double pes, String sexe, String nacionalitat) {
        this.nom = nom;
        this.edad = edad; 
        this.altura = altura;
        this.pes = pes;
        this.sexe = sexe;
        this.nacionalitat = nacionalitat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("L'edat ha de ser superior a 0.");
        }
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("L'altura ha de ser superior a 0.");
        }
    }

    public double getPes() {
        return pes;
    }

    public void setPes(double pes) {
        if (pes > 0) {
            this.pes = pes;
        } else {
            throw new IllegalArgumentException("El pes ha de ser superior a 0.");
        }
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getNacionalitat() {
        return nacionalitat;
    }

    public void setNacionalitat(String nacionalitat) {
        this.nacionalitat = nacionalitat;
    }
        
   public Persona() {
    }

   double calcularIMC() {
       return pes / (altura * altura);        
    }
   
   boolean esMajorDEdat() {
       
    return edad >= 18;
            
   }
   
   boolean tePesSaludable(){ 
       double IMC = calcularIMC();       
       if (IMC >=18.5 && IMC<=24.9){
           return true;
       }
       return false;
   }
   
   String obtenirDescripcio(){
       return nom + " tiene " + edad + " tiene una altura de " + altura + " con el peso " + pes + " el sexo es " + sexe + " la nacionalidad es " + nacionalitat + "."; 
   }
   
   String celebrarAniversari(){
       edad++;
       return "Ara tens " + edad + " anys";
   }
   
   double calcularFreqMaximaCardiaca() {
       double freqMaximaCardiaca;
       
       if (sexe.equalsIgnoreCase("home")) {
           freqMaximaCardiaca = 208 - (0.7*edad);
       } else {
           freqMaximaCardiaca = 206 - (0.88*edad);
       }
       return freqMaximaCardiaca;
   }
   
   double convertirAlturaAcentimetres() {
       return altura * 100;
   }
}
