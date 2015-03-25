package fabrique.gestion.Objets;

import java.util.Date;

public class Fermenteur {

    private int id;

    private int numero;

    private int capacite;

    private String dateLavageAcide;

    private int etat = 0;

    private Date dateEtat;

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
            return EtatFermenteur.etat(etat) + "\n" + brassin.getNumero();
        }
        return EtatFermenteur.etat(etat);
    }

    public Date getDateEtat() {
        return dateEtat;
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

    public void setBrassin(Brassin brassin) {
        this.brassin = brassin;
        etat = 1;
    }
}
