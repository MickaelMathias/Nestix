package app;

import javax.swing.*;

public class C_FORMULAIRE_LIVRE{

private JTextField tf_isbn, tf_titre, tf_tome, tf_saga, tf_annee, tf_editeur;
private JTextField tf_lien, tf_tag_1, tf_tag_2, tf_tag_3, tf_genre_1, tf_genre_2;
private JTextField tf_award, tf_ceremonie, tf_annee_ceremonie;
private String type;
private JTextArea tf_synop;
private C_LIVRE mon_livre = new C_LIVRE();
private JList list_ecrivains;

public C_LIVRE getLivre(){
    return this.mon_livre;
}

    public JTextField getTf_isbn() {
        return tf_isbn;
    }

    public void setTf_isbn(JTextField tf_isbn) {
        this.tf_isbn = tf_isbn;
    }

    public JTextField getTf_titre() {
        return tf_titre;
    }

    public void setTf_titre(JTextField tf_titre) {
        this.tf_titre = tf_titre;
    }

    public JTextField getTf_tome() {
        return tf_tome;
    }

    public void setTf_tome(JTextField tf_tome) {
        this.tf_tome = tf_tome;
    }

    public JTextField getTf_saga() {
        return tf_saga;
    }

    public void setTf_saga(JTextField tf_saga) {
        this.tf_saga = tf_saga;
    }

    public JTextField getTf_annee() {
        return tf_annee;
    }

    public void setTf_annee(JTextField tf_annee) {
        this.tf_annee = tf_annee;
    }

    public JTextField getTf_editeur() {
        return tf_editeur;
    }

    public void setTf_editeur(JTextField tf_editeur) {
        this.tf_editeur = tf_editeur;
    }

    public JTextField getTf_lien() {
        return tf_lien;
    }

    public void setTf_lien(JTextField tf_lien) {
        this.tf_lien = tf_lien;
    }

    public JTextField getTf_tag_1() {
        return tf_tag_1;
    }

    public void setTf_tag_1(JTextField tf_tag_1) {
        this.tf_tag_1 = tf_tag_1;
    }

    public JTextField getTf_tag_2() {
        return tf_tag_2;
    }

    public void setTf_tag_2(JTextField tf_tag_2) {
        this.tf_tag_2 = tf_tag_2;
    }

    public JTextField getTf_tag_3() {
        return tf_tag_3;
    }

    public void setTf_tag_3(JTextField tf_tag_3) {
        this.tf_tag_3 = tf_tag_3;
    }

    public JTextField getTf_genre_1() {
        return tf_genre_1;
    }

    public void setTf_genre_1(JTextField tf_genre_1) {
        this.tf_genre_1 = tf_genre_1;
    }

    public JTextField getTf_genre_2() {
        return tf_genre_2;
    }

    public void setTf_genre_2(JTextField tf_genre_2) {
        this.tf_genre_2 = tf_genre_2;
    }

    public JTextField getTf_award() {
        return tf_award;
    }

    public void setTf_award(JTextField tf_award) {
        this.tf_award = tf_award;
    }

    public JTextField getTf_ceremonie() {
        return tf_ceremonie;
    }

    public void setTf_ceremonie(JTextField tf_ceremonie) {
        this.tf_ceremonie = tf_ceremonie;
    }

    public JTextField getTf_annee_ceremonie() {
        return tf_annee_ceremonie;
    }

    public void setTf_annee_ceremonie(JTextField tf_annee_ceremonie) {
        this.tf_annee_ceremonie = tf_annee_ceremonie;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JTextArea getTf_synop() {
        return tf_synop;
    }

    public void setTf_synop(JTextArea tf_synop) {
        this.tf_synop = tf_synop;
    }

    public C_LIVRE getMon_livre() {
        return mon_livre;
    }

    public void setMon_livre(C_LIVRE mon_livre) {
        this.mon_livre = mon_livre;
    }

    public JList getList_ecrivains() {
        return list_ecrivains;
    }

    public void setList_ecrivains(JList list_ecrivains) {
        this.list_ecrivains = list_ecrivains;
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

    public C_LIVRE recupDonneesLivre(){
    
        mon_livre.setISBN(this.recupInt(tf_isbn));
        mon_livre.setAnnee(this.recupInt(tf_annee));
        mon_livre.setTome(this.recupInt(tf_tome));
        mon_livre.setSynop(this.tf_synop.getText());
        mon_livre.setSaga(this.tf_saga.getText());
        mon_livre.setTitre(this.tf_titre.getText());
        mon_livre.mon_editeur.setNom(this.tf_editeur.getText());
        mon_livre.setSynop(this.tf_synop.getText());
        mon_livre.setAsv(1);
        mon_livre.setType(type);
        mon_livre.setCover("NULL");
        mon_livre.ma_ceremonie.setNom(this.tf_ceremonie.getText());
        mon_livre.mon_award.setNom(this.tf_award.getText());
        mon_livre.setAnneeAward(this.recupInt(tf_annee_ceremonie));

        mon_livre.setLien(this.tf_lien.getText());
    
        return mon_livre;
    }


}