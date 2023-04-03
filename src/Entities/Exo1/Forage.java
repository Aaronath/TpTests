package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    private float diametre;

    public Forage(int id, String nom, float hauteur, float debitMax, float diametre) {
        super(id, nom, hauteur, debitMax);
    }

    public double GetVolume(){
        return super.GetVolume() + (Math.PI * this.diametre * super.getHauteur());
    }

    public String GetDescription(){
        return super.getDescription()+" - diamètre "+ this.diametre;
    }

    public float getDiametre() {
        return diametre;
    }
}
