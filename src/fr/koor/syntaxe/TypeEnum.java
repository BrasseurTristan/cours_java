package fr.koor.syntaxe;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TypeEnum {
    // Permet d'utiliser le clavier dans le terminal
    static BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws Exception {

        Feu feu = Feu.VERT;

        System.out.println("Que voulez-vous faire ? (passer, attendre) : ");
        String action = keyboard.readLine();

        if ( action.equals( "passer" ) ) {
            // On compare les états du type énuméré
            if ( feu != Feu.VERT ) {
                System.out.println( "Vous ne pouvez pas passer, cas le feu n'est pas vert" );
            } else {
                System.out.println( "Bonne route" );
            }
        } else if ( action.equals( "attendre" ) ) {
            if ( feu == Feu.VERT ) {
                System.out.println( "Vous devez passer, les autres attendent derrière vous" );
            } else {
                System.out.println( "Bonne initiative" );
            }
        } else {
            System.out.println( "Commande inconnue" );
        }
    }
}
