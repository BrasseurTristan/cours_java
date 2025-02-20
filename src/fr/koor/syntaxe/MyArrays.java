package fr.koor.syntaxe;

public class MyArrays {

    public static void main(String[] args) {

        int [] firstArray = new int[5];
        // On insère les données dans un tableau.
        firstArray[0] = 10;
        firstArray[1] = 20;
        firstArray[2] = 30;
        firstArray[3] = 40;
        firstArray[4] = 50;
        //Affichera une exception, car la longueur du tableau est de 5.
        //firstArray[5] = 60;

        for (int value : firstArray){
            System.out.println(value);
        }
        // Autre méthode d'insertion dans un tableau.
        int [] secondArray = { 100, 200, 300, 400, 500};

        for (int value : secondArray){
            System.out.println(value);
        }
        // Un tableau de chaîne de caractères vide renvoie null
        String[] values = new String[3];
        for (String string : values){
            System.out.println(string);
        }
    }
}
