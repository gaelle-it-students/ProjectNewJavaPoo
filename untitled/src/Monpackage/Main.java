package Monpackage;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bonjour, Je vous présente mon premier programme en JAVA ,ce programme valide les connaissances en POO  !!!" );
        System.out.println("________________________________________________________________________________________________________________________________________");
        System.out.println( "Création de CREATURE qui contient ses paramètres d'entrée (Classe Parente) " );
        Creature C1 = new Creature("Elodie","Alavin","155 cm","45 kg","08/10/1983");
        System.out.println(C1);
        System.out.println( "Affichage des attributs de la classe parente avec String Builder " );
        System.out.println (new StringBuilder()
                .append(String.format("My name is %s\n", C1.firstName))
                .append(String.format("My firstname is %s\n", C1.lastName)));
        System.out.println("________________________________________________________________________________________________________________________________________");
        System.out.println( "Création de PERSONNE P1 avec un constructeur qui contient ses paramètres d'entrée (Classe Enfant) " );
        // Instanciation de l'objet de l'objet à la classe parente
        Person P1 =  new Person("Gaelle.payet.univ@gmail.com","8 rue des Fleurs");
        System.out.println(P1);
        System.out.println( "Création de PERSONNE P1 et affichage de ses attributs (Classe Enfant) " );
        System.out.println( "Affichage des attributs de la classe parente avec String Builder " );
        System.out.println (new StringBuilder()
                .append(String.format("My email is %s\n", P1.email))
                .append(String.format("My adress is %s\n", P1.adress)));
       // System.out.println( "Concaténation de la chaine de caractère) " );
       // String p1 = P1.email;
       // String p2 = P1.adress;
       // String s = p1.concat(p2);
       // System.out.println("Chaine concaténée = " + s);
        // Heritage = cas ou l'enfant accède aux parents
        System.out.println( "Création de PERSONNE P2 avec données personnelles email et adresse cachées " );
        Person P2 = new Person("Killian","Mbappé","180 cm","80 kg","08/10/1998","killian.mbappe@psg.fr","150 avenue de Paris");
        System.out.println(P2);
        System.out.println (new StringBuilder()
                .append(String.format("My email is %s\n", P2.email))
                .append(String.format("My adress is %s\n", P2.adress)));
        System.out.println( "Création de PERSONNE P3 avec héritage des attributs de la classe parente CREATURE " );
        Person P3 = new Person("Killian","Mbappé","180 cm","80 kg","08/10/1998","killian.mbappe@psg.fr","150 avenue de Paris");
        System.out.println("Coucou, je suis Killian Mbappé, je n'aimerais pas que vous connaissiez mon email et mon adresse !!!, Je suis la star n°1 du football francais !!!");
        System.out.println (new StringBuilder()
                .append(String.format("My name is %s\n", P3.firstName))
                .append(String.format("My firstname is %s\n", P3.lastName))
                .append(String.format("My birthday is %s\n", P3.date))
                .append(String.format("My weight is %s\n", P3.weight))
                .append(String.format("My height is %s\n", P3.height))
                .append(String.format("My email is hidden %s\n", P3.email))
                .append(String.format("My adress is hidden %s\n", P3.adress)));
        System.out.println("________________________________________________________________________________________________________________________________________");
        System.out.println( "Création de CHAT F1 avec un constructeur avec ses paramètres d'entrée ( Classe enfant)" );
        Cat F1 = new Cat("Persan");
        System.out.println(F1);
        System.out.println( "Affichage des attributs de la classe enfant CHAT avec String Builder " );
        System.out.println (new StringBuilder()
                .append(String.format("My species is %s\n", F1.species)));
        System.out.println("________________________________________________________________________________________________________________________________________");
        System.out.println( "Création de CHAT F2 avec héritage des attributs de la classe parente CREATURE " );
        Cat F2 = new Cat("Matou","LEMATOU","20cm","5 kg","03/10/2021","Chat de Gouttière");
        System.out.println(F2.getFirstName());
        System.out.println (new StringBuilder()
                .append(String.format("My name is %s\n", F2.firstName))
                .append(String.format("My firstname is %s\n", F2.lastName))
                .append(String.format("My birthday is %s\n", F2.height))
                .append(String.format("My weight is %s\n", F2.weight))
                .append(String.format("My height is %s\n", F2.date))
                .append(String.format("My species is %s\n", F2.species)));
        System.out.println( "Méthodes obligatoires appelées depuis l'interface pour récupérer l'espèce et la race " );
        System.out.println("Espece : " + F1.getEspeces());
        System.out.println("Race : " + C1.getRaces());






    }




}

