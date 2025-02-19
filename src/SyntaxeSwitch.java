public class SyntaxeSwitch {
    public static void main(String[] args) {
         // Nouvelle syntaxe pour les switchs depuis la Java 14

        int value = (int) (Math.random() * 11);

        switch( value ) {
            // La syntaxe -> permet de ne plus utiliser le break à la fin du case.
            case 0, 1, 2, 3, 4 -> System.out.println( "Petit chiffre" );
            case 5, 6, 7, 8, 9 -> System.out.println( "Grand chiffre" );
            default -> System.out.println( "Ce n'est plus un chiffre, mais un nombre" );
        }
    }
}
