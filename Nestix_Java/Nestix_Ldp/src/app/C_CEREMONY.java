package app;

public class C_CEREMONY {
    int id;
    String nom;

    public C_CEREMONY(){

    }

    public C_CEREMONY(String pNom){
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

        String ma_requete_id_ceremony = "";
        if (this.nom.equals("NULL")){
            this.id = 0;
        }
        else{
            ma_requete_id_ceremony = "SELECT ceremony_id FROM ceremony WHERE ceremony_name = \""+this.nom+"\"";
        this.id = Requete.requeteUniqueTexteInt(ma_requete_id_ceremony);}
        }
}
