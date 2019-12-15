package app;
import java.sql.SQLException;
import java.util.ArrayList;

public class C_PRODC {
    int id;
    String nom;

    public void setId(int pId){
        this.id = pId;
    }
    public int getId(){
        return this.id;
    }
    public void setNom(String pNom){
        if (pNom.equals("")){
            this.nom = "NULL";
        }
        else{
        this.nom = pNom;}
    }
    public String getNom(){
        return this.nom;
    }

    public void recupId(){
    String ma_requete_id_pc = "";
    if (this.nom.equals("NULL")){
        this.id = 0;
    }
    else{
        ma_requete_id_pc = "SELECT pc_id FROM production_company WHERE pc_name = \""+this.nom+"\"";
        this.id = Requete.requeteUniqueTexteInt(ma_requete_id_pc);}
    }
}