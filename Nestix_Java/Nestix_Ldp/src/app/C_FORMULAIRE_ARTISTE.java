package app;

import javax.swing.*;

public class C_FORMULAIRE_ARTISTE{

private JTextField tf_nom, tf_prenom, tf_dob, tf_dod, tf_pays, tf_nickname, tf_groupe, tf_ceremonie, tf_award, tf_annee_award ;
private String type;
private JComboBox cb_sexe;
private C_ARTISTE mon_artiste = new C_ARTISTE();
C_CEREMONY ma_ceremonie = new C_CEREMONY();
C_AWARD mon_award = new C_AWARD();
private JList list_metiers;

public C_ARTISTE getArtiste(){
    return this.mon_artiste;
}

    public JTextField getTf_nom() {
        return tf_nom;
    }

    public void setTf_nom(JTextField tf_nom) {
        this.tf_nom = tf_nom;
    }

    public JTextField getTf_prenom() {
        return tf_prenom;
    }

    public void setTf_prenom(JTextField tf_prenom) {
        this.tf_prenom = tf_prenom;
    }

    public JTextField getTf_dob() {
        return tf_dob;
    }

    public void setTf_dob(JTextField tf_dob) {
        this.tf_dob = tf_dob;
    }

    public JTextField getTf_dod() {
        return tf_dod;
    }

    public void setTf_dod(JTextField tf_dod) {
        this.tf_dod = tf_dod;
    }

    public JTextField getTf_pays() {
        return tf_pays;
    }

    public void setTf_pays(JTextField tf_pays) {
        this.tf_pays = tf_pays;
    }

    public JTextField getTf_nickname() {
        return tf_nickname;
    }

    public void setTf_nickname(JTextField tf_nickname) {
        this.tf_nickname = tf_nickname;
    }

    public JTextField getTf_groupe() {
        return tf_groupe;
    }

    public void setTf_ceremonie(JTextField tf_ceremonie) {
        this.tf_ceremonie = tf_ceremonie;
    }

    public JTextField getTf_ceremonie() {
        return tf_ceremonie;
    }
    public void setTf_annee_award(JTextField tf_annee_ceremonie) {
        this.tf_annee_award = tf_annee_ceremonie;
    }

    public JTextField getTf_annee_ceremonie() {
        return tf_annee_award;
    }

    public void setTf_award(JTextField tf_award) {
        this.tf_award = tf_award;
    }

    public JTextField getTf_award() {
        return tf_award;
    }

    public void setTf_groupe(JTextField tf_groupe) {
        this.tf_groupe = tf_groupe;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public JComboBox getCb_sexe() {
        return cb_sexe;
    }

    public void setCb_sexe(JComboBox cb_sexe) {
        this.cb_sexe = cb_sexe;
    }

    public C_ARTISTE getMon_artiste() {
        return mon_artiste;
    }

    public void setMon_artiste(C_ARTISTE mon_artiste) {
        this.mon_artiste = mon_artiste;
    }

    public C_CEREMONY getMa_ceremonie() {
        return ma_ceremonie;
    }

    public void setMa_ceremonie(C_CEREMONY ma_ceremonie) {
        this.ma_ceremonie = ma_ceremonie;
    }

    public C_AWARD getMon_award() {
        return mon_award;
    }

    public void setMon_award(C_AWARD mon_award) {
        this.mon_award = mon_award;
    }

    public JList getList_metiers() {
        return list_metiers;
    }

    public void setList_metiers(JList list_acteurs) {
        this.list_metiers = list_acteurs;
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

    public C_ARTISTE recupDonneesArtiste(){
    
        mon_artiste.setSexe(this.cb_sexe.getSelectedItem().toString());
        mon_artiste.setLast_name(this.tf_nom.getText());
        mon_artiste.setFirst_name(this.tf_prenom.getText());
        mon_artiste.setDob(this.tf_dob.getText());
        mon_artiste.setDod(this.tf_dod.getText());
        mon_artiste.pays.setNom(this.tf_pays.getText());
        mon_artiste.setNickname(this.tf_nickname.getText());
        mon_artiste.groupe.setNom(this.tf_groupe.getText());
        mon_artiste.ma_ceremonie.setNom(this.tf_ceremonie.getText());
        mon_artiste.mon_award.setNom(this.tf_award.getText());
        mon_artiste.setAnneeAward(this.recupInt(tf_annee_award));
        //mon_artiste.setAsv(1);
        mon_artiste.setCover("NULL");

        return mon_artiste;
    }

}