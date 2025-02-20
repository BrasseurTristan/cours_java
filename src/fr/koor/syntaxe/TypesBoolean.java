package fr.koor.syntaxe;

public class TypesBoolean {
    public static void main(String[] args) {

        // Un booléen répond soit vrai(true) soit faux(false)
        boolean state1 = true;
        System.out.println(state1);
        boolean state2 = false;
        System.out.println(state2);

        // Opérateurs booléens : &&(and) ||(or) !(not)
        // L'opérateur &&
        if (state1 && state2) {
            System.out.println("Les deux variables sont initialisées à true ");
        }
        ;
        // L'opérateur ||
        if (state1 || state2) {
            System.out.println("L'une des deux variables est initialisée à true ");
        }
        ;
        // L'opérateur !
        if (!state1) {
            System.out.println("state1 est initialisée à false ");
        }
        ;
    }
}
