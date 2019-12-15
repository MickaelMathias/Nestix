package app;

import javax.swing.*;

public class C_FORMULAIRE_FILM{

private JTextField tf_visa, tf_titre, tf_annee, tf_realisateur, tf_scenariste, tf_duree, tf_trailer, tf_lien;
private JTextField tf_budget, tf_tag_1, tf_tag_2, tf_tag_3, tf_genre_1, tf_genre_2, tf_saga;
private JTextField tf_award, tf_ceremonie, tf_annee_ceremonie;
private String type;
private JTextArea tf_synop;
private C_FILM mon_film = new C_FILM();
private JList list_acteurs;

public C_FILM getFilm(){
    return this.mon_film;
}

public void setVisa(JTextField mon_tf_visa){
    this.tf_visa = mon_tf_visa;
}
public void setTitre(JTextField mon_tf_titre){
    this.tf_titre = mon_tf_titre;
}
public void setAnnee(JTextField mon_tf_annee){
    this.tf_annee = mon_tf_annee;
}
public void setRealisateur(JTextField mon_tf_realisateur){
    this.tf_realisateur = mon_tf_realisateur;
}
public void setScenariste(JTextField mon_tf_scenariste){
    this.tf_scenariste = mon_tf_scenariste;
}
public void setDuree(JTextField mon_tf_duree){
    this.tf_duree = mon_tf_duree;
}
public void setTrailer(JTextField mon_tf_trailer){
    this.tf_trailer = mon_tf_trailer;
}
public void setLien(JTextField mon_tf_lien){
    this.tf_lien = mon_tf_lien;
}
public void setBudget(JTextField mon_tf_budget){
    this.tf_budget = mon_tf_budget;
}
public void setTag1(JTextField mon_tf_tag1){
    this.tf_tag_1 = mon_tf_tag1;
}
public void setTag2(JTextField mon_tf_tag2){
    this.tf_tag_2 = mon_tf_tag2;
}
public void setTag3(JTextField mon_tf_tag3){
    this.tf_tag_3 = mon_tf_tag3;
}
public void setGenre1(JTextField mon_tf_genre1){
    this.tf_genre_1 = mon_tf_genre1;
}
public void setGenre2(JTextField mon_tf_genre2){
    this.tf_genre_2 = mon_tf_genre2;
}
public void setSaga(JTextField mon_tf_saga){
    this.tf_saga = mon_tf_saga;
}
public void setAward(JTextField mon_tf_award){
    this.tf_award = mon_tf_award;
}
public void setCeremonie(JTextField mon_tf_ceremonie){
    this.tf_ceremonie = mon_tf_ceremonie;
}
public void setAnneeCeremonie(JTextField mon_tf_annee_c){
    this.tf_annee_ceremonie = mon_tf_annee_c;
}
public void setSynop(JTextArea mon_tf_synop){
    this.tf_synop = mon_tf_synop;
}
public void setType(String mon_type){
    this.type = mon_type;
}

public void setListActeur(JList ma_list){
    this.list_acteurs = ma_list;
}
public JTextField getVisa(){
    return this.tf_visa;
}
public JTextField getTitre(){
    return this.tf_trailer;
}
public JTextField getAnnee(){
    return this.tf_annee;
}
public JTextField getRealisateur(){
    return this.tf_realisateur;
}
public JTextField getScenariste(){
    return this.tf_scenariste;
}
public JTextField getDuree(){
    return this.tf_duree;
}
public JTextField getTrailer(){
    return this.tf_trailer;
}
public JTextField getLien(){
    return this.tf_lien;
}
public JTextField getBudget(){
    return this.tf_budget;
}
public JTextField getTag1(){
    return this.tf_tag_1;
}
public JTextField getTag2(){
    return this.tf_tag_2;
}
public JTextField getTag3(){
    return this.tf_tag_3;
}
public JTextField getGenre1(){
    return this.tf_genre_1;
}
public JTextField getGenre2(){
    return this.tf_genre_2;
}
public JTextField getSaga(){
    return this.tf_saga;
}
/*
public JTextField getActeur1(){
    return this.tf_acteur_1;
}
/
public JTextField getActeur2(){
    return this.tf_acteur_2;
}
public JTextField getActeur3(){
    return this.tf_acteur_3;
}*/
public JTextField getAward(){
    return this.tf_award;
}
public JTextField getCeremonie(){
    return this.tf_ceremonie;
}
public JTextField getAnneeCeremonie(){
    return this.tf_annee_ceremonie;
}
public JTextArea getSynop(){
    return this.tf_synop;
}
public String getType(){
    return this.type;
}

public JList getListActeurs(){
    return this.list_acteurs;
}

public void resetListActeur(){
    System.out.println(this.list_acteurs.getModel().getSize());
    ListSelectionModel selmodel = this.list_acteurs.getSelectionModel();
    int index = selmodel.getMinSelectionIndex();
    if (index >= 0)
        this.list_acteurs.getModel();
    ((DefaultListModel) list_acteurs.getModel()).clear();
}

public void resetForm(){
    resetListActeur();
    this.tf_visa.setText("");
    this.tf_titre.setText("");
    this.tf_annee.setText("");
    this.tf_realisateur.setText("");
    this.tf_scenariste.setText("");
    this.tf_duree.setText("");
    this.tf_trailer.setText("");
    this.tf_lien.setText("");
    this.tf_budget.setText("");
    this.tf_tag_1.setText("");
    this.tf_tag_2.setText("");
    this.tf_tag_3.setText("");
    this.tf_genre_1.setText("");
    this.tf_genre_2.setText("");
    this.tf_saga.setText("");
    this.tf_award.setText("");
    this.tf_ceremonie.setText("");
    this.tf_annee_ceremonie.setText("");
    this.tf_synop.setText("");

}

public int recupInt(JTextField mon_tf){
    int id = 0;
    if (mon_tf.getText().equals(""))
    {
        id = 0;
    }
    else {
        id = Integer.parseInt(mon_tf.getText());}
    return id;
}

public C_FILM recupDonneesFilm(){
    
    mon_film.setSynop(this.tf_synop.getText());
    mon_film.setBudget(this.tf_budget.getText());
    mon_film.setSaga(this.tf_saga.getText());
    mon_film.setAnnee(this.recupInt(tf_annee));
    mon_film.setVisa(this.recupInt(tf_visa));
    mon_film.setDuree(this.recupInt(tf_duree));
    mon_film.setAsv(1);
    mon_film.setTitre(this.tf_titre.getText());
    mon_film.setType(type);
    mon_film.setCover("NULL");
    mon_film.setLien(this.tf_lien.getText());
    mon_film.setTrailer(this.tf_trailer.getText());
    mon_film.ma_ceremonie.setNom(this.tf_ceremonie.getText());
    mon_film.mon_award.setNom(this.tf_award.getText());
    mon_film.setAnneeAward(this.recupInt(tf_annee_ceremonie));

    return mon_film;
}


}