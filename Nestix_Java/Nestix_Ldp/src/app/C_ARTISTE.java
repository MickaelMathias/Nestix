package app;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class C_ARTISTE extends C_HUMAN{
    String nickname, dod;
    C_GROUPE groupe = new C_GROUPE();
    ArrayList <C_METIER> metiers = new ArrayList<>();
    C_PAYS pays = new C_PAYS();
    C_CEREMONY ma_ceremonie = new C_CEREMONY();
    C_AWARD mon_award = new C_AWARD();
    int annee_award;


/*
    public void addMetier(String pMetier){
        C_METIER mon_metier = new C_METIER(pMetier);
        mon_metier.recupId();
        if (mon_metier.getId() == -1){
            System.out.println("PROBLEME ID - 1");
        }
        else{
            metiers.add(mon_metier);
        }
    }*/
    public int getAnneeAward() {
        return annee_award;
    }

    public void setAnneeAward(int annee_award) {
        this.annee_award = annee_award;
    }

    public String getDod() {
        return dod;
    }

    public void setDod(String dod) {
        this.dod = dod;
    }

    public C_PAYS getPays(){
        return this.pays;
    }

    public void setPays(C_PAYS pays){
        this.pays = pays;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public C_GROUPE getGroupe() {
        return groupe;
    }

    public void setGroupe(C_GROUPE groupe) {
        this.groupe = groupe;
    }

    public ArrayList<C_METIER> getMetiers() {
        return metiers;
    }

    public void setMetiers(ArrayList<C_METIER> metiers) {
        this.metiers = metiers;
    }

    public String verifNickname(String nickname){
        if (this.nickname.equals("")){
            if (this.first_name.equals("")){
                this.nickname = this.last_name;}
            else if(this.last_name.equals("")){
                this.nickname = this.first_name;
            }
            else{
                this.nickname = "NULL";
            }
        }
        else {
            this.nickname = "";
        }
        return this.nickname;
    }
    public void creation(int statut){
        super.creation(statut);
 
        
        String requete_creation_chanson = "INSERT INTO artist (human_id, artist_dod, artist_nickname, asv_id) VALUES ("+this.id+","+verifNull(verifDate(this.getDod()))+","+verifNull(verifNickname(this.getNickname()))+",1)";
        System.out.println(requete_creation_chanson);
        Requete.requeteInsert(requete_creation_chanson);
    }

    public void recupId(){
        String ma_requete_id_genre = "";
        if (this.nickname.equals("NULL")){
            this.id = 0;
        }
        else{
        ma_requete_id_genre = "SELECT human_id FROM artist WHERE artist_nickname = \""+this.nickname+"\"";
        this.id = Requete.requeteUniqueTexteInt(ma_requete_id_genre);}
        }
    public boolean verifNicknameVide(){
        if (this.last_name.equals("") && this.first_name.equals("") && this.nickname.equals("")){
            JOptionPane.showMessageDialog(maFrame.getL_creation(), "Le surnom est obligatoire. Vous pouvez le rentrer manuellement ou le programme en créera un automatiquement avec le nom et prénom.");
            return true;
        }
        else return false;
    }
    public void assoCeremony(){
        this.mon_award.recupId();
        this.ma_ceremonie.recupId();

        if(!verifNullInt(this.mon_award.getId()).equals("NULL") && (!verifNullInt(this.ma_ceremonie.getId()).equals("NULL"))) {
        String requete_creation_award_artiste = "INSERT INTO competed_in (media_id, award_id, ceremony_id, year) VALUES ("+ this.id +","+ verifNullInt(this.mon_award.getId()) +","+ verifNullInt(this.ma_ceremonie.getId()) +","+verifNullInt(this.annee_award)+")";
        System.out.println(requete_creation_award_artiste);
        Requete.requeteInsert(requete_creation_award_artiste);}
    
}

    public void assoGroupe(){
        this.groupe.recupId();
        if(!verifNullInt(this.groupe.getId()).equals("NULL")){
            String requete_creation_groupe_artiste = "INSERT INTO composed_by (human_id, band_id) VALUES ("+this.id+","+ verifNullInt(this.groupe.getId())+")";
            System.out.println(requete_creation_groupe_artiste);
            Requete.requeteInsert(requete_creation_groupe_artiste);}

    }

    public void assoPays(){
        this.pays.recupId();
        if(!verifNullInt(this.pays.getId()).equals("NULL")){
            String requete_creation_pays_artiste = "INSERT INTO come_from (human_id, country_id) VALUES ("+this.id+","+ verifNullInt(this.pays.getId())+")";
            System.out.println(requete_creation_pays_artiste);
            Requete.requeteInsert(requete_creation_pays_artiste);}
    }
}
