package models;

public class Animal {

    private Proprietaire proprietaire;
    private String type;
    private int numero;
    private boolean herbivore;

    public Animal(Proprietaire proprietaire, String type, int numero, boolean herbivore) {
        this.proprietaire = proprietaire;
        this.type = type;
        this.numero = numero;
        this.herbivore = herbivore;
    }

    public Proprietaire getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(Proprietaire proprietaire) {
        this.proprietaire = proprietaire;
    }

    public String getType() {
        return type;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isHerbivore() {
        return herbivore;
    }

    @Override
    public String toString() {
        return String.format("N°%04d-%s-Propriété de %s", numero, type, proprietaire);
    }
}