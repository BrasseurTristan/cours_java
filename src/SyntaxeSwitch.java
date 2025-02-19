public class SyntaxeSwitch {
    public static void main(String[] args) {
         // Nouvelle syntaxe pour les switchs depuis la Java 14

        int value = (int) (Math.random() * 11);

        switch( value ) {
            // La syntaxe -> permet de ne plus utiliser le break à la fin du case.
            // Attention le -> est utilisable seulement lorsque l'on renvoie une seule instruction
            case 0, 1, 2, 3, 4 -> System.out.println( "Petit chiffre" );
            case 5, 6, 7, 8, 9 -> System.out.println( "Grand chiffre" );
            default -> System.out.println( "Ce n'est plus un chiffre, mais un nombre" );
        }


        // Si on a besoin de plusieurs lignes de code pour calculer la valeur finale,
        // On doit utiliser le mot clé yield (Similaire à un return dans une fonction)
        String result = switch( value ) {
            case 0, 1, 2, 3, 4 -> {
                double sqrt = Math.sqrt( value );
                yield "Petit chiffre dont la racine carré vaut " + sqrt;
            }
            case 5, 6, 7, 8, 9 -> {
                double square = value * value;
                yield "Grand chiffre dont le carré vaut " + square;
            }
            default -> "Ce n'est plus un chiffre, mais un nombre";
        };

        System.out.println( result );

    }
}
