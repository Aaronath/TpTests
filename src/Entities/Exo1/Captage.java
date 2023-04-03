package Entities.Exo1;

public class Captage implements Comparable<Captage>
{
    private int id;
    private String nom;
    private float hauteur;
    private float debitMax;

    public Captage(int id, String nom, float hauteur, float debitMax) {
        this.id = id;
        this.nom = nom;
        this.hauteur = hauteur;
        this.debitMax = debitMax;
    }

    public String getDescription(){
        return this.nom +" - "+ this.hauteur +" mètres - "+ this.debitMax+" litres";
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public float getHauteur() {
        return hauteur;
    }

    public float getDebitMax() {
        return debitMax;
    }

    @Override
    public int compareTo(Captage captage) {
        if (this.GetVolume() == captage.GetVolume()) {
            return 0;
        } else if (this.GetVolume() > captage.GetVolume()) {
            return 1;
        } else {
            return -1;
        }
    }

    public double GetVolume(){
        return 0;
    }
}
