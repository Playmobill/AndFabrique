package fabrique.gestion;

import android.app.Activity;
import android.graphics.Typeface;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.HorizontalScrollView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import fabrique.gestion.Objets.Brassin;
import fabrique.gestion.Objets.Cuve;
import fabrique.gestion.Objets.Fermenteur;
import fabrique.gestion.Widget.BoutonCuve;
import fabrique.gestion.Widget.BoutonFermenteur;

public class ActivityTableauDeBord extends Activity {

    private DisplayMetrics tailleEcran;

    private Fermenteur[] fermenteurs;

    private Cuve[] cuves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //Jeu de donnees
        initialiserFermenteurs();

        initialiserCuves();

        //Taille ecran
        tailleEcran = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(tailleEcran);

        //Layout pour le defilement horizontal
        HorizontalScrollView layoutHorizontalScroll = new HorizontalScrollView(this);
        layoutHorizontalScroll.setBackgroundColor(R.color.gris);

            //Tableau pour les elements de la fenetre
            TableLayout layoutTableau = new TableLayout(this);

                //Ligne 1 du tableau qui affiche le texte "Fermenteurs"
                TableRow ligne1 = nouvelleLigneTexte("Fermenteurs");

                //Ligne 2 du tableau qui affiche tous les fermenteurs
                TableRow ligne2 = intialiserLigneFermenteur();

                //Ligne 3 du tableau qui affiche le texte "Garde"
                TableRow ligne3 = nouvelleLigneTexte("Garde");

                //Ligne 3 du tableau qui affiche le texte "Garde"
                TableRow ligne4 = intialiserLigneGarde();

        //Ajout

                layoutTableau.addView(ligne1);

                layoutTableau.addView(ligne2);

                layoutTableau.addView(ligne3);

                layoutTableau.addView(ligne4);

            layoutHorizontalScroll.addView(layoutTableau);

        setContentView(layoutHorizontalScroll);
    }

    public TableRow nouvelleLigneTexte(String texte) {
        TableRow ligne = new TableRow(this);

        TableRow.LayoutParams parametreLigne = new TableRow.LayoutParams(TableRow.LayoutParams.MATCH_PARENT, TableRow.LayoutParams.WRAP_CONTENT);
        //parametreLigne.span = 2;
        ligne.setLayoutParams(parametreLigne);

        TextView txt = new TextView(this);
        txt.setText(texte);
        txt.setTypeface(null, Typeface.BOLD);
        txt.setTextSize(30);

        ligne.addView(txt);

        return ligne;
    }

    public TableRow intialiserLigneFermenteur() {
        TableRow ligne = new TableRow(this);

        TableRow.LayoutParams parametreFermenteur = new TableRow.LayoutParams(tailleEcran.widthPixels/5, tailleEcran.widthPixels/5);
        parametreFermenteur.setMargins(10, 10, 10, 10);

        for (final Fermenteur fermenteur : fermenteurs) {
            BoutonFermenteur boutonFermenteur = new BoutonFermenteur(this, fermenteur);
            boutonFermenteur.setLayoutParams(parametreFermenteur);
            ligne.addView(boutonFermenteur);
        }
        return ligne;
    }

    public TableRow intialiserLigneGarde() {
        TableRow ligne = new TableRow(this);

        TableRow.LayoutParams parametreCuve = new TableRow.LayoutParams(tailleEcran.widthPixels/6, tailleEcran.widthPixels/6);
        parametreCuve.setMargins(10, 10, 10, 10);

        for (final Cuve cuve : cuves) {
            BoutonCuve boutonCuve = new BoutonCuve(this, cuve);
            boutonCuve.setLayoutParams(parametreCuve);
            ligne.addView(boutonCuve);
        }
        return ligne;
    }

    public void initialiserFermenteurs() {
        //Fermenteur 1 contenant brassin 1
        fermenteurs = new Fermenteur[2];
        fermenteurs[0] = new Fermenteur();
        fermenteurs[0].setId(0);
        fermenteurs[0].setNumero(1);
        fermenteurs[0].setEtat(1);
            //Brassin 1
            Brassin brassin1 = new Brassin();
            brassin1.setId(0);
            brassin1.setNumero(312);
            fermenteurs[0].setBrassin(brassin1);

        //Fermenteur 2
        fermenteurs[1] = new Fermenteur();
        fermenteurs[1].setId(1);
        fermenteurs[1].setNumero(2);
        fermenteurs[1].setEtat(0);
    }

    public void initialiserCuves() {
        //Cuve 1 contenant brassin 1
        cuves = new Cuve[3];
        cuves[0] = new Cuve();
        cuves[0].setId(0);
        cuves[0].setNumero(1);
        cuves[0].setEtat(1);
        //Brassin 1
            Brassin brassin1 = new Brassin();
            brassin1.setId(0);
            brassin1.setNumero(312);
            cuves[0].setBrassin(brassin1);

        //Cuve 2
        cuves[1] = new Cuve();
        cuves[1].setId(1);
        cuves[1].setNumero(2);
        cuves[1].setEtat(0);

        //Cuve 3
        cuves[2] = new Cuve();
        cuves[2].setId(1);
        cuves[2].setNumero(2);
        cuves[2].setEtat(0);
    }
}