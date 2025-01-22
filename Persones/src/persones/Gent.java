/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package persones;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author docto
 */
public class Gent {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FASE 1 2 3
        //Persona persona1 = new Persona("David ", 15 , 1.75 , 80 , " home " ,"España");
        //Persona persona2 = new Persona("Arturo ", 17 , 1.90 , 60 , " home " , "Francés");
        //Persona persona3 = new Persona("Andrea " , 25 , 1.50 , 70 , " Dona " , "Italià");
      /*    
        Persona persona1 = new Persona("David", 1.75, 70, "home", "Espanya", "15-05-1991","12345678Z");
       
        persona1.afegirTelefon("654321098", 1);
        persona1.afegirTelefon("678123456", 2);
        persona1.afegirTelefon("6872135478", 3);

        // Imprimim les dades
        System.out.println(persona1.obtenirDescripcio());
        System.out.println("DNI: " + persona1.getDNI());
        System.out.println("Telèfons:\n" + persona1.getNumeros());
        System.out.println("IMC: " + persona1.calcularIMC());
        System.out.println("És major d'edat: " + persona1.esMajorDEdat());
        System.out.println(persona1.celebrarAniversari());  
        
        
        System.out.println("\n");
        
        Persona persona2 = new Persona("Andrea", 1.50, 25, "dona", "Espanya", "15-05-1998", "48658A");
        persona2.afegirTelefon("654321098", 4);
        
        System.out.println(persona2.obtenirDescripcio());
        System.out.println("DNI: " + persona2.getDNI());
        System.out.println("Telèfons:\n" + persona2.getNumeros());
        System.out.println("IMC: " + persona2.calcularIMC());
        System.out.println("És major d'edat: " + persona2.esMajorDEdat());
        System.out.println(persona2.celebrarAniversari()); 
        
        //FASE 4
        System.out.println("");
        Actiu actiu = new Actiu("Programador",1500,8);
        System.out.println("Treballa de " + actiu.getOcupacio());
        System.out.println("El seu sou mensual es: " + actiu.getSouMensual() + "?");
        System.out.println("Treballa " + actiu.getHoresTreballades() + " hores a la semana");
        System.out.println("El seu soy anual es " + actiu.calcularIngresosAnuals());
        
        Menor menor = new Menor("Primaria","Basquet");
        System.out.println(menor.getActivitatExtracolar());
        System.out.println(menor.getCursActual());
        
        String[] activitats = {"Llegir", "Caminar", "Jardineria", "Cuinar"};
        
        Jubilat jubilat = new Jubilat(1200.50, 2015, activitats,"Joan", 1.75, 70.0, "Home", "Espanyola", "01-01-1948", "12345678A");
        System.out.println("Activitats preferides: " + jubilat.mostrarActivitats());
        System.out.println("La pensio mensual que reb: " + jubilat.getPensioMensual() + "?");
        System.out.println("Any de jubilacio: " + jubilat.getDataJubilacio());
        System.out.println("Porta " + jubilat.calcularAnysJubilacio() + " anys jubilat");
        */
      
