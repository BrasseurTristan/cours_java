package fr.koor.syntaxe;

import java.util.Scanner;

public class Boucles {
    public static void main(String[] args) {

        // La boucle for

        for ( int counter = 1; counter <= 10; counter++ )
            System.out.println( counter );

        System.out.println( "Bye bye" );

        // La boucle while

        int i=0;
        while( i<10 ) {
            System.out.print( i + " " );
            i++;
        }
        System.out.println();

        // la boucle do while
        Scanner scanner = new Scanner( System.in );
        String login, password;
        do {
            System.out.print( "Veuillez saisir votre identifiant : " );
            login = scanner.nextLine();

            System.out.print( "Veuillez saisir votre mot de passe : " );
            password = scanner.nextLine();
        } while( login.equals( "james" ) == false || password.equals( "007" ) == false );

        System.out.println( "Bonjour James, vous êtes connecté !" );

        // La boucle for each
        int [] intArray = { 10, 20, 30, 40, 50 };

        for( int value : intArray ) {
            System.out.println( value );
        }

    }

}
