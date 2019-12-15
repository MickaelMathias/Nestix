package app;
import java.sql.SQLException;
import java.util.ArrayList;

public class C_CHANSON extends C_MEDIA{
    int annee, annee_award;
    String album;
    ArrayList<C_ARTISTE> mes_interpretes = new ArrayList<>();
    ArrayList<C_TAG> mes_tags = new ArrayList<>();
    ArrayList<C_GENRE> mes_genres = new ArrayList<>();
    C_CEREMONY ma_ceremonie = new C_CEREMONY();
    C_AWARD mon_award = new C_AWARD();
    C_PRODC mon_label = new C_PRODC();
    C_GROUPE mon_groupe = new C_GROUPE();

    public int getAnneeAward() {
        return annee_award;
    }

    public void setAnneeAward(int annee_award) {
        this.annee_award = annee_award;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public C_GROUPE getGroupe() {
        return mon_groupe;
    }

    public void setEditeur(C_GROUPE groupe) {
        this.mon_groupe = groupe;
    }

    public C_PRODC getEditeur() {
        return mon_label;
    }

    public void setEditeur(C_PRODC editeur) {
        this.mon_label = editeur;
    }

    public ArrayList<C_ARTISTE> getMes_interpretes() {
        return mes_interpretes;
    }

    public void setMes_interpretes(ArrayList<C_ARTISTE> mes_interpretes) {
        this.mes_interpretes = mes_interpretes;
    }

    public ArrayList<C_TAG> getMes_tags() {
        return mes_tags;
    }

    public void setMes_tags(ArrayList<C_TAG> mes_tags) {
        this.mes_tags = mes_tags;
    }

    public ArrayList<C_GENRE> getMes_genres() {
        return mes_genres;
    }

    public void setMes_genres(ArrayList<C_GENRE> mes_genres) {
        this.mes_genres = mes_genres;
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
    
    public void addInterprete(String nom){
    if (nom.equals("")){
        C_ARTISTE mon_interprete = new C_ARTISTE();
        mon_interprete.setNickname("NULL");
        mon_interprete.setId(0);
        this.mes_interpretes.add(mon_interprete);
    }
    else{
        C_ARTISTE mon_interprete = new C_ARTISTE();
        mon_interprete.setNickname(nom);
        mon_interprete.recupId();
        this.mes_interpretes.add(mon_interprete);}
    }
    
    public void removeInterprete(int index){
        this.mes_interpretes.remove(index);
    }

    public void addGenre(String nom){

    if (nom.equals("")){
        C_GENRE mon_genre = new C_GENRE();
        mon_genre.setNom("NULL");
        mon_genre.setId(0);
        this.mes_genres.add(mon_genre);
    }
    else{
        C_GENRE mon_genre = new C_GENRE();
        mon_genre.setNom(nom);
        mon_genre.recupId();
        this.mes_genres.add(mon_genre);}
    }
    
    public void addTag(String nom){
        if (nom.equals("")){
            C_TAG mon_tag = new C_TAG();
            mon_tag.setNom("NULL");
            mon_tag.setId(0);
            this.mes_tags.add(mon_tag);
        }
        else{
            C_TAG mon_tag = new C_TAG();
            mon_tag.setNom(nom);
            mon_tag.recupId();
            this.mes_tags.add(mon_tag);}
    }
    public void creation(int statut){
        super.creation(statut);
 
        String requete_creation_chanson = "INSERT INTO song (song_id, song_album, song_year) VALUES ("+this.id+","+verifNull(this.album)+","+verifNullInt(this.annee)+")";
        System.out.println(requete_creation_chanson);
        Requete.requeteInsert(requete_creation_chanson);
    }

    public void assoPersonnes(){
        C_METIER interprete = new C_METIER("Interprète");
        interprete.recupId(); // récupere ID METIER
        String requete_creation_interprete = "";

        for (int i = 0 ; i < mes_interpretes.size() ; i++){
            if (!mes_interpretes.get(i).getNickname().equals("")){
                mes_interpretes.get(i).recupId();
                if(!verifNullInt(mes_interpretes.get(i).getId()).equals("NULL")){
                    requete_creation_interprete = "INSERT INTO take_part_in (media_id, work_id, human_id) VALUES ("+this.id+","+interprete.getId()+","+verifNullInt(mes_interpretes.get(i).getId())+")";
                System.out.println(requete_creation_interprete);
                Requete.requeteInsert(requete_creation_interprete);}
            else {}

        }
    }
}


    public void assoGenre(){
        String requete_genre ="";

        for (int i = 0; i < mes_genres.size() ; i++){
        mes_genres.get(i).recupId();
        if(!verifNullInt(mes_genres.get(i).getId()).equals("NULL")){
        requete_genre = "INSERT INTO categorized_by (media_id, genre_id) VALUES ("+this.id+","+verifNullInt(mes_genres.get(i).getId())+")";
        System.out.println(requete_genre);
        Requete.requeteInsert(requete_genre);}}
        
    }


    public void assoTag(){
        for (int i = 0; i < mes_tags.size() ; i++){
            mes_tags.get(i).recupId();
            if(!verifNullInt(mes_tags.get(i).getId()).equals("NULL")){

        String requete_creation_tag_livre = "INSERT INTO is_associated_with (media_id, tag_id) VALUES ("+this.id+","+verifNullInt(mes_tags.get(i).getId())+")";
        System.out.println(requete_creation_tag_livre);
        Requete.requeteInsert(requete_creation_tag_livre);}}
    }


    public void assoCeremony(){
    this.mon_award.recupId();
    this.ma_ceremonie.recupId();

    if(!verifNullInt(this.mon_award.getId()).equals("NULL") && (!verifNullInt(this.ma_ceremonie.getId()).equals("NULL"))) {
    String requete_creation_award = "INSERT INTO competed_in (media_id, award_id, ceremony_id, year) VALUES ("+ this.id +","+ verifNullInt(this.mon_award.getId()) +","+ verifNullInt(this.ma_ceremonie.getId()) +","+verifNullInt(this.annee_award)+")";
    System.out.println(requete_creation_award);
    Requete.requeteInsert(requete_creation_award);}}


    public void assoEditeur(){
    this.mon_label.recupId();
        if(!verifNullInt(this.mon_label.getId()).equals("NULL")){
        String requete_creation_chanson_label = "INSERT INTO produced_by (media_id, pc_id) VALUES ("+this.id+","+verifNullInt(this.mon_label.getId())+")";
        System.out.println(requete_creation_chanson_label);
        Requete.requeteInsert(requete_creation_chanson_label);}
    }


}