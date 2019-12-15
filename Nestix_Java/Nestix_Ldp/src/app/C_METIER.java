package app;

public class C_METIER{
    int id;
    String nom;

    public C_METIER(){

    }

    public C_METIER(String pNom){
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
        String ma_requete_id_metier = "";
        if (this.nom.equals("NULL")){
            this.id = 0;
        }
        else{
            ma_requete_id_metier = "SELECT work_id FROM work WHERE work_name = \""+this.nom+"\"";
            this.id = Requete.requeteUniqueTexteInt(ma_requete_id_metier);}
        }
}