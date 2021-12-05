package Monpackage;
// Extension de la classe  Créature pour bénificier des propriétés héritées
public class Cat extends Creature {
    public String species;


    public Cat() {



    }

// Constructeur avec un paramètre par défaut spécifique à la classe enfant

    public Cat(String species) {
        this.species = species;


    }
    // Constructeur de modification d'attributs de la classe parente
    public Cat (String firstname, String lastname, String height, String weight, String date, String species){
        super(firstname,lastname,height,weight,date);

        this.species = species;
    }
// Metodes Getter et Setter
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
// Surcharge de la classe parente
    @Override
    public String toString() {
        return "Cat{" +
                "species='" + species + '\'' +
                '}';
    }


    @Override
    public String getRaces() {
       return null;
    }
}

