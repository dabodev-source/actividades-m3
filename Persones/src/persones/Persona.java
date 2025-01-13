/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package persones;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Persona {
    private String nom;
    private double altura;
    private double pes;
    private String sexe;
    private String nacionalitat;
    private LocalDate dataNaixement;
    private String DNI;
    private String[] telefons = new String[5];

    private static final char[] LLETRES_DNI = {
        'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B',
        'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
    };

    public Persona(String nom, double altura, double pes, String sexe, String nacionalitat, String data, String DNI) {
        this.nom = nom;
        this.altura = altura;
        this.pes = pes;
        this.sexe = sexe;
        this.nacionalitat = nacionalitat;
        this.dataNaixement = LocalDate.parse(data, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        setDNI(DNI);
    }

    public Persona() {}

    public int getEdad() {
        if (dataNaixement == null) {
        System.out.println("Error: La data de naixement no està inicialitzada.");
        return -1; // Retorna un valor indicant l'error
        }
            return Period.between(dataNaixement, LocalDate.now()).getYears();
    }

    public String obtenirDescripcio() {
        if (dataNaixement == null || nom == null || sexe == null || nacionalitat == null) {
        return "Error: Alguns atributs de la persona no estan inicialitzats.";
    }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String dataFormatted = dataNaixement.format(formatter);

        return String.format("%s, Edat: %d, Altura: %.2f m, Pes: %.1f kg, Sexe: %s, Nacionalitat: %s, Data de Naixement: %s",
                nom, getEdad(), altura, pes, sexe, nacionalitat, dataFormatted);
    }

    public boolean esMajorDEdat() {
        return getEdad() >= 18;
    }

    public double calcularIMC() {
        return pes / (altura * altura);
    }

    public boolean tePesSaludable() {
        double IMC = calcularIMC();
        return IMC >= 18.5 && IMC <= 24.9;
    }

    public String celebrarAniversari() {
        return "Felicitats, ara tens " + (getEdad() + 1) + " anys!";
    }

    public double calcularFreqMaximaCardiaca() {
        return sexe.equalsIgnoreCase("home") ? 
            208 - (0.7 * getEdad()) : 
            206 - (0.88 * getEdad());
    }

    public double convertirAlturaACentimetres() {
        return altura * 100;
    }
    
    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
    if (isValidDni(DNI)) {
        this.DNI = DNI;
    } else {
        System.out.println("DNI no vàlid.");
        this.DNI = "DNI incorrecte";
    }
}

    private boolean isValidDni(String dni) {
    if (dni == null || !dni.matches("\\d{8}[A-Z]")) return false; // Verifica que el DNI tenga 8 dígitos seguidos de una letra
    
    // Extrae los 8 primeros dígitos
    int numeros = Integer.parseInt(dni.substring(0, 8));
    
    // Calcula la letra correcta basada en los 8 primeros dígitos
    char lletraCorrecta = LLETRES_DNI[numeros % 23];
    
    // Compara la letra proporcionada con la correcta
    return dni.charAt(8) == lletraCorrecta;
}

    public void afegirTelefon(String telefon, int posicio) {
        if (posicio < 1 || posicio > 5) {
            System.out.println("Posició no vàlida. Ha de ser entre 1 i 5.");
            return;
        }
        telefons[posicio - 1] = telefon;
    }

    public String getNumeros() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < telefons.length; i++) {
            if (telefons[i] != null) {
                sb.append("Posició ").append(i + 1).append(": ").append(telefons[i]).append("\n");
            }
        }
        return sb.toString();
    }
    
    public void setDataNaixement(String data) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
    this.dataNaixement = LocalDate.parse(data, formatter);
}
}
