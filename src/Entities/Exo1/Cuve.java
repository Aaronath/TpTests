package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    private double largeur;
    private double longueur;
    public Cuve(int id, String nom, float hauteur, float debitMax, float largeur, float longueur) {
        super(id, nom, hauteur, debitMax);
    }

    public String GetDescription(){
        return super.getDescription()+" - longueur "+this.longueur+" - largeur "+this.largeur;
    }

    public double GetVolume(){
        return super.GetVolume() + this.longueur * this.largeur;
    }
}
