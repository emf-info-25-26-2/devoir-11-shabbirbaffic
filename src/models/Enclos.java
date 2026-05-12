package models;

public class Enclos {

    private Animal[] animaux;

    public Enclos(int taille) {
        animaux = new Animal[taille];
    }

    public boolean resteDeLaPlace() {
        return getNombreAnimaux() < animaux.length;
    }

    public int getNombreAnimaux() {
        int compteur = 0;

        for (Animal animal : animaux) {
            if (animal != null) {
                compteur++;
            }
        }

        return compteur;
    }

    public int getPlacesRestantes() {
        return animaux.length - getNombreAnimaux();
    }

    public boolean contientAuMoinsUnHerbivore() {
        for (Animal animal : animaux) {
            if (animal != null && animal.isHerbivore()) {
                return true;
            }
        }

        return false;
    }

    public boolean placerAnimal(Animal animal) {
        if (!resteDeLaPlace()) {
            return false;
        }

        if (getNombreAnimaux() > 0 && contientAuMoinsUnHerbivore() != animal.isHerbivore()) {
            return false;
        }

        for (int i = 0; i < animaux.length; i++) {
            if (animaux[i] == null) {
                animaux[i] = animal;
                return true;
            }
        }

        return false;
    }

    public Animal retirerAnimal() {
        for (int i = 0; i < animaux.length; i++) {
            if (animaux[i] != null) {
                Animal animalRetire = animaux[i];
                animaux[i] = null;
                return animalRetire;
            }
        }

        return null;
    }

    public Animal[] getAnimaux() {
        return animaux;
    }
}
    

