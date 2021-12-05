package Monpackage;
// Implémentation Interface
public class Creature implements InterfaceEspece {
    public String firstName;
    public String lastName;
    public String height;
    public String weight;
    public String date;


    public Creature(){

    }

    public Creature (String firstname, String lastname, String height, String weight, String date) {
        this.firstName = firstname;
        this.lastName = lastname;
        this.height = height;
        this.weight = weight;

        this.date = date;


    }
    // Méthodes Getter
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Creature{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height='" + height + '\'' +
                ", weight='" + weight + '\'' +
                ", date='" + date + '\'' +
                '}';
    }


    // Méthodes obligatoires à implémenter dans l'interface = Retourne le nom de la classe surchargée

    @Override
    public String getEspeces() {
        return this.getClass().getSimpleName();
    }

    @Override
    public String getRaces() {
        return this.getClass().getSimpleName();
    }
}




