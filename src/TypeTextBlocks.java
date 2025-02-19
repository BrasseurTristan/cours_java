public class TypeTextBlocks {
    public static void main(String[] args) {

        // Méthode de concaténations de String avant Java 15.
//        String welcome = "My Super App - Copyright KooR.fr\n"
//                       + "Usage: [options] SuperApp param1 param2\n"
//                       + "    -h      display this help\n"
//                       + "    -x      imagine a parameter\n";

        // Le TextBlocks permettent d'écrire un texte conséquent juste avec un retour à la ligne et sans concaténations
        String welcome = """
                My Super App - Copyright KooR.fr
                Usage: [options] SuperApp param1 param2
                    -h      display this help
                    -x      imagine a parameter
                """;
        System.out.println( welcome );

        // Les textBlocks sont utiles également pour écrire des requêtes SQL ou également des JSON

    }
}
