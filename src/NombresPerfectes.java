import utils.Utils;

import java.util.ArrayList;

public class NombresPerfectes {
    /*
    Implementa una funció que digui si un número és o no perfecte.
    Si el número és perfecte tornarà 1 (cert), sinó tornarà 0 (fals).
    Un número és perfecte si és igual a la suma de tots els seus divisors, excepte ell mateix.
    Per exemple són perfectes el 6 (1+2+3), el 28 (1+2+4+7+14)
    * */
    public static void main(String[] args) {
        int nombre = Utils.LlegirInt("Introdueix un nombre per saber si es o no perfecte:");
        if(esPerfecte(nombre)){
            System.out.println(nombre + " es perfecte.");
        }else{
            System.out.println(nombre + " no es perfecte.");
        }
    }

    /**
     * Comprova si el nombre rebut per paràmetre es perfecte.
     * Un número és perfecte si és igual a la suma de tots els seus divisors, excepte ell mateix.
     * Per exemple són perfectes el 6 (1+2+3), el 28 (1+2+4+7+14)
     * @param numero nombre a comprovar
     * @return cert si es perfecte, false si no es perfecte
     */
    public static boolean esPerfecte(int numero){
        ArrayList<Integer> divisors = Utils.getDivisors(numero);
        return numero == sumaArray(divisors);
    }

    /**
     * Fa la suma de tots els elements d'un ArrayList
     * @param divisors ArrayList a sumar
     * @return suma total dels elements de la colecció
     */
    private static int sumaArray(ArrayList<Integer> divisors) {
        int sumaTotal  =0;
        for (Integer num:divisors
             ) {
            sumaTotal +=num;
        }
        return sumaTotal;
    }




}
