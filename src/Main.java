public class Main {
    public static void main(String[] args) {
        // Commentaire sur une ligne

        /*
         * Ce commentaire peux être
         * fait sur plusieurs lignes
         */

        // Toute variable doit être typé
        int counter = 10;

        // incrémentation de la variable
        counter ++;

        //décrémentation de la variable
        counter --;

        System.out.println(counter);

        /*
         * Règles pour les noms de variables :
         * caractères autorisés = lettres + chiffres + _ + $
         */
        int var1 = 100;
        int nom_complexe = 200; // l'underscore est conventionnellement utilisé pour les constantes.
        int nom$complexe = 300; // Le dollar est utilisé dans les classes anonymes.
        int nomélémentaire = 400; // Les accents fonctionnent, mais déconseillé.
        // int 2essai = 0;  On ne peut pas commencer par un chiffre

        // La convention veut que le camelCase soit utilisé
        int nomComplexe = 500;

      /*
       * Les 4 types entiers
       */

        //byte = 1 octet → l'intervalle de valeur d'un byte est entre -128 et 127
        byte monOctet = 100;
        System.out.println("Byte :" + monOctet);
        // byte monOctet1 = 128; affiche une erreur !

        // short = 2 octets → l'intervalle de valeur d'un byte est entre -32768 et 32767
        short monShort = 30000;
        System.out.println("Short :" + monShort);
        // short monShort1 = 32768; affiche une erreur !

        // int = 4 octets → l'intervalle de valeur d'un byte est entre -2 147 483 648 et 2 147 483 647
        // Depuis Java 7 on peut utiliser l'underscore pour espacer les grands chiffres.
        int monInt = 1_000_000_000;
        System.out.println("int :" + monInt);

        // long = 8 octets -> l'intervalle de valeur d'un byte est entre -9 223 372 036 854 775 808 et 9 223 372 036 854 775 807
        long monLong = 1_000_000_000;
        System.out.println("Long :" + monLong);
        // la constante que l'on tape est typée int ce qui ne permet pas d'écrire un chiffre plus grand que 1 Milliard
        // La solution est de typer la constante en long en ajoutant un L majuscule à la fin du chiffre.
        // long monLong1 = 10_000_000_000;
        long monLong1 = 10_000_000_000L;
        System.out.println("Long1 :" + monLong);

        /*
         * Les 4 bases en numérique
         */
        int decimalValue = 10;  //                                                      10 digits de 0 à 9
        int binaryValue = 0b101; // 0b pour signifier que la valeur va être du binaire  2 digit 0 et 1
        System.out.println("Binaire :" + binaryValue); // Affiche 5
        int octalValue = 010; // Valeur Octale (il faut commencer par 0)  8 digits de 0 à 7
        System.out.println("Octal :" + octalValue); // Affiche 5
        int hexadecimalValue = 0xff; // 0x signifie que c'est de l'hexadécimal.  16 digits 0 à 9 puis de A à F
        System.out.println("Hexadécimal :" + hexadecimalValue); // Affiche 255

        // Les opérateurs sur valeurs entières : ++ --     + - * / %     += -= *= /= %=
        int a = 33;
        int b = 44;
        int result = a + b;
        System.out.println(result);

        byte b1 = 100;
        byte b2 = 100;
        // byte + byte est forcément converti en int car la probabilité de dépasser 1 octet est élevé (la même pour short)
        int sum = b1 + b2;

        int currentValue = 5;
        currentValue += 5; // curentValue = currentValue + 5

        // Incrémentations et decrémentations

        int value = 10;
        // Affiche 11
        System.out.println(++a); // incrémentation préfixée => l'incrément est effectué avant l'utilisation de la variable
        // Affiche 10
        System.out.println(a++); // incrémentation postfixée => l'incrément est effectué après l'utilisation de la variable

        int part1 = 10;
        int part2 = 20;
        int result1 = part1++ + part2++;
        System.out.println(result1); // Affiche 30


        
    }
}