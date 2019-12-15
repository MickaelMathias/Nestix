package app;
import java.sql.SQLException;
import java.util.ArrayList;

public class C_LIVRE extends C_MEDIA{
    int ISBN, annee, tome, annee_award;
    String synop, saga;
    ArrayList<C_ARTISTE> mes_ecrivains = new ArrayList<>();
    ArrayList<C_TAG> mes_tags = new ArrayList<>();
    ArrayList<C_GENRE> mes_genres = new ArrayList<>();
    C_CEREMONY ma_ceremonie = new C_CEREMONY();
    C_AWARD mon_award = new C_AWARD();
    C_PRODC mon_editeur = new C_PRODC();

    @Override
    public String toString() {
        return "C_LIVRE{" + "ISBN=" + this.getISBN() + ", annee=" + this.getAnnee() + ", tome=" + this.getTome() + ", annee_award=" + this.getAnneeAward() + ", synop=" + this.getSynop() + ", saga=" + this.getSaga() + ", editeur=" + this.getEditeur() + ", mes_ecrivains=" + mes_ecrivains.get(0).getNom() + ", mes_tags=" + mes_tags.get(0).getNom() + ", mes_genres=" + mes_genres.get(0).getNom() + ", ma_ceremonie=" + ma_ceremonie.getNom() + ", mon_award=" + mon_award.getNom() + '}';
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getTome() {
        return tome;
    }

    public void setTome(int tome) {
        this.tome = tome;
    }

    public String getSynop() {
        return synop;
    }

    public void setSynop(String synop) {
        this.synop = synop;
    }

    public String getSaga() {
        return saga;
    }

    public void setSaga(String saga) {
        this.saga = saga;
    }

    public C_PRODC getEditeur() {
        return mon_editeur;
    }

    public void setEditeur(C_PRODC editeur) {
        this.mon_editeur = editeur;
    }

    public ArrayList<C_ARTISTE> getMes_ecrivains() {
        return mes_ecrivains;
    }

    public void setMes_ecrivains(ArrayList<C_ARTISTE> mes_ecrivains) {
        this.mes_ecrivains = mes_ecrivains;
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

    public void setAnneeAward(int pAnnee){
        this.annee_award = pAnnee;
    }

    public int getAnneeAward(){
        return this.annee_award;
    }

    public void addEcrivain(String nom){
    if (nom.equals("")){
        C_ARTISTE mon_ecrivain = new C_ARTISTE();
        mon_ecrivain.setNom("NULL");
        mon_ecrivain.setId(0);
        this.mes_ecrivains.add(mon_ecrivain);
    }
    else{
        C_ARTISTE mon_ecrivain = new C_ARTISTE();
        mon_ecrivain.setNom(nom);
        mon_ecrivain.recupId(nom);
        this.mes_ecrivains.add(mon_ecrivain);}
    }

    public void removeEcrivain(int index){
        this.mes_ecrivains.remove(index);
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
        String requete_creation_livre =" INSERT INTO book (book_id, ISBN, book_synop, book_release, book_tome, book_saga) VALUES ("
        +this.id+","+verifNullInt(this.ISBN)+","+verifNull(this.synop)+","+verifNullInt(this.annee)+","+verifNullInt(this.tome)+","+verifNull(this.saga)+")";
        System.out.println(requete_creation_livre);
        Requete.requeteInsert(requete_creation_livre);
    }

    public void assoPersonnes(){
        C_METIER ecrivain = new C_METIER("Ecrivain");
        ecrivain.recupId(); // récupere ID METIER
        String requete_creation_ecrivain = "";

        for (int i = 0 ; i < mes_ecrivains.size() ; i++){
            if (!mes_ecrivains.get(i).getNom().equals("")){
                mes_ecrivains.get(i).recupId(mes_ecrivains.get(i).getNom());
                if(!verifNullInt(mes_ecrivains.get(i).getId()).equals("NULL")){
                    requete_creation_ecrivain = "INSERT INTO take_part_in (media_id, work_id, human_id) VALUES ("+this.id+","+ecrivain.getId()+","+verifNullInt(mes_ecrivains.get(i).getId())+")";
                System.out.println(requete_creation_ecrivain);
                Requete.requeteInsert(requete_creation_ecrivain);}}
            else {}

        }
    }


    public void assoGenre(){
        String requete_genre ="";

        for (int i = 0; i < mes_genres.size() ; i++){
        mes_genres.get(i).recupId();
        if(!verifNullInt(mes_genres.get(i).getId()).equals("NULL")){
        requete_genre = "INSERT INTO categorized_by (media_id, genre_id) VALUES ("+this.id+","+verifNullInt(mes_genres.get(i).getId())+")";
        System.out.println(requete_genre);
        Requete.requeteInsert(requete_genre);}
        }
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
    this.mon_editeur.recupId();
        if(!verifNullInt(this.mon_editeur.getId()).equals("NULL")){
        String requete_creation_livre_editeur = "INSERT INTO produced_by (media_id, pc_id) VALUES ("+this.id+","+verifNullInt(this.mon_editeur.getId())+")";
        System.out.println(requete_creation_livre_editeur);
        Requete.requeteInsert(requete_creation_livre_editeur);}
    }


}