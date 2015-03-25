package fabrique.gestion.Widget;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.Button;

import fabrique.gestion.Objets.Fermenteur;
import fabrique.gestion.R;

public class BoutonFermenteur extends Button {

    public BoutonFermenteur(Context context, Fermenteur fermenteur) {
        super(new ContextThemeWrapper(context, R.style.bouton));
        setText("F" + fermenteur.getNumero() + "\n" + fermenteur.getEtat());
    }
}
