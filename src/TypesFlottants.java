public class TypesFlottants {
    public static void main(String[] args){

        // Une constante qui contient un point dans sa valeur (voir f2) est directement typé double.
        // Il faut ajouter un f minuscule ou majuscule à la fin de la valeur si on veut garder un type float (voir f1).
        float f1 = 3.6f; // 4 octets → interval de valeur entre -1.4*10-45 et 3.4*1038
        double f2 = 3.141592654; // 8 octets → interval de valeur entre 4.9*10-324 et 1.7*10308

        // 2 formes de représentation de flottants
        double first = 1.234; // Syntaxe classique
        double second = 1234e-3; // Notation exponentielle (mantisse - exposant)

        // Attention piège !
        //double result = 1 / 3;  Division entière qui calcule un entier
        double result = 1.0 / 3; // Il faut au moims mettre un chiffre avec une virgule pour le typé double.
        System.out.println(result);
    }
}
