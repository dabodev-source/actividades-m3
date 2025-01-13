/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author docto
 */
public class UtilsArrays {
    /**
     * Imprimeix per consola en una l�nia tots els valors del vector
     * @param vector un vector d'enters
     */
    public void mostrar(int[] vector) {
         for (int num : vector) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
     
    /**
     * Suma tots els elements d'un vector
     * @param llista el vector d'enters per sumar
     * @return la suma dels elements del vector
     */
    public int suma(int[] llista) {
        int suma = 0;
        for (int num : llista) {
            suma += num;
        }
        return suma;
    }
    
     /**
     * Calcula la mitjana aritm�tica dels elements d'un vector
     * @param llista un vector d'enters
     * @return la mitjana aritm�tica del vector
     */
    public double mitjana(int[] llista) {
        if (llista.length == 0) return 0;
        return (double) suma(llista) / llista.length;
    }
    
     /**
     * Obt� el valor m�xim d'una llista d'enters
     * @param llista un vector d'enters
     * @return el valor m�xim trobat en el vector
     */
     public int max(int[] llista) {
        int max = Integer.MIN_VALUE;
        for (int num : llista) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
    
    /**
     * Obt� el valor m�nim d'una llista d'enters
     * @param llista un vector d'enters
     * @return el valor m�nim trobat en el vector
     */
    public int min(int[] llista) {
       int min = Integer.MAX_VALUE;
        for (int num : llista) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    
     /**
     * Calcula la difer�ncia entre el valor m�nim i el m�xim
     * @param llista el vector d'enters
     * @return el rang, �s a dir, max(llista) - min(llista)
     */
    public int rang(int[] llista) {
        return max(llista) - min(llista);
    }
    
   
    /**
     * Inicialitza un array d'enters amb valors aleatoris compresos entre dos
     * valors determinats
     * @param array l'array que cal inicialitzar
     * L'array que passem al m�tode pot contenir valors a les seves posicions, per� seran sobreescrits dins el m�tode.
     * @param desDe el m�nim valor possible
     * @param finsA el m�xim valor possible
     */
    public void inicialitzaAleatori(int []array, int desDe, int finsA) {
        for (int i = 0; i < array.length; i++) {
            array[i] = desDe + (int) (Math.random() * (finsA - desDe + 1));
        }
    }
    
    
    /**
     * Obt� els valors superiors a un determinat valor
     * @param llista una llista d'enters
     * @param valor el valor que cal utilitzar per a determinar quins valors s�n superiors
     * @return un vector de mida igual al n�mero de valors superiors al valor donat,
     * que contindr� els n�meros amb valor superior al valor donat
     */
    public int[] valorsSuperiors(int[] llista, double valor) {
        int count = 0;
        for (int num : llista) {
            if (num > valor) count++;
        }

        int[] result = new int[count];
        int index = 0;
        for (int num : llista) {
            if (num > valor) {
                result[index++] = num;
            }
        }
        return result;
    }
    
    /**
     * Obt� els valors inferiors a un determinat valor
     * @param llista una llista d'enters
     * @param valor el valor que cal utilitzar per a determinar quins valors s�n inferiors
     * @return un vector de mida igual al n�mero de valors superiors al valor donat,
     * que contindr� els n�meros amb valor superior al valor donat
     */
    public int[] valorsInferiors(int[] llista, double valor) {
        int count = 0;
    for (int num : llista) {
        if (num < valor) {
            count++;
        }
    }

    int[] result = new int[count];
    int index = 0;
    for (int num : llista) {
        if (num < valor) {
            result[index++] = num;
        }
    }

    return result;
    }
    
    /**
     * Multiplica cada element d'un vector per un valor determinat
     * El vector passat per par�metre no s'ha de veure alterat pel m�tode, �s a dir, ha de conservar els valors originals
     * @param array un vector d'enters
     * @param n el n�mero pel qual es multiplicar�
     * @return un vector que cont� cada element del vector proporcionat mulitplicat pel valor n
     */
    public int[] multiplica(int[] array, int n) {
         int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            result[i] = array[i] * n;
        }
        return result;
    }
     
    /**
     * Realitza la suma de dos vectors suma[i] = array1[i] + array2[i]
     * @param array1 un vector d'enters
     * @param array2 un vector d'enters
     * El vectors passats per par�metre no s'han de veure alterat pel m�tode, �s a dir, ha de conservar els valors originals
     * Si un array �s m�s llarg que l'altre, s'ha de sumar 0 als valors que no tinguin valor aparellat.
     * @return  un vector d'enters que resulta de sumar els valors que hi ha
     * en les mateixes posicions dels dos vectors proporcionats en els arguments
     */
    public int[] suma(int[] array1, int[] array2) {
         int maxLength = Math.max(array1.length, array2.length);
    int[] result = new int[maxLength];

    for (int i = 0; i < maxLength; i++) {
        int valor1 = (i < array1.length) ? array1[i] : 0; // Si array1 no tiene valor en esta posici�n, usamos 0
        int valor2 = (i < array2.length) ? array2[i] : 0; // Si array2 no tiene valor en esta posici�n, usamos 0
        result[i] = valor1 + valor2;
    }

    return result;

    }
}
