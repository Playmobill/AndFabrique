package fabrique.gestion.Widget;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import fabrique.gestion.Objets.Fermenteur;
import fabrique.gestion.R;

public class BoutonFermenteur extends Button implements View.OnClickListener {

    Fermenteur fermenteur;

    public BoutonFermenteur(Context context, Fermenteur fermenteur) {
        super(new ContextThemeWrapper(context, R.style.bouton));
        this.fermenteur = fermenteur;
        this.setGravity(Gravity.LEFT|Gravity.CENTER_HORIZONTAL);
        setText("F" + fermenteur.getNumero() + "\n" + fermenteur.getEtat());
        setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String texte = "";
        if (fermenteur.getNumero() != 0) {
            texte = texte + "F" + fermenteur.getNumero();
        }
        texte = texte + "\n";

        if (fermenteur.getCapacite() != 0) {
            texte = texte + fermenteur.getCapacite();
        }
        texte = texte + "\n" + fermenteur.getEtat();

        if (fermenteur.getBrassin() == null) {
            texte = texte + "\n";
        }
        texte = texte + "\n" + fermenteur.getDateEtat();
        setText(texte);
    }
}
