package app;
import java.util.ArrayList;

public class C_ARTISTE{
    int id;
    String nom = "";
    ArrayList <C_METIER> metiers = new ArrayList<>();

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

    public void recupId(String pNom){
        String ma_requete = "";
        if (pNom.equals("NULL")){
            this.id = 0;
        }
        else{
        ma_requete = "SELECT human.human_id FROM human JOIN artist ON human.human_id = artist.human_id WHERE artist_nickname = \""+pNom+"\"";}
        this.id = Requete.requeteUniqueTexteInt(ma_requete);
    }

    public void addMetier(String pMetier){
        C_METIER mon_metier = new C_METIER(pMetier);
        mon_metier.recupId();
        if (mon_metier.getId() == -1){
            System.out.println("PROBLEME ID - 1");
        }
        else{
            metiers.add(mon_metier);
        }
    }
}