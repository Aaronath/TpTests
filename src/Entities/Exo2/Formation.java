package Entities.Exo2;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Formation
{
    private int idFormation;
    private String nomFormation;
    private int prixFormation;

    private ArrayList<Participant> lesParticipants;

    public Formation(int idFormation, String nomFormation, int prixFormation) {
        this.idFormation = idFormation;
        this.nomFormation = nomFormation;
        this.prixFormation = prixFormation;
        this.lesParticipants = new ArrayList<>();
    }

    public void AjouterParticipant(Participant unParticipant)
    {
        lesParticipants.add(unParticipant);
    }

    // Cette méthode permet de compter le nombre de participants
    // réellement présents à la formation.
    public int GetNombreDePresents()
    {
        // A compléter ici
        int nbParticipants = 0;
        for (Participant participant:
             lesParticipants) {
            if (participant.isEstPresent()){
                nbParticipants++;
            }
        }

        return nbParticipants;
    }

    // Cette méthode permet de calculer le montant total
    // des frais kilométriques versés pour une formation
    // en ne prenant en compte que les participants présents.
    // On rembourse 1.89 du KM
    public double CalculerFraisRemboursementKilometriques()
    {
        // A compléter ici
        float frais = 0;
        for (Participant participant:
             lesParticipants) {
            if (participant.isEstPresent()){
                frais = (float) (frais + participant.getNbKm()*1.89);
            }
        }

        return frais;
    }

    // Cette méthode permet de calculer le taux de présence
    // par rapport au nombre d'inscrits
    public double TauxDePresence()
    {
        // A compléter ici
        int nbParticipants = lesParticipants.size();
        int lesPresents = this.GetNombreDePresents();
        double taux = nbParticipants * (lesPresents / 100);
        return taux;
    }

    // Cette méthode permet de calculer le bénéfice de la formation.
    // Ce dernier se détermine en multipliant le nombre de présents par le prix de la formation moins
    // les frais kilométriques versés
    public double BeneficeFormation()
    {
        // A compléter ici
        return this.prixFormation * this.GetNombreDePresents() - this.CalculerFraisRemboursementKilometriques();
    }
}
