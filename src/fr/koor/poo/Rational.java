package fr.koor.poo;

// Création d'une classe
public class Rational {

    // Attributs de la classe Rational
    // les attributs sont en visibilité package.
    // Cela veut dire qu'elles sont utilisables seulement dans le package dans lequel la classe est.
//    int numerator;
//    int denominator;

    // Les attributs sont en visiblité public.
    // Donc utilisable dans tout le projet.
//    public int numerator;
//    public int denominator;

    // Les attributs sont en visibilité privée.
    // Le mode le plus restrictif.
    // On peut donner une valeur par défaut aux attributs
    private int numerator /* = 0 */;
    private int denominator /* = 1 */;

    // Le constructeur est une méthode qui va être invoqué au moment de l'initialisation de l'objet.
    // Il ne sera plus ré-invoqué par la suite.
    // Le constructeur doit avoir le même nom que la classe (il peut y avoir plusieurs constructeurs).
    public Rational(){
        // On appelle le constructeur dessous(avec this) et on met les valeurs, qui seront celle pas défaut.
        this(2,3);
        // Autre méthode d'assigné les valeurs aux attributs.
//        this.setNumerator(2);
//        this.setDenominator(3);
    }
    // Autre type de constructeur // Cela s'appelle de la surcharge de constructeur
    public Rational(int numerator, int denominator) {
//        this.numerator = numerator; // Fonctionne, mais pas optimal !
//        this.denominator = denominator;// Fonctionne, mais pas optimal !
        this.setNumerator(numerator);   // Permet de garder la sécurité mise dans le setter
        this.setDenominator(denominator); // Permet de garder la sécurité mise dans le setter
    }

    // Les propriétés (getter et setter)

    public int getNumerator(){
        // this est optionnel dans ce cas.
        return this.numerator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    public int getDenominator() {
        return this.denominator;
    }

    public void setDenominator(int denominator) {
        if(denominator == 0){
            throw new RuntimeException("denominator cannot be null");
        }
        // On met this pour confirmer que cet attribut appartient à la classe
        this.denominator = denominator;
    }

    // Permet d'afficher un objet en format String
    public String toString() {
        return "Rational{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }
}
