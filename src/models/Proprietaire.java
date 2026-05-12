package models;

public class Proprietaire {

    private String prenom;
    private String nom;

    public Proprietaire(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return prenom + " " + nom;
    }
}

