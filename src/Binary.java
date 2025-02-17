public class Binary {
    public static void main(String[] args){
        /*
         * Utilisation des opérateurs binaires
         */
        for (int i = 0; i < 16 ; i++) {
            String str = Integer.toBinaryString( i );
            while (str.length() < 4) str = "0" + str;
            System.out.println( str );
        }


        // Déclaration et initialisation de deux variables entières en notation binaire
        int value1 = 0b10101010; // Équivaut à 170 en décimal
        int value2 = 0b00001111; // Équivaut à 15 en décimal

        // Les opérateurs binaires sont :
        // & (AND)    |(OR)    ^(XOR)   ~(NOT)

        // Opération NOT (~) : inverse tous les bits de value1
        System.out.println("NOT - "+ Integer.toBinaryString(~value1));
        // Opération AND (&) : garde les bits à 1 seulement si les deux opérandes ont des bits à 1.
        System.out.println("AND - "+ Integer.toBinaryString( value1 & value2));
        // Opération OR (|) : met les bits à 1 si au moins un des opérandes a un bit à 1.
        System.out.println("OR - "+ Integer.toBinaryString( value1 | value2));
        // Opération XOR (^) : met les bits à 1 si un seul des deux opérandes a un bit à 1 (différence)
        System.out.println("XOR - "+ Integer.toBinaryString( value1 ^ value2));

        // Les opérateurs de décalage de bits permettent de déplacer les bits vers la gauche ou la droite :
        // << (décalage vers la gauche - left shift) : multiplie par 2^n
        // >> (décalage vers la droite - right shift) : divise par 2^n (en conservant le signe pour les nombres négatifs)
        // Décalage de 2 bits vers la gauche de value2 (équivalent à multiplier par 4).
        System.out.println("<< - "+ Integer.toBinaryString(value2 << 2) + " ["+value2+" -> "+(value2 << 2)+"]");
        // Décalage de 2 bits vers la droite de value2 (équivalent à diviser par 4).
        System.out.println(">> - "+ Integer.toBinaryString(value2 >> 2) + " ["+value2+" -> "+(value2 >> 2)+"]");

        // Les affectations combinées permettent d'appliquer un opérateur et d'affecter le résultat à la variable
        // &=   |=   ^=   >>=   <<=

        // Décalage gauche de 2 bits et affectation à value1
        value1 <<= 2; // value1 = value1 << 2
        System.out.println("value1 après <<= 2 : " + Integer.toBinaryString(value1) + " [" + value1 + "]");

        // Affichage du décalage gauche de value2 sans modification de sa valeur
        System.out.println("value2 << 2 : " + Integer.toBinaryString(value2 << 2) +
                " [" + value2 + " -> " + (value2 << 2) + "]");

    }
}
