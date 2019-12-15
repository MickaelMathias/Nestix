package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class C_PAYS{
    int id;
    String nom;
    String flag;


    public C_PAYS(){

    }

    public C_PAYS(String pNom){
        this.nom = pNom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void recupId(){
        String ma_requete_id_pays = "";
        if (this.nom.equals("")){
            this.id = 0;
        }
        else{
            ma_requete_id_pays = "SELECT country_id FROM country WHERE country_name = \""+this.nom+"\"";
            this.id = Requete.requeteUniqueTexteInt(ma_requete_id_pays);}
        }

}