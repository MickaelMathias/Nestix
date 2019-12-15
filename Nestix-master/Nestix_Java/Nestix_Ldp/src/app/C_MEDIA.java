package app;

public class C_MEDIA{
    int asv, id;
    String titre, type, cover, lien;

    public int getId(){
        return this.id;
    }
    public void setId(int pId){
        this.id = pId;
    }
    public int getAsv() {
        return asv;
    }
    public void setAsv(int asv) {
        this.asv = asv;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public String getCover() {
        return cover;
    }
    public void setCover(String cover) {
        this.cover = cover;
    }
    public String getLien() {
        return lien;
    }
    public void setLien(String lien) {
        this.lien = lien;
    }
    public String verifNull(String value){
        if (value.equals("") || value.equals(null)){
            value =  "NULL";
        }
        else{
            value = "'"+value+"'";
        }
        return value;
    }

    public String verifNullInt(int value){
        String value_retour;
        if (value == 0){
            value_retour = "NULL";
        }
        else{
            value_retour = value+"";
        }
        return value_retour;
    }

    @Override
    public String toString() {
        return "C_MEDIA{ asv=" + asv + ", titre=" + titre + ", type=" + type + ", cover=" + cover + ", lien=" + lien + '}';
    }

    public void creation(int statut){
        String requete_creation_media = "";
        requete_creation_media = "INSERT INTO media (media_title, media_type,media_cover,media_link) VALUES ("+verifNull(this.getTitre())+","+verifNull(this.getType())+",NULL,"+verifNull(this.getLien())+")";
        System.out.println(requete_creation_media);
        Requete.requeteInsert(requete_creation_media);
        String requete_recup_id = "SELECT media_id FROM media ORDER BY media_id DESC LIMIT 1";
        System.out.println(requete_recup_id);
        this.id = Requete.requeteUniqueTexteInt(requete_recup_id);
        String requete_current_time = "SELECT CURRENT_DATE";
        String date_courante = Requete.requeteUniqueTexteString(requete_current_time);
        String requete_asv = "INSERT INTO status (media_id, asv_id, asv_date_creat, asv_date_modif) VALUES ("+this.id+","+statut+",'"+date_courante+"','"+date_courante+"')";
        System.out.println(requete_asv);
        Requete.requeteInsert(requete_asv);
 
    }

    public void suppression(int mon_id) {
        //Suppression des relations de media et movie/book/song
        String relations[] = {"produced_by", "competed_in", "is_associated_with", "categorized_by", "status", "appreciation", "contains", "take_part_in", "associated_with"};
        
        for (int i=0; i<relations.length; i++) {
        	String requete_suppr="DELETE FROM `"+relations[i]+"` WHERE `"+relations[i]+"`.`media_id` ="+mon_id;
        	Requete.requeteInsert(requete_suppr);
        }
        
        //Suppression de movie/book/song
        String types_de_media[] = {"movie", "book", "song"};
        
        for (int i=0; i<types_de_media.length; i++) {
        	String requete_suppr="DELETE FROM `"+types_de_media[i]+"` WHERE `"+types_de_media[i]+"`.`"+types_de_media[i]+"_id` ="+mon_id;
        	Requete.requeteInsert(requete_suppr);
        }
        
        //Suppression finale du média
        String requete_suppr_media = "DELETE FROM `media` WHERE `media`.`media_id` ="+mon_id;
        Requete.requeteInsert(requete_suppr_media);
        System.out.println("Suppression réussie");
    }

}