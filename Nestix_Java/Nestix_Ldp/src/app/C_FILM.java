package app;
import java.sql.SQLException;
import java.util.ArrayList;

public class C_FILM extends C_MEDIA{
    String synop, budget, saga, trailer;
    ArrayList <C_ARTISTE> mes_acteurs = new ArrayList<>(); 
    ArrayList <C_ARTISTE> mes_scenaristes = new ArrayList<>(); 
    ArrayList <C_ARTISTE> mes_realisateurs = new ArrayList<>(); 
    ArrayList <C_GENRE> mes_genres = new ArrayList<>(); 
    ArrayList <C_TAG> mes_tags = new ArrayList<>(); 
    C_CEREMONY ma_ceremonie = new C_CEREMONY();
    C_AWARD mon_award = new C_AWARD();

    int annee, visa, duree, annee_award;

    @Override
    public String toString() {
        return "C_FILM{" + "synop=" + synop + ", budget=" + budget + ", saga=" + saga + ", id=" + id + ", annee=" + annee + ", visa=" + visa + ", duree=" + duree + '}';
    }

    public void setSynop(String pSynop){
        this.synop = pSynop; 
    }
    public void setBudget(String pBudget){
        this.budget = pBudget;
    }
    public void setSaga(String pSaga){
        this.saga = pSaga;
    }
    public void setAnnee(int pAnnee){
        this.annee = pAnnee;
    }
    public void setVisa(int pVisa){
        this.visa = pVisa;
    }
    public void setDuree(int pDuree){
        this.duree = pDuree;
    }
    public void setAnneeAward(int pAnnee){
        this.annee_award = pAnnee;
    }
    public void setTrailer(String pTrailer){
        this.trailer = pTrailer;
    }
    
    public String getSynop(){
        return this.synop;
    }
    public String getBudget(){
        return this.budget;
    }
    public String getSaga(){
        return this.saga;
    }
    public int getAnnee(){
        return this.annee;
    }
    public int getVisa(){
        return this.visa;
    }
    public int getDuree(){
        return this.duree;
    }
    public int getAnneeAward(){
        return this.annee_award;
    }
    public String getTrailer(){
        return this.trailer;
    }


    public void addActeur(String nom){
        C_ARTISTE mon_acteur = new C_ARTISTE();
        mon_acteur.setNickname(nom);
        mon_acteur.getId();
        this.mes_acteurs.add(mon_acteur);
    }

    public void removeActeur(int index){
        this.mes_acteurs.remove(index);
    }

    public void addRealisateur(String nom){
        if (nom.equals("")){
            C_ARTISTE mon_realisateur = new C_ARTISTE();
            mon_realisateur.setNickname("NULL");
            mon_realisateur.setId(0);
            this.mes_realisateurs.add(mon_realisateur);
        }
        else{
        C_ARTISTE mon_realisateur = new C_ARTISTE();
        mon_realisateur.setNickname(nom);
        mon_realisateur.recupId();
        this.mes_realisateurs.add(mon_realisateur);}
    }

    public void addScenariste(String nom){
        if (nom.equals("")){
            C_ARTISTE mon_scenariste = new C_ARTISTE();
            mon_scenariste.setNickname("NULL");
            mon_scenariste.setId(0);
            this.mes_scenaristes.add(mon_scenariste);
        }
        else{
        C_ARTISTE mon_scenariste = new C_ARTISTE();
        mon_scenariste.setNickname(nom);
        mon_scenariste.recupId();
        this.mes_scenaristes.add(mon_scenariste);}
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
    

    public void supprActeur(C_ARTISTE mon_acteur){
        // TODO
    }


    public void creation(int statut){
        // Réalise creation media + creation movie
        super.creation(statut);
        String requete_creation_film_2 = "INSERT INTO movie (visa, movie_year, movie_runtime, movie_trailer, movie_synop, movie_budget, movie_saga, movie_id) VALUES ("
        +verifNullInt(this.visa)+","+verifNullInt(this.annee)+","+verifNullInt(this.duree)+","+verifNull(this.trailer)+","+verifNull(this.synop)+","+verifNull(this.budget)+","+verifNull(this.saga)+","+this.id+")"; 
        System.out.println(requete_creation_film_2);
        Requete.requeteInsert(requete_creation_film_2);
    }

    public void assoPersonnes(){
        C_METIER real = new C_METIER("Réalisateur");
        real.recupId(); // récupere ID METIER
        C_METIER acteur = new C_METIER("Acteur");
        acteur.recupId();
        C_METIER scena = new C_METIER("Scénariste");
        scena.recupId();
        String requete_creation_real = "";
        String requete_creation_scenariste = "";

        if(!verifNullInt(mes_realisateurs.get(0).getId()).equals("NULL")){ 
            requete_creation_real = "INSERT INTO take_part_in (media_id, work_id, human_id) VALUES ("+this.id+","+real.getId()+","+ verifNullInt(mes_realisateurs.get(0).getId())+")";
            System.out.println(requete_creation_real);
           Requete.requeteInsert(requete_creation_real);

        }
        if(!verifNullInt(mes_scenaristes.get(0).getId()).equals("NULL")){ 
            requete_creation_scenariste = "INSERT INTO take_part_in (media_id, work_id, human_id) VALUES ("+this.id+","+scena.getId()+","+verifNullInt(mes_scenaristes.get(0).getId())+")";
            System.out.println(requete_creation_scenariste);
            Requete.requeteInsert(requete_creation_scenariste);
        }


        for (int i = 0 ; i < mes_acteurs.size() ; i++){
            if (!mes_acteurs.get(i).getNickname().equals("")){
                mes_acteurs.get(i).recupId();
                if(!verifNullInt(mes_acteurs.get(i).getId()).equals("NULL")){
                String requete_creation_acteur = "INSERT INTO take_part_in (media_id, work_id, human_id) VALUES ("+this.id+","+acteur.getId()+","+verifNullInt(mes_acteurs.get(i).getId())+")";
                System.out.println(requete_creation_acteur);
                Requete.requeteInsert(requete_creation_acteur);}}
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
            String requete_creation_film_4 = "INSERT INTO is_associated_with (media_id, tag_id) VALUES ("+this.id+","+verifNullInt(mes_tags.get(i).getId())+")";
            System.out.println(requete_creation_film_4);
            Requete.requeteInsert(requete_creation_film_4);}}
    }

    public void assoCeremony(){
        this.mon_award.recupId();
        this.ma_ceremonie.recupId();

        if(!verifNullInt(this.mon_award.getId()).equals("NULL") && (!verifNullInt(this.ma_ceremonie.getId()).equals("NULL"))) {
        String requete_creation_film_6 = "INSERT INTO competed_in (media_id, award_id, ceremony_id, year) VALUES ("+ this.id +","+ verifNullInt(this.mon_award.getId()) +","+ verifNullInt(this.ma_ceremonie.getId()) +","+verifNullInt(this.annee_award)+")";
        System.out.println(requete_creation_film_6);
        Requete.requeteInsert(requete_creation_film_6);}
    }

    
    public C_FILM recupFilmParId(int id) throws SQLException{
        C_FILM mon_film = new C_FILM();
        mon_film.setId(id);
        //Requete.rechercheInfosMedias(id);
        



        return mon_film;
    }

}