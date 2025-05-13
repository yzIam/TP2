// Classe Carte
//
import java.time.LocalDate;

public class FenBanque {

    //attributs
    private int noCarte;
    private float soldePeriode;
    private LocalDate debutPeriode;
    private LocalDate echeancePeriode;
    private float soldeTotal;
    private float tauxCarte;

    //Constructeur Carte
    public Carte(int noCarte) {
        this.noCarte = noCarte;
    }

    //methodes

    //2 methodes avec le meme nom???? mais 2 arguments?
    public Carte(int noCarte, float soldeTotal) {}

    public float getSoldePeriode() {}

    public float getSoldeTotal() {}

    public LocalDate getEcheancePeriode() {}

    public void setTauxCarte(float tauxCarte) {}

    public void ajouterTransaction(
        float montant,
        string fournisseur,
        LocalDate date
    ) {}

    public void payer(float montant) {}

    public void nouvellePeriode() {}

    public void chargerInterets() {}
}
