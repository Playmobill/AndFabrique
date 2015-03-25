package fabrique.gestion.Objets;

import java.util.Date;

public class Cuve {

    private int id;

    private int numero;

    private int capacite;

    private String dateLavageAcide;

    private int etat = 0;

    private Date dateEtat;

    private String commentaireEtat;

    private Brassin brassin;

    public int getId() {
        return id;
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacite() {
        return capacite;
    }

    public String getDateLavageAcide() {
        return dateLavageAcide;
    }

    public String getEtat() {
        if (etat == 1) {
            return EtatCuve.etat(etat) + "\n" + brassin.getNumero();
        } else if (etat == 2) {
            return EtatCuve.etat(etat) + "\n" + brassin.getNumero();
        }
        return EtatCuve.etat(etat);
    }

    public Date getDateEtat() {
        return dateEtat;
    }

    public String getCommentaireEtat() {
        return commentaireEtat;
    }

    public Brassin getBrassin() {
        return brassin;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setCapacite(int capacite) {
        this.capacite = capacite;
    }

    public void setDateLavageAcide(String dateLavageAcide) {
        this.dateLavageAcide = dateLavageAcide;
    }

    public void setEtat(int etat) {
        this.etat = etat;
    }

    public void setDateEtat(Date dateEtat) {
        this.dateEtat = dateEtat;
    }

    public void setCommentaireEtat(String commentaireEtat) {
        this.commentaireEtat = commentaireEtat;
    }

    public void setBrassin(Brassin brassin) {
        this.brassin = brassin;
        etat = 1;
    }
}
