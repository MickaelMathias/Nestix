package app;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class C_HUMAN{
    int id;
    String last_name, first_name, cover, sexe, dob;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }
    
    
    public static String verifDate(String text) {
        if (text.equals("") || !text.matches("\\d{4}-[01]\\d-[0-3]\\d"))
            return "";
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        df.setLenient(false);
        try {
            df.parse(text);
            System.out.println("Date OK");
            return text;

        } catch (ParseException ex) {
            System.out.println("PB Date");
            return "";

        }
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


    public void creation(int statut){
        String requete_creation_human = "";

        requete_creation_human = "INSERT INTO human (human_lastname, human_firstname, human_sex, human_dob, human_pic) VALUES ("+verifNull(this.getLast_name())+","+verifNull(this.getFirst_name())+","+ verifNull(this.getSexe())+","+ verifNull(verifDate(this.getDob()))+",NULL)";
        System.out.println(requete_creation_human);
        Requete.requeteInsert(requete_creation_human);
        String requete_recup_id = "SELECT human_id FROM human ORDER BY human_id DESC LIMIT 1";
        System.out.println(requete_recup_id);
        this.id = Requete.requeteUniqueTexteInt(requete_recup_id);
        String requete_current_time = "SELECT CURRENT_DATE";
        /*
        String date_courante = Requete.requeteUniqueTexteString(requete_current_time);
        String requete_asv = "INSERT INTO status (media_id, asv_id, asv_date_creat, asv_date_modif) VALUES ("+this.id+","+statut+",'"+date_courante+"','"+date_courante+"')";
        System.out.println(requete_asv);
        Requete.requeteInsert(requete_asv);*/
 
    }

}