        //FASE 5
        /*
        ArrayList<Persona> llistaPersones = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int opcio;
        
        do {            
            opcio = mostrarMenu();
            System.out.println("Seleciona una opcio");
            opcio = scanner.nextInt();
            switch(opcio) {
                case 1: 
                    afegirPersona(llistaPersones);
                    break;
                case 2: 
                     mostrarTotesPersones(llistaPersones);                   
                    break;
                case 3:
                    eliminarPersonaPerNom(llistaPersones);
                    break;
                case 4:
                    buscarPersonaPerNom(llistaPersones);
                    break;
                case 5:
                    mostrarMajorsEdat(llistaPersones);
                    break;
                case 6:
                    System.out.println("Sortir");
                    break;
                default: System.out.println("Opció no vàlida!");
                    
            }
        } while (opcio != 6);
        
    }

    public static int mostrarMenu() {
        System.out.println("\nMenú de Persones:");
        System.out.println("1. Afegir una persona");
        System.out.println("2. Mostrar les dades de totes les persones");
        System.out.println("3. Eliminar una persona");
        System.out.println("4. Buscar una persona per nom");
        System.out.println("5. Mostrar les persones majors d'edat");
        System.out.println("6. Sortir");
        return 0;
    }

    public static void afegirPersona(ArrayList<Persona> llistaPersones) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdueix les dades de la persona:");

    // Solicitar los datos de la persona
    System.out.print("Nom: ");
    String nom = scanner.nextLine();
    System.out.print("Altura (en metres): ");
    double altura = scanner.nextDouble();
    System.out.print("Pes (en kg): ");
    double pes = scanner.nextDouble();
    scanner.nextLine(); // Limpiar el buffer
    System.out.print("Sexe: ");
    String sexe = scanner.nextLine();
    System.out.print("Nacionalitat: ");
    String nacionalitat = scanner.nextLine();
    System.out.print("Data de Naixement (dd-MM-yyyy): ");
    String dataNaixement = scanner.nextLine();
    System.out.print("DNI: ");
    String DNI = scanner.nextLine();

    // Crear la persona utilizando el constructor
    Persona novaPersona = new Persona(nom, altura, pes, sexe, nacionalitat, dataNaixement, DNI);

    // Añadir la persona a la lista
    llistaPersones.add(novaPersona);

    System.out.println("Persona afegida correctament!");

   
    }

    public static void mostrarTotesPersones(ArrayList<Persona> llistaPersones) {
        for (Persona novaPersona:llistaPersones) {
            System.out.println(" Nombre: " + novaPersona.nom + " Altura: " + novaPersona.altura + " Pes: " + novaPersona.pes + " Sexe: " + novaPersona.sexe + " Nacionalitat: " + novaPersona.nacionalitat + " Data de naixement: " + novaPersona.dataNaixement + " DNI: " + novaPersona.DNI);
        }
    }

    public static void eliminarPersonaPerNom(ArrayList<Persona> llistaPersones) {
      Scanner scanner = new Scanner(System.in);
        System.out.println("Que persona quieres eliminar");
        String nomBuscat = scanner.nextLine();
        Persona personaAEliminar = null;

    // Busca la persona con el nombre especificado
    for (Persona persona : llistaPersones) {
        if (persona.getNom().equalsIgnoreCase(nomBuscat)) { // Compara el nombre
            personaAEliminar = persona; // Encuentra la persona
            break; // Sal del bucle una vez encontrada
        }
    }

    // Verifica si se encontró la persona
    if (personaAEliminar != null) {
        llistaPersones.remove(personaAEliminar); // Elimina la persona de la lista
        System.out.println("Persona eliminada: " + personaAEliminar.obtenirDescripcio());
    } else {
        System.out.println("No s'ha trobat cap persona amb el nom: " + nomBuscat);
    }
        
    }

    public static void buscarPersonaPerNom(ArrayList<Persona> llistaPersones) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que persona estas buscando");
        String nomBuscat = scanner.nextLine();
        
        boolean personaTrobada = false;
        //Recoremos la lista
        
        for (Persona persona :llistaPersones) {
            if(persona.getNom().equalsIgnoreCase(nomBuscat)){
                System.out.println("Datos de la persona encontrada");
                System.out.println(persona.obtenirDescripcio());
                personaTrobada = true;
            }
            
        }
        if (!personaTrobada){
            System.out.println("No se a trobat res");
        }
    }

    public static void mostrarMajorsEdat(ArrayList<Persona> llistaPersones) {
        if (llistaPersones.isEmpty()) {
        System.out.println("La llista està buida.");
        return;
    }

    Persona personaMajor = null;
    int edatMaxima = -1;

    for (Persona persones : llistaPersones) {
        if (persones.getEdad() > edatMaxima) {
            edatMaxima = persones.getEdad(); // Actualiza la edad máxima
            personaMajor = persones;         // Guarda la persona con la mayor edad
        }
    }

    if (personaMajor != null) {
        System.out.println("La persona de major edat és:");
        System.out.println(personaMajor.obtenirDescripcio());
    
        }
    
    
    }*/
    
    //FASE 6
    ArrayList<Persona> llistaPersones = new ArrayList<>();
        int opcio;

