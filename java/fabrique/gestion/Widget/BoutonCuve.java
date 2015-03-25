package fabrique.gestion.Widget;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;

import fabrique.gestion.Objets.Cuve;
import fabrique.gestion.R;

public class BoutonCuve extends Button implements View.OnClickListener {

    private Cuve cuve;

    public BoutonCuve(Context context, Cuve cuve) {
        super(new ContextThemeWrapper(context, R.style.bouton));
        this.cuve = cuve;
        this.setGravity(Gravity.LEFT | Gravity.CENTER_HORIZONTAL);
        setText("C" + cuve.getNumero() + "\n" + cuve.getEtat());
        setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        String texte = "";
        if (cuve.getNumero() != 0) {
            texte = texte + "C" + cuve.getNumero();
        }
        texte = texte + "\n";

        if (cuve.getCapacite() != 0) {
            texte = texte + cuve.getCapacite() + "L";
        }
        texte = texte + "\n" + cuve.getEtat();

        if ((cuve.getCommentaireEtat() != null) && (cuve.getCommentaireEtat().equals(""))) {
            texte = texte + "\n";
        }

        if (cuve.getBrassin() == null) {
            texte = texte + "\n";
        }
        texte = texte + "\n" + cuve.getDateEtat();
        setText(texte);
    }
}
