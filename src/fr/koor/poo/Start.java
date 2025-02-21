package fr.koor.poo;

public class Start {
    public static void main(String[] args) {

        // On a créé un nouvel objet à partir de la classe Rational
        // Utilisation du premier constructeur
        Rational r = new Rational();
//        r.numerator = 3; // Ne fonctionne plus car les propriétés de la classes sont en private
//        r.denominator = 4;
//        System.out.printf("[%d/%d]\n" , r.numerator, r.denominator);

        r.setNumerator(3); // On utilise les propriétés set de la classe pour modifier les attributs
        r.setDenominator(4);
        // On utilise les propriétés get de la classe pour récupérer les attributs de l'objet r
        // qui est lui-même une instanciation de la classe Rational.
        System.out.printf("[%d/%d]\n" , r.getDenominator(), r.getDenominator());

//        Utilisation du deuxième constructeur
        Rational r2 = new Rational(5,6);
        System.out.printf("[%d/%d]\n" , r2.getDenominator(), r2.getDenominator());
    }
}
