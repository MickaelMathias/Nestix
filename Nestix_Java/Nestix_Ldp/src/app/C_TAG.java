package app;

public class C_TAG {
    int id;
    String nom;

    public C_TAG(){

    }

    public C_TAG(String pNom){
        this.nom = pNom;
    }
    public void setId(int pId){
        this.id = pId;
    }

    public void setNom(String pNom){
        this.nom = pNom;
    }

    public int getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }

    public void recupId(){
        String ma_requete_id_tag = "";
        if (this.nom.equals("NULL")){
            this.id = 0;
        }
        else{
            ma_requete_id_tag = "SELECT tag_id FROM tag WHERE tag_name = \""+this.nom+"\"";
        this.id = Requete.requeteUniqueTexteInt(ma_requete_id_tag);}
        }
}