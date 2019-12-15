package app;

public class C_GENRE {
    int id;
    String nom;

    public C_GENRE(){

    }

    public C_GENRE(String pNom){
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
    public String verifNull(String value){
        if (value.equals("") || value.equals(null)){
            value =  "NULL";
        }
        else{
            value = "'"+value+"'";
        }
        return value;
    }
    public void recupId(){
        String ma_requete_id_genre = "";
        if (this.nom.equals("NULL")){
            this.id = 0;
        }
        else{
        ma_requete_id_genre = "SELECT genre_id FROM genre WHERE genre_name = \""+this.nom+"\"";
        this.id = Requete.requeteUniqueTexteInt(ma_requete_id_genre);}
        }
    
    
}