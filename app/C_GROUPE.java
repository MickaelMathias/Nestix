package app;

import javax.swing.*;

public class C_GROUPE{

    int id;
    String nom;

    public C_GROUPE(){

    }

    public C_GROUPE(String pNom){
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
        String ma_requete_id_groupe = "";
        if (this.nom.equals("NULL")){
            this.id = 0;
        }
        else{
            ma_requete_id_groupe = "SELECT band_id FROM band WHERE band_name = \""+this.nom+"\"";
            this.id = Requete.requeteUniqueTexteInt(ma_requete_id_groupe);}
        }

}

    

