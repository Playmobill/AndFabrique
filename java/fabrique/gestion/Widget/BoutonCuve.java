package fabrique.gestion.Widget;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.widget.Button;

import fabrique.gestion.Objets.Cuve;
import fabrique.gestion.R;

public class BoutonCuve extends Button {

    public BoutonCuve(Context context, Cuve cuve) {
        super(new ContextThemeWrapper(context, R.style.bouton));
        setText("C" + cuve.getNumero() + "\n" + cuve.getEtat());
    }
}
