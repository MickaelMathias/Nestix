package app;

import javax.swing.*;

public class C_FORMULAIRE_ARTISTE{

    private JTextField tf_visa, tf_titre, tf_annee, tf_realisateur, tf_scenariste, tf_duree, tf_trailer, tf_lien;
private JTextField tf_budget, tf_tag_1, tf_tag_2, tf_tag_3, tf_genre_1, tf_genre_2, tf_saga;
private JTextField tf_award, tf_ceremonie, tf_annee_ceremonie;
private String type;
private JTextArea tf_synop;
private C_ARTISTE mon_film = new C_ARTISTE();
private JList list_acteurs;

public C_ARTISTE getArtiste(){
    return this.mon_artiste;
}

}