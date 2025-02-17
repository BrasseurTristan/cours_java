public class TypesCharacter {
    public static void main(String[] args){

        // Attention entre une chaine de caractères(") et caratère (')
        String theStr = "une chaine de caractères"; // Un ensemble de caractère
        char theChar = 'a'; // Un unique caractère

        // La syntaxe pour certains caractères spéciaux
        char retourALaLigne = '\n';
        char tabulation = '\t';

        // En Java, on utilise UNICODE
        // En UNICODE, 1 caractère = 2 octets
        char piMaj = '\u03a0';
        //char piMin = '\u03c0';  // Codification en hexadécimal
        char piMin = 960;         // Codification en décimal

        // Méthodes statiques sont proposé pour tester les caractères.
        // Pleins de méthodes sont proposés derrière Character
        boolean isDigit = Character.isDigit( theChar );
        System.out.println(isDigit); // Renvoie false
        boolean isLetter = Character.isLetter(piMin);
        System.out.println(isLetter); // Renvoie true
        boolean isUpperCaseLetter = Character.isUpperCase(piMin);
        System.out.println(isUpperCaseLetter); // Renvoie false
    }
}
