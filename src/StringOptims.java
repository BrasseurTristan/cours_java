public class StringOptims {

    private static final int LOOP_COUNT = 10_000_000;

    // Exemple de concaténations non optimisé
    public static void withoutOptims(){
        // On récupère le temps actuel en millisecondes.
        long begin = System.currentTimeMillis();

        String part1 = "part1";
        double part2 = 3.141592654;
        int part3 = 123;
        String part4 = "\u03c0";
        // la boucle permet de simuler une utilisation conséquente de mon code
         for (int i = 0; i<LOOP_COUNT; i++){
        String fullMessage = "Begin - ";
        // À chaque fois que l'on concatène, cela créer une nouvelle chaine de caractère.
        fullMessage += part1;
        fullMessage += " - ";
        fullMessage += part2;
        fullMessage += " - ";
        fullMessage += part3;
        fullMessage += " - ";
        fullMessage += part4;
        fullMessage += " - END";
//        System.out.println(fullMessage);
        };
        // On récupère le temps actuel en millisecondes.(sera différent, car exécuté à la fin du code.)
        long end = System.currentTimeMillis();
        // On soustrait les deux variables qui recupèrent le temps afin de savoir combien de temps à durée execution
        System.out.println("Duration with concatenation: " + (end-begin) + "ms");
    }


    // UTILISATION DE STRINGBUFFER !
    public static void optimThreadSafe() {
        // On récupère le temps actuel en millisecondes.
        long begin = System.currentTimeMillis();

        String part1 = "part1";
        double part2 = 3.141592654;
        int part3 = 123;
        String part4 = "\u03c0";
        // la boucle permet de simuler une utilisation conséquente de mon code
        for (int i = 0; i < LOOP_COUNT; i++) {
            StringBuffer buffer = new StringBuffer("Begin - ");
            // À chaque fois que l'on concatène, cela créer une nouvelle chaine de caractère.
            buffer.append(part1);
            buffer.append(" - ");
            buffer.append(part2);
            buffer.append(" - ");
            buffer.append(part3);
            buffer.append(" - ");
            buffer.append(part4);
            buffer.append(" - END");
            String fullMessage = buffer.toString();
            // System.out.println( fullMessage );
        };
            // On récupère le temps actuel en millisecondes.(sera différent, car exécuté à la fin du code.)
            long end = System.currentTimeMillis();
            // On soustrait les deux variables qui recupèrent le temps afin de savoir combien de temps à durée execution
            System.out.println("Duration with StringBuffer: " + (end - begin) + "ms");
    }

    //UTILISATION DE STRINGBUILDER !
    public static void optimThreadUnsafe() {
        // On récupère le temps actuel en millisecondes.
        long begin = System.currentTimeMillis();

        String part1 = "part1";
        double part2 = 3.141592654;
        int part3 = 123;
        String part4 = "\u03c0";
        // la boucle permet de simuler une utilisation conséquente de mon code
        for (int i = 0; i < LOOP_COUNT; i++) {
            StringBuilder builder = new StringBuilder("Begin - ");
            // À chaque fois que l'on concatène, cela créer une nouvelle chaine de caractère.
            builder.append(part1);
            builder.append(" - ");
            builder.append(part2);
            builder.append(" - ");
            builder.append(part3);
            builder.append(" - ");
            builder.append(part4);
            builder.append(" - END");
            String fullMessage = builder.toString();
            // System.out.println( fullMessage );
        };
        // On récupère le temps actuel en millisecondes.(sera différent, car exécuté à la fin du code.)
        long end = System.currentTimeMillis();
        // On soustrait les deux variables qui recupèrent le temps afin de savoir combien de temps à durée execution
        System.out.println("Duration with StringBuilder: " + (end - begin) + "ms");
    }
    public static void main(String[] args) {
        withoutOptims();
        optimThreadSafe();  // StringBuffer
        optimThreadUnsafe(); // StringBuilder

        //ATTENTION : Les concaténations en lignes sont automatiquement optimisées.
        // Le compilateur va automatiquement faire un StringBuilder dans ce cas.
        String part1 = "part1";
        double part2 = 3.141592654;
        int part3 = 123;
        String part4 = "\u03c0";
        String fullMessage =  "Begin - " + part1 + " - " + part2 + " - " + part3 + " - " + part4 + " - END";
        System.out.println( fullMessage);
        /*
         * Le StringBuffer est thread safe ce qui signifie qu'il peut être utilisé en toute sécurité dans
         * des environnements multi-thread. Il est moins performant en raison du coût de synchronisation.
         *
         * Le StringBuilder est à privilégier pour une utilisation mono thread.
         * Il est plus performant, car il ne gère pas la synchronisation.
         */
    };
}


