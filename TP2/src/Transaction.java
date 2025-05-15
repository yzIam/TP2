/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author itsyz
 */
public class Transaction {

    private float montant;
    private String fournisseur;
    private LocalDate date;

    // Constructeur
    public Transaction(float montant, String fournisseur, LocalDate date) {
        this.montant = montant;
        this.fournisseur = fournisseur;
        this.date = date;
    }
}
