/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author itsyz
 */
/*
Yazid Alaoui
*/
import java.time.LocalDate;

public class Carte{

    //attributs
    private int noCarte;
    private float soldePeriode;
    private LocalDate debutPeriode;
    private LocalDate echeancePeriode;
    private float soldeTotal;
    private float tauxCarte;
    private ArrayList<Transaction> transactions;

    //Constructeur Carte
    public Carte(int noCarte) {
        this.noCarte = noCarte;
    }

    public Carte(int noCarte, float soldeTotal) {
        this.noCarte = noCarte;
        this.soldeTotal = soldeTotal;
    }

    //methodes

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
