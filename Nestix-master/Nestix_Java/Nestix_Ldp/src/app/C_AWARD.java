package app;

public class C_AWARD {
    int id;
    String nom;

    public C_AWARD(){

    }

    public C_AWARD(String pNom){
        this.nom = pNom;
    }
    public void setId(int pId){
        this.id = pId;
    }

    public void setNom(String pNom){
        if (pNom.equals("")){
            this.nom = "NULL";
        }
        else{
        this.nom = pNom;}
    }

    public int getId(){
        return this.id;
    }

    public String getNom(){
        return this.nom;
    }
    public void recupId(){
        String ma_requete_id_award = "";
        if (this.nom.equals("NULL")){
            this.id = 0;
        }
        else{
            ma_requete_id_award = "SELECT award_id FROM award WHERE award_name = \""+this.nom+"\"";
            this.id = Requete.requeteUniqueTexteInt(ma_requete_id_award);}
        }

}