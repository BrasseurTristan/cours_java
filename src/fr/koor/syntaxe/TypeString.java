package fr.koor.syntaxe;

public class TypeString {
    public static void main(String[] args){

        String message = "Voici un texte avec un caractère unicode \u03c0";
        System.out.println(message);

        // Opérateurs de manipulation de chaine de caractères
        String start = "Start";
        start = start + "After";    // Pas une bonne idée pour la performance
        start += "End";             // Les classes StringBuffer et StringBuilder sont plus éfficaces.
        System.out.println( start );

        // La classe String propose un certain nombre de méthodes.
        // ATTENTION : Une chaîne de caractères est immutable. Il est impossible de changer son contenu.
        //             Mais on peut produire une nouvelle chaîne de caractère à partir de la première.
        String upper = message.toUpperCase(); // Change le caractère Unicode pi minuscule en pi majuscule.
        System.out.println(upper);
        String lower = message.toLowerCase();
        System.out.println(lower);

        String subPart = message.substring(23,32); // substring() extraie des caractères d'une chaîne de caractère.
                                                   // La première valeur est inclus et la deuxième est exclus.
        System.out.println(subPart + "!");

        String[] parts = message.split(" "); // On découpe la chaîne de caractère à chaque espace
                                                   // et on met le tout dans un tableau de chaîne de caractère
        for (String str: parts){
            System.out.println( str );
        }

        String replacement = message.replace("texte", "truc"); // replace() remplace les mots par des autres
                                // la première valeur est la cible et la deuxième valeur est par quoi la cible va être remplacé.
        System.out.println(replacement);

        // Transformer des chaînes de caractères en nombres et vice versa.
        String strValue = "123";
        int value = Integer.parseInt( strValue );
        strValue = "3.141592654";
        double value2 = Double.parseDouble( strValue );
        System.out.println(value + " - " + value2);

        String finalString = value + ""; // On concatène avec une chaîne vide afin de changer le type value à String.
        finalString += " ";
        finalString += Double.toString( value2 );
        System.out.println( finalString );

        String strFinal2 = String.format("%05d %5.2f", value, value2); // On formate les chaines de caractères
        // "%05d" signifie que l'on veut 5 chiffres au total et que les trous vont être rempli par des 0 (d pour double)
        // "%5.2f" signifie que l'on veut 5 chiffres au total (le point est compté dedans) et que l'on veut également que 2 chiffres après la virgule.
        System.out.println(strFinal2);


         // Déclaration et initialisation de trois chaînes de caractères
        String str1 = "toto";  // Chaîne littérale, stockée dans le pool de chaînes
        String str2 = "tata";  // Chaîne littérale différente de str1
        String str3 = "toto";  // str3 pointe vers la même adresse mémoire que str1 (optimisation du pool de chaînes)

        // Comparaison des références mémoire avec "=="
        System.out.println(str1 == str2); // Retourne false, car "toto" et "tata" sont stockées à des endroits différents
        System.out.println(str1 == str3); // Retourne true, car str1 et str3 pointent vers la même instance du pool de chaînes

        // Exemple avec une concaténation dynamique
        String half = "to";          // Chaîne littérale stockée dans le pool de chaînes
        String str4 = half + half;   // Concaténation dynamique → crée un nouvel objet en mémoire (hors du pool de chaînes)
     }
}
