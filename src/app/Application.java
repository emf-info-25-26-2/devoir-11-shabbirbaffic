package app;

import java.util.Random;

import models.Animal;
import models.Enclos;
import models.Proprietaire;

public class Application {

    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
    
        //
        //              )        (                 ) (           (         (
        //           ( /(   *   ))\ )        (  ( /( )\ )        )\ )  (   )\ )
        //     (   ( )\())` )  /(()/((       )\ )\()|()/(  (    (()/(  )\ (()/(
        //     )\  )((_)\  ( )(_))(_))\    (((_|(_)\ /(_)) )\    /(_)|((_) /(_))
        //    ((_)((_)((_)(_(_()|_))((_)   )\___ ((_|_))_ ((_)  (_)) )\___(_))
        //    __   _____ _____ ___ ___    ___ ___  ___  ___   ___ ___ ___   _
        //    \ \ / / _ \_   _| _ \ __|  / __/ _ \|   \| __| |_ _/ __|_ _| | |
        //     \ V / (_) || | |   / _|  | (_| (_) | |) | _|   | | (__ | |  |_|
        //      \_/ \___/ |_| |_|_\___|  \___\___/|___/|___| |___\___|___| (_)
        //



   
        

            private static int compteurAnimaux = 1;
        
                Enclos[] enclos = new Enclos[8];
        
                for (int i = 0; i < enclos.length; i++) {
                    enclos[i] = new Enclos(8);
                }
        
                Proprietaire[] proprietaires = {
                        new Proprietaire("Mario", "Duprévert"),
                        new Proprietaire("Paul", "Duchampsec"),
                        new Proprietaire("Fred", "Dupaturage"),
                        new Proprietaire("Tom", "Delaprairie")
                };
        
                for (Proprietaire proprietaire : proprietaires) {
                    for (int i = 0; i < 10; i++) {
                        Animal animal = genererAnimal(proprietaire);
        
                        boolean animalPlace = false;
        
                        for (Enclos unEnclos : enclos) {
                            if (unEnclos.placerAnimal(animal)) {
                                animalPlace = true;
                                break;
                            }
                        }
        
                        if (!animalPlace) {
                            System.out.println("Impossible de placer l'animal : " + animal);
                            return;
                        }
                    }
                }
        
                for (int i = 0; i < enclos.length; i++) {
                    System.out.println("Contenu de l'enclos N°" + (i + 1));
        
                    for (Animal animal : enclos[i].getAnimaux()) {
                        if (animal != null) {
                            System.out.println("   " + animal);
                        }
                    }
                }
            }
        
            public static Animal genererAnimal(Proprietaire proprietaire) {
                String[] types = {"Cheval", "Vache", "Chèvre", "Poule", "Chien", "Porc"};
        
                String type = types[RANDOM.nextInt(types.length)];
                boolean herbivore = type.equals("Cheval") || type.equals("Vache") || type.equals("Chèvre");
        
                Animal animal = new Animal(proprietaire, type, compteurAnimaux, herbivore);
                compteurAnimaux++;
        
                return animal;
            }
        }



    }