        do {
            opcio = mostrarMenu();
            switch (opcio) {
                case 1:
                    afegirPersona(llistaPersones);
                    break;
                case 2:
                    buscarPersonaPerNom(llistaPersones);
                    break;
                case 3:
                    mostrarTotesPersones(llistaPersones);
                    break;
                case 4:
                    eliminarPersonaPerNomEquals(llistaPersones);
                    break;
                case 5:
                    buscarPersonaPerNomEquals(llistaPersones);
                    break;
                case 6:
                    System.out.println("Sortir......");
                    break;
                default:
                    System.out.println("Opció no vàlida!");
            }
        } while (opcio != 6);
    }

    public static int mostrarMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nMenu persones");
        System.out.println("1. Afegir una persona a la llista");
        System.out.println("2. Buscar persona per nom");
        System.out.println("3. Mostrar totes les persones");
        System.out.println("4. Eliminar persona");
        System.out.println("5. Buscar persona per nom (equals)");
        System.out.println("6. Sortir");
        System.out.print("Selecciona una opció: ");
        return scanner.nextInt();
    }

    public static int mostrarsubmenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nSUBMENÚ:");
        System.out.println("1. Afegir Persona Activa");
        System.out.println("2. Afegir Persona Jubilada");
        System.out.println("3. Afegir Persona Menor");
        System.out.println("4. Tornar al menú principal");
        System.out.print("Selecciona una opció: ");
        return scanner.nextInt();
    }

    public static void afegirPersona(ArrayList<Persona> llistaPersones) {
        int subpcio;
    Scanner scanner = new Scanner(System.in); // Crear Scanner
    do {
        subpcio = mostrarsubmenu(); // Llamada al submenú
        switch (subpcio) {
            case 1:
                System.out.println("Afegint Persona Activa...");
                // Solicitar los datos de la Persona Activa
                System.out.print("Nom: ");
                String nomActiu = scanner.nextLine();
                System.out.print("Altura: ");
                double alturaActiu = scanner.nextDouble();
                System.out.print("Pes: ");
                double pesActiu = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Sexe: ");
                String sexeActiu = scanner.nextLine();
                System.out.print("Nacionalitat: ");
                String nacionalitatActiu = scanner.nextLine();
                System.out.print("Data de naixement: ");
                String dataNaixementActiu = scanner.nextLine();
                System.out.print("DNI: ");
                String dniActiu = scanner.nextLine();
                System.out.print("Ocupació: ");
                String ocupacio = scanner.nextLine();
                System.out.print("Sou mensual: ");
                double souMensual = scanner.nextDouble();
                System.out.print("Hores treballades: ");
                int horesTreballades = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer

                // Crear una nova Persona Activa
                Actiu personaActiu = new Actiu(ocupacio, souMensual, horesTreballades, nomActiu, alturaActiu, pesActiu, sexeActiu, nacionalitatActiu, dataNaixementActiu, dniActiu);
                llistaPersones.add(personaActiu);
                break;

            case 2:
                System.out.println("Afegint Persona Jubilada...");
                // Solicitar los datos de la Persona Jubilada
                System.out.print("Nom: ");
                String nomJubilat = scanner.nextLine();
                System.out.print("Altura: ");
                double alturaJubilat = scanner.nextDouble();
                System.out.print("Pes: ");
                double pesJubilat = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Sexe: ");
                String sexeJubilat = scanner.nextLine();
                System.out.print("Nacionalitat: ");
                String nacionalitatJubilat = scanner.nextLine();
                System.out.print("Data de naixement: ");
                String dataNaixementJubilat = scanner.nextLine();
                System.out.print("DNI: ");
                String dniJubilat = scanner.nextLine();
                System.out.print("Pensió mensual: ");
                double pensioMensual = scanner.nextDouble();
                System.out.print("Any de jubilació: ");
                int anyJubilacio = scanner.nextInt();
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Activitats preferides (separadas por coma): ");
                String activitats = scanner.nextLine();
                String[] activitatsPreferides = activitats.split(","); // Dividir por coma

                // Crear una nova Persona Jubilada
                Jubilat personaJubilat = new Jubilat(pensioMensual, anyJubilacio, activitatsPreferides, nomJubilat, alturaJubilat, pesJubilat, sexeJubilat, nacionalitatJubilat, dataNaixementJubilat, dniJubilat);
                llistaPersones.add(personaJubilat);
                break;

            case 3:
                System.out.println("Afegint Persona Menor...");
                // Solicitar los datos de la Persona Menor
                System.out.print("Nom: ");
                String nomMenor = scanner.nextLine();
                System.out.print("Altura: ");
                double alturaMenor = scanner.nextDouble();
                System.out.print("Pes: ");
                double pesMenor = scanner.nextDouble();
                scanner.nextLine(); // Limpiar el buffer
                System.out.print("Sexe: ");
                String sexeMenor = scanner.nextLine();
                System.out.print("Nacionalitat: ");
                String nacionalitatMenor = scanner.nextLine();
                System.out.print("Data de naixement: ");
                String dataNaixementMenor = scanner.nextLine();
                System.out.print("DNI: ");
                String dniMenor = scanner.nextLine();
                System.out.print("Curs actual: ");
                String cursActual = scanner.nextLine();
                System.out.print("Activitat extraescolar: ");
                String activitatExtraescolar = scanner.nextLine();

                // Crear una nova Persona Menor
                Menor personaMenor = new Menor(cursActual, activitatExtraescolar, nomMenor, alturaMenor, pesMenor, sexeMenor, nacionalitatMenor, dataNaixementMenor, dniMenor);
                llistaPersones.add(personaMenor);
                break;

            case 4:
                System.out.println("Tornant al menú principal...");
                break; // Salir del submenú
            default:
                System.out.println("Opció no vàlida al submenú!");
        }
    } while (subpcio != 4);
    }

    public static void mostrarTotesPersones(ArrayList<Persona> llistaPersones) {
        if (llistaPersones.isEmpty()) {
            System.out.println("La llista de persones està buida!");
        } else {
            System.out.println("\nLlista de persones:");
            for (Persona persona : llistaPersones) {
                System.out.println(persona.toString());
            }
        }
    }
    
    public static void buscarPersonaPerNom(ArrayList<Persona> llistaPersones) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el nom de la persona a buscar: ");
        String nomBuscat = scanner.nextLine();
        boolean trobat = false;

        for (Persona persona : llistaPersones) {
            if (persona.getNom().equalsIgnoreCase(nomBuscat)) {
                System.out.println("Persona trobada:");
                System.out.println(persona.obtenirDescripcio());
                trobat = true;
                break;
            }
        }

        if (!trobat) {
            System.out.println("No s'ha trobat cap persona amb el nom: " + nomBuscat);
        }
    }
    
    
    //FASE 7
    
        public static void eliminarPersonaPerNomEquals(ArrayList<Persona> llistaPersones) {
       Scanner scanner = new Scanner(System.in);
        System.out.print("Introdueix el nom de la persona que vols eliminar: ");
        String nom = scanner.nextLine();

        // Crear un objeto temporal solo con el nombre
        Persona personaAEliminar = new Persona(nom);

        // Intentar eliminar directamente
        boolean eliminat = llistaPersones.remove(personaAEliminar);

        if (eliminat) {
            System.out.println("Persona eliminada amb èxit.");
        } else {
            System.out.println("No s'ha trobat cap persona amb aquest nom.");
        }

        }
        
        public static void buscarPersonaPerNomEquals(ArrayList<Persona> llistaPersones) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Introdueix el nom de la persona que vols buscar: ");
    String nom = scanner.nextLine();

    // Crear un objeto temporal solo con el nombre
    Persona personaABuscar = new Persona(nom);
    
    // Buscar el índice de la persona en la lista
    int index = llistaPersones.indexOf(personaABuscar);

    if (index != -1) {
        // Si se encuentra, mostrar la información de la persona
        System.out.println("Persona trobada: " + llistaPersones.get(index));
    } else {
        // Si no se encuentra
        System.out.println("No s'ha trobat cap persona amb aquest nom.");
    }
}
    
}