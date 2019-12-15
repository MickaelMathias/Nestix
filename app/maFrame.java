/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;

import java.util.HashMap;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author mickael
 */
public class maFrame extends javax.swing.JFrame {

    /** Creates new form maFrame */
    public maFrame() {
        initComponents();
        layered_creation.setVisible(false); 
    }


    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {


        jPanel1 = new javax.swing.JPanel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        panel_general = new javax.swing.JPanel();
        jtabbed_general = new javax.swing.JTabbedPane();
        panel_creation = new javax.swing.JPanel();
        layered_choix_media = new javax.swing.JLayeredPane();
        choix_film = new javax.swing.JRadioButton();
        choix_film.setActionCommand("Film");
        choix_livre = new javax.swing.JRadioButton();
        choix_livre.setActionCommand("Livre");
        choix_musique = new javax.swing.JRadioButton();
        choix_musique.setActionCommand("Musique");
        choix_artiste = new javax.swing.JRadioButton();
        choix_artiste.setActionCommand("Artiste");
        choix_group = new javax.swing.ButtonGroup();
        choix_group.add(choix_film);
        choix_group.add(choix_livre);
        choix_group.add(choix_musique);
        choix_group.add(choix_artiste);
        b_creer = new javax.swing.JButton();
        layered_creation = new javax.swing.JLayeredPane();
        label_informations = new javax.swing.JLabel();
        label_informations_1 = new javax.swing.JLabel();
        label_informations_2 = new javax.swing.JLabel();
        label_informations_3 = new javax.swing.JLabel();
        label_informations_4 = new javax.swing.JLabel();
        label_informations_5 = new javax.swing.JLabel();
        label_informations_6 = new javax.swing.JLabel();
        label_informations_7 = new javax.swing.JLabel();
        label_informations_8 = new javax.swing.JLabel();
        label_informations_9 = new javax.swing.JLabel();
        label_informations_10 = new javax.swing.JLabel();
        label_informations_11 = new javax.swing.JLabel();
        label_informations_12 = new javax.swing.JLabel();
        label_informations_13 = new javax.swing.JLabel();
        label_informations_14 = new javax.swing.JLabel();
        label_informations_15 = new javax.swing.JLabel();
        label_informations_16 = new javax.swing.JLabel();
        label_informations_17 = new javax.swing.JLabel();
        label_informations_18 = new javax.swing.JLabel();
        tf_informations_1 = new javax.swing.JTextField();
        tf_informations_2 = new javax.swing.JTextField();
        tf_informations_3 = new javax.swing.JTextField();
        tf_informations_4 = new javax.swing.JTextField();
        tf_informations_5 = new javax.swing.JTextField();
        tf_informations_6 = new javax.swing.JTextField();
        tf_informations_7 = new javax.swing.JTextField();
        tf_informations_8 = new javax.swing.JTextField();
        tf_informations_9 = new javax.swing.JTextField();
        tf_informations_10 = new javax.swing.JTextField();
        tf_informations_11 = new javax.swing.JTextField();
        tf_informations_12 = new javax.swing.JTextField();
        tf_informations_13 = new javax.swing.JTextField();
        tf_informations_14 = new javax.swing.JTextField();
        tf_informations_15 = new javax.swing.JTextField();
        tf_informations_16 = new javax.swing.JTextField();
        tf_informations_17 = new javax.swing.JTextField();
        tf_informations_18 = new javax.swing.JTextField();

        label_informations_test = new javax.swing.JLabel();
        tf_informations_test = new javax.swing.JTextField();
        b_rechercher_test = new javax.swing.JButton();
        cb_recherche_test = new javax.swing.JComboBox<>();



        label_acteurs = new javax.swing.JLabel();
        tf_ajout_acteur = new javax.swing.JTextField();
        b_ajout_acteur = new javax.swing.JButton();
        label_image = new javax.swing.JLabel();
        b_fichier_image = new javax.swing.JButton();
        pannel_image = new javax.swing.JLayeredPane();
        label_synop = new javax.swing.JLabel();
        sp_synop = new javax.swing.JScrollPane();
        textarea_synop = new javax.swing.JTextArea();
        b_valider_creation = new javax.swing.JButton();
        b_brouillon_creation = new javax.swing.JButton();
        b_reinitialiser_creation = new javax.swing.JButton();
        panel_film = new javax.swing.JPanel();
        pannel_criteres_film = new javax.swing.JLayeredPane();
        tf_critere_film_1 = new javax.swing.JTextField();
        tf_critere_film_2 = new javax.swing.JTextField();
        tf_critere_film_3 = new javax.swing.JTextField();
        tf_critere_film_4 = new javax.swing.JTextField();
        cb_critere_film_2 = new javax.swing.JComboBox<>();
        cb_critere_film_3 = new javax.swing.JComboBox<>();
        cb_critere_film_1 = new javax.swing.JComboBox<>();
        cb_critere_film_4 = new javax.swing.JComboBox<>();
        label_ajout_critere_film = new javax.swing.JLabel();
        b_recherche_film = new javax.swing.JButton();
        b_reinitialise_film = new javax.swing.JButton();
        b_ajout_critere_film = new javax.swing.JButton();
        pannel_resultats_film = new javax.swing.JLayeredPane();
        label_resultats_film = new javax.swing.JLabel();
        sp_tableau_resultats_film = new javax.swing.JScrollPane();
        tableau_resultats_film = new javax.swing.JTable();
        b_modifier_film = new javax.swing.JButton();
        b_bloquer_film = new javax.swing.JButton();
        b_suppr_film = new javax.swing.JButton();
        tf_film_selectionne = new javax.swing.JTextField();
        panel_film_modif = new javax.swing.JPanel();
        label_titre_modif_film = new javax.swing.JLabel();
        layered_modif_film = new javax.swing.JLayeredPane();
        label_modif_film_informations = new javax.swing.JLabel();
        label_modif_film_acteurs = new javax.swing.JLabel();
        label_modif_film_image = new javax.swing.JLabel();
        label_modif_film_1 = new javax.swing.JLabel();
        label_modif_film_2 = new javax.swing.JLabel();
        label_modif_film_3 = new javax.swing.JLabel();
        label_modif_film_4 = new javax.swing.JLabel();
        label_modif_film_5 = new javax.swing.JLabel();
        label_modif_film_6 = new javax.swing.JLabel();
        label_modif_film_7 = new javax.swing.JLabel();
        label_modif_film_8 = new javax.swing.JLabel();
        label_modif_film_9 = new javax.swing.JLabel();
        label_modif_film_10 = new javax.swing.JLabel();
        label_modif_film_11 = new javax.swing.JLabel();
        label_modif_film_12 = new javax.swing.JLabel();
        label_modif_film_13 = new javax.swing.JLabel();
        label_modif_film_14 = new javax.swing.JLabel();
        tf_modif_film_1 = new javax.swing.JTextField();
        tf_modif_film_2 = new javax.swing.JTextField();
        tf_modif_film_3 = new javax.swing.JTextField();
        tf_modif_film_4 = new javax.swing.JTextField();
        tf_modif_film_5 = new javax.swing.JTextField();
        tf_modif_film_6 = new javax.swing.JTextField();
        tf_modif_film_7 = new javax.swing.JTextField();
        tf_modif_film_8 = new javax.swing.JTextField();
        tf_modif_film_9 = new javax.swing.JTextField();
        tf_modif_film_10 = new javax.swing.JTextField();
        tf_modif_film_11 = new javax.swing.JTextField();
        tf_modif_film_12 = new javax.swing.JTextField();
        tf_modif_film_13 = new javax.swing.JTextField();
        tf_modif_film_14 = new javax.swing.JTextField();

        tf_ajout_modif_acteur = new javax.swing.JTextField();
        b_ajout_modif_acteur = new javax.swing.JButton();
        tf_modif_acteur_1 = new javax.swing.JTextField();
        b_suppr_modif_acteur_1 = new javax.swing.JButton();
        tf_modif_acteur_2 = new javax.swing.JTextField();
        b_modif_suppr_acteur_5 = new javax.swing.JButton();
        tf_modif_acteur_3 = new javax.swing.JTextField();
        b_modif_suppr_acteur_6 = new javax.swing.JButton();
        b_modif_fichier_image_film = new javax.swing.JButton();
        pannel_modif_image_film = new javax.swing.JLayeredPane();
        jLabel24 = new javax.swing.JLabel();
        label_modif_synop_film = new javax.swing.JLabel();
        scrollpanel_modif_synop_film = new javax.swing.JScrollPane();
        textarea_modif_synop_film = new javax.swing.JTextArea();
        b_revenir_modif_film = new javax.swing.JButton();
        b_bloquer_modif_film = new javax.swing.JButton();
        b_suppr_acteur_7 = new javax.swing.JButton();
        b_suppr_acteur_8 = new javax.swing.JButton();
        b_brouillon_modif_film = new javax.swing.JButton();
        b_valider_modif_film = new javax.swing.JButton();
        panel_livre = new javax.swing.JPanel();
        pannel_criteres_livre = new javax.swing.JLayeredPane();
        tf_critere_livre_1 = new javax.swing.JTextField();
        tf_critere_livre_2 = new javax.swing.JTextField();
        tf_critere_livre_3 = new javax.swing.JTextField();
        tf_critere_livre_4 = new javax.swing.JTextField();
        cb_critere_livre_2 = new javax.swing.JComboBox<>();
        cb_critere_livre_3 = new javax.swing.JComboBox<>();
        cb_critere_livre_1 = new javax.swing.JComboBox<>();
        cb_critere_livre_4 = new javax.swing.JComboBox<>();
        label_ajout_critere_livre = new javax.swing.JLabel();
        b_recherche_livre = new javax.swing.JButton();
        b_reinitialise_livre = new javax.swing.JButton();
        b_ajout_critere_livre = new javax.swing.JButton();
        pannel_resultats_livre = new javax.swing.JLayeredPane();
        label_resultats_film1 = new javax.swing.JLabel();
        sp_tableau_resultats_livre = new javax.swing.JScrollPane();
        tableau_resultats_livre = new javax.swing.JTable();
        panel_livre_modif = new javax.swing.JPanel();
        label_titre_modif_livre = new javax.swing.JLabel();
        layered_modif_livre = new javax.swing.JLayeredPane();
        label_modif_livre_informations = new javax.swing.JLabel();
        label_modif_livre_ecrivains = new javax.swing.JLabel();
        label_modif_livre_image = new javax.swing.JLabel();
        label_modif_livre_1 = new javax.swing.JLabel();
        label_modif_livre_2 = new javax.swing.JLabel();
        label_modif_livre_3 = new javax.swing.JLabel();
        label_modif_livre_4 = new javax.swing.JLabel();
        label_modif_livre_5 = new javax.swing.JLabel();
        label_modif_livre_6 = new javax.swing.JLabel();
        label_modif_livre_7 = new javax.swing.JLabel();
        label_modif_livre_8 = new javax.swing.JLabel();
        label_modif_livre_9 = new javax.swing.JLabel();
        label_modif_livre_10 = new javax.swing.JLabel();
        label_modif_livre_11 = new javax.swing.JLabel();
        label_modif_livre_12 = new javax.swing.JLabel();

        tf_modif_livre_1 = new javax.swing.JTextField();
        tf_modif_livre_2 = new javax.swing.JTextField();
        tf_modif_livre_3 = new javax.swing.JTextField();
        tf_modif_livre_4 = new javax.swing.JTextField();
        tf_modif_livre_5 = new javax.swing.JTextField();
        tf_modif_livre_6 = new javax.swing.JTextField();
        tf_modif_livre_7 = new javax.swing.JTextField();
        tf_modif_livre_8 = new javax.swing.JTextField();
        tf_modif_livre_9 = new javax.swing.JTextField();
        tf_modif_livre_10 = new javax.swing.JTextField();
        tf_modif_livre_11 = new javax.swing.JTextField();
        tf_modif_livre_12 = new javax.swing.JTextField();


        tf_ajout_modif_ecrivains = new javax.swing.JTextField();
        b_ajout_modif_ecrivains = new javax.swing.JButton();
        tf_modif_ecrivain_1 = new javax.swing.JTextField();
        b_suppr_modif_ecrivain_1 = new javax.swing.JButton();
        tf_modif_ecrivain_2 = new javax.swing.JTextField();
        b_suppr_modif_ecrivain_2 = new javax.swing.JButton();
        tf_modif_ecrivain_3 = new javax.swing.JTextField();
        b_suppr_modif_ecrivain_3 = new javax.swing.JButton();
        b_modif_fichier_image_livre = new javax.swing.JButton();
        pannel_modif_image_livre = new javax.swing.JLayeredPane();
        jLabel25 = new javax.swing.JLabel();
        label_modif_synop_livre = new javax.swing.JLabel();
        scrollpanel_modif_synop_livre = new javax.swing.JScrollPane();
        textarea_modif_synop_livre = new javax.swing.JTextArea();
        b_revenir_modif_livre = new javax.swing.JButton();
        b_bloquer_modif_livre = new javax.swing.JButton();
        b_brouillon_modif_livre = new javax.swing.JButton();
        b_valider_modif_livre = new javax.swing.JButton();
        panel_musique = new javax.swing.JPanel();
        pannel_criteres_musique = new javax.swing.JLayeredPane();
        tf_critere_musique_1 = new javax.swing.JTextField();
        tf_critere_musique_2 = new javax.swing.JTextField();
        tf_critere_musique_3 = new javax.swing.JTextField();
        tf_critere_musique_4 = new javax.swing.JTextField();
        cb_critere_musique_2 = new javax.swing.JComboBox<>();
        cb_critere_musique_3 = new javax.swing.JComboBox<>();
        cb_critere_musique_1 = new javax.swing.JComboBox<>();
        cb_critere_musique_4 = new javax.swing.JComboBox<>();
        label_ajout_critere_musique = new javax.swing.JLabel();
        b_recherche_musique = new javax.swing.JButton();
        b_reinitialise_musique = new javax.swing.JButton();
        b_ajout_critere_musique = new javax.swing.JButton();
        pannel_resultats_musique = new javax.swing.JLayeredPane();
        label_resultats_film2 = new javax.swing.JLabel();
        sp_tableau_resultats_musique = new javax.swing.JScrollPane();
        tableau_resultats_musique = new javax.swing.JTable();
        panel_musique_modif = new javax.swing.JPanel();
        label_titre_modif_musique = new javax.swing.JLabel();
        layered_modif_musique = new javax.swing.JLayeredPane();
        label_modif_musique_informations = new javax.swing.JLabel();
        label_modif_musique_artistes = new javax.swing.JLabel();
        label_modif_musique_image = new javax.swing.JLabel();
        label_modif_musique_1 = new javax.swing.JLabel();
        label_modif_musique_2 = new javax.swing.JLabel();
        label_modif_musique_3 = new javax.swing.JLabel();
        label_modif_musique_4 = new javax.swing.JLabel();
        tf_modif_musique_1 = new javax.swing.JTextField();
        tf_modif_musique_2 = new javax.swing.JTextField();
        tf_modif_musique_3 = new javax.swing.JTextField();
        tf_modif_musique_4 = new javax.swing.JTextField();
        tf_ajout_modif_artistes = new javax.swing.JTextField();
        b_ajout_modif_artistes = new javax.swing.JButton();
        tf_modif_artiste_1 = new javax.swing.JTextField();
        b_suppr_modif_artistes_1 = new javax.swing.JButton();
        tf_modif_artiste_2 = new javax.swing.JTextField();
        b_suppr_modif_artistes_2 = new javax.swing.JButton();
        tf_modif_artiste_3 = new javax.swing.JTextField();
        b_suppr_modif_artistes_3 = new javax.swing.JButton();
        b_modif_fichier_image_musique = new javax.swing.JButton();
        pannel_modif_image_musique = new javax.swing.JLayeredPane();
        label_modif_synop_musique = new javax.swing.JLabel();
        scrollpanel_modif_synop_film2 = new javax.swing.JScrollPane();
        textarea_voir_album_musique = new javax.swing.JTextArea();
        b_revenir_modif_musique = new javax.swing.JButton();
        b_bloquer_modif_musique = new javax.swing.JButton();
        b_brouillon_modif_musique = new javax.swing.JButton();
        b_valider_modif_musique = new javax.swing.JButton();
        pannel_modif_image_livre2 = new javax.swing.JLayeredPane();
        jLabel27 = new javax.swing.JLabel();
        b_voir_album_modif_musique = new javax.swing.JButton();
        scrollpanel_modif_synop_musique = new javax.swing.JScrollPane();
        textarea_modif_synop_musique = new javax.swing.JTextArea();
        panel_artistes = new javax.swing.JPanel();
        pannel_criteres_musique1 = new javax.swing.JLayeredPane();
        tf_critere_artiste_1 = new javax.swing.JTextField();
        tf_critere_artiste_2 = new javax.swing.JTextField();
        tf_critere_artiste_3 = new javax.swing.JTextField();
        tf_critere_artiste_4 = new javax.swing.JTextField();
        cb_critere_artiste_2 = new javax.swing.JComboBox<>();
        cb_critere_artiste_3 = new javax.swing.JComboBox<>();
        cb_critere_artiste_1 = new javax.swing.JComboBox<>();
        cb_critere_artiste_4 = new javax.swing.JComboBox<>();
        label_ajout_critere_artiste = new javax.swing.JLabel();
        b_recherche_artiste = new javax.swing.JButton();
        b_reinitialise_artiste = new javax.swing.JButton();
        b_ajout_critere_artiste = new javax.swing.JButton();
        pannel_resultats_musique1 = new javax.swing.JLayeredPane();
        label_resultats_artiste = new javax.swing.JLabel();
        sp_tableau_resultats_artiste = new javax.swing.JScrollPane();
        tableau_resultats_artiste = new javax.swing.JTable();
        panel_artiste_modif = new javax.swing.JPanel();
        label_titre_modif_artiste = new javax.swing.JLabel();
        layered_modif_artiste = new javax.swing.JLayeredPane();
        label_modif_artiste_informations = new javax.swing.JLabel();
        label_modif_artiste_metier = new javax.swing.JLabel();
        label_modif_artiste_image = new javax.swing.JLabel();
        label_modif_artiste_1 = new javax.swing.JLabel();
        label_modif_artiste_2 = new javax.swing.JLabel();
        label_modif_artiste_3 = new javax.swing.JLabel();
        label_modif_artiste_4 = new javax.swing.JLabel();
        tf_modif_desartistes_1 = new javax.swing.JTextField();
        tf_modif_desartistes_2 = new javax.swing.JTextField();
        tf_modif_desartistes_3 = new javax.swing.JTextField();
        tf_modif_desartistes_4 = new javax.swing.JTextField();
        tf_modif_artiste_metier_1 = new javax.swing.JTextField();
        tf_modif_artiste_metier_2 = new javax.swing.JTextField();
        tf_modif_artiste_metier_3 = new javax.swing.JTextField();
        b_modif_fichier_image_artiste = new javax.swing.JButton();
        pannel_modif_image_artiste = new javax.swing.JLayeredPane();
        label_modif_synop_artiste = new javax.swing.JLabel();
        b_revenir_modif_artiste = new javax.swing.JButton();
        b_bloquer_modif_artiste = new javax.swing.JButton();
        b_brouillon_modif_artiste = new javax.swing.JButton();
        b_valider_modif_artiste = new javax.swing.JButton();
        scrollpanel_modif_synop_artiste = new javax.swing.JScrollPane();
        textarea_modif_synop_artiste = new javax.swing.JTextArea();
        tf_modif_desartistes_5 = new javax.swing.JTextField();
        label_modif_artiste_5 = new javax.swing.JLabel();
        tf_modif_desartistes_6 = new javax.swing.JTextField();
        label_modif_artiste_6 = new javax.swing.JLabel();
        tf_modif_desartistes_7 = new javax.swing.JTextField();
        label_modif_artiste_7 = new javax.swing.JLabel();
        panel_bdd = new javax.swing.JPanel();
        label_bdd_titre = new javax.swing.JLabel();
        cb_critere_bdd = new javax.swing.JComboBox<>();
        b_valider_critere_bdd = new javax.swing.JButton();
        lp_bdd_1 = new javax.swing.JLayeredPane();
        lp_bdd_2 = new javax.swing.JLayeredPane();
        label_bdd_valeur_1 = new javax.swing.JLabel();
        b_modifier_critere_bdd_1 = new javax.swing.JButton();
        b_supprimer_critere_bdd_1 = new javax.swing.JButton();
        label_bdd_valeur_2 = new javax.swing.JLabel();
        b_modifier_critere_bdd_2 = new javax.swing.JButton();
        b_supprimer_critere_bdd_2 = new javax.swing.JButton();
        label_bdd_valeur_3 = new javax.swing.JLabel();
        b_modifier_critere_bdd_3 = new javax.swing.JButton();
        b_supprimer_critere_bdd_3 = new javax.swing.JButton();
        label_bdd_valeur_4 = new javax.swing.JLabel();
        b_modifier_critere_bdd_4 = new javax.swing.JButton();
        b_supprimer_critere_bdd_4 = new javax.swing.JButton();
        label_bdd_valeur_5 = new javax.swing.JLabel();
        b_modifier_critere_bdd_5 = new javax.swing.JButton();
        b_supprimer_critere_bdd_5 = new javax.swing.JButton();
        lp_bdd_3 = new javax.swing.JLayeredPane();
        tf_ajout_critere_bdd_1 = new javax.swing.JTextField();
        tf_ajout_critere_bdd_2 = new javax.swing.JTextField();
        b_ajout_critere_bdd = new javax.swing.JButton();
        b_valider_ajout_bdd = new javax.swing.JButton();
        panel_users = new javax.swing.JPanel();
        pannel_criteres_users = new javax.swing.JLayeredPane();
        tf_critere_users_1 = new javax.swing.JTextField();
        tf_critere_users_2 = new javax.swing.JTextField();
        tf_critere_users_3 = new javax.swing.JTextField();
        cb_critere_users_2 = new javax.swing.JComboBox<>();
        cb_critere_users_3 = new javax.swing.JComboBox<>();
        cb_critere_users_1 = new javax.swing.JComboBox<>();
        label_ajout_critere_users = new javax.swing.JLabel();
        b_recherche_users = new javax.swing.JButton();
        b_reinitialise_users = new javax.swing.JButton();
        b_ajout_critere_users = new javax.swing.JButton();
        pannel_resultats_users = new javax.swing.JLayeredPane();
        label_resultats_users = new javax.swing.JLabel();
        sp_tableau_resultats_users = new javax.swing.JScrollPane();
        tableau_resultats_users = new javax.swing.JTable();
        pannel_users_comm = new javax.swing.JPanel();
        jp_users_comm = new javax.swing.JLayeredPane();
        sp_users_comm = new javax.swing.JScrollPane();
        tab_brouillons1 = new javax.swing.JTable();
        b_revenir_users_comm = new javax.swing.JButton();
        label_users_comm_titre = new javax.swing.JLabel();
        panel_brouillon = new javax.swing.JPanel();
        choix_brouillon_1 = new javax.swing.JRadioButton();
        choix_brouillon_2 = new javax.swing.JRadioButton();
        choix_brouillon_3 = new javax.swing.JRadioButton();
        choix_brouillon_4 = new javax.swing.JRadioButton();
        b_valider_brouillons = new javax.swing.JButton();
        jp_brouillons = new javax.swing.JLayeredPane();
        sp_brouillons = new javax.swing.JScrollPane();
        tab_brouillons = new javax.swing.JTable();
        b_revenir_brouillons = new javax.swing.JButton();

        sp_list_acteurs = new javax.swing.JScrollPane();
        list_acteurs = new javax.swing.JList<String>(new javax.swing.DefaultListModel<String>()); 
        b_suppr_list = new javax.swing.JButton();
        model = new javax.swing.DefaultListModel<>();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_general.setPreferredSize(new java.awt.Dimension(1000, 950));

        choix_film.setText("FILM");

        choix_livre.setText("LIVRE");

        choix_musique.setText("MUSIQUE");

        choix_artiste.setText("ARTISTE");

        b_creer.setText("Creer");
        b_creer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_creerActionPerformed(evt);
            }
        });

        layered_choix_media.setLayer(choix_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_choix_media.setLayer(choix_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_choix_media.setLayer(choix_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_choix_media.setLayer(choix_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_choix_media.setLayer(b_creer, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layered_choix_mediaLayout = new javax.swing.GroupLayout(layered_choix_media);
        layered_choix_media.setLayout(layered_choix_mediaLayout);
        layered_choix_mediaLayout.setHorizontalGroup(
            layered_choix_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_choix_mediaLayout.createSequentialGroup()
                .addGroup(layered_choix_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_choix_mediaLayout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(choix_film)
                        .addGap(18, 18, 18)
                        .addComponent(choix_livre)
                        .addGap(18, 18, 18)
                        .addComponent(choix_musique)
                        .addGap(18, 18, 18)
                        .addComponent(choix_artiste))
                    .addGroup(layered_choix_mediaLayout.createSequentialGroup()
                        .addGap(443, 443, 443)
                        .addComponent(b_creer)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layered_choix_mediaLayout.setVerticalGroup(
            layered_choix_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_choix_mediaLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layered_choix_mediaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix_film)
                    .addComponent(choix_livre)
                    .addComponent(choix_artiste)
                    .addComponent(choix_musique))
                .addGap(18, 18, 18)
                .addComponent(b_creer)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layered_creation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layered_creation.setPreferredSize(new java.awt.Dimension(940, 600));

        label_informations.setText("INFORMATIONS");
        label_informations_1.setText("Titre");
        label_informations_2.setText("Année");
        label_informations_3.setText("Réalisateur");
        label_informations_4.setText("Scénariste");
        label_informations_5.setText("Durée");
        label_informations_6.setText("Trailer");
        label_informations_7.setText("Budget");

        tf_informations_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_informations_1.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_2.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_3.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_4.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_5.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_6.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_7.setPreferredSize(new java.awt.Dimension(120, 26));

        label_acteurs.setText("ACTEURS");

        tf_ajout_acteur.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_ajout_acteur.setPreferredSize(new java.awt.Dimension(120, 26));

        b_ajout_acteur.setText("Ajouter");
        b_ajout_acteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_acteurActionPerformed(evt);
            }
        });

        label_image.setText("IMAGE");

        b_fichier_image.setText("Choisir Fichier");
        b_fichier_image.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fichier_imageActionPerformed(evt);
            }
        });

        pannel_image.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pannel_imageLayout = new javax.swing.GroupLayout(pannel_image);
        pannel_image.setLayout(pannel_imageLayout);
        pannel_imageLayout.setHorizontalGroup(
            pannel_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 201, Short.MAX_VALUE)
        );
        pannel_imageLayout.setVerticalGroup(
            pannel_imageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );

        label_synop.setText("Synopsis");

        textarea_synop.setColumns(20);
        textarea_synop.setRows(5);
        sp_synop.setViewportView(textarea_synop);

        b_valider_creation.setText("Valider Création");
        b_valider_creation.addActionListener(new java.awt.event.ActionListener()  {
            public void actionPerformed(java.awt.event.ActionEvent evt){
                b_valider_creationActionPerformed(evt);
            }
        });

        b_brouillon_creation.setText("Brouillon");
        b_brouillon_creation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_brouillon_creationActionPerformed(evt);
            }
        });

        tf_informations_8.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_8.setText("Visa");
        label_informations_9.setText("Tag 1");
        tf_informations_9.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_10.setText("Tag 2");
        tf_informations_10.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_11.setText("Tag 3");
        tf_informations_11.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_12.setText("Genre 1");
        tf_informations_12.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_13.setText("Genre 2");
        tf_informations_13.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_14.setText("Lien");
        tf_informations_14.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_15.setText("Cérémonie");
        tf_informations_15.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_16.setText("Récompense");
        tf_informations_16.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_informations_17.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_17.setText("Saga");
        tf_informations_18.setPreferredSize(new java.awt.Dimension(120, 26));
        label_informations_18.setText("Année");

        label_informations_test.setText("Titre");
        tf_informations_test.setPreferredSize(new java.awt.Dimension(120, 26));
        b_rechercher_test.setText("R");
        b_rechercher_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_rechercher_testActionPerformed(evt);
            }
        });
        cb_recherche_test.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_recherche_test.setMinimumSize(new java.awt.Dimension(250, 27));
        cb_recherche_test.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_recherche_testActionPerformed(evt);
            }
        });

        b_reinitialiser_creation.setText("Réinitialiser");
        b_reinitialiser_creation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reinitialiser_creationActionPerformed(evt);
            }
        });

        mon_formulaire_film.setType(choix_creation);
        mon_formulaire_film.setVisa(tf_informations_1);
        mon_formulaire_film.setTitre(tf_informations_2);
        mon_formulaire_film.setAnnee(tf_informations_3);
        mon_formulaire_film.setRealisateur(tf_informations_4);
        mon_formulaire_film.setScenariste(tf_informations_5);
        mon_formulaire_film.setDuree(tf_informations_6);
        mon_formulaire_film.setTrailer(tf_informations_7);
        mon_formulaire_film.setLien(tf_informations_8);
        mon_formulaire_film.setSaga(tf_informations_17);
        mon_formulaire_film.setBudget(tf_informations_9);
        mon_formulaire_film.setTag1(tf_informations_10);
        mon_formulaire_film.setTag2(tf_informations_11);
        mon_formulaire_film.setTag3(tf_informations_12);
        mon_formulaire_film.setGenre1(tf_informations_13);
        mon_formulaire_film.setGenre2(tf_informations_14);
        mon_formulaire_film.setAward(tf_informations_16);
        mon_formulaire_film.setCeremonie(tf_informations_15);
        mon_formulaire_film.setAnneeCeremonie(tf_informations_18);
        mon_formulaire_film.setSynop(textarea_synop);
        mon_formulaire_film.setListActeur(list_acteurs);

        mon_formulaire_livre.setTf_isbn(tf_informations_1);
        mon_formulaire_livre.setTf_titre(tf_informations_2);
        mon_formulaire_livre.setTf_tome(tf_informations_3);
        mon_formulaire_livre.setTf_saga(tf_informations_4);
        mon_formulaire_livre.setTf_annee(tf_informations_5);
        mon_formulaire_livre.setTf_editeur(tf_informations_6);
        mon_formulaire_livre.setTf_lien(tf_informations_7);
        mon_formulaire_livre.setTf_tag_1(tf_informations_8);
        mon_formulaire_livre.setTf_tag_2(tf_informations_9);
        mon_formulaire_livre.setTf_tag_3(tf_informations_10);
        mon_formulaire_livre.setTf_genre_1(tf_informations_11);
        mon_formulaire_livre.setTf_genre_2(tf_informations_12);
        mon_formulaire_livre.setTf_award(tf_informations_16);
        mon_formulaire_livre.setTf_ceremonie(tf_informations_15);
        mon_formulaire_livre.setTf_annee_ceremonie(tf_informations_18);
        mon_formulaire_livre.setTf_synop(textarea_synop);
        mon_formulaire_livre.setList_ecrivains(list_acteurs);

        mon_formulaire_chanson.setTf_titre(tf_informations_1);
        mon_formulaire_chanson.setTf_annee(tf_informations_2);
        mon_formulaire_chanson.setTf_groupe(tf_informations_3);
        mon_formulaire_chanson.setTf_album(tf_informations_4);
        mon_formulaire_chanson.setTf_lien(tf_informations_5);
        mon_formulaire_chanson.setTf_tag_1(tf_informations_6);
        mon_formulaire_chanson.setTf_tag_2(tf_informations_7);
        mon_formulaire_chanson.setTf_tag_3(tf_informations_8);
        mon_formulaire_chanson.setTf_genre_1(tf_informations_9);
        mon_formulaire_chanson.setTf_genre_2(tf_informations_10);
        mon_formulaire_chanson.setTf_label(tf_informations_11);
        mon_formulaire_chanson.setTf_award(tf_informations_16);
        mon_formulaire_chanson.setTf_ceremonie(tf_informations_15);
        mon_formulaire_chanson.setTf_annee_ceremonie(tf_informations_18);
        mon_formulaire_chanson.setTf_synop(textarea_synop);
        mon_formulaire_chanson.setList_interprete(list_acteurs);



        list_acteurs.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = new String [mon_formulaire_film.getFilm().mes_acteurs.size()];
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        sp_list_acteurs.setViewportView(list_acteurs);

        b_suppr_list.setText("Supprimer");
        b_suppr_list.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_listActionPerformed(evt);
            }
        });



        layered_creation.setLayer(label_informations, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_acteurs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_ajout_acteur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_ajout_acteur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_fichier_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(pannel_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_synop, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(sp_synop, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_valider_creation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_brouillon_creation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_15, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_16, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_17, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_18, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(label_informations_test, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(tf_informations_test, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_rechercher_test, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(cb_recherche_test, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_reinitialiser_creation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(sp_list_acteurs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_creation.setLayer(b_suppr_list, javax.swing.JLayeredPane.DEFAULT_LAYER);
        javax.swing.GroupLayout layered_creationLayout = new javax.swing.GroupLayout(layered_creation);
        layered_creation.setLayout(layered_creationLayout);
        layered_creationLayout.setHorizontalGroup(
            layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_creationLayout.createSequentialGroup()
                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_creationLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(label_informations))
                    .addGroup(layered_creationLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_informations_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_1)
                                    .addGap(46, 46, 46)
                                    .addComponent(tf_informations_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_informations_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_informations_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layered_creationLayout.createSequentialGroup()
                                        .addComponent(label_informations_5)
                                        .addGap(36, 36, 36)
                                        .addComponent(tf_informations_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layered_creationLayout.createSequentialGroup()
                                            .addComponent(label_informations_3)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(tf_informations_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layered_creationLayout.createSequentialGroup()
                                            .addComponent(label_informations_4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(tf_informations_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layered_creationLayout.createSequentialGroup()
                                        .addComponent(label_informations_6)
                                        .addGap(36, 36, 36)
                                        .addComponent(tf_informations_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_12, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_informations_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_creationLayout.createSequentialGroup()
                                    .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(label_informations_11, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(label_informations_10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(label_informations_9, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(27, 27, 27)
                                    .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_informations_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_informations_10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(tf_informations_11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_13, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_informations_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_14, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_informations_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_creationLayout.createSequentialGroup()
                                    .addComponent(label_informations_17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(tf_informations_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_creationLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(label_acteurs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_image)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_creationLayout.createSequentialGroup()
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layered_creationLayout.createSequentialGroup()
                                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layered_creationLayout.createSequentialGroup()
                                                .addGap(177, 177, 177)
                                                .addComponent(b_ajout_acteur))
                                            .addGroup(layered_creationLayout.createSequentialGroup()
                                                .addGap(171, 171, 171)
                                                .addComponent(b_suppr_list)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                                .addComponent(sp_list_acteurs, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(115, 115, 115))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                                        .addComponent(label_informations_15, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(tf_informations_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                                        .addComponent(label_informations_16)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tf_informations_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                                        .addComponent(label_informations_18)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(tf_informations_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(90, 90, 90)))))
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pannel_image, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sp_synop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b_valider_creation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_brouillon_creation)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_reinitialiser_creation)
                                .addGap(225, 225, 225)))
                        .addGap(58, 58, 58))
                    .addGroup(layered_creationLayout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(tf_ajout_acteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_fichier_image)
                        .addGap(89, 89, 89))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                .addGap(31, 31, Short.MAX_VALUE)
                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                        .addComponent(label_synop)
                        .addGap(149, 149, 149))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_creationLayout.createSequentialGroup()
                        .addComponent(label_informations_test, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tf_informations_test, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_rechercher_test, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cb_recherche_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(589, 589, 589))))
        );
        layered_creationLayout.setVerticalGroup(
            layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_creationLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_informations)
                    .addComponent(label_acteurs)
                    .addComponent(label_image))
                .addGap(18, 18, 18)
                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_creationLayout.createSequentialGroup()
                        .addComponent(b_fichier_image)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pannel_image, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_synop)
                        .addGap(12, 12, 12)
                        .addComponent(sp_synop, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layered_creationLayout.createSequentialGroup()
                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layered_creationLayout.createSequentialGroup()
                                .addComponent(label_informations_1)
                                .addGap(18, 18, 18)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_2)
                                    .addComponent(tf_informations_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_3)
                                    .addComponent(tf_informations_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layered_creationLayout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(label_informations_4))
                                    .addGroup(layered_creationLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tf_informations_4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tf_informations_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_informations_5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_6)
                                    .addComponent(tf_informations_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_7)
                                    .addComponent(tf_informations_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_8)
                                    .addComponent(tf_informations_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_9)
                                    .addComponent(tf_informations_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_10)
                                    .addComponent(tf_informations_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(12, 12, 12)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_11)
                                    .addComponent(tf_informations_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_12)
                                    .addComponent(tf_informations_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_13)
                                    .addComponent(tf_informations_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_14)
                                    .addComponent(tf_informations_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layered_creationLayout.createSequentialGroup()
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_informations_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_ajout_acteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_ajout_acteur)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sp_list_acteurs, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(b_suppr_list)
                                .addGap(18, 18, 18)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_15)
                                    .addComponent(tf_informations_15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_16)
                                    .addComponent(tf_informations_16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_informations_18)
                                    .addComponent(tf_informations_18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(158, 158, 158)))
                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_informations_17)
                            .addComponent(tf_informations_17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_valider_creation)
                            .addComponent(b_brouillon_creation)
                            .addComponent(b_reinitialiser_creation))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label_informations_test)
                            .addComponent(tf_informations_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_rechercher_test)
                            .addComponent(cb_recherche_test, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_creationLayout = new javax.swing.GroupLayout(panel_creation);
        panel_creation.setLayout(panel_creationLayout);
        panel_creationLayout.setHorizontalGroup(
            panel_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layered_choix_media)
            .addGroup(panel_creationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layered_creation, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_creationLayout.setVerticalGroup(
            panel_creationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_creationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(layered_choix_media, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(layered_creation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );


        jtabbed_general.addTab("CREATION", panel_creation);

        pannel_criteres_film.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_critere_film_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_critere_film_1.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_critere_film_1.setEnabled(false);

        tf_critere_film_2.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_critere_film_2.setEnabled(false);

        tf_critere_film_3.setMinimumSize(new java.awt.Dimension(50, 26));
        tf_critere_film_3.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_critere_film_3.setEnabled(false);

        tf_critere_film_4.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_critere_film_4.setEnabled(false);



        cb_critere_film_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisissez", "Nom Réalisateur", "Prénom Réalisateur", "Année", "Nom Acteur", "Prénom Acteur", "Visa" }));
        cb_critere_film_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_film_1ActionPerformed(evt);
            }
        });

        cb_critere_film_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisissez", "Nom Réalisateur", "Prénom Réalisateur", "Année", "Nom Acteur", "Prénom Acteur", "Visa" }));
        cb_critere_film_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_film_2ActionPerformed(evt);
            }
        });

        cb_critere_film_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisissez", "Nom Réalisateur", "Prénom Réalisateur", "Année", "Nom Acteur", "Prénom Acteur", "Visa" }));
        cb_critere_film_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_film_3ActionPerformed(evt);
            }
        });



        cb_critere_film_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Choisissez", "Nom Réalisateur", "Prénom Réalisateur", "Année", "Nom Acteur", "Prénom Acteur", "Visa" }));
        cb_critere_film_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_film_4ActionPerformed(evt);
            }
        });

        label_ajout_critere_film.setText("2 critères restants");
        label_ajout_critere_film.setToolTipText("");

        b_recherche_film.setText("Rechercher");
        b_recherche_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					String requete_finale = "";
					String requete_base = "(SELECT * FROM media WHERE media_type = 'film' AND media_title IN (SELECT media_title FROM media WHERE media_type = 'film' ";
			        
			        HashMap<javax.swing.JComboBox,javax.swing.JTextField> hmComboBox = new HashMap<javax.swing.JComboBox,javax.swing.JTextField>();
			        hmComboBox.put(cb_critere_film_1, tf_critere_film_1);
			        hmComboBox.put(cb_critere_film_2, tf_critere_film_2);
			        hmComboBox.put(cb_critere_film_3, tf_critere_film_3);
			        hmComboBox.put(cb_critere_film_4, tf_critere_film_4);

			        requete_finale = requete_base + verif_combobox(hmComboBox);
			        System.out.println("Req Finale" + requete_finale);	
                    b_recherche_filmActionPerformed(evt,requete_finale);
                    
			        } catch (SQLException e) {
			        	e.printStackTrace();
				}
            }
        });

        b_reinitialise_film.setText("Réinitialiser");
        b_reinitialise_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reinitialise_filmActionPerformed(evt);
            }
        });

        b_ajout_critere_film.setText("Ajouter critère");
        b_ajout_critere_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_critere_filmActionPerformed(evt);
            }
        });

        pannel_criteres_film.setLayer(tf_critere_film_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(tf_critere_film_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(tf_critere_film_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(tf_critere_film_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(cb_critere_film_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(cb_critere_film_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(cb_critere_film_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(cb_critere_film_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(label_ajout_critere_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(b_recherche_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(b_reinitialise_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_film.setLayer(b_ajout_critere_film, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_criteres_filmLayout = new javax.swing.GroupLayout(pannel_criteres_film);
        pannel_criteres_film.setLayout(pannel_criteres_filmLayout);
        pannel_criteres_filmLayout.setHorizontalGroup(
            pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                .addComponent(cb_critere_film_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tf_critere_film_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                .addComponent(cb_critere_film_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_film_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                .addComponent(cb_critere_film_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_film_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                .addComponent(cb_critere_film_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_film_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_criteres_filmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_recherche_film)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_reinitialise_film)
                .addContainerGap())
            .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_ajout_critere_film, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b_ajout_critere_film))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_criteres_filmLayout.setVerticalGroup(
            pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_filmLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_film_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_film_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_film_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_film_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_film_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_film_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_film_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_film_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_ajout_critere_film)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ajout_critere_film)
                .addGap(22, 22, 22)
                .addGroup(pannel_criteres_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_reinitialise_film)
                    .addComponent(b_recherche_film))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pannel_resultats_film.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_resultats_film.setText("Vos résultats");

        tableau_resultats_film.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tableau_resultats_film.getSelectionModel().addListSelectionListener((ListSelectionListener) new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent arg0) {
				int sr = tableau_resultats_film.getSelectedRow();
				tf_film_selectionne.setText((String) tableau_resultats_film.getModel().getValueAt(sr, 1));
				
			}
        	
        });

        sp_tableau_resultats_film.setViewportView(tableau_resultats_film);

        b_modifier_film.setText("Modifier");
        b_modifier_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try{
                b_modifier_filmActionPerformed(evt);}
                catch(SQLException e){
                    e.printStackTrace();
                }
            }
        });

        b_bloquer_film.setText("Bloquer");
        b_bloquer_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloquer_filmActionPerformed(evt);
            }
        });

        b_suppr_film.setText("Supprimer");
        b_suppr_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					b_suppr_filmActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        tf_film_selectionne.setPreferredSize(new java.awt.Dimension(120, 26));

        pannel_resultats_film.setLayer(label_resultats_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_film.setLayer(sp_tableau_resultats_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_film.setLayer(b_modifier_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_film.setLayer(b_bloquer_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_film.setLayer(b_suppr_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_film.setLayer(tf_film_selectionne, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_resultats_filmLayout = new javax.swing.GroupLayout(pannel_resultats_film);
        pannel_resultats_film.setLayout(pannel_resultats_filmLayout);
        pannel_resultats_filmLayout.setHorizontalGroup(
            pannel_resultats_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_resultats_filmLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_resultats_film)
                .addGap(273, 273, 273))
            .addGroup(pannel_resultats_filmLayout.createSequentialGroup()
                .addGroup(pannel_resultats_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pannel_resultats_filmLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(sp_tableau_resultats_film, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pannel_resultats_filmLayout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(b_modifier_film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_bloquer_film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_suppr_film))
                    .addGroup(pannel_resultats_filmLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addComponent(tf_film_selectionne, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        pannel_resultats_filmLayout.setVerticalGroup(
            pannel_resultats_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_resultats_filmLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultats_film)
                .addGap(18, 18, 18)
                .addComponent(sp_tableau_resultats_film, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_film_selectionne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pannel_resultats_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_modifier_film)
                    .addComponent(b_bloquer_film)
                    .addComponent(b_suppr_film))
                .addGap(16, 16, 16))
        );

        javax.swing.GroupLayout panel_filmLayout = new javax.swing.GroupLayout(panel_film);
        panel_film.setLayout(panel_filmLayout);
        panel_filmLayout.setHorizontalGroup(
            panel_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_filmLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pannel_criteres_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pannel_resultats_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panel_filmLayout.setVerticalGroup(
            panel_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_filmLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannel_resultats_film)
                    .addGroup(panel_filmLayout.createSequentialGroup()
                        .addComponent(pannel_criteres_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(171, Short.MAX_VALUE))))
        );

        jtabbed_general.addTab("FILM", panel_film);

        label_titre_modif_film.setText("Modification du film \"TITRE\"");

        layered_modif_film.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layered_modif_film.setPreferredSize(new java.awt.Dimension(940, 600));

        label_modif_film_informations.setText("INFORMATIONS");

        label_modif_film_acteurs.setText("ACTEURS");

        label_modif_film_image.setText("IMAGE");

        label_modif_film_1.setText("Titre");

        label_modif_film_2.setText("Année");

        label_modif_film_3.setText("Réalisateur");

        label_modif_film_4.setText("Scénariste");

        label_modif_film_5.setText("Durée");

        label_modif_film_6.setText("Trailer");

        label_modif_film_7.setText("Budget");

        tf_modif_film_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_film_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_film_2.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_film_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_film_2ActionPerformed(evt);
            }
        });

        tf_modif_film_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_film_4.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_film_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_film_4ActionPerformed(evt);
            }
        });

        tf_modif_film_5.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_film_6.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_film_7.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_ajout_modif_acteur.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_ajout_modif_acteur.setPreferredSize(new java.awt.Dimension(120, 26));

        b_ajout_modif_acteur.setText("Ajouter");
        b_ajout_modif_acteur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_modif_acteurActionPerformed(evt);
            }
        });

        tf_modif_acteur_1.setText("Stallone");
        tf_modif_acteur_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_acteur_1.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_acteur_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_acteur_1ActionPerformed(evt);
            }
        });

        b_suppr_modif_acteur_1.setText("Supprimer");
        b_suppr_modif_acteur_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_acteur_1ActionPerformed(evt);
            }
        });

        tf_modif_acteur_2.setText("Staloute");
        tf_modif_acteur_2.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_acteur_2.setPreferredSize(new java.awt.Dimension(120, 26));

        b_modif_suppr_acteur_5.setText("Supprimer");
        b_modif_suppr_acteur_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modif_suppr_acteur_5ActionPerformed(evt);
            }
        });

        tf_modif_acteur_3.setText("Stalette");
        tf_modif_acteur_3.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_acteur_3.setPreferredSize(new java.awt.Dimension(120, 26));

        b_modif_suppr_acteur_6.setText("Supprimer");
        b_modif_suppr_acteur_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modif_suppr_acteur_6ActionPerformed(evt);
            }
        });

        b_modif_fichier_image_film.setText("Choisir Fichier");
        b_modif_fichier_image_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modif_fichier_image_filmActionPerformed(evt);
            }
        });

        pannel_modif_image_film.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel24.setText("IMAGE ICI");

        pannel_modif_image_film.setLayer(jLabel24, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_modif_image_filmLayout = new javax.swing.GroupLayout(pannel_modif_image_film);
        pannel_modif_image_film.setLayout(pannel_modif_image_filmLayout);
        pannel_modif_image_filmLayout.setHorizontalGroup(
            pannel_modif_image_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_modif_image_filmLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pannel_modif_image_filmLayout.setVerticalGroup(
            pannel_modif_image_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_modif_image_filmLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel24)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        label_modif_synop_film.setText("Synopsis");

        textarea_modif_synop_film.setColumns(20);
        textarea_modif_synop_film.setRows(5);
        scrollpanel_modif_synop_film.setViewportView(textarea_modif_synop_film);

        b_revenir_modif_film.setText("Revenir à la recherche");
        b_revenir_modif_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_revenir_modif_filmActionPerformed(evt);
            }
        });

        b_bloquer_modif_film.setText("Bloquer");
        b_bloquer_modif_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloquer_modif_filmActionPerformed(evt);
            }
        });

        b_suppr_acteur_7.setText("Ajouter");
        b_suppr_acteur_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_acteur_7ActionPerformed(evt);
            }
        });

        b_suppr_acteur_8.setText("Ajouter");
        b_suppr_acteur_8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_acteur_8ActionPerformed(evt);
            }
        });

        b_brouillon_modif_film.setText("Brouillon");
        b_brouillon_modif_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_brouillon_modif_filmActionPerformed(evt);
            }
        });

        b_valider_modif_film.setText("Valider Modifications");
        b_valider_modif_film.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_valider_modif_filmActionPerformed(evt);
            }
        });

        label_modif_film_8.setText("Lien");
        tf_modif_film_8.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_film_9.setText("Budget");
        tf_modif_film_9.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_film_10.setText("Tag 1");
        tf_modif_film_10.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_film_11.setText("Tag 2");
        tf_modif_film_11.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_film_12.setText("Tag 3");
        tf_modif_film_12.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_film_13.setText("Genre 1");
        tf_modif_film_13.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_film_14.setText("Genre 2");
        tf_modif_film_14.setPreferredSize(new java.awt.Dimension(120, 26));


        layered_modif_film.setLayer(label_modif_film_informations, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_acteurs, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_ajout_modif_acteur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_ajout_modif_acteur, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_acteur_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_suppr_modif_acteur_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_acteur_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_modif_suppr_acteur_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_acteur_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_modif_suppr_acteur_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_modif_fichier_image_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(pannel_modif_image_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_synop_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(scrollpanel_modif_synop_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_revenir_modif_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_bloquer_modif_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_suppr_acteur_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_suppr_acteur_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_brouillon_modif_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(b_valider_modif_film, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(label_modif_film_14, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_film.setLayer(tf_modif_film_14, javax.swing.JLayeredPane.DEFAULT_LAYER);


        javax.swing.GroupLayout layered_modif_filmLayout = new javax.swing.GroupLayout(layered_modif_film);
        layered_modif_film.setLayout(layered_modif_filmLayout);
        layered_modif_filmLayout.setHorizontalGroup(
            layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(b_revenir_modif_film))
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addComponent(b_valider_modif_film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_brouillon_modif_film)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_bloquer_modif_film)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addComponent(label_modif_film_12)
                        .addGap(33, 33, 33)
                        .addComponent(tf_modif_film_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layered_modif_filmLayout.createSequentialGroup()
                            .addGap(104, 104, 104)
                            .addComponent(label_modif_film_informations))
                        .addGroup(layered_modif_filmLayout.createSequentialGroup()
                            .addGap(52, 52, 52)
                            .addComponent(label_modif_film_1)
                            .addGap(46, 46, 46)
                            .addComponent(tf_modif_film_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                    .addComponent(label_modif_film_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_film_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                    .addComponent(label_modif_film_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_film_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                            .addComponent(label_modif_film_7)
                                            .addGap(33, 33, 33)
                                            .addComponent(tf_modif_film_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                                .addComponent(label_modif_film_4)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(tf_modif_film_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                                .addComponent(label_modif_film_5)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tf_modif_film_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                                .addComponent(label_modif_film_6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(tf_modif_film_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                        .addComponent(label_modif_film_10)
                                        .addGap(33, 33, 33)
                                        .addComponent(tf_modif_film_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                        .addComponent(label_modif_film_11)
                                        .addGap(33, 33, 33)
                                        .addComponent(tf_modif_film_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                            .addComponent(label_modif_film_8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(tf_modif_film_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                            .addComponent(label_modif_film_9)
                                            .addGap(33, 33, 33)
                                            .addComponent(tf_modif_film_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                    .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layered_modif_filmLayout.createSequentialGroup()
                            .addComponent(label_modif_film_14)
                            .addGap(33, 33, 33)
                            .addComponent(tf_modif_film_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layered_modif_filmLayout.createSequentialGroup()
                            .addComponent(label_modif_film_13)
                            .addGap(33, 33, 33)
                            .addComponent(tf_modif_film_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(label_modif_film_acteurs)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_modif_film_image)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                        .addGap(181, 181, 181)
                                        .addComponent(b_ajout_modif_acteur))
                                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                        .addGap(102, 102, 102)
                                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                                .addComponent(tf_modif_acteur_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_acteur_1))
                                            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                                .addComponent(tf_modif_acteur_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_modif_suppr_acteur_5))
                                            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                                .addComponent(tf_modif_acteur_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_modif_suppr_acteur_6)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pannel_modif_image_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_filmLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                                .addComponent(scrollpanel_modif_synop_film, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58))
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(tf_ajout_modif_acteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_modif_fichier_image_film)
                        .addGap(89, 89, 89))
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_modif_synop_film)
                        .addGap(149, 149, 149))))
        );
        layered_modif_filmLayout.setVerticalGroup(
            layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_modif_film_informations)
                    .addComponent(label_modif_film_acteurs)
                    .addComponent(label_modif_film_image))
                .addGap(18, 18, 18)
                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addComponent(label_modif_film_1)
                        .addGap(76, 76, 76)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_acteur_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_suppr_modif_acteur_1))
                        .addGap(136, 136, 136))
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addComponent(tf_modif_film_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_7))
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_modif_filmLayout.createSequentialGroup()
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ajout_modif_acteur, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_modif_fichier_image_film))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                .addComponent(b_ajout_modif_acteur)
                                .addGap(72, 72, 72)
                                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_acteur_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_modif_suppr_acteur_5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_acteur_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_modif_suppr_acteur_6)))
                            .addComponent(pannel_modif_image_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label_modif_synop_film)))
                .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addComponent(scrollpanel_modif_synop_film, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(b_bloquer_modif_film)
                            .addComponent(b_brouillon_modif_film)
                            .addComponent(b_valider_modif_film)
                            .addComponent(tf_modif_film_14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_14))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(b_revenir_modif_film)
                        .addGap(19, 19, 19))
                    .addGroup(layered_modif_filmLayout.createSequentialGroup()
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_modif_film_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layered_modif_filmLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(label_modif_film_8)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_filmLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_film_13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_film_13))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout panel_film_modifLayout = new javax.swing.GroupLayout(panel_film_modif);
        panel_film_modif.setLayout(panel_film_modifLayout);
        panel_film_modifLayout.setHorizontalGroup(
            panel_film_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_film_modifLayout.createSequentialGroup()
                .addGroup(panel_film_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_film_modifLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(label_titre_modif_film))
                    .addGroup(panel_film_modifLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layered_modif_film, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_film_modifLayout.setVerticalGroup(
            panel_film_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_film_modifLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label_titre_modif_film)
                .addGap(18, 18, 18)
                .addComponent(layered_modif_film, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("FILM MODIF", panel_film_modif);

        pannel_criteres_livre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_critere_livre_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_critere_livre_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_livre_2.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_livre_3.setMinimumSize(new java.awt.Dimension(50, 26));
        tf_critere_livre_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_livre_4.setPreferredSize(new java.awt.Dimension(120, 26));

        cb_critere_livre_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_livre_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_livre_2ActionPerformed(evt);
            }
        });

        cb_critere_livre_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_livre_3.setSize(new java.awt.Dimension(96, 27));

        cb_critere_livre_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_livre_1.setMinimumSize(new java.awt.Dimension(250, 27));

        cb_critere_livre_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_livre_4.setSize(new java.awt.Dimension(96, 27));

        label_ajout_critere_livre.setText("2 critères restants");
        label_ajout_critere_livre.setToolTipText("");

        b_recherche_livre.setText("Rechercher");
        b_recherche_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_recherche_livreActionPerformed(evt);
            }
        });

        b_reinitialise_livre.setText("Réinitialiser");
        b_reinitialise_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reinitialise_livreActionPerformed(evt);
            }
        });

        b_ajout_critere_livre.setText("Ajouter critère");
        b_ajout_critere_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_critere_livreActionPerformed(evt);
            }
        });

        pannel_criteres_livre.setLayer(tf_critere_livre_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(tf_critere_livre_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(tf_critere_livre_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(tf_critere_livre_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(cb_critere_livre_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(cb_critere_livre_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(cb_critere_livre_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(cb_critere_livre_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(label_ajout_critere_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(b_recherche_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(b_reinitialise_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_livre.setLayer(b_ajout_critere_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_criteres_livreLayout = new javax.swing.GroupLayout(pannel_criteres_livre);
        pannel_criteres_livre.setLayout(pannel_criteres_livreLayout);
        pannel_criteres_livreLayout.setHorizontalGroup(
            pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                .addComponent(cb_critere_livre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tf_critere_livre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                .addComponent(cb_critere_livre_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_livre_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                .addComponent(cb_critere_livre_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_livre_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                .addComponent(cb_critere_livre_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_livre_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_criteres_livreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_recherche_livre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_reinitialise_livre)
                .addContainerGap())
            .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_ajout_critere_livre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b_ajout_critere_livre))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_criteres_livreLayout.setVerticalGroup(
            pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_livreLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_livre_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_livre_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_livre_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_livre_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_livre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_livre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_livre_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_livre_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_ajout_critere_livre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ajout_critere_livre)
                .addGap(22, 22, 22)
                .addGroup(pannel_criteres_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_reinitialise_livre)
                    .addComponent(b_recherche_livre))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pannel_resultats_livre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_resultats_film1.setText("Vos résultats");

        tableau_resultats_livre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sp_tableau_resultats_livre.setViewportView(tableau_resultats_livre);

        pannel_resultats_livre.setLayer(label_resultats_film1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_livre.setLayer(sp_tableau_resultats_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_resultats_livreLayout = new javax.swing.GroupLayout(pannel_resultats_livre);
        pannel_resultats_livre.setLayout(pannel_resultats_livreLayout);
        pannel_resultats_livreLayout.setHorizontalGroup(
            pannel_resultats_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_resultats_livreLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_resultats_film1)
                .addGap(273, 273, 273))
            .addGroup(pannel_resultats_livreLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(sp_tableau_resultats_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_resultats_livreLayout.setVerticalGroup(
            pannel_resultats_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_resultats_livreLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultats_film1)
                .addGap(18, 18, 18)
                .addComponent(sp_tableau_resultats_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 571, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_livreLayout = new javax.swing.GroupLayout(panel_livre);
        panel_livre.setLayout(panel_livreLayout);
        panel_livreLayout.setHorizontalGroup(
            panel_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_livreLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pannel_criteres_livre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(pannel_resultats_livre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panel_livreLayout.setVerticalGroup(
            panel_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_livreLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_livreLayout.createSequentialGroup()
                        .addComponent(pannel_criteres_livre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 165, Short.MAX_VALUE))
                    .addComponent(pannel_resultats_livre))
                .addContainerGap())
        );

        jtabbed_general.addTab("LIVRE", panel_livre);

        label_titre_modif_livre.setText("Modification du livre \"TITRE\"");

        layered_modif_livre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layered_modif_livre.setPreferredSize(new java.awt.Dimension(940, 600));

        label_modif_livre_informations.setText("INFORMATIONS");

        label_modif_livre_ecrivains.setText("ECRIVAINS");

        label_modif_livre_image.setText("IMAGE");

        label_modif_livre_1.setText("ISBN");

        label_modif_livre_2.setText("Titre");

        label_modif_livre_3.setText("Tome");

        label_modif_livre_4.setText("Collection");

        label_modif_livre_5.setText("Année");

        label_modif_livre_6.setText("Editeur");

        tf_modif_livre_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_livre_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_livre_2.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_livre_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_livre_2ActionPerformed(evt);
            }
        });

        tf_modif_livre_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_livre_4.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_livre_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_livre_4ActionPerformed(evt);
            }
        });

        tf_modif_livre_5.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_livre_6.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_ajout_modif_ecrivains.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_ajout_modif_ecrivains.setPreferredSize(new java.awt.Dimension(120, 26));

        b_ajout_modif_ecrivains.setText("Ajouter");
        b_ajout_modif_ecrivains.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_modif_ecrivainsActionPerformed(evt);
            }
        });

        tf_modif_ecrivain_1.setText("Stallone");
        tf_modif_ecrivain_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_ecrivain_1.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_ecrivain_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_ecrivain_1ActionPerformed(evt);
            }
        });

        b_suppr_modif_ecrivain_1.setText("Supprimer");
        b_suppr_modif_ecrivain_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_ecrivain_1ActionPerformed(evt);
            }
        });

        tf_modif_ecrivain_2.setText("Staloute");
        tf_modif_ecrivain_2.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_ecrivain_2.setPreferredSize(new java.awt.Dimension(120, 26));

        b_suppr_modif_ecrivain_2.setText("Supprimer");
        b_suppr_modif_ecrivain_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_ecrivain_2ActionPerformed(evt);
            }
        });

        tf_modif_ecrivain_3.setText("Stalette");
        tf_modif_ecrivain_3.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_ecrivain_3.setPreferredSize(new java.awt.Dimension(120, 26));

        b_suppr_modif_ecrivain_3.setText("Supprimer");
        b_suppr_modif_ecrivain_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_ecrivain_3ActionPerformed(evt);
            }
        });

        b_modif_fichier_image_livre.setText("Choisir Fichier");
        b_modif_fichier_image_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modif_fichier_image_livreActionPerformed(evt);
            }
        });

        pannel_modif_image_livre.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel25.setText("IMAGE ICI");

        pannel_modif_image_livre.setLayer(jLabel25, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_modif_image_livreLayout = new javax.swing.GroupLayout(pannel_modif_image_livre);
        pannel_modif_image_livre.setLayout(pannel_modif_image_livreLayout);
        pannel_modif_image_livreLayout.setHorizontalGroup(
            pannel_modif_image_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_modif_image_livreLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(55, Short.MAX_VALUE))
        );
        pannel_modif_image_livreLayout.setVerticalGroup(
            pannel_modif_image_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_modif_image_livreLayout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel25)
                .addContainerGap(101, Short.MAX_VALUE))
        );

        label_modif_synop_livre.setText("Synopsis");

        textarea_modif_synop_livre.setColumns(20);
        textarea_modif_synop_livre.setRows(5);
        scrollpanel_modif_synop_livre.setViewportView(textarea_modif_synop_livre);

        b_revenir_modif_livre.setText("Revenir à la recherche");
        b_revenir_modif_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_revenir_modif_livreActionPerformed(evt);
            }
        });

        b_bloquer_modif_livre.setText("Bloquer");
        b_bloquer_modif_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloquer_modif_livreActionPerformed(evt);
            }
        });

        b_brouillon_modif_livre.setText("Brouillon");
        b_brouillon_modif_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_brouillon_modif_livreActionPerformed(evt);
            }
        });

        b_valider_modif_livre.setText("Valider Modifications");
        b_valider_modif_livre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_valider_modif_livreActionPerformed(evt);
            }
        });

        label_modif_livre_7.setText("ISBN");

        tf_modif_livre_7.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_livre_7.setPreferredSize(new java.awt.Dimension(120, 26));

        label_modif_livre_8.setText("Titre");

        tf_modif_livre_8.setPreferredSize(new java.awt.Dimension(120, 26));


        label_modif_livre_9.setText("Tome");
        tf_modif_livre_9.setPreferredSize(new java.awt.Dimension(120, 26));

        label_modif_livre_10.setText("Collection");
        tf_modif_livre_10.setPreferredSize(new java.awt.Dimension(120, 26));

        label_modif_livre_11.setText("Année");
        tf_modif_livre_11.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_livre_12.setPreferredSize(new java.awt.Dimension(120, 26));
        label_modif_livre_12.setText("Editeur");

        layered_modif_livre.setLayer(label_modif_livre_informations, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_ecrivains, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_ajout_modif_ecrivains, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_ajout_modif_ecrivains, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_ecrivain_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_suppr_modif_ecrivain_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_ecrivain_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_suppr_modif_ecrivain_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_ecrivain_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_suppr_modif_ecrivain_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_modif_fichier_image_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(pannel_modif_image_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_synop_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(scrollpanel_modif_synop_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_revenir_modif_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_bloquer_modif_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_brouillon_modif_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(b_valider_modif_livre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(tf_modif_livre_12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_livre.setLayer(label_modif_livre_12, javax.swing.JLayeredPane.DEFAULT_LAYER);


        javax.swing.GroupLayout layered_modif_livreLayout = new javax.swing.GroupLayout(layered_modif_livre);
        layered_modif_livre.setLayout(layered_modif_livreLayout);
        layered_modif_livreLayout.setHorizontalGroup(
            layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(label_modif_livre_informations))
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                        .addComponent(label_modif_livre_3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(tf_modif_livre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(label_modif_livre_2)
                                            .addComponent(label_modif_livre_1))
                                        .addGap(46, 46, 46)
                                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(tf_modif_livre_1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(tf_modif_livre_2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_12, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_modif_livre_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_10)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_modif_livre_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                    .addComponent(label_modif_livre_11, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_livre_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addComponent(label_modif_livre_ecrivains)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_modif_livre_image)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                        .addGap(205, 205, 205)
                                        .addComponent(b_ajout_modif_ecrivains))
                                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                        .addGap(126, 126, 126)
                                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                                .addComponent(tf_modif_ecrivain_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_ecrivain_3))
                                            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                                .addComponent(tf_modif_ecrivain_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_ecrivain_2))
                                            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                                .addComponent(tf_modif_ecrivain_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_ecrivain_1)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 110, Short.MAX_VALUE)
                                .addComponent(pannel_modif_image_livre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(scrollpanel_modif_synop_livre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(58, 58, 58))
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(tf_ajout_modif_ecrivains, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_modif_fichier_image_livre)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_modif_synop_livre)
                        .addGap(149, 149, 149))
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_livreLayout.createSequentialGroup()
                                .addComponent(b_valider_modif_livre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_brouillon_modif_livre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_bloquer_modif_livre))
                            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(b_revenir_modif_livre)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layered_modif_livreLayout.setVerticalGroup(
            layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_modif_livre_informations)
                    .addComponent(label_modif_livre_ecrivains)
                    .addComponent(label_modif_livre_image))
                .addGap(18, 18, 18)
                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ajout_modif_ecrivains, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_modif_fichier_image_livre))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_modif_livreLayout.createSequentialGroup()
                                .addComponent(b_ajout_modif_ecrivains)
                                .addGap(67, 67, 67)
                                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_ecrivain_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_suppr_modif_ecrivain_1))
                                .addGap(11, 11, 11)
                                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_ecrivain_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_suppr_modif_ecrivain_3)))
                            .addComponent(pannel_modif_image_livre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label_modif_synop_livre)
                        .addGap(12, 12, 12)
                        .addComponent(scrollpanel_modif_synop_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(layered_modif_livreLayout.createSequentialGroup()
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_3)
                            .addComponent(tf_modif_ecrivain_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_suppr_modif_ecrivain_2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_11))
                        .addGap(10, 10, 10)
                        .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_modif_livre_12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_modif_livre_12))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layered_modif_livreLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_bloquer_modif_livre)
                    .addComponent(b_brouillon_modif_livre)
                    .addComponent(b_valider_modif_livre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_revenir_modif_livre)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout panel_livre_modifLayout = new javax.swing.GroupLayout(panel_livre_modif);
        panel_livre_modif.setLayout(panel_livre_modifLayout);
        panel_livre_modifLayout.setHorizontalGroup(
            panel_livre_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_livre_modifLayout.createSequentialGroup()
                .addGroup(panel_livre_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_livre_modifLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(label_titre_modif_livre))
                    .addGroup(panel_livre_modifLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layered_modif_livre, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_livre_modifLayout.setVerticalGroup(
            panel_livre_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_livre_modifLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label_titre_modif_livre)
                .addGap(18, 18, 18)
                .addComponent(layered_modif_livre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("LIVRE MODIF", panel_livre_modif);

        pannel_criteres_musique.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_critere_musique_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_critere_musique_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_musique_2.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_musique_3.setMinimumSize(new java.awt.Dimension(50, 26));
        tf_critere_musique_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_musique_4.setPreferredSize(new java.awt.Dimension(120, 26));

        cb_critere_musique_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_musique_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_musique_2ActionPerformed(evt);
            }
        });

        cb_critere_musique_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_musique_3.setSize(new java.awt.Dimension(96, 27));

        cb_critere_musique_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_musique_1.setMinimumSize(new java.awt.Dimension(250, 27));

        cb_critere_musique_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_musique_4.setSize(new java.awt.Dimension(96, 27));

        label_ajout_critere_musique.setText("2 critères restants");
        label_ajout_critere_musique.setToolTipText("");

        b_recherche_musique.setText("Rechercher");
        b_recherche_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_recherche_musiqueActionPerformed(evt);
            }
        });

        b_reinitialise_musique.setText("Réinitialiser");
        b_reinitialise_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reinitialise_musiqueActionPerformed(evt);
            }
        });

        b_ajout_critere_musique.setText("Ajouter critère");
        b_ajout_critere_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_critere_musiqueActionPerformed(evt);
            }
        });

        pannel_criteres_musique.setLayer(tf_critere_musique_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(tf_critere_musique_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(tf_critere_musique_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(tf_critere_musique_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(cb_critere_musique_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(cb_critere_musique_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(cb_critere_musique_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(cb_critere_musique_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(label_ajout_critere_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(b_recherche_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(b_reinitialise_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique.setLayer(b_ajout_critere_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_criteres_musiqueLayout = new javax.swing.GroupLayout(pannel_criteres_musique);
        pannel_criteres_musique.setLayout(pannel_criteres_musiqueLayout);
        pannel_criteres_musiqueLayout.setHorizontalGroup(
            pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                .addComponent(cb_critere_musique_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tf_critere_musique_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                .addComponent(cb_critere_musique_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_musique_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                .addComponent(cb_critere_musique_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_musique_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                .addComponent(cb_critere_musique_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_musique_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_criteres_musiqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_recherche_musique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_reinitialise_musique)
                .addContainerGap())
            .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_ajout_critere_musique, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b_ajout_critere_musique))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_criteres_musiqueLayout.setVerticalGroup(
            pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_musiqueLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_musique_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_musique_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_musique_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_musique_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_musique_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_musique_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_musique_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_musique_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_ajout_critere_musique)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ajout_critere_musique)
                .addGap(22, 22, 22)
                .addGroup(pannel_criteres_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_reinitialise_musique)
                    .addComponent(b_recherche_musique))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pannel_resultats_musique.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_resultats_film2.setText("Vos résultats");

        tableau_resultats_musique.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sp_tableau_resultats_musique.setViewportView(tableau_resultats_musique);

        pannel_resultats_musique.setLayer(label_resultats_film2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_musique.setLayer(sp_tableau_resultats_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_resultats_musiqueLayout = new javax.swing.GroupLayout(pannel_resultats_musique);
        pannel_resultats_musique.setLayout(pannel_resultats_musiqueLayout);
        pannel_resultats_musiqueLayout.setHorizontalGroup(
            pannel_resultats_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_resultats_musiqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_resultats_film2)
                .addGap(273, 273, 273))
            .addGroup(pannel_resultats_musiqueLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(sp_tableau_resultats_musique, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pannel_resultats_musiqueLayout.setVerticalGroup(
            pannel_resultats_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_resultats_musiqueLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultats_film2)
                .addGap(18, 18, 18)
                .addComponent(sp_tableau_resultats_musique, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_musiqueLayout = new javax.swing.GroupLayout(panel_musique);
        panel_musique.setLayout(panel_musiqueLayout);
        panel_musiqueLayout.setHorizontalGroup(
            panel_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_musiqueLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pannel_criteres_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(pannel_resultats_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panel_musiqueLayout.setVerticalGroup(
            panel_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_musiqueLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannel_criteres_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pannel_resultats_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("MUSIQUE", panel_musique);

        label_titre_modif_musique.setText("Modification de la musique \"TITRE\"");

        layered_modif_musique.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layered_modif_musique.setPreferredSize(new java.awt.Dimension(940, 600));

        label_modif_musique_informations.setText("INFORMATIONS");

        label_modif_musique_artistes.setText("ARTISTES");

        label_modif_musique_image.setText("IMAGE");

        label_modif_musique_1.setText("Titre");

        label_modif_musique_2.setText("Année");

        label_modif_musique_3.setText("Groupe");

        label_modif_musique_4.setText("Album");

        tf_modif_musique_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_musique_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_musique_2.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_musique_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_musique_2ActionPerformed(evt);
            }
        });

        tf_modif_musique_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_musique_4.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_musique_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_musique_4ActionPerformed(evt);
            }
        });

        tf_ajout_modif_artistes.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_ajout_modif_artistes.setPreferredSize(new java.awt.Dimension(120, 26));

        b_ajout_modif_artistes.setText("Ajouter");
        b_ajout_modif_artistes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_modif_artistesActionPerformed(evt);
            }
        });

        tf_modif_artiste_1.setText("Stallone");
        tf_modif_artiste_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_1.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_artiste_1ActionPerformed(evt);
            }
        });

        b_suppr_modif_artistes_1.setText("Supprimer");
        b_suppr_modif_artistes_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_artistes_1ActionPerformed(evt);
            }
        });

        tf_modif_artiste_2.setText("Staloute");
        tf_modif_artiste_2.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_2.setPreferredSize(new java.awt.Dimension(120, 26));

        b_suppr_modif_artistes_2.setText("Supprimer");
        b_suppr_modif_artistes_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_artistes_2ActionPerformed(evt);
            }
        });

        tf_modif_artiste_3.setText("Stalette");
        tf_modif_artiste_3.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_3.setPreferredSize(new java.awt.Dimension(120, 26));

        b_suppr_modif_artistes_3.setText("Supprimer");
        b_suppr_modif_artistes_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_suppr_modif_artistes_3ActionPerformed(evt);
            }
        });

        b_modif_fichier_image_musique.setText("Choisir Fichier");
        b_modif_fichier_image_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modif_fichier_image_musiqueActionPerformed(evt);
            }
        });

        pannel_modif_image_musique.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pannel_modif_image_musiqueLayout = new javax.swing.GroupLayout(pannel_modif_image_musique);
        pannel_modif_image_musique.setLayout(pannel_modif_image_musiqueLayout);
        pannel_modif_image_musiqueLayout.setHorizontalGroup(
            pannel_modif_image_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );
        pannel_modif_image_musiqueLayout.setVerticalGroup(
            pannel_modif_image_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        label_modif_synop_musique.setText("Synopsis");

        textarea_voir_album_musique.setColumns(20);
        textarea_voir_album_musique.setRows(5);
        scrollpanel_modif_synop_film2.setViewportView(textarea_voir_album_musique);

        b_revenir_modif_musique.setText("Revenir à la recherche");
        b_revenir_modif_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_revenir_modif_musiqueActionPerformed(evt);
            }
        });

        b_bloquer_modif_musique.setText("Bloquer");
        b_bloquer_modif_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloquer_modif_musiqueActionPerformed(evt);
            }
        });

        b_brouillon_modif_musique.setText("Brouillon");
        b_brouillon_modif_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_brouillon_modif_musiqueActionPerformed(evt);
            }
        });

        b_valider_modif_musique.setText("Valider Modifications");
        b_valider_modif_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_valider_modif_musiqueActionPerformed(evt);
            }
        });

        pannel_modif_image_livre2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel27.setText("IMAGE ICI");

        pannel_modif_image_livre2.setLayer(jLabel27, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_modif_image_livre2Layout = new javax.swing.GroupLayout(pannel_modif_image_livre2);
        pannel_modif_image_livre2.setLayout(pannel_modif_image_livre2Layout);
        pannel_modif_image_livre2Layout.setHorizontalGroup(
            pannel_modif_image_livre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_modif_image_livre2Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_modif_image_livre2Layout.setVerticalGroup(
            pannel_modif_image_livre2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_modif_image_livre2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addComponent(jLabel27)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        b_voir_album_modif_musique.setText("Voir album");
        b_voir_album_modif_musique.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_voir_album_modif_musiqueActionPerformed(evt);
            }
        });

        textarea_modif_synop_musique.setColumns(20);
        textarea_modif_synop_musique.setRows(5);
        scrollpanel_modif_synop_musique.setViewportView(textarea_modif_synop_musique);

        layered_modif_musique.setLayer(label_modif_musique_informations, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_musique_artistes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_musique_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_musique_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_musique_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_musique_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_musique_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_musique_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_musique_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_musique_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_musique_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_ajout_modif_artistes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_ajout_modif_artistes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_artiste_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_suppr_modif_artistes_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_artiste_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_suppr_modif_artistes_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(tf_modif_artiste_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_suppr_modif_artistes_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_modif_fichier_image_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(pannel_modif_image_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(label_modif_synop_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(scrollpanel_modif_synop_film2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_revenir_modif_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_bloquer_modif_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_brouillon_modif_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_valider_modif_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(pannel_modif_image_livre2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(b_voir_album_modif_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_musique.setLayer(scrollpanel_modif_synop_musique, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layered_modif_musiqueLayout = new javax.swing.GroupLayout(layered_modif_musique);
        layered_modif_musique.setLayout(layered_modif_musiqueLayout);
        layered_modif_musiqueLayout.setHorizontalGroup(
            layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(label_modif_musique_informations))
                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                .addComponent(pannel_modif_image_livre2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_voir_album_modif_musique))
                            .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                    .addComponent(label_modif_musique_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(tf_modif_musique_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_musiqueLayout.createSequentialGroup()
                                    .addComponent(label_modif_musique_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_musique_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_musiqueLayout.createSequentialGroup()
                                    .addComponent(label_modif_musique_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_musique_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_musiqueLayout.createSequentialGroup()
                                    .addComponent(label_modif_musique_1)
                                    .addGap(46, 46, 46)
                                    .addComponent(tf_modif_musique_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(scrollpanel_modif_synop_film2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_modif_musiqueLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(label_modif_musique_artistes)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_modif_musique_image)
                        .addGap(136, 136, 136))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_modif_musiqueLayout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(tf_ajout_modif_artistes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(b_modif_fichier_image_musique)
                        .addGap(89, 89, 89))
                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(b_ajout_modif_artistes))
                                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                                .addComponent(tf_modif_artiste_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_artistes_1))
                                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                                .addComponent(tf_modif_artiste_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_artistes_2))
                                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                                .addComponent(tf_modif_artiste_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(b_suppr_modif_artistes_3)))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                                .addComponent(pannel_modif_image_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(scrollpanel_modif_synop_musique, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_modif_musiqueLayout.createSequentialGroup()
                                        .addComponent(b_valider_modif_musique)
                                        .addGap(26, 26, 26)
                                        .addComponent(b_brouillon_modif_musique)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(b_bloquer_modif_musique)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_musiqueLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_modif_synop_musique)
                .addGap(149, 149, 149))
            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(b_revenir_modif_musique)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layered_modif_musiqueLayout.setVerticalGroup(
            layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_modif_musique_informations)
                    .addComponent(label_modif_musique_artistes)
                    .addComponent(label_modif_musique_image))
                .addGap(18, 18, 18)
                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_ajout_modif_artistes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_modif_fichier_image_musique))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                .addComponent(b_ajout_modif_artistes)
                                .addGap(28, 28, 28)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_artiste_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_suppr_modif_artistes_1))
                                .addGap(18, 18, 18)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_artiste_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_suppr_modif_artistes_2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_artiste_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(b_suppr_modif_artistes_3)))
                            .addComponent(pannel_modif_image_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(label_modif_synop_musique)
                        .addGap(24, 24, 24)
                        .addComponent(scrollpanel_modif_synop_musique, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                .addComponent(tf_modif_musique_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146))
                            .addGroup(layered_modif_musiqueLayout.createSequentialGroup()
                                .addComponent(label_modif_musique_1)
                                .addGap(26, 26, 26)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_modif_musique_2)
                                    .addComponent(tf_modif_musique_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_modif_musique_3)
                                    .addComponent(tf_modif_musique_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_modif_musique_4)
                                    .addComponent(tf_modif_musique_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pannel_modif_image_livre2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(b_voir_album_modif_musique))
                        .addGap(18, 18, 18)
                        .addComponent(scrollpanel_modif_synop_film2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)))
                .addGroup(layered_modif_musiqueLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_bloquer_modif_musique)
                    .addComponent(b_brouillon_modif_musique)
                    .addComponent(b_valider_modif_musique))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_revenir_modif_musique)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_musique_modifLayout = new javax.swing.GroupLayout(panel_musique_modif);
        panel_musique_modif.setLayout(panel_musique_modifLayout);
        panel_musique_modifLayout.setHorizontalGroup(
            panel_musique_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_musique_modifLayout.createSequentialGroup()
                .addGroup(panel_musique_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_musique_modifLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(label_titre_modif_musique))
                    .addGroup(panel_musique_modifLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layered_modif_musique, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_musique_modifLayout.setVerticalGroup(
            panel_musique_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_musique_modifLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label_titre_modif_musique)
                .addGap(18, 18, 18)
                .addComponent(layered_modif_musique, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("MUSIQUE MODIF", panel_musique_modif);

        pannel_criteres_musique1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_critere_artiste_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_critere_artiste_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_artiste_2.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_artiste_3.setMinimumSize(new java.awt.Dimension(50, 26));
        tf_critere_artiste_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_artiste_4.setPreferredSize(new java.awt.Dimension(120, 26));

        cb_critere_artiste_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_artiste_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_artiste_2ActionPerformed(evt);
            }
        });

        cb_critere_artiste_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_artiste_3.setSize(new java.awt.Dimension(96, 27));

        cb_critere_artiste_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_artiste_1.setMinimumSize(new java.awt.Dimension(250, 27));

        cb_critere_artiste_4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_artiste_4.setSize(new java.awt.Dimension(96, 27));

        label_ajout_critere_artiste.setText("2 critères restants");
        label_ajout_critere_artiste.setToolTipText("");

        b_recherche_artiste.setText("Rechercher");
        b_recherche_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_recherche_artisteActionPerformed(evt);
            }
        });

        b_reinitialise_artiste.setText("Réinitialiser");
        b_reinitialise_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reinitialise_artisteActionPerformed(evt);
            }
        });

        b_ajout_critere_artiste.setText("Ajouter critère");
        b_ajout_critere_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_critere_artisteActionPerformed(evt);
            }
        });

        pannel_criteres_musique1.setLayer(tf_critere_artiste_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(tf_critere_artiste_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(tf_critere_artiste_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(tf_critere_artiste_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(cb_critere_artiste_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(cb_critere_artiste_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(cb_critere_artiste_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(cb_critere_artiste_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(label_ajout_critere_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(b_recherche_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(b_reinitialise_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_musique1.setLayer(b_ajout_critere_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_criteres_musique1Layout = new javax.swing.GroupLayout(pannel_criteres_musique1);
        pannel_criteres_musique1.setLayout(pannel_criteres_musique1Layout);
        pannel_criteres_musique1Layout.setHorizontalGroup(
            pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                .addComponent(cb_critere_artiste_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tf_critere_artiste_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                .addComponent(cb_critere_artiste_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_artiste_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                .addComponent(cb_critere_artiste_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_artiste_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                .addComponent(cb_critere_artiste_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_artiste_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_criteres_musique1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_recherche_artiste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_reinitialise_artiste)
                .addContainerGap())
            .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(label_ajout_critere_artiste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(b_ajout_critere_artiste))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_criteres_musique1Layout.setVerticalGroup(
            pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_musique1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_artiste_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_artiste_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_artiste_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_artiste_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_artiste_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_artiste_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_artiste_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_artiste_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(b_ajout_critere_artiste)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ajout_critere_artiste)
                .addGap(22, 22, 22)
                .addGroup(pannel_criteres_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_reinitialise_artiste)
                    .addComponent(b_recherche_artiste))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pannel_resultats_musique1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_resultats_artiste.setText("Vos résultats");

        tableau_resultats_artiste.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sp_tableau_resultats_artiste.setViewportView(tableau_resultats_artiste);

        pannel_resultats_musique1.setLayer(label_resultats_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_musique1.setLayer(sp_tableau_resultats_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_resultats_musique1Layout = new javax.swing.GroupLayout(pannel_resultats_musique1);
        pannel_resultats_musique1.setLayout(pannel_resultats_musique1Layout);
        pannel_resultats_musique1Layout.setHorizontalGroup(
            pannel_resultats_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_resultats_musique1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_resultats_artiste)
                .addGap(273, 273, 273))
            .addGroup(pannel_resultats_musique1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(sp_tableau_resultats_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );
        pannel_resultats_musique1Layout.setVerticalGroup(
            pannel_resultats_musique1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_resultats_musique1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultats_artiste)
                .addGap(18, 18, 18)
                .addComponent(sp_tableau_resultats_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_artistesLayout = new javax.swing.GroupLayout(panel_artistes);
        panel_artistes.setLayout(panel_artistesLayout);
        panel_artistesLayout.setHorizontalGroup(
            panel_artistesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_artistesLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pannel_criteres_musique1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(pannel_resultats_musique1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panel_artistesLayout.setVerticalGroup(
            panel_artistesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_artistesLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel_artistesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannel_criteres_musique1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pannel_resultats_musique1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("ARTISTES", panel_artistes);

        label_titre_modif_artiste.setText("Modification de l'artiste \"NOM\"");

        layered_modif_artiste.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        layered_modif_artiste.setPreferredSize(new java.awt.Dimension(940, 600));

        label_modif_artiste_informations.setText("INFORMATIONS");

        label_modif_artiste_metier.setText("ARTISTES");

        label_modif_artiste_image.setText("IMAGE");

        label_modif_artiste_1.setText("Sexe");

        label_modif_artiste_2.setText("Nom");

        label_modif_artiste_3.setText("Prénom");

        label_modif_artiste_4.setText("Née en");

        tf_modif_desartistes_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_desartistes_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_desartistes_2.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_desartistes_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_desartistes_2ActionPerformed(evt);
            }
        });

        tf_modif_desartistes_3.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_desartistes_4.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_desartistes_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_desartistes_4ActionPerformed(evt);
            }
        });

        tf_modif_artiste_metier_1.setText("Acteur");
        tf_modif_artiste_metier_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_metier_1.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_metier_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_artiste_metier_1ActionPerformed(evt);
            }
        });

        tf_modif_artiste_metier_2.setText("Réalisateur");
        tf_modif_artiste_metier_2.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_metier_2.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_modif_artiste_metier_3.setText("Scénariste");
        tf_modif_artiste_metier_3.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_modif_artiste_metier_3.setPreferredSize(new java.awt.Dimension(120, 26));

        b_modif_fichier_image_artiste.setText("Choisir Fichier");
        b_modif_fichier_image_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modif_fichier_image_artisteActionPerformed(evt);
            }
        });

        pannel_modif_image_artiste.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout pannel_modif_image_artisteLayout = new javax.swing.GroupLayout(pannel_modif_image_artiste);
        pannel_modif_image_artiste.setLayout(pannel_modif_image_artisteLayout);
        pannel_modif_image_artisteLayout.setHorizontalGroup(
            pannel_modif_image_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 217, Short.MAX_VALUE)
        );
        pannel_modif_image_artisteLayout.setVerticalGroup(
            pannel_modif_image_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 216, Short.MAX_VALUE)
        );

        label_modif_synop_artiste.setText("Commentaires");

        b_revenir_modif_artiste.setText("Revenir à la recherche");
        b_revenir_modif_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_revenir_modif_artisteActionPerformed(evt);
            }
        });

        b_bloquer_modif_artiste.setText("Bloquer");
        b_bloquer_modif_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_bloquer_modif_artisteActionPerformed(evt);
            }
        });

        b_brouillon_modif_artiste.setText("Brouillon");
        b_brouillon_modif_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_brouillon_modif_artisteActionPerformed(evt);
            }
        });

        b_valider_modif_artiste.setText("Valider Modifications");
        b_valider_modif_artiste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_valider_modif_artisteActionPerformed(evt);
            }
        });

        textarea_modif_synop_artiste.setColumns(20);
        textarea_modif_synop_artiste.setRows(5);
        scrollpanel_modif_synop_artiste.setViewportView(textarea_modif_synop_artiste);

        tf_modif_desartistes_5.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_desartistes_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_desartistes_5ActionPerformed(evt);
            }
        });

        label_modif_artiste_5.setText("Mort en");

        tf_modif_desartistes_6.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_desartistes_6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_desartistes_6ActionPerformed(evt);
            }
        });

        label_modif_artiste_6.setText("Pays");

        tf_modif_desartistes_7.setPreferredSize(new java.awt.Dimension(120, 26));
        tf_modif_desartistes_7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_modif_desartistes_7ActionPerformed(evt);
            }
        });

        label_modif_artiste_7.setText("Surnom");

        layered_modif_artiste.setLayer(label_modif_artiste_informations, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_metier, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_image, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_artiste_metier_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_artiste_metier_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_artiste_metier_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(b_modif_fichier_image_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(pannel_modif_image_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_synop_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(b_revenir_modif_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(b_bloquer_modif_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(b_brouillon_modif_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(b_valider_modif_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(scrollpanel_modif_synop_artiste, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(tf_modif_desartistes_7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        layered_modif_artiste.setLayer(label_modif_artiste_7, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layered_modif_artisteLayout = new javax.swing.GroupLayout(layered_modif_artiste);
        layered_modif_artiste.setLayout(layered_modif_artisteLayout);
        layered_modif_artisteLayout.setHorizontalGroup(
            layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(label_modif_artiste_informations))
                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                .addComponent(label_modif_artiste_7)
                                .addGap(27, 27, 27)
                                .addComponent(tf_modif_desartistes_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                    .addComponent(label_modif_artiste_6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_desartistes_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                    .addComponent(label_modif_artiste_5, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(21, 21, 21)
                                    .addComponent(tf_modif_desartistes_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_modif_artisteLayout.createSequentialGroup()
                                    .addComponent(label_modif_artiste_4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_desartistes_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                    .addComponent(label_modif_artiste_3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_desartistes_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                    .addComponent(label_modif_artiste_2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tf_modif_desartistes_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                    .addComponent(label_modif_artiste_1)
                                    .addGap(46, 46, 46)
                                    .addComponent(tf_modif_desartistes_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(label_modif_artiste_metier)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(label_modif_artiste_image)
                        .addGap(136, 136, 136))
                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                        .addGap(174, 485, Short.MAX_VALUE)
                        .addComponent(b_modif_fichier_image_artiste)
                        .addGap(89, 89, 89))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_artisteLayout.createSequentialGroup()
                        .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tf_modif_artiste_metier_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_modif_artiste_metier_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_modif_artiste_metier_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(135, 135, 135)
                                .addComponent(pannel_modif_image_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(scrollpanel_modif_synop_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layered_modif_artisteLayout.createSequentialGroup()
                                .addComponent(b_valider_modif_artiste)
                                .addGap(26, 26, 26)
                                .addComponent(b_brouillon_modif_artiste)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_bloquer_modif_artiste)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layered_modif_artisteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_modif_synop_artiste)
                .addGap(149, 149, 149))
            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                .addGap(321, 321, 321)
                .addComponent(b_revenir_modif_artiste)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layered_modif_artisteLayout.setVerticalGroup(
            layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_modif_artiste_informations)
                    .addComponent(label_modif_artiste_metier)
                    .addComponent(label_modif_artiste_image))
                .addGap(18, 18, 18)
                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                        .addComponent(b_modif_fichier_image_artiste)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pannel_modif_image_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(label_modif_synop_artiste)
                        .addGap(24, 24, 24)
                        .addComponent(scrollpanel_modif_synop_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                        .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                .addComponent(tf_modif_artiste_metier_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_modif_artiste_metier_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tf_modif_artiste_metier_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                        .addComponent(tf_modif_desartistes_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(146, 146, 146))
                                    .addGroup(layered_modif_artisteLayout.createSequentialGroup()
                                        .addComponent(label_modif_artiste_1)
                                        .addGap(26, 26, 26)
                                        .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(label_modif_artiste_2)
                                            .addComponent(tf_modif_desartistes_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(label_modif_artiste_3)
                                            .addComponent(tf_modif_desartistes_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(22, 22, 22)
                                        .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(label_modif_artiste_4)
                                            .addComponent(tf_modif_desartistes_4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_modif_artiste_5)
                                    .addComponent(tf_modif_desartistes_5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(label_modif_artiste_6)
                                    .addComponent(tf_modif_desartistes_6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(tf_modif_desartistes_7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label_modif_artiste_7))))
                        .addGap(111, 111, 111)))
                .addGroup(layered_modif_artisteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_bloquer_modif_artiste)
                    .addComponent(b_brouillon_modif_artiste)
                    .addComponent(b_valider_modif_artiste))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_revenir_modif_artiste)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_artiste_modifLayout = new javax.swing.GroupLayout(panel_artiste_modif);
        panel_artiste_modif.setLayout(panel_artiste_modifLayout);
        panel_artiste_modifLayout.setHorizontalGroup(
            panel_artiste_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_artiste_modifLayout.createSequentialGroup()
                .addGroup(panel_artiste_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_artiste_modifLayout.createSequentialGroup()
                        .addGap(393, 393, 393)
                        .addComponent(label_titre_modif_artiste))
                    .addGroup(panel_artiste_modifLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(layered_modif_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        panel_artiste_modifLayout.setVerticalGroup(
            panel_artiste_modifLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_artiste_modifLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(label_titre_modif_artiste)
                .addGap(18, 18, 18)
                .addComponent(layered_modif_artiste, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(69, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("ARTISTE MODIF", panel_artiste_modif);

        label_bdd_titre.setText("Critère à éditer");

        cb_critere_bdd.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        b_valider_critere_bdd.setText("Valider");
        b_valider_critere_bdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_valider_critere_bddActionPerformed(evt);
            }
        });

        lp_bdd_1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        lp_bdd_2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_bdd_valeur_1.setText("Valeur 1");

        b_modifier_critere_bdd_1.setText("Modifier");
        b_modifier_critere_bdd_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modifier_critere_bdd_1ActionPerformed(evt);
            }
        });

        b_supprimer_critere_bdd_1.setText("Supprimer");
        b_supprimer_critere_bdd_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supprimer_critere_bdd_1ActionPerformed(evt);
            }
        });

        label_bdd_valeur_2.setText("Valeur 2");

        b_modifier_critere_bdd_2.setText("Modifier");
        b_modifier_critere_bdd_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modifier_critere_bdd_2ActionPerformed(evt);
            }
        });

        b_supprimer_critere_bdd_2.setText("Supprimer");
        b_supprimer_critere_bdd_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supprimer_critere_bdd_2ActionPerformed(evt);
            }
        });

        label_bdd_valeur_3.setText("Valeur 3");

        b_modifier_critere_bdd_3.setText("Modifier");
        b_modifier_critere_bdd_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modifier_critere_bdd_3ActionPerformed(evt);
            }
        });

        b_supprimer_critere_bdd_3.setText("Supprimer");
        b_supprimer_critere_bdd_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supprimer_critere_bdd_3ActionPerformed(evt);
            }
        });

        label_bdd_valeur_4.setText("Valeur 4");

        b_modifier_critere_bdd_4.setText("Modifier");
        b_modifier_critere_bdd_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modifier_critere_bdd_4ActionPerformed(evt);
            }
        });

        b_supprimer_critere_bdd_4.setText("Supprimer");
        b_supprimer_critere_bdd_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supprimer_critere_bdd_4ActionPerformed(evt);
            }
        });

        label_bdd_valeur_5.setText("Valeur 5");

        b_modifier_critere_bdd_5.setText("Modifier");
        b_modifier_critere_bdd_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_modifier_critere_bdd_5ActionPerformed(evt);
            }
        });

        b_supprimer_critere_bdd_5.setText("Supprimer");
        b_supprimer_critere_bdd_5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_supprimer_critere_bdd_5ActionPerformed(evt);
            }
        });

        lp_bdd_2.setLayer(label_bdd_valeur_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_modifier_critere_bdd_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_supprimer_critere_bdd_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(label_bdd_valeur_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_modifier_critere_bdd_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_supprimer_critere_bdd_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(label_bdd_valeur_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_modifier_critere_bdd_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_supprimer_critere_bdd_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(label_bdd_valeur_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_modifier_critere_bdd_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_supprimer_critere_bdd_4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(label_bdd_valeur_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_modifier_critere_bdd_5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_2.setLayer(b_supprimer_critere_bdd_5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lp_bdd_2Layout = new javax.swing.GroupLayout(lp_bdd_2);
        lp_bdd_2.setLayout(lp_bdd_2Layout);
        lp_bdd_2Layout.setHorizontalGroup(
            lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lp_bdd_2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lp_bdd_2Layout.createSequentialGroup()
                        .addComponent(label_bdd_valeur_1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_modifier_critere_bdd_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_supprimer_critere_bdd_1))
                    .addGroup(lp_bdd_2Layout.createSequentialGroup()
                        .addComponent(label_bdd_valeur_2, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_modifier_critere_bdd_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_supprimer_critere_bdd_2))
                    .addGroup(lp_bdd_2Layout.createSequentialGroup()
                        .addComponent(label_bdd_valeur_3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_modifier_critere_bdd_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_supprimer_critere_bdd_3))
                    .addGroup(lp_bdd_2Layout.createSequentialGroup()
                        .addComponent(label_bdd_valeur_4, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_modifier_critere_bdd_4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_supprimer_critere_bdd_4))
                    .addGroup(lp_bdd_2Layout.createSequentialGroup()
                        .addComponent(label_bdd_valeur_5, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_modifier_critere_bdd_5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b_supprimer_critere_bdd_5)))
                .addContainerGap(16, Short.MAX_VALUE))
        );
        lp_bdd_2Layout.setVerticalGroup(
            lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lp_bdd_2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bdd_valeur_1)
                    .addComponent(b_modifier_critere_bdd_1)
                    .addComponent(b_supprimer_critere_bdd_1))
                .addGap(18, 18, 18)
                .addGroup(lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bdd_valeur_2)
                    .addComponent(b_modifier_critere_bdd_2)
                    .addComponent(b_supprimer_critere_bdd_2))
                .addGap(18, 18, 18)
                .addGroup(lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bdd_valeur_3)
                    .addComponent(b_modifier_critere_bdd_3)
                    .addComponent(b_supprimer_critere_bdd_3))
                .addGap(18, 18, 18)
                .addGroup(lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bdd_valeur_4)
                    .addComponent(b_modifier_critere_bdd_4)
                    .addComponent(b_supprimer_critere_bdd_4))
                .addGap(18, 18, 18)
                .addGroup(lp_bdd_2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(label_bdd_valeur_5)
                    .addComponent(b_modifier_critere_bdd_5)
                    .addComponent(b_supprimer_critere_bdd_5))
                .addContainerGap(269, Short.MAX_VALUE))
        );

        lp_bdd_3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        b_ajout_critere_bdd.setText("Ajouter");
        b_ajout_critere_bdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_critere_bddActionPerformed(evt);
            }
        });

        b_valider_ajout_bdd.setText("Valider ajouts");
        b_valider_ajout_bdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_valider_ajout_bddActionPerformed(evt);
            }
        });

        lp_bdd_3.setLayer(tf_ajout_critere_bdd_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_3.setLayer(tf_ajout_critere_bdd_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_3.setLayer(b_ajout_critere_bdd, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_3.setLayer(b_valider_ajout_bdd, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lp_bdd_3Layout = new javax.swing.GroupLayout(lp_bdd_3);
        lp_bdd_3.setLayout(lp_bdd_3Layout);
        lp_bdd_3Layout.setHorizontalGroup(
            lp_bdd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lp_bdd_3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(lp_bdd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp_bdd_3Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(lp_bdd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tf_ajout_critere_bdd_2, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tf_ajout_critere_bdd_1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lp_bdd_3Layout.createSequentialGroup()
                        .addGroup(lp_bdd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(lp_bdd_3Layout.createSequentialGroup()
                                .addComponent(b_ajout_critere_bdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp_bdd_3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(b_valider_ajout_bdd)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        lp_bdd_3Layout.setVerticalGroup(
            lp_bdd_3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp_bdd_3Layout.createSequentialGroup()
                .addContainerGap(353, Short.MAX_VALUE)
                .addComponent(tf_ajout_critere_bdd_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(tf_ajout_critere_bdd_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_ajout_critere_bdd)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_valider_ajout_bdd)
                .addGap(33, 33, 33))
        );

        lp_bdd_1.setLayer(lp_bdd_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        lp_bdd_1.setLayer(lp_bdd_3, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout lp_bdd_1Layout = new javax.swing.GroupLayout(lp_bdd_1);
        lp_bdd_1.setLayout(lp_bdd_1Layout);
        lp_bdd_1Layout.setHorizontalGroup(
            lp_bdd_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lp_bdd_1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lp_bdd_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(lp_bdd_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        lp_bdd_1Layout.setVerticalGroup(
            lp_bdd_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, lp_bdd_1Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(lp_bdd_1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lp_bdd_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lp_bdd_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_bddLayout = new javax.swing.GroupLayout(panel_bdd);
        panel_bdd.setLayout(panel_bddLayout);
        panel_bddLayout.setHorizontalGroup(
            panel_bddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bddLayout.createSequentialGroup()
                .addGroup(panel_bddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bddLayout.createSequentialGroup()
                        .addGap(445, 445, 445)
                        .addGroup(panel_bddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cb_critere_bdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label_bdd_titre)
                            .addComponent(b_valider_critere_bdd)))
                    .addGroup(panel_bddLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lp_bdd_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        panel_bddLayout.setVerticalGroup(
            panel_bddLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bddLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(label_bdd_titre)
                .addGap(18, 18, 18)
                .addComponent(cb_critere_bdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(b_valider_critere_bdd)
                .addGap(18, 18, 18)
                .addComponent(lp_bdd_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("GESTION BDD", panel_bdd);

        pannel_criteres_users.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tf_critere_users_1.setMinimumSize(new java.awt.Dimension(120, 26));
        tf_critere_users_1.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_users_2.setPreferredSize(new java.awt.Dimension(120, 26));

        tf_critere_users_3.setMinimumSize(new java.awt.Dimension(50, 26));
        tf_critere_users_3.setPreferredSize(new java.awt.Dimension(120, 26));

        cb_critere_users_2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_users_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_critere_users_2ActionPerformed(evt);
            }
        });

        cb_critere_users_3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_users_3.setSize(new java.awt.Dimension(96, 27));

        cb_critere_users_1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Réalisateur", "Année", "Acteur", "Budget", "Scénariste" }));
        cb_critere_users_1.setMinimumSize(new java.awt.Dimension(250, 27));

        label_ajout_critere_users.setText("1 critère restant");
        label_ajout_critere_users.setToolTipText("");

        b_recherche_users.setText("Rechercher");
        b_recherche_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_recherche_usersActionPerformed(evt);
            }
        });

        b_reinitialise_users.setText("Réinitialiser");
        b_reinitialise_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_reinitialise_usersActionPerformed(evt);
            }
        });

        b_ajout_critere_users.setText("Ajouter critère");
        b_ajout_critere_users.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_ajout_critere_usersActionPerformed(evt);
            }
        });

        pannel_criteres_users.setLayer(tf_critere_users_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(tf_critere_users_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(tf_critere_users_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(cb_critere_users_2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(cb_critere_users_3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(cb_critere_users_1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(label_ajout_critere_users, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(b_recherche_users, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(b_reinitialise_users, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_criteres_users.setLayer(b_ajout_critere_users, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_criteres_usersLayout = new javax.swing.GroupLayout(pannel_criteres_users);
        pannel_criteres_users.setLayout(pannel_criteres_usersLayout);
        pannel_criteres_usersLayout.setHorizontalGroup(
            pannel_criteres_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_usersLayout.createSequentialGroup()
                .addComponent(cb_critere_users_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(tf_critere_users_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_usersLayout.createSequentialGroup()
                .addComponent(cb_critere_users_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_users_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pannel_criteres_usersLayout.createSequentialGroup()
                .addComponent(cb_critere_users_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tf_critere_users_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_criteres_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(b_recherche_users)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(b_reinitialise_users)
                .addContainerGap())
            .addGroup(pannel_criteres_usersLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(b_ajout_critere_users)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_criteres_usersLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_ajout_critere_users, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58))
        );
        pannel_criteres_usersLayout.setVerticalGroup(
            pannel_criteres_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_criteres_usersLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(pannel_criteres_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_users_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_users_1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(pannel_criteres_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_critere_users_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_users_2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pannel_criteres_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_critere_users_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_critere_users_3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(b_ajout_critere_users)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_ajout_critere_users)
                .addGap(22, 22, 22)
                .addGroup(pannel_criteres_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b_reinitialise_users)
                    .addComponent(b_recherche_users))
                .addContainerGap(231, Short.MAX_VALUE))
        );

        pannel_resultats_users.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        label_resultats_users.setText("Vos résultats");

        tableau_resultats_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sp_tableau_resultats_users.setViewportView(tableau_resultats_users);

        pannel_resultats_users.setLayer(label_resultats_users, javax.swing.JLayeredPane.DEFAULT_LAYER);
        pannel_resultats_users.setLayer(sp_tableau_resultats_users, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout pannel_resultats_usersLayout = new javax.swing.GroupLayout(pannel_resultats_users);
        pannel_resultats_users.setLayout(pannel_resultats_usersLayout);
        pannel_resultats_usersLayout.setHorizontalGroup(
            pannel_resultats_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_resultats_usersLayout.createSequentialGroup()
                .addContainerGap(286, Short.MAX_VALUE)
                .addComponent(label_resultats_users)
                .addGap(273, 273, 273))
            .addGroup(pannel_resultats_usersLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(sp_tableau_resultats_users, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pannel_resultats_usersLayout.setVerticalGroup(
            pannel_resultats_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_resultats_usersLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(label_resultats_users)
                .addGap(18, 18, 18)
                .addComponent(sp_tableau_resultats_users, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_usersLayout = new javax.swing.GroupLayout(panel_users);
        panel_users.setLayout(panel_usersLayout);
        panel_usersLayout.setHorizontalGroup(
            panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usersLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(pannel_criteres_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(pannel_resultats_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36))
        );
        panel_usersLayout.setVerticalGroup(
            panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_usersLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(panel_usersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pannel_criteres_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pannel_resultats_users, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("USERS", panel_users);

        jp_users_comm.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tab_brouillons1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sp_users_comm.setViewportView(tab_brouillons1);

        b_revenir_users_comm.setText("Revenir aux résultats");

        jp_users_comm.setLayer(sp_users_comm, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jp_users_comm.setLayer(b_revenir_users_comm, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jp_users_commLayout = new javax.swing.GroupLayout(jp_users_comm);
        jp_users_comm.setLayout(jp_users_commLayout);
        jp_users_commLayout.setHorizontalGroup(
            jp_users_commLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_users_commLayout.createSequentialGroup()
                .addGroup(jp_users_commLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_users_commLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(sp_users_comm, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_users_commLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(b_revenir_users_comm)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jp_users_commLayout.setVerticalGroup(
            jp_users_commLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_users_commLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(sp_users_comm, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(b_revenir_users_comm)
                .addGap(20, 20, 20))
        );

        label_users_comm_titre.setText("Commentaires de l'utilisateur \"NOM\"");

        javax.swing.GroupLayout pannel_users_commLayout = new javax.swing.GroupLayout(pannel_users_comm);
        pannel_users_comm.setLayout(pannel_users_commLayout);
        pannel_users_commLayout.setHorizontalGroup(
            pannel_users_commLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_users_commLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jp_users_comm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pannel_users_commLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_users_comm_titre)
                .addGap(374, 374, 374))
        );
        pannel_users_commLayout.setVerticalGroup(
            pannel_users_commLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pannel_users_commLayout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addComponent(label_users_comm_titre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jp_users_comm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("USERS COMM", pannel_users_comm);

        choix_brouillon_1.setText("Brouillon admin");
        choix_brouillon_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_brouillon_1ActionPerformed(evt);
            }
        });

        choix_brouillon_2.setText("Suggestions Utilisateurs");
        choix_brouillon_2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_brouillon_2ActionPerformed(evt);
            }
        });

        choix_brouillon_3.setText("Pages bloquées");
        choix_brouillon_3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_brouillon_3ActionPerformed(evt);
            }
        });

        choix_brouillon_4.setText("Commentaires bloqués");
        choix_brouillon_4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                choix_brouillon_4ActionPerformed(evt);
            }
        });

        b_valider_brouillons.setText("Valider");

        jp_brouillons.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tab_brouillons.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        sp_brouillons.setViewportView(tab_brouillons);

        b_revenir_brouillons.setText("Revenir aux résultats");

        jp_brouillons.setLayer(sp_brouillons, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jp_brouillons.setLayer(b_revenir_brouillons, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jp_brouillonsLayout = new javax.swing.GroupLayout(jp_brouillons);
        jp_brouillons.setLayout(jp_brouillonsLayout);
        jp_brouillonsLayout.setHorizontalGroup(
            jp_brouillonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_brouillonsLayout.createSequentialGroup()
                .addGroup(jp_brouillonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jp_brouillonsLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(sp_brouillons, javax.swing.GroupLayout.PREFERRED_SIZE, 906, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jp_brouillonsLayout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addComponent(b_revenir_brouillons)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jp_brouillonsLayout.setVerticalGroup(
            jp_brouillonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jp_brouillonsLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(sp_brouillons, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(b_revenir_brouillons)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panel_brouillonLayout = new javax.swing.GroupLayout(panel_brouillon);
        panel_brouillon.setLayout(panel_brouillonLayout);
        panel_brouillonLayout.setHorizontalGroup(
            panel_brouillonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_brouillonLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addGroup(panel_brouillonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_brouillonLayout.createSequentialGroup()
                        .addComponent(b_valider_brouillons)
                        .addGap(439, 439, 439))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_brouillonLayout.createSequentialGroup()
                        .addComponent(choix_brouillon_1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choix_brouillon_2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choix_brouillon_3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(choix_brouillon_4)
                        .addGap(140, 140, 140))))
            .addGroup(panel_brouillonLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jp_brouillons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_brouillonLayout.setVerticalGroup(
            panel_brouillonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_brouillonLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_brouillonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(choix_brouillon_1)
                    .addComponent(choix_brouillon_2)
                    .addComponent(choix_brouillon_3)
                    .addComponent(choix_brouillon_4))
                .addGap(18, 18, 18)
                .addComponent(b_valider_brouillons)
                .addGap(18, 18, 18)
                .addComponent(jp_brouillons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jtabbed_general.addTab("BROUILLONS", panel_brouillon);

        javax.swing.GroupLayout panel_generalLayout = new javax.swing.GroupLayout(panel_general);
        panel_general.setLayout(panel_generalLayout);
        panel_generalLayout.setHorizontalGroup(
            panel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_generalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtabbed_general, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_generalLayout.setVerticalGroup(
            panel_generalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_generalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtabbed_general, javax.swing.GroupLayout.PREFERRED_SIZE, 778, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(166, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_general, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>                        

    private void b_reinitialise_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                    
       // TODO add your handling code here:
       mon_formulaire_film.resetForm();
    }                                                   

                                              

    private void cb_critere_film_1ActionPerformed(java.awt.event.ActionEvent evt) {  
        String critere_film_1 = cb_critere_film_1.getSelectedItem().toString();                                              
        if (critere_film_1 == "Choisissez")
            tf_critere_film_1.setEnabled(false);
        else tf_critere_film_1.setEnabled(true);
    }
    private void cb_critere_film_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String critere_film_2 = cb_critere_film_2.getSelectedItem().toString();                                              
        if (critere_film_2 == "Choisissez")
            tf_critere_film_2.setEnabled(false);
        else tf_critere_film_2.setEnabled(true);
    } 
    private void cb_critere_film_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String critere_film_3 = cb_critere_film_3.getSelectedItem().toString();                                              
        if (critere_film_3 == "Choisissez")
            tf_critere_film_3.setEnabled(false);
        else tf_critere_film_3.setEnabled(true);
    } 
    private void cb_critere_film_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        String critere_film_4 = cb_critere_film_4.getSelectedItem().toString();                                              
        if (critere_film_4 == "Choisissez")
            tf_critere_film_4.setEnabled(false);
        else tf_critere_film_4.setEnabled(true);
    } 

    private String verif_combobox (
        HashMap<javax.swing.JComboBox,javax.swing.JTextField> hm){
    	String requete_complementaire = "";
    	
    	for(javax.swing.JComboBox i : hm.keySet())
    	{
	
    		String choix_user = i.getSelectedItem().toString();
	        String valeur_choix = hm.get(i).getText();

	    if (choix_user == "Nom Réalisateur")
        {
            requete_complementaire += "AND media_id IN "
                + "(SELECT media.media_id FROM media JOIN take_part_in ON media.media_id=take_part_in.media_id WHERE human_id=(SELECT DISTINCT human.human_id FROM human JOIN take_part_in ON human.human_id=take_part_in.human_id WHERE human_lastname=\"" + valeur_choix +"\"))";
        }
        else if (choix_user == "Prénom Réalisateur")
        {
            requete_complementaire += "AND media_id IN "
                    + "(SELECT media.media_id FROM media JOIN take_part_in ON media.media_id=take_part_in.media_id  WHERE human_id=(SELECT DISTINCT human.human_id FROM human JOIN take_part_in ON human.human_id=take_part_in.human_id WHERE human_firstname=\"" + valeur_choix +"\") AND work_id= (SELECT work_id FROM work WHERE work_name=\"Réalisateur\"))";
        }
        else if (choix_user == "Nom Acteur") 
        {
            requete_complementaire += "AND media_id IN "
                    + "(SELECT media.media_id FROM media JOIN take_part_in ON media.media_id=take_part_in.media_id  WHERE human_id=(SELECT DISTINCT human.human_id FROM human JOIN take_part_in ON human.human_id=take_part_in.human_id WHERE human_lastname=\"" + valeur_choix +"\") AND work_id= (SELECT work_id FROM work WHERE work_name=\"Acteur\"))";
        }
        else if (choix_user == "Prénom Acteur")
        {
            requete_complementaire += "AND media_id IN "
                    + "(SELECT media.media_id FROM media JOIN take_part_in ON media.media_id=take_part_in.media_id  WHERE human_id=(SELECT DISTINCT human.human_id FROM human JOIN take_part_in ON human.human_id=take_part_in.human_id WHERE human_firstname=\"" + valeur_choix +"\") AND work_id= (SELECT work_id FROM work WHERE work_name=\"Acteur\"))";
        }
        else if (choix_user == "Visa")
            requete_complementaire += "AND media_id IN " + "(SELECT media.media_id FROM media JOIN movie ON media_id=movie_id WHERE visa=\"" + valeur_choix + "\")))";
        else if (choix_user == "Genre")
        {
            requete_complementaire += "AND media_id IN (SELECT media.media_id FROM media JOIN categorized_by ON media.media_id=categorized_by.media_id WHERE genre_id IN (SELECT DISTINCT categorized_by.genre_id FROM categorized_by JOIN genre ON categorized_by.genre_id=genre.genre_id WHERE genre_name=\"" + valeur_choix +"\"))";
        }
        else if (choix_user == "Année")
        {
            requete_complementaire += "AND media_id IN " + "(SELECT media.media_id FROM media JOIN movie ON media_id=movie_id WHERE movie_year=\"" + valeur_choix + "\")";
        }
        else if (choix_user == "Tag") 
            requete_complementaire += "JOIN is_associated_with ON media.media_id=is_associated_with.media_id WHERE tag_id IN (SELECT DISTINCT is_associated_with.tag_id FROM is_associated_with JOIN tag ON is_associated_with.tag_id=tag.tag_id WHERE tag_name=\"" + valeur_choix + "\")";
            
    }
    requete_complementaire += "))";
    return requete_complementaire;
}  



    private void b_recherche_filmActionPerformed(java.awt.event.ActionEvent evt, String req) throws SQLException {   

    	tableau_resultats_film.removeAll();
        String critere_bdd_1 = "";                                              
        System.out.println(tf_critere_film_1.getText()); 
        if (cb_critere_film_1.getSelectedItem() == "Nom Réalisateur")
            critere_bdd_1 = "human_lastname"; 
        else if (cb_critere_film_1.getSelectedItem() == "Prénom Réalisateur")
            critere_bdd_1 = "human_firstname"; 

        String requette = "SELECT media_id FROM media WHERE media_id IN (SELECT media.media_id FROM media JOIN take_part_in ON media.media_id=take_part_in.media_id WHERE human_id=(SELECT DISTINCT human.human_id FROM human JOIN take_part_in ON human.human_id=take_part_in.human_id WHERE "+critere_bdd_1+"= \""+tf_critere_film_1.getText()+"\") AND work_id= (SELECT work_id FROM work WHERE work_name=\"Réalisateur\"))";

        
        Object tab[][] = Requete.rechercheFilm(req); 
        String titre[] = {"Id", "Titre","Année"}; 
        
        tableau_resultats_film.setModel(new javax.swing.table.DefaultTableModel(tab,titre)); //Affichage 
      
    }  

                        
    private void b_creerActionPerformed(java.awt.event.ActionEvent evt) {   
        layered_creation.setVisible(false);                                     
        layered_creation.setVisible(true);
         
        choix_creation = choix_group.getSelection().getActionCommand();
        if (choix_creation == "Livre"){
            label_informations_1.setText("ISBN");
            label_informations_1.setVisible(true);
            tf_informations_1.setVisible(true);

            label_informations_2.setText("Titre");
            label_informations_2.setVisible(true);
            tf_informations_2.setVisible(true);

            label_informations_3.setText("Tome");
            label_informations_3.setVisible(true);
            tf_informations_3.setVisible(true);

            label_informations_4.setText("Saga");
            label_informations_4.setVisible(true);
            tf_informations_4.setVisible(true);

            label_informations_5.setText("Année");
            label_informations_5.setVisible(true);
            tf_informations_5.setVisible(true);

            label_informations_6.setText("Editeur");
            label_informations_6.setVisible(true);
            tf_informations_6.setVisible(true);

            label_informations_7.setText("Lien");
            label_informations_7.setVisible(true);
            tf_informations_7.setVisible(true);

            label_informations_8.setText("Tag 1");
            label_informations_8.setEnabled(true);
            tf_informations_8.setEnabled(true);

            label_informations_9.setText("Tag 2");
            label_informations_9.setEnabled(true);
            tf_informations_9.setEnabled(true);

            label_informations_10.setText("Tag 3");
            label_informations_10.setEnabled(true);
            tf_informations_10.setEnabled(true);

            label_informations_11.setText("Genre 1");
            label_informations_11.setEnabled(true);
            tf_informations_11.setEnabled(true);

            label_informations_12.setText("Genre 2");
            label_informations_12.setEnabled(true);
            tf_informations_12.setEnabled(true);

            label_informations_13.setText("");
            label_informations_13.setEnabled(false);
            tf_informations_13.setEnabled(false);

            label_informations_14.setText("");
            label_informations_14.setEnabled(true);
            tf_informations_14.setEnabled(false);

            label_informations_17.setText("");
            label_informations_17.setEnabled(true);
            tf_informations_17.setEnabled(false);

            label_acteurs.setText("Ecrivains");
            tf_ajout_acteur.setEnabled(true);
            b_ajout_acteur.setEnabled(true);
            b_suppr_list.setEnabled(true);
            //LIST
            label_synop.setEnabled(true);
            textarea_synop.setEnabled(true);
        }
        else if (choix_creation == "Musique"){

            label_informations_1.setText("Titre");
            label_informations_1.setVisible(true);
            tf_informations_1.setVisible(true);

            label_informations_2.setText("Année");
            label_informations_2.setVisible(true);
            tf_informations_2.setVisible(true);

            label_informations_3.setText("Groupe");
            label_informations_3.setVisible(true);
            tf_informations_3.setVisible(true);

            label_informations_4.setText("Album");
            label_informations_4.setVisible(true);
            tf_informations_4.setVisible(true);

            label_informations_5.setText("Lien");
            label_informations_5.setVisible(true);
            tf_informations_5.setVisible(true);

            label_informations_6.setText("Tag 1");
            label_informations_6.setVisible(true);
            tf_informations_6.setVisible(true);

            label_informations_7.setText("Tag 2");
            label_informations_7.setVisible(true);
            tf_informations_7.setVisible(true);

            label_informations_8.setText("Tag 3");
            label_informations_8.setEnabled(true);
            tf_informations_8.setEnabled(true);

            label_informations_9.setText("Genre 1");
            label_informations_9.setEnabled(true);
            tf_informations_9.setEnabled(true);

            label_informations_10.setText("Genre 2");
            label_informations_10.setEnabled(true);
            tf_informations_10.setEnabled(true);

            label_informations_11.setText("Label");
            label_informations_11.setEnabled(true);
            tf_informations_11.setEnabled(true);

            label_informations_12.setText("");
            label_informations_12.setEnabled(false);
            tf_informations_12.setEnabled(false);

            label_informations_13.setText("");
            label_informations_13.setEnabled(false);
            tf_informations_13.setEnabled(false);

            label_informations_14.setText("");
            label_informations_14.setEnabled(false);
            tf_informations_14.setEnabled(false);

            label_informations_17.setText("");
            label_informations_17.setEnabled(false);
            tf_informations_17.setEnabled(false);

            label_acteurs.setText("Interprètes");
            tf_ajout_acteur.setEnabled(true);
            b_ajout_acteur.setEnabled(true);
            b_suppr_list.setEnabled(true);

            label_synop.setEnabled(false);
            textarea_synop.setEnabled(false);
        }

        else if (choix_creation == "Artiste"){
            label_informations_1.setText("Sexe");
            label_informations_1.setVisible(true);
            tf_informations_1.setVisible(true);

            label_informations_2.setText("Nom");
            label_informations_2.setVisible(true);
            tf_informations_2.setVisible(true);

            label_informations_3.setText("Prénom");
            label_informations_3.setVisible(true);
            tf_informations_3.setVisible(true);

            label_informations_4.setText("Née en");
            label_informations_4.setVisible(true);
            tf_informations_4.setVisible(true);

            label_informations_5.setText("Mort en");
            label_informations_5.setVisible(true);
            tf_informations_5.setVisible(true);

            label_informations_6.setText("Pays");
            label_informations_6.setVisible(true);
            tf_informations_6.setVisible(true);

            label_informations_7.setText("Surnom");
            label_informations_7.setVisible(true);
            tf_informations_7.setVisible(true);

            label_informations_8.setText("Groupe");
            label_informations_8.setEnabled(true);
            tf_informations_8.setEnabled(true);

            label_informations_9.setText("");
            label_informations_9.setEnabled(false);
            tf_informations_9.setEnabled(false);

            label_informations_10.setText("");
            label_informations_10.setEnabled(false);
            tf_informations_10.setEnabled(false);

            label_informations_11.setText("");
            label_informations_11.setEnabled(false);
            tf_informations_11.setEnabled(false);

            label_informations_12.setText("");
            label_informations_12.setEnabled(false);
            tf_informations_12.setEnabled(false);

            label_informations_13.setText("");
            label_informations_13.setEnabled(false);
            tf_informations_13.setEnabled(false);

            label_informations_14.setText("");
            label_informations_14.setEnabled(false);
            tf_informations_14.setEnabled(false);

            label_informations_17.setText("");
            label_informations_17.setEnabled(false);
            tf_informations_17.setEnabled(false);
            

            label_acteurs.setText("Métiers");
            tf_ajout_acteur.setEnabled(false);
            b_ajout_acteur.setEnabled(false);
            b_suppr_list.setEnabled(false);

            label_synop.setEnabled(false);
            textarea_synop.setEnabled(false);
        }

        else if (choix_creation == "Film"){
            label_informations_1.setText("Visa");
            label_informations_1.setVisible(true);
            tf_informations_1.setVisible(true);



            label_informations_2.setText("Titre");
            label_informations_2.setVisible(true);
            tf_informations_2.setVisible(true);


            label_informations_3.setText("Année");
            label_informations_3.setVisible(true);
            tf_informations_3.setVisible(true);


            label_informations_4.setText("Réalisateur");
            label_informations_4.setVisible(true);
            tf_informations_4.setVisible(true);

            label_informations_5.setText("Scénariste");
            label_informations_5.setVisible(true);
            tf_informations_5.setVisible(true);

            label_informations_6.setText("Durée");
            label_informations_6.setVisible(true);
            tf_informations_6.setVisible(true);

            label_informations_7.setText("Trailer");
            label_informations_7.setVisible(true);
            tf_informations_7.setVisible(true);

            label_informations_8.setText("Lien");
            label_informations_8.setEnabled(true);
            tf_informations_8.setEnabled(true);

            label_informations_9.setText("Budget");
            label_informations_9.setEnabled(true);
            tf_informations_9.setEnabled(true);

            label_informations_10.setText("Tag 1");
            label_informations_10.setEnabled(true);
            tf_informations_10.setEnabled(true);

            label_informations_11.setText("Tag 2");
            label_informations_11.setEnabled(true);
            tf_informations_11.setEnabled(true);

            label_informations_12.setText("Tag 3");
            label_informations_12.setEnabled(true);
            tf_informations_12.setEnabled(true);

            label_informations_13.setText("Genre 1");
            label_informations_13.setEnabled(true);
            tf_informations_13.setEnabled(true);

            label_informations_14.setText("Genre 2");
            label_informations_14.setEnabled(true);
            tf_informations_14.setEnabled(true);

            label_informations_17.setText("Saga");
            label_informations_17.setEnabled(true);
            tf_informations_17.setEnabled(true);

            label_acteurs.setText("Acteurs");
            tf_ajout_acteur.setEnabled(true);
            b_ajout_acteur.setEnabled(true);
            b_suppr_list.setEnabled(true);

            label_synop.setEnabled(true);
            textarea_synop.setEnabled(true);
        }

        System.out.println(choix_creation);
    }                                       

    private void b_ajout_critere_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void tf_modif_film_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void tf_modif_film_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void b_ajout_modif_acteurActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void tf_modif_acteur_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void b_suppr_modif_acteur_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_modif_suppr_acteur_5ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_modif_suppr_acteur_6ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_modif_fichier_image_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void b_revenir_modif_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void b_bloquer_modif_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void b_suppr_acteur_7ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void b_suppr_acteur_8ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void b_brouillon_modif_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_valider_modif_filmActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }  
    
    private void b_reinitialiser_creationActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        mon_formulaire_film.resetForm();
    }   

    private void cb_critere_livre_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void b_recherche_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void b_reinitialise_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void b_ajout_critere_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void tf_modif_livre_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void tf_modif_livre_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        // TODO add your handling code here:
    }                                                

    private void b_ajout_modif_ecrivainsActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void tf_modif_ecrivain_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void b_suppr_modif_ecrivain_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_suppr_modif_ecrivain_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_suppr_modif_ecrivain_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_modif_fichier_image_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                            
        // TODO add your handling code here:
    }                                                           

    private void b_revenir_modif_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void b_bloquer_modif_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     
                                                 

    private void b_brouillon_modif_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_valider_modif_livreActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void cb_critere_musique_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void b_recherche_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void b_reinitialise_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_ajout_critere_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_valider_modif_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_brouillon_modif_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_bloquer_modif_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_revenir_modif_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_modif_fichier_image_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    private void b_suppr_modif_artistes_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_suppr_modif_artistes_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_suppr_modif_artistes_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void tf_modif_artiste_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void b_ajout_modif_artistesActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void tf_modif_musique_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void tf_modif_musique_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void b_voir_album_modif_musiqueActionPerformed(java.awt.event.ActionEvent evt) {                                                           
        // TODO add your handling code here:
    }                                                          

    private void cb_critere_artiste_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void b_recherche_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void b_reinitialise_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_ajout_critere_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void tf_modif_desartistes_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void tf_modif_desartistes_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void tf_modif_artiste_metier_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_modif_fichier_image_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    private void b_revenir_modif_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_bloquer_modif_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void b_brouillon_modif_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_valider_modif_artisteActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void tf_modif_desartistes_5ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void tf_modif_desartistes_6ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void tf_modif_desartistes_7ActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void b_valider_critere_bddActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void b_modifier_critere_bdd_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_supprimer_critere_bdd_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_modifier_critere_bdd_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_supprimer_critere_bdd_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_modifier_critere_bdd_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_supprimer_critere_bdd_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_modifier_critere_bdd_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_supprimer_critere_bdd_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_modifier_critere_bdd_5ActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void b_supprimer_critere_bdd_5ActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

    private void b_ajout_critere_bddActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void b_valider_ajout_bddActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        // TODO add your handling code here:
    }                                                   

    private void cb_critere_users_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                   
        // TODO add your handling code here:
    }                                                  

    private void b_recherche_usersActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void b_reinitialise_usersActionPerformed(java.awt.event.ActionEvent evt) {                                                     
        // TODO add your handling code here:
    }                                                    

    private void b_ajout_critere_usersActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        // TODO add your handling code here:
    }                                                     

    private void choix_brouillon_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void choix_brouillon_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void choix_brouillon_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void choix_brouillon_4ActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void b_brouillon_creationActionPerformed(java.awt.event.ActionEvent evt) {                                                     

        if (choix_creation == "Film"){
        mon_formulaire_film.setType(choix_creation);
        recuperer_champs_film();
        mon_formulaire_film.getFilm().creation(1);
        mon_formulaire_film.getFilm().assoPersonnes();
        mon_formulaire_film.getFilm().assoGenre();
        mon_formulaire_film.getFilm().assoCeremony();
        mon_formulaire_film.getFilm().assoTag();}

        if (choix_creation == "Livre"){
        mon_formulaire_film.setType(choix_creation);
        recuperer_champs_livre();
        /*mon_formulaire_film.getFilm().creation(1);
        mon_formulaire_film.getFilm().assoPersonnes();
        mon_formulaire_film.getFilm().assoGenre();
        mon_formulaire_film.getFilm().assoCeremony();
        mon_formulaire_film.getFilm().assoTag()*/;}

    }                                                    

    private void b_rechercher_testActionPerformed(java.awt.event.ActionEvent evt) {                                                  

    }                                                 

    private void cb_recherche_testActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }   

    private void b_suppr_listActionPerformed(java.awt.event.ActionEvent evt) {                                             
        for (int i = 0; i < mon_formulaire_film.getFilm().mes_acteurs.size() ; i++){
            System.out.println(mon_formulaire_film.getFilm().mes_acteurs.get(i).getNom());
        }
        int selectedIx = list_acteurs.getSelectedIndex();
        mon_formulaire_film.getFilm().removeActeur(selectedIx);
        model.remove(selectedIx);
        for (int i = 0; i < mon_formulaire_film.getFilm().mes_acteurs.size() ; i++){
            System.out.println(mon_formulaire_film.getFilm().mes_acteurs.get(i).getNom());
        }
    } 


    private void recuperer_champs_film(){
        mon_formulaire_film.recupDonneesFilm();
        mon_formulaire_film.getFilm().addScenariste(mon_formulaire_film.getScenariste().getText());
        mon_formulaire_film.getFilm().addRealisateur(mon_formulaire_film.getRealisateur().getText());

        mon_formulaire_film.getFilm().addGenre(mon_formulaire_film.getGenre1().getText());
        mon_formulaire_film.getFilm().addGenre(mon_formulaire_film.getGenre2().getText());

        mon_formulaire_film.getFilm().addTag(mon_formulaire_film.getTag1().getText());
        mon_formulaire_film.getFilm().addTag(mon_formulaire_film.getTag2().getText());
        mon_formulaire_film.getFilm().addTag(mon_formulaire_film.getTag3().getText());   
    }

    private void recuperer_champs_livre(){
        mon_formulaire_livre.recupDonneesLivre(); 

        mon_formulaire_livre.getLivre().addGenre(mon_formulaire_livre.getTf_genre_1().getText());
        mon_formulaire_livre.getLivre().addGenre(mon_formulaire_livre.getTf_genre_2().getText());

        mon_formulaire_livre.getLivre().addTag(mon_formulaire_livre.getTf_tag_1().getText());
        mon_formulaire_livre.getLivre().addTag(mon_formulaire_livre.getTf_tag_2().getText());
        mon_formulaire_livre.getLivre().addTag(mon_formulaire_livre.getTf_tag_3().getText()); 
    }

    private void recuperer_champs_chanson(){
        mon_formulaire_chanson.recupDonneesChanson(); 

        mon_formulaire_chanson.getChanson().addGenre(mon_formulaire_chanson.getTf_genre_1().getText());
        mon_formulaire_chanson.getChanson().addGenre(mon_formulaire_chanson.getTf_genre_2().getText());

        mon_formulaire_chanson.getChanson().addTag(mon_formulaire_chanson.getTf_tag_1().getText());
        mon_formulaire_chanson.getChanson().addTag(mon_formulaire_chanson.getTf_tag_2().getText());
        mon_formulaire_chanson.getChanson().addTag(mon_formulaire_chanson.getTf_tag_3().getText()); 
    }

    private void b_valider_creationActionPerformed(java.awt.event.ActionEvent evt){  
        if (choix_creation == "Film"){
            System.out.println("Crea Film");
            mon_formulaire_film.setType(choix_creation);
            recuperer_champs_film();
            mon_formulaire_film.getFilm().creation(1);
            mon_formulaire_film.getFilm().assoPersonnes();
            mon_formulaire_film.getFilm().assoGenre();
            mon_formulaire_film.getFilm().assoCeremony();
            mon_formulaire_film.getFilm().assoTag();}
        else if (choix_creation == "Livre"){
            System.out.println("Crea Livre");
            mon_formulaire_livre.setType(choix_creation);
            recuperer_champs_livre();
            mon_formulaire_livre.getLivre().creation(1);
            
            mon_formulaire_livre.getLivre().assoPersonnes();
            mon_formulaire_livre.getLivre().assoGenre();
            mon_formulaire_livre.getLivre().assoCeremony();
            mon_formulaire_livre.getLivre().assoTag();
            mon_formulaire_livre.getLivre().assoEditeur();

        }
        else if (choix_creation == "Musique"){
            System.out.println("Crea Chanson");
            choix_creation = "Chanson";
            mon_formulaire_chanson.setType(choix_creation);
            recuperer_champs_chanson();
            mon_formulaire_chanson.getChanson().creation(1);
            
            mon_formulaire_chanson.getChanson().assoPersonnes();
            mon_formulaire_chanson.getChanson().assoGenre();
            mon_formulaire_chanson.getChanson().assoCeremony();
            mon_formulaire_chanson.getChanson().assoTag();
            mon_formulaire_chanson.getChanson().assoEditeur();

        }

    }                                                  

    private void b_fichier_imageActionPerformed(java.awt.event.ActionEvent evt) {                                                
        // TODO add your handling code here:
    }                                               

    private void b_suppr_acteur_3ActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    }                                                

    private void b_suppr_acteur_2ActionPerformed(java.awt.event.ActionEvent evt) {                                                 

    }                                                

    private void b_suppr_acteur_1ActionPerformed(java.awt.event.ActionEvent evt) {                                                 

    }                                                
                                      

    private void b_ajout_acteurActionPerformed(java.awt.event.ActionEvent evt) {                                               
        String mon_artiste = tf_ajout_acteur.getText();
        if (choix_creation == "Film"){
            mon_formulaire_film.getFilm().addActeur(mon_artiste);}
        else if (choix_creation == "Livre"){
            mon_formulaire_livre.getLivre().addEcrivain(mon_artiste);
            System.out.println(mon_formulaire_livre.getLivre().mes_ecrivains.get(0).getNom());}
        else if (choix_creation == "Musique"){
            mon_formulaire_chanson.getChanson().addInterprete(mon_artiste);
            System.out.println(mon_formulaire_chanson.getChanson().mes_interpretes.get(0).getNom());}

        model.addElement(mon_artiste); 
        list_acteurs.setModel(model);
    }                                              

    
    
    private void b_modifier_filmActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                                
        int sr = tableau_resultats_film.getSelectedRow();
        int mon_id = (int)(tableau_resultats_film.getModel().getValueAt(sr, 0));
        System.out.println(mon_id);


    }                                               

    private void b_bloquer_filmActionPerformed(java.awt.event.ActionEvent evt) {                                               
        // TODO add your handling code here:
    }                                              

    //Suppression du film
    private void b_suppr_filmActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                             
    	int sr = tableau_resultats_film.getSelectedRow();
        int mon_id = Integer.valueOf((String)tableau_resultats_film.getModel().getValueAt(sr, 0));
        
        C_MEDIA media_a_supprimer = new C_MEDIA();
        media_a_supprimer.suppression(mon_id);
          
    }   
 
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(maFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(maFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(maFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(maFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new maFrame().setVisible(true);
                
                
            }
        });
    }


    // Variables declaration - do not modify  
    
    public Connexion connexion;
    public Statement statement = null;
    C_FORMULAIRE_FILM mon_formulaire_film = new C_FORMULAIRE_FILM();
    C_FORMULAIRE_LIVRE mon_formulaire_livre = new C_FORMULAIRE_LIVRE();
    C_FORMULAIRE_CHANSON mon_formulaire_chanson= new C_FORMULAIRE_CHANSON();
    public String mon_film_type;
    public String choix_creation;
    public String mon_dernier_media_id; //
    public String mon_film_visa;//
    public String mon_film_titre;
    public String mon_film_annee; //
    public String mon_film_realisateur;
    public String mon_film_scenariste;
    public String mon_film_duree; //
    public String mon_film_trailer;
    public String mon_film_lien;
    public String mon_film_budget; //
    public String mon_film_id_tag1; //
    public String mon_film_id_tag2; //
    public String mon_film_id_tag3; //
    public String mon_film_id_genre1; //
    public String mon_film_id_genre2; //
    public String mon_film_saga;
    public String mon_film_id_acteur; //
    public String mon_film_id_realisateur; //
    public String mon_film_id_scenariste; //
    public String mon_film_id_acteur1;//
    public String mon_film_id_acteur2; //
    public String mon_film_id_acteur3; //
    public String mon_film_id_scenariste1; //
    public String mon_film_id_realisateur1; //
    public String mon_film_id_award; //
    public String mon_film_id_ceremonie; //
    public String mon_film_annee_award; //
    public String mon_film_synop;

    public javax.swing.JScrollPane sp_list_acteurs;
    public javax.swing.JList<String> list_acteurs; 
    public javax.swing.JButton b_suppr_list;
    public javax.swing.DefaultListModel<String> model; 


    


    public javax.swing.JButton b_modifier_film;
    public javax.swing.JButton b_bloquer_film;
    public javax.swing.JButton b_suppr_film;

    public javax.swing.JButton b_ajout_acteur;
    public javax.swing.JButton b_ajout_critere_artiste;
    public javax.swing.JButton b_ajout_critere_bdd;
    public javax.swing.JButton b_ajout_critere_film;
    public javax.swing.JButton b_ajout_critere_livre;
    public javax.swing.JButton b_ajout_critere_musique;
    public javax.swing.JButton b_ajout_critere_users;
    public javax.swing.JButton b_ajout_modif_acteur;
    public javax.swing.JButton b_ajout_modif_artistes;
    public javax.swing.JButton b_ajout_modif_ecrivains;
    public javax.swing.JButton b_bloquer_modif_artiste;
    public javax.swing.JButton b_bloquer_modif_film;
    public javax.swing.JButton b_bloquer_modif_livre;
    public javax.swing.JButton b_bloquer_modif_musique;
    public javax.swing.JButton b_brouillon_creation;
    public javax.swing.JButton b_brouillon_modif_artiste;
    public javax.swing.JButton b_brouillon_modif_film;
    public javax.swing.JButton b_brouillon_modif_livre;
    public javax.swing.JButton b_brouillon_modif_musique;
    public javax.swing.JButton b_creer;
    public javax.swing.JButton b_fichier_image;
    public javax.swing.JButton b_modif_fichier_image_artiste;
    public javax.swing.JButton b_modif_fichier_image_film;
    public javax.swing.JButton b_modif_fichier_image_livre;
    public javax.swing.JButton b_modif_fichier_image_musique;
    public javax.swing.JButton b_modif_suppr_acteur_5;
    public javax.swing.JButton b_modif_suppr_acteur_6;
    public javax.swing.JButton b_modifier_critere_bdd_1;
    public javax.swing.JButton b_modifier_critere_bdd_2;
    public javax.swing.JButton b_modifier_critere_bdd_3;
    public javax.swing.JButton b_modifier_critere_bdd_4;
    public javax.swing.JButton b_modifier_critere_bdd_5;
    public javax.swing.JButton b_recherche_artiste;
    public javax.swing.JButton b_recherche_film;
    public javax.swing.JButton b_recherche_livre;
    public javax.swing.JButton b_recherche_musique;
    public javax.swing.JButton b_recherche_users;
    public javax.swing.JButton b_reinitialise_artiste;
    public javax.swing.JButton b_reinitialise_film;
    public javax.swing.JButton b_reinitialise_livre;
    public javax.swing.JButton b_reinitialise_musique;
    public javax.swing.JButton b_reinitialise_users;
    public javax.swing.JButton b_revenir_brouillons;
    public javax.swing.JButton b_revenir_modif_artiste;
    public javax.swing.JButton b_revenir_modif_film;
    public javax.swing.JButton b_revenir_modif_livre;
    public javax.swing.JButton b_revenir_modif_musique;
    public javax.swing.JButton b_revenir_users_comm;

    public javax.swing.JButton b_rechercher_test;

    public javax.swing.JButton b_suppr_acteur_1;
    public javax.swing.JButton b_suppr_acteur_2;
    public javax.swing.JButton b_suppr_acteur_3;
    public javax.swing.JButton b_suppr_acteur_7;
    public javax.swing.JButton b_suppr_acteur_8;
    public javax.swing.JButton b_suppr_modif_acteur_1;
    public javax.swing.JButton b_suppr_modif_artistes_1;
    public javax.swing.JButton b_suppr_modif_artistes_2;
    public javax.swing.JButton b_suppr_modif_artistes_3;
    public javax.swing.JButton b_suppr_modif_ecrivain_1;
    public javax.swing.JButton b_suppr_modif_ecrivain_2;
    public javax.swing.JButton b_suppr_modif_ecrivain_3;
    public javax.swing.JButton b_supprimer_critere_bdd_1;
    public javax.swing.JButton b_supprimer_critere_bdd_2;
    public javax.swing.JButton b_supprimer_critere_bdd_3;
    public javax.swing.JButton b_supprimer_critere_bdd_4;
    public javax.swing.JButton b_supprimer_critere_bdd_5;
    public javax.swing.JButton b_valider_ajout_bdd;
    public javax.swing.JButton b_valider_brouillons;
    public javax.swing.JButton b_valider_creation;
    public javax.swing.JButton b_reinitialiser_creation;
    public javax.swing.JButton b_valider_critere_bdd;
    public javax.swing.JButton b_valider_modif_artiste;
    public javax.swing.JButton b_valider_modif_film;
    public javax.swing.JButton b_valider_modif_livre;
    public javax.swing.JButton b_valider_modif_musique;
    public javax.swing.JButton b_voir_album_modif_musique;
    public javax.swing.ButtonGroup buttonGroup1;
    public javax.swing.ButtonGroup buttonGroup2;
    public javax.swing.JComboBox<String> cb_critere_artiste_1;
    public javax.swing.JComboBox<String> cb_critere_artiste_2;
    public javax.swing.JComboBox<String> cb_critere_artiste_3;
    public javax.swing.JComboBox<String> cb_critere_artiste_4;
    public javax.swing.JComboBox<String> cb_critere_bdd;
    public javax.swing.JComboBox<String> cb_critere_film_1;
    public javax.swing.JComboBox<String> cb_critere_film_2;
    public javax.swing.JComboBox<String> cb_critere_film_3;
    public javax.swing.JComboBox<String> cb_critere_film_4;
    public javax.swing.JComboBox<String> cb_critere_livre_1;
    public javax.swing.JComboBox<String> cb_critere_livre_2;
    public javax.swing.JComboBox<String> cb_critere_livre_3;
    public javax.swing.JComboBox<String> cb_critere_livre_4;
    public javax.swing.JComboBox<String> cb_critere_musique_1;
    public javax.swing.JComboBox<String> cb_critere_musique_2;
    public javax.swing.JComboBox<String> cb_critere_musique_3;
    public javax.swing.JComboBox<String> cb_critere_musique_4;
    public javax.swing.JComboBox<String> cb_critere_users_1;
    public javax.swing.JComboBox<String> cb_critere_users_2;
    public javax.swing.JComboBox<String> cb_critere_users_3;

    public javax.swing.JComboBox<String> cb_recherche_test;

    public javax.swing.JRadioButton choix_artiste;
    public javax.swing.JRadioButton choix_brouillon_1;
    public javax.swing.JRadioButton choix_brouillon_2;
    public javax.swing.JRadioButton choix_brouillon_3;
    public javax.swing.JRadioButton choix_brouillon_4;
    public javax.swing.JRadioButton choix_film;
    public javax.swing.JRadioButton choix_livre;
    public javax.swing.JRadioButton choix_musique;
    public javax.swing.ButtonGroup choix_group;
    public javax.swing.JLabel jLabel24;
    public javax.swing.JLabel jLabel25;
    public javax.swing.JLabel jLabel27;
    public javax.swing.JPanel jPanel1;
    public javax.swing.JLayeredPane jp_brouillons;
    public javax.swing.JLayeredPane jp_users_comm;
    public javax.swing.JTabbedPane jtabbed_general;
    public javax.swing.JLabel label_acteurs;
    public javax.swing.JLabel label_ajout_critere_artiste;
    public javax.swing.JLabel label_ajout_critere_film;
    public javax.swing.JLabel label_ajout_critere_livre;
    public javax.swing.JLabel label_ajout_critere_musique;
    public javax.swing.JLabel label_ajout_critere_users;
    public javax.swing.JLabel label_bdd_titre;
    public javax.swing.JLabel label_bdd_valeur_1;
    public javax.swing.JLabel label_bdd_valeur_2;
    public javax.swing.JLabel label_bdd_valeur_3;
    public javax.swing.JLabel label_bdd_valeur_4;
    public javax.swing.JLabel label_bdd_valeur_5;
    public javax.swing.JLabel label_image;
    public javax.swing.JLabel label_informations;
    public javax.swing.JLabel label_informations_1;
    public javax.swing.JLabel label_informations_2;
    public javax.swing.JLabel label_informations_3;
    public javax.swing.JLabel label_informations_4;
    public javax.swing.JLabel label_informations_5;
    public javax.swing.JLabel label_informations_6;
    public javax.swing.JLabel label_informations_7;
    public javax.swing.JLabel label_informations_8;
    public javax.swing.JLabel label_informations_9;
    public javax.swing.JLabel label_informations_10;
    public javax.swing.JLabel label_informations_11;
    public javax.swing.JLabel label_informations_12;
    public javax.swing.JLabel label_informations_13;
    public javax.swing.JLabel label_informations_14;
    public javax.swing.JLabel label_informations_15;
    public javax.swing.JLabel label_informations_16;
    public javax.swing.JLabel label_informations_17;
    public javax.swing.JLabel label_informations_18;

    public javax.swing.JLabel label_informations_test;

    public javax.swing.JLabel label_modif_artiste_1;
    public javax.swing.JLabel label_modif_artiste_2;
    public javax.swing.JLabel label_modif_artiste_3;
    public javax.swing.JLabel label_modif_artiste_4;
    public javax.swing.JLabel label_modif_artiste_5;
    public javax.swing.JLabel label_modif_artiste_6;
    public javax.swing.JLabel label_modif_artiste_7;
    public javax.swing.JLabel label_modif_artiste_image;
    public javax.swing.JLabel label_modif_artiste_informations;
    public javax.swing.JLabel label_modif_artiste_metier;
    public javax.swing.JLabel label_modif_film_1;
    public javax.swing.JLabel label_modif_film_2;
    public javax.swing.JLabel label_modif_film_3;
    public javax.swing.JLabel label_modif_film_4;
    public javax.swing.JLabel label_modif_film_5;
    public javax.swing.JLabel label_modif_film_6;
    public javax.swing.JLabel label_modif_film_7;
    public javax.swing.JLabel label_modif_film_8;
    public javax.swing.JLabel label_modif_film_9;
    public javax.swing.JLabel label_modif_film_10;
    public javax.swing.JLabel label_modif_film_11;
    public javax.swing.JLabel label_modif_film_12;
    public javax.swing.JLabel label_modif_film_13;
    public javax.swing.JLabel label_modif_film_14;
    public javax.swing.JLabel label_modif_film_acteurs;
    public javax.swing.JLabel label_modif_film_image;
    public javax.swing.JLabel label_modif_film_informations;
    public javax.swing.JLabel label_modif_livre_1;
    public javax.swing.JLabel label_modif_livre_2;
    public javax.swing.JLabel label_modif_livre_3;
    public javax.swing.JLabel label_modif_livre_4;
    public javax.swing.JLabel label_modif_livre_5;
    public javax.swing.JLabel label_modif_livre_6;
    public javax.swing.JLabel label_modif_livre_7;
    public javax.swing.JLabel label_modif_livre_8;
    public javax.swing.JLabel label_modif_livre_9;
    public javax.swing.JLabel label_modif_livre_10;
    public javax.swing.JLabel label_modif_livre_11;
    public javax.swing.JLabel label_modif_livre_12;
    public javax.swing.JLabel label_modif_livre_ecrivains;
    public javax.swing.JLabel label_modif_livre_image;
    public javax.swing.JLabel label_modif_livre_informations;
    public javax.swing.JLabel label_modif_musique_1;
    public javax.swing.JLabel label_modif_musique_2;
    public javax.swing.JLabel label_modif_musique_3;
    public javax.swing.JLabel label_modif_musique_4;
    public javax.swing.JLabel label_modif_musique_artistes;
    public javax.swing.JLabel label_modif_musique_image;
    public javax.swing.JLabel label_modif_musique_informations;
    public javax.swing.JLabel label_modif_synop_artiste;
    public javax.swing.JLabel label_modif_synop_film;
    public javax.swing.JLabel label_modif_synop_livre;
    public javax.swing.JLabel label_modif_synop_musique;
    public javax.swing.JLabel label_resultats_artiste;
    public javax.swing.JLabel label_resultats_film;
    public javax.swing.JLabel label_resultats_film1;
    public javax.swing.JLabel label_resultats_film2;
    public javax.swing.JLabel label_resultats_users;
    public javax.swing.JLabel label_synop;
    public javax.swing.JLabel label_titre_modif_artiste;
    public javax.swing.JLabel label_titre_modif_film;
    public javax.swing.JLabel label_titre_modif_livre;
    public javax.swing.JLabel label_titre_modif_musique;
    public javax.swing.JLabel label_users_comm_titre;
    public javax.swing.JLayeredPane layered_choix_media;
    public javax.swing.JLayeredPane layered_creation;
    public javax.swing.JLayeredPane layered_modif_artiste;
    public javax.swing.JLayeredPane layered_modif_film;
    public javax.swing.JLayeredPane layered_modif_livre;
    public javax.swing.JLayeredPane layered_modif_musique;
    public javax.swing.JLayeredPane lp_bdd_1;
    public javax.swing.JLayeredPane lp_bdd_2;
    public javax.swing.JLayeredPane lp_bdd_3;
    public javax.swing.JPanel panel_artiste_modif;
    public javax.swing.JPanel panel_artistes;
    public javax.swing.JPanel panel_bdd;
    public javax.swing.JPanel panel_brouillon;
    public javax.swing.JPanel panel_creation;
    public javax.swing.JPanel panel_film;
    public javax.swing.JPanel panel_film_modif;
    public javax.swing.JPanel panel_general;
    public javax.swing.JPanel panel_livre;
    public javax.swing.JPanel panel_livre_modif;
    public javax.swing.JPanel panel_musique;
    public javax.swing.JPanel panel_musique_modif;
    public javax.swing.JPanel panel_users;
    public javax.swing.JLayeredPane pannel_criteres_film;
    public javax.swing.JLayeredPane pannel_criteres_livre;
    public javax.swing.JLayeredPane pannel_criteres_musique;
    public javax.swing.JLayeredPane pannel_criteres_musique1;
    public javax.swing.JLayeredPane pannel_criteres_users;
    public javax.swing.JLayeredPane pannel_image;
    public javax.swing.JLayeredPane pannel_modif_image_artiste;
    public javax.swing.JLayeredPane pannel_modif_image_film;
    public javax.swing.JLayeredPane pannel_modif_image_livre;
    public javax.swing.JLayeredPane pannel_modif_image_livre2;
    public javax.swing.JLayeredPane pannel_modif_image_musique;
    public javax.swing.JLayeredPane pannel_resultats_film;
    public javax.swing.JLayeredPane pannel_resultats_livre;
    public javax.swing.JLayeredPane pannel_resultats_musique;
    public javax.swing.JLayeredPane pannel_resultats_musique1;
    public javax.swing.JLayeredPane pannel_resultats_users;
    public javax.swing.JPanel pannel_users_comm;
    public javax.swing.JScrollPane scrollpanel_modif_synop_artiste;
    public javax.swing.JScrollPane scrollpanel_modif_synop_film;
    public javax.swing.JScrollPane scrollpanel_modif_synop_film2;
    public javax.swing.JScrollPane scrollpanel_modif_synop_livre;
    public javax.swing.JScrollPane scrollpanel_modif_synop_musique;
    public javax.swing.JScrollPane sp_brouillons;
    public javax.swing.JScrollPane sp_synop;
    public javax.swing.JScrollPane sp_tableau_resultats_artiste;
    public javax.swing.JScrollPane sp_tableau_resultats_film;
    public javax.swing.JScrollPane sp_tableau_resultats_livre;
    public javax.swing.JScrollPane sp_tableau_resultats_musique;
    public javax.swing.JScrollPane sp_tableau_resultats_users;
    public javax.swing.JScrollPane sp_users_comm;
    public javax.swing.JTable tab_brouillons;
    public javax.swing.JTable tab_brouillons1;
    public javax.swing.JTable tableau_resultats_artiste;
    public javax.swing.JTable tableau_resultats_film;
    public javax.swing.JTable tableau_resultats_livre;
    public javax.swing.JTable tableau_resultats_musique;
    public javax.swing.JTable tableau_resultats_users;
    public javax.swing.JTextArea textarea_modif_synop_artiste;
    public javax.swing.JTextArea textarea_modif_synop_film;
    public javax.swing.JTextArea textarea_modif_synop_livre;
    public javax.swing.JTextArea textarea_modif_synop_musique;
    public javax.swing.JTextArea textarea_synop;
    public javax.swing.JTextArea textarea_voir_album_musique;
    public javax.swing.JTextField tf_ajout_acteur;
    public javax.swing.JTextField tf_ajout_critere_bdd_1;
    public javax.swing.JTextField tf_ajout_critere_bdd_2;
    public javax.swing.JTextField tf_ajout_modif_acteur;
    public javax.swing.JTextField tf_ajout_modif_artistes;
    public javax.swing.JTextField tf_ajout_modif_ecrivains;
    public javax.swing.JTextField tf_critere_artiste_1;
    public javax.swing.JTextField tf_critere_artiste_2;
    public javax.swing.JTextField tf_critere_artiste_3;
    public javax.swing.JTextField tf_critere_artiste_4;
    public javax.swing.JTextField tf_critere_film_1;
    public javax.swing.JTextField tf_critere_film_2;
    public javax.swing.JTextField tf_critere_film_3;
    public javax.swing.JTextField tf_critere_film_4;
    public javax.swing.JTextField tf_critere_livre_1;
    public javax.swing.JTextField tf_critere_livre_2;
    public javax.swing.JTextField tf_critere_livre_3;
    public javax.swing.JTextField tf_critere_livre_4;
    public javax.swing.JTextField tf_critere_musique_1;
    public javax.swing.JTextField tf_critere_musique_2;
    public javax.swing.JTextField tf_critere_musique_3;
    public javax.swing.JTextField tf_critere_musique_4;
    public javax.swing.JTextField tf_critere_users_1;
    public javax.swing.JTextField tf_critere_users_2;
    public javax.swing.JTextField tf_critere_users_3;
    public javax.swing.JTextField tf_informations_1;
    public javax.swing.JTextField tf_informations_2;
    public javax.swing.JTextField tf_informations_3;
    public javax.swing.JTextField tf_informations_4;
    public javax.swing.JTextField tf_informations_5;
    public javax.swing.JTextField tf_informations_6;
    public javax.swing.JTextField tf_informations_7;
    public javax.swing.JTextField tf_informations_8;
    public javax.swing.JTextField tf_informations_9;
    public javax.swing.JTextField tf_informations_10;
    public javax.swing.JTextField tf_informations_11;
    public javax.swing.JTextField tf_informations_12;
    public javax.swing.JTextField tf_informations_13;
    public javax.swing.JTextField tf_informations_14;
    public javax.swing.JTextField tf_informations_15;
    public javax.swing.JTextField tf_informations_16;
    public javax.swing.JTextField tf_informations_17;
    public javax.swing.JTextField tf_informations_18;

    public javax.swing.JTextField tf_informations_test;

    public javax.swing.JTextField tf_film_selectionne;
    public javax.swing.JTextField tf_modif_acteur_1;
    public javax.swing.JTextField tf_modif_acteur_2;
    public javax.swing.JTextField tf_modif_acteur_3;
    public javax.swing.JTextField tf_modif_artiste_1;
    public javax.swing.JTextField tf_modif_artiste_2;
    public javax.swing.JTextField tf_modif_artiste_3;
    public javax.swing.JTextField tf_modif_artiste_metier_1;
    public javax.swing.JTextField tf_modif_artiste_metier_2;
    public javax.swing.JTextField tf_modif_artiste_metier_3;
    public javax.swing.JTextField tf_modif_desartistes_1;
    public javax.swing.JTextField tf_modif_desartistes_2;
    public javax.swing.JTextField tf_modif_desartistes_3;
    public javax.swing.JTextField tf_modif_desartistes_4;
    public javax.swing.JTextField tf_modif_desartistes_5;
    public javax.swing.JTextField tf_modif_desartistes_6;
    public javax.swing.JTextField tf_modif_desartistes_7;
    public javax.swing.JTextField tf_modif_ecrivain_1;
    public javax.swing.JTextField tf_modif_ecrivain_2;
    public javax.swing.JTextField tf_modif_ecrivain_3;
    public javax.swing.JTextField tf_modif_film_1;
    public javax.swing.JTextField tf_modif_film_2;
    public javax.swing.JTextField tf_modif_film_3;
    public javax.swing.JTextField tf_modif_film_4;
    public javax.swing.JTextField tf_modif_film_5;
    public javax.swing.JTextField tf_modif_film_6;
    public javax.swing.JTextField tf_modif_film_7;
    public javax.swing.JTextField tf_modif_film_8;
    public javax.swing.JTextField tf_modif_film_9;
    public javax.swing.JTextField tf_modif_film_10;
    public javax.swing.JTextField tf_modif_film_11;
    public javax.swing.JTextField tf_modif_film_12;
    public javax.swing.JTextField tf_modif_film_13;
    public javax.swing.JTextField tf_modif_film_14;
    public javax.swing.JTextField tf_modif_livre_1;
    public javax.swing.JTextField tf_modif_livre_2;
    public javax.swing.JTextField tf_modif_livre_3;
    public javax.swing.JTextField tf_modif_livre_4;
    public javax.swing.JTextField tf_modif_livre_5;
    public javax.swing.JTextField tf_modif_livre_6;
    public javax.swing.JTextField tf_modif_livre_7;
    public javax.swing.JTextField tf_modif_livre_8;
    public javax.swing.JTextField tf_modif_livre_9;
    public javax.swing.JTextField tf_modif_livre_10;
    public javax.swing.JTextField tf_modif_livre_11;
    public javax.swing.JTextField tf_modif_livre_12;
    public javax.swing.JTextField tf_modif_musique_1;
    public javax.swing.JTextField tf_modif_musique_2;
    public javax.swing.JTextField tf_modif_musique_3;
    public javax.swing.JTextField tf_modif_musique_4;
    
    public String tableau_tf_creation_film []= new String [24]; 

}
