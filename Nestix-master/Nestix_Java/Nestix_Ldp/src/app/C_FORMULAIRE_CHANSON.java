package app;

import javax.swing.*;

public class C_FORMULAIRE_CHANSON{
    
    private JTextField tf_titre, tf_annee, tf_groupe, tf_album, tf_lien;
    private JTextField tf_tag_1, tf_tag_2, tf_tag_3, tf_genre_1, tf_genre_2;
    private JTextField tf_award, tf_ceremonie, tf_annee_ceremonie, tf_label;
    private String type;
    private JTextArea tf_synop;
    private C_CHANSON ma_chanson = new C_CHANSON();
    private JList list_interprete;
    
    public C_CHANSON getChanson(){
        return this.ma_chanson;
    }

    public JTextField getTf_titre() {
        return tf_titre;
    }

    public void setTf_titre(JTextField tf_titre) {
        this.tf_titre = tf_titre;
    }

    public JTextField getTf_annee() {
        return tf_annee;
    }

    public void setTf_label(JTextField tf_label) {
        this.tf_label = tf_label;
    }

    public JTextField getTf_label() {
        return tf_label;
    }

    public void setTf_annee(JTextField tf_annee) {
        this.tf_annee = tf_annee;
    }

    public JTextField getTf_groupe() {
        return tf_groupe;
    }

    public void setTf_groupe(JTextField tf_groupe) {
        this.tf_groupe = tf_groupe;
    }

    public JTextField getTf_album() {
        return tf_album;
    }

    public void setTf_album(JTextField tf_album) {
        this.tf_album = tf_album;
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

    public C_CHANSON getMa_chanson() {
        return ma_chanson;
    }

    public void setMa_chanson(C_CHANSON ma_chanson) {
        this.ma_chanson = ma_chanson;
    }

    public JList getList_interprete() {
        return list_interprete;
    }

    public void setList_interprete(JList list_interprete) {
        this.list_interprete = list_interprete;
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

    public C_CHANSON recupDonneesChanson(){
    
        ma_chanson.setTitre(this.tf_titre.getText());
        ma_chanson.setAnnee(this.recupInt(tf_annee));
        ma_chanson.mon_groupe.setNom(this.tf_groupe.getText());
        ma_chanson.setAlbum(this.tf_album.getText());
        ma_chanson.setLien(this.tf_lien.getText());
        ma_chanson.setTitre(this.tf_titre.getText());
        ma_chanson.mon_label.setNom(this.tf_label.getText());
        ma_chanson.setAsv(1);
        ma_chanson.setType(type);
        ma_chanson.setCover("NULL");
        ma_chanson.ma_ceremonie.setNom(this.tf_ceremonie.getText());
        ma_chanson.mon_award.setNom(this.tf_award.getText());
        ma_chanson.setAnneeAward(this.recupInt(tf_annee_ceremonie));

    
        return ma_chanson;
    }


}
