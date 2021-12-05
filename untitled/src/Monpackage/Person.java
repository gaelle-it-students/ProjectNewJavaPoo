package Monpackage;

import java.util.Objects;

public class Person extends Creature {
    public String email;
    public String adress;

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object userInfodataPerso) {
        if (this == userInfodataPerso) return true;
        if ( userInfodataPerso == null || userInfodataPerso.getClass() != getClass()) return false;
        Person person = (Person)userInfodataPerso ;
        return Objects.equals(email, person.email) && Objects.equals(adress, person.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, adress);
    }


    public Person() {

    }
    public Person (String firstname, String lastname, String height, String weight, String date,String email,String adress){
        super(firstname,lastname,height,weight,date);

    }

    public Person (String email, String adress) {

        this.email = email;
        this.adress = adress;
    }
    public String getEmail() {
        return email;
    }

    public String getAdress() {
        return adress;
    }


    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                ", adress='" + adress + '\'' +
                '}';
    }



}
