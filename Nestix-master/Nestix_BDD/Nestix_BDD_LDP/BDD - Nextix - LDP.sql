-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  lun. 09 déc. 2019 à 08:12
-- Version du serveur :  5.7.26
-- Version de PHP :  7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `nestix`
--

-- --------------------------------------------------------

--
-- Structure de la table `appreciation`
--

DROP TABLE IF EXISTS `appreciation`;
CREATE TABLE IF NOT EXISTS `appreciation` (
  `appr_id` int(11) NOT NULL,
  `appr_note` smallint(6) DEFAULT NULL,
  `appr_com` text,
  `appr_date` date DEFAULT NULL,
  `human_id` int(11) NOT NULL,
  `media_id` int(11) NOT NULL,
  PRIMARY KEY (`appr_id`),
  KEY `media_id` (`media_id`),
  KEY `human_id` (`human_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `artist`
--

DROP TABLE IF EXISTS `artist`;
CREATE TABLE IF NOT EXISTS `artist` (
  `human_id` int(11) NOT NULL,
  `artist_dod` date DEFAULT NULL,
  `artist_nickname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`human_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `artist`
--

INSERT INTO `artist` (`human_id`, `artist_dod`, `artist_nickname`) VALUES
(1, NULL, 'Will Smith'),
(2, NULL, 'René La Taupe'),
(3, NULL, NULL),
(4, NULL, NULL),
(10, NULL, 'Emma Watson');

-- --------------------------------------------------------

--
-- Structure de la table `associated_with`
--

DROP TABLE IF EXISTS `associated_with`;
CREATE TABLE IF NOT EXISTS `associated_with` (
  `media_id` int(11) NOT NULL,
  `work_id` smallint(6) NOT NULL,
  PRIMARY KEY (`media_id`,`work_id`),
  KEY `work_id` (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `associated_with`
--

INSERT INTO `associated_with` (`media_id`, `work_id`) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1),
(6, 1),
(16, 1),
(13, 2),
(14, 2),
(15, 2),
(1, 4),
(2, 4),
(3, 4),
(4, 4),
(5, 4),
(6, 4),
(16, 4);

-- --------------------------------------------------------

--
-- Structure de la table `asvalidation`
--

DROP TABLE IF EXISTS `asvalidation`;
CREATE TABLE IF NOT EXISTS `asvalidation` (
  `asv_id` smallint(6) NOT NULL,
  `asv_status` enum('En attente','Refusé','Validé') DEFAULT NULL,
  `asv_date_creat` date DEFAULT NULL,
  `asv_date_modif` date DEFAULT NULL,
  PRIMARY KEY (`asv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `asvalidation`
--

INSERT INTO `asvalidation` (`asv_id`, `asv_status`, `asv_date_creat`, `asv_date_modif`) VALUES
(1, 'Validé', NULL, NULL),
(2, 'En attente', NULL, NULL),
(3, 'Refusé', NULL, NULL);

-- --------------------------------------------------------

--
-- Structure de la table `award`
--

DROP TABLE IF EXISTS `award`;
CREATE TABLE IF NOT EXISTS `award` (
  `award_id` int(11) NOT NULL,
  `award_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`award_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `band`
--

DROP TABLE IF EXISTS `band`;
CREATE TABLE IF NOT EXISTS `band` (
  `band_id` int(11) NOT NULL,
  `band_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`band_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `band`
--

INSERT INTO `band` (`band_id`, `band_name`) VALUES
(1, 'Spice Girls');

-- --------------------------------------------------------

--
-- Structure de la table `book`
--

DROP TABLE IF EXISTS `book`;
CREATE TABLE IF NOT EXISTS `book` (
  `ISBN` int(11) DEFAULT NULL,
  `book_synop` text,
  `book_release` int(4) DEFAULT NULL,
  `book_original_title` varchar(255) DEFAULT NULL,
  `book_tome` smallint(6) DEFAULT NULL,
  `book_saga` varchar(200) DEFAULT NULL,
  `book_id` int(11) NOT NULL,
  PRIMARY KEY (`book_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `book`
--

INSERT INTO `book` (`ISBN`, `book_synop`, `book_release`, `book_original_title`, `book_tome`, `book_saga`, `book_id`) VALUES
(2070643026, 'Le jour de ses onze ans, Harry Potter, un orphelin élevé par un oncle et une tante qui le détestent, voit son existence bouleversée. Un géant nommé Hagrid,vient le chercher pour l\'emmener à Poudlard, une école de sorcellerie ! Voler en balai, jeter des sorts, combattre les trolls : Harry se révèle un sorcier doué. Mais quel est le mystère qui l\'entoure ? Et qui est l\'effroyable V..., le mage dont personne n\'ose prononcer le nom ?', 1997, 'Harry Potter and the Philosopher\'s Stone', 1, 'Harry Potter', 1),
(2070524558, 'Une rentrée fracassante en voiture volante, une étrange malédiction qui s\'abat sur les élèves, cette deuxième année à l\'école des sorciers ne s\'annonce pas de tout repos ! Entre les cours de potions magiques, les matches de Quidditch et les combats de mauvais sorts, Harry Potter trouvera-t-il le temps de percer le mystère de la Chambre des Secrets ? Un livre magique pour sorciers confirmés.', 1998, 'Harry Potter and the Chamber of Secrets', 2, 'Harry Potter', 2);

-- --------------------------------------------------------

--
-- Structure de la table `categorized_by`
--

DROP TABLE IF EXISTS `categorized_by`;
CREATE TABLE IF NOT EXISTS `categorized_by` (
  `media_id` int(11) NOT NULL,
  `genre_id` smallint(6) NOT NULL,
  PRIMARY KEY (`media_id`,`genre_id`),
  KEY `genre_id` (`genre_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `categorized_by`
--

INSERT INTO `categorized_by` (`media_id`, `genre_id`) VALUES
(1, 5),
(2, 5),
(3, 5),
(4, 5),
(5, 5),
(6, 5),
(9, 5),
(10, 5),
(11, 5),
(12, 5);

-- --------------------------------------------------------

--
-- Structure de la table `ceremony`
--

DROP TABLE IF EXISTS `ceremony`;
CREATE TABLE IF NOT EXISTS `ceremony` (
  `ceremony_id` smallint(6) NOT NULL,
  `ceremony_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ceremony_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `ceremony`
--

INSERT INTO `ceremony` (`ceremony_id`, `ceremony_name`) VALUES
(1, 'Prix Goncourt'),
(2, 'César'),
(3, 'Oscar'),
(4, 'Grammy Awards'),
(5, 'Brit Awards'),
(6, 'Razzie Awards'),
(7, 'Festival de Cannes'),
(8, 'Prix Femina'),
(9, 'Victoires de la musique'),
(10, 'Berlinale');

-- --------------------------------------------------------

--
-- Structure de la table `city`
--

DROP TABLE IF EXISTS `city`;
CREATE TABLE IF NOT EXISTS `city` (
  `city_id` smallint(6) NOT NULL,
  `city_name` varchar(255) DEFAULT NULL,
  `country_id` smallint(6) NOT NULL,
  PRIMARY KEY (`city_id`),
  KEY `country_id` (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `city`
--

INSERT INTO `city` (`city_id`, `city_name`, `country_id`) VALUES
(1, 'Bordeaux', 1),
(2, 'Montpellier', 1),
(3, 'Montréal', 2),
(4, 'Toronto', 2),
(5, 'Sète', 1),
(6, 'Paris', 1);

-- --------------------------------------------------------

--
-- Structure de la table `collection`
--

DROP TABLE IF EXISTS `collection`;
CREATE TABLE IF NOT EXISTS `collection` (
  `collect_id` int(11) NOT NULL,
  `collect_date_creat` date DEFAULT NULL,
  `collect_title` varchar(255) DEFAULT NULL,
  `human_id` int(11) NOT NULL,
  PRIMARY KEY (`collect_id`),
  KEY `human_id` (`human_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `come_from`
--

DROP TABLE IF EXISTS `come_from`;
CREATE TABLE IF NOT EXISTS `come_from` (
  `human_id` int(11) NOT NULL,
  `country_id` smallint(6) NOT NULL,
  PRIMARY KEY (`human_id`,`country_id`),
  KEY `country_id` (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `come_from`
--

INSERT INTO `come_from` (`human_id`, `country_id`) VALUES
(2, 1),
(1, 3),
(3, 3);

-- --------------------------------------------------------

--
-- Structure de la table `competed_in`
--

DROP TABLE IF EXISTS `competed_in`;
CREATE TABLE IF NOT EXISTS `competed_in` (
  `media_id` int(11) NOT NULL,
  `award_id` int(11) NOT NULL,
  `ceremony_id` smallint(6) NOT NULL,
  `year` int(4) DEFAULT NULL,
  PRIMARY KEY (`media_id`,`award_id`,`ceremony_id`),
  KEY `ceremony_id` (`ceremony_id`),
  KEY `award_id` (`award_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `composed_by`
--

DROP TABLE IF EXISTS `composed_by`;
CREATE TABLE IF NOT EXISTS `composed_by` (
  `human_id` int(11) NOT NULL,
  `band_id` int(11) NOT NULL,
  PRIMARY KEY (`human_id`,`band_id`),
  KEY `band_id` (`band_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `composed_by`
--

INSERT INTO `composed_by` (`human_id`, `band_id`) VALUES
(12, 1),
(13, 1),
(14, 1),
(15, 1),
(16, 1);

-- --------------------------------------------------------

--
-- Structure de la table `contains`
--

DROP TABLE IF EXISTS `contains`;
CREATE TABLE IF NOT EXISTS `contains` (
  `media_id` int(11) NOT NULL,
  `collect_id` int(11) NOT NULL,
  PRIMARY KEY (`media_id`,`collect_id`),
  KEY `collect_id` (`collect_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Structure de la table `country`
--

DROP TABLE IF EXISTS `country`;
CREATE TABLE IF NOT EXISTS `country` (
  `country_id` smallint(6) NOT NULL,
  `country_name` varchar(50) DEFAULT NULL,
  `country_flag` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`country_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `country`
--

INSERT INTO `country` (`country_id`, `country_name`, `country_flag`) VALUES
(1, 'France', NULL),
(2, 'Canada', NULL),
(3, 'Etats-Unis', NULL),
(4, 'Grande Bretagne', NULL);

-- --------------------------------------------------------

--
-- Structure de la table `genre`
--

DROP TABLE IF EXISTS `genre`;
CREATE TABLE IF NOT EXISTS `genre` (
  `genre_id` smallint(6) NOT NULL,
  `genre_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`genre_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `genre`
--

INSERT INTO `genre` (`genre_id`, `genre_name`) VALUES
(1, 'Drame'),
(2, 'Comédie'),
(3, 'Thriller'),
(4, 'Action'),
(5, 'Fantastique'),
(6, 'Horreur'),
(7, 'Science Fiction'),
(8, 'Polar'),
(9, 'Historique'),
(10, 'Animation'),
(11, 'Western'),
(12, 'Parodie'),
(13, 'Comédie Musicale'),
(14, 'Documentaire'),
(15, 'Blockbuster'),
(16, 'Road Movie'),
(17, 'Romantique'),
(18, 'Culte'),
(19, 'D\'aventure'),
(20, 'Rock'),
(21, 'Chanson française'),
(22, 'Indé'),
(23, 'Punk'),
(24, 'Pop'),
(25, 'Classique'),
(26, 'Roman'),
(27, 'Poésie'),
(28, 'Théâtre'),
(29, 'Biographie');

-- --------------------------------------------------------

--
-- Structure de la table `human`
--

DROP TABLE IF EXISTS `human`;
CREATE TABLE IF NOT EXISTS `human` (
  `human_id` int(11) NOT NULL,
  `human_lastname` varchar(100) DEFAULT NULL,
  `human_sex` enum('Homme','Femme','Non binaire') DEFAULT NULL,
  `human_dob` date DEFAULT NULL,
  `human_pic` varchar(255) DEFAULT NULL,
  `human_firstname` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`human_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `human`
--

INSERT INTO `human` (`human_id`, `human_lastname`, `human_sex`, `human_dob`, `human_pic`, `human_firstname`) VALUES
(1, 'Smith', 'Homme', '1968-09-25', NULL, 'Will'),
(2, 'La Taupe', 'Non binaire', NULL, NULL, 'René'),
(3, 'Colombus', 'Homme', '1958-09-10', NULL, 'Chris'),
(4, 'Cuarón', 'Homme', '1961-11-28', NULL, 'Alfonso'),
(5, 'Serra', 'Homme', NULL, NULL, 'Jahân'),
(6, 'Mathias', 'Homme', NULL, NULL, 'Mickael'),
(7, 'Wilkosz', 'Homme', NULL, NULL, 'Aurélien'),
(8, 'Pompeani', 'Homme', NULL, NULL, 'Frank'),
(9, 'Lechaix', 'Femme', '1988-01-19', NULL, 'Laure'),
(10, 'Watson', 'Femme', '1990-04-15', NULL, 'Emma'),
(11, 'LeRelou', 'Homme', NULL, NULL, 'Toto'),
(12, 'Halliwell', 'Femme', NULL, NULL, 'Geri'),
(13, 'Beckham', 'Femme', NULL, NULL, 'Victoria'),
(14, 'Brown', 'Femme', NULL, NULL, 'Melanie'),
(15, 'Chisholm', 'Femme', NULL, NULL, 'Melanie'),
(16, 'Bunton', 'Femme', NULL, NULL, 'Emma'),
(17, 'Zellweger', 'Femme', '1969-04-25', NULL, 'Renée'),
(18, 'Rowling', 'Femme', '1965-07-31', NULL, 'J. K.'),
(19, 'Mathieu', 'Homme', NULL, NULL, 'Nicolas'),
(20, 'Vuillard', 'Homme', NULL, NULL, 'Eric');

-- --------------------------------------------------------

--
-- Structure de la table `is_associated_with`
--

DROP TABLE IF EXISTS `is_associated_with`;
CREATE TABLE IF NOT EXISTS `is_associated_with` (
  `media_id` int(11) NOT NULL,
  `tag_id` smallint(6) NOT NULL,
  PRIMARY KEY (`media_id`,`tag_id`),
  KEY `tag_id` (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `is_associated_with`
--

INSERT INTO `is_associated_with` (`media_id`, `tag_id`) VALUES
(14, 6);

-- --------------------------------------------------------

--
-- Structure de la table `media`
--

DROP TABLE IF EXISTS `media`;
CREATE TABLE IF NOT EXISTS `media` (
  `media_id` int(11) NOT NULL,
  `media_title` varchar(255) DEFAULT NULL,
  `media_type` enum('Film','Chanson','Livre','') DEFAULT NULL,
  `media_cover` varchar(255) DEFAULT NULL,
  `media_link` varchar(255) DEFAULT NULL,
  `asv_id` smallint(6) NOT NULL,
  PRIMARY KEY (`media_id`),
  KEY `asv_id` (`asv_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `media`
--

INSERT INTO `media` (`media_id`, `media_title`, `media_type`, `media_cover`, `media_link`, `asv_id`) VALUES
(1, 'Harry Potter à l\'école des sorciers', 'Film', NULL, NULL, 1),
(2, 'Harry Potter et la Chambre des secrets', 'Film', NULL, NULL, 1),
(3, 'Harry Potter et le Prisonnier d\'Azkaban', 'Film', NULL, NULL, 1),
(4, 'Harry Potter et la Coupe de feu', 'Film', NULL, NULL, 1),
(5, 'Harry Potter et l\'Ordre du phénix', 'Film', NULL, NULL, 1),
(6, 'Harry Potter et le Prince de sang-mêlé', 'Film', NULL, NULL, 1),
(7, 'Leurs enfants après eux', 'Livre', NULL, NULL, 1),
(8, 'L\'Ordre du jour', 'Livre', NULL, NULL, 1),
(9, 'Harry Potter à l\'école des sorciers', 'Livre', NULL, NULL, 1),
(10, 'Harry Potter et la Chambre des secrets', 'Livre', NULL, NULL, 1),
(11, 'Harry Potter et le Prisonnier d\'Azkaban', 'Livre', NULL, NULL, 1),
(12, 'Harry Potter et la Coupe de feu', 'Livre', NULL, NULL, 1),
(13, 'Wannabe', 'Chanson', NULL, NULL, 1),
(14, 'Mignon Mignon', 'Chanson', NULL, NULL, 1),
(15, 'It\'s raining men', 'Chanson', 'img/test.jpg', 'commercial.com', 1),
(16, 'Le Journal de Bridget Jones', 'Film', NULL, NULL, 1);

-- --------------------------------------------------------

--
-- Structure de la table `movie`
--

DROP TABLE IF EXISTS `movie`;
CREATE TABLE IF NOT EXISTS `movie` (
  `visa` int(11) DEFAULT NULL,
  `movie_year` int(4) DEFAULT NULL,
  `movie_runtime` smallint(6) DEFAULT NULL,
  `movie_trailer` varchar(255) DEFAULT NULL,
  `movie_synop` text,
  `movie_budget` varchar(30) DEFAULT NULL,
  `movie_saga` varchar(255) DEFAULT NULL,
  `movie_id` int(11) NOT NULL,
  PRIMARY KEY (`movie_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `movie`
--

INSERT INTO `movie` (`visa`, `movie_year`, `movie_runtime`, `movie_trailer`, `movie_synop`, `movie_budget`, `movie_saga`, `movie_id`) VALUES
(103984, 2001, 152, NULL, NULL, '125 000 000 $', 'Harry Potter', 1),
(106791, 2002, 161, NULL, NULL, '100 000 000 $', 'Harry Potter', 2),
(110535, 2004, 142, NULL, NULL, '130 000 000 $', 'Harry Potter', 3),
(114028, 2005, 157, '', NULL, '150 000 000 $', 'Harry Potter', 4),
(NULL, 2001, 97, NULL, NULL, NULL, NULL, 16);

-- --------------------------------------------------------

--
-- Structure de la table `play`
--

DROP TABLE IF EXISTS `play`;
CREATE TABLE IF NOT EXISTS `play` (
  `song_id` int(11) NOT NULL,
  `band_id` int(11) NOT NULL,
  PRIMARY KEY (`song_id`,`band_id`),
  KEY `band_id` (`band_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `play`
--

INSERT INTO `play` (`song_id`, `band_id`) VALUES
(13, 1);

-- --------------------------------------------------------

--
-- Structure de la table `produced_by`
--

DROP TABLE IF EXISTS `produced_by`;
CREATE TABLE IF NOT EXISTS `produced_by` (
  `media_id` int(11) NOT NULL,
  `pc_id` smallint(6) NOT NULL,
  PRIMARY KEY (`media_id`,`pc_id`),
  KEY `pc_id` (`pc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `produced_by`
--

INSERT INTO `produced_by` (`media_id`, `pc_id`) VALUES
(9, 1),
(10, 1),
(11, 1),
(7, 2),
(8, 2),
(13, 21);

-- --------------------------------------------------------

--
-- Structure de la table `production_company`
--

DROP TABLE IF EXISTS `production_company`;
CREATE TABLE IF NOT EXISTS `production_company` (
  `pc_id` smallint(6) NOT NULL,
  `pc_name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`pc_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `production_company`
--

INSERT INTO `production_company` (`pc_id`, `pc_name`) VALUES
(1, 'Bloomsbury Publishing'),
(2, 'Actes Sud'),
(3, 'Warner Music Group'),
(4, 'Universal Music Group'),
(5, 'EMI'),
(6, 'PolyGram'),
(7, 'Walt Disney Studios Entertainment'),
(8, 'Warner Bros. Entertainment'),
(9, 'Fox Entertainment Group'),
(10, 'Universal Studios\r\nNBCUniversal'),
(11, 'Sony Pictures Motion Picture Group'),
(12, 'Paramount Motion Pictures Group'),
(13, 'Gaumont'),
(14, 'StudioCanal'),
(15, 'UGC Ciné Cite'),
(16, 'EuropaCorp'),
(17, 'Maison d\'édition Gallimard'),
(18, 'Les Éditions Flammarion'),
(19, 'Les éditions Milan'),
(20, 'Hachette'),
(21, 'Virgin');

-- --------------------------------------------------------

--
-- Structure de la table `song`
--

DROP TABLE IF EXISTS `song`;
CREATE TABLE IF NOT EXISTS `song` (
  `song_id` int(11) NOT NULL,
  `song_album` varchar(200) DEFAULT NULL,
  `song_year` int(4) DEFAULT NULL,
  PRIMARY KEY (`song_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `song`
--

INSERT INTO `song` (`song_id`, `song_album`, `song_year`) VALUES
(13, 'Wannabe', 1996),
(14, 'Les aventures de René La Taupe', 2008),
(15, 'Bridget Jones\'s Diary', 2001);

-- --------------------------------------------------------

--
-- Structure de la table `tag`
--

DROP TABLE IF EXISTS `tag`;
CREATE TABLE IF NOT EXISTS `tag` (
  `tag_id` smallint(6) NOT NULL,
  `tag_name` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`tag_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `tag`
--

INSERT INTO `tag` (`tag_id`, `tag_name`) VALUES
(1, 'Drôle'),
(2, 'Nature'),
(3, 'Noël'),
(4, 'Fête'),
(5, 'St-Valentin'),
(6, 'Humour'),
(7, 'Océan'),
(8, 'Gore'),
(9, 'Enquête'),
(10, 'Futur'),
(11, 'Distopie'),
(12, 'Technologie'),
(13, 'Sport'),
(14, 'Epopée'),
(15, 'Mafia'),
(16, 'Meurtre'),
(17, 'Magie'),
(18, 'Culte'),
(19, 'Rétro'),
(20, 'Animaux'),
(21, 'Primé'),
(22, 'Social'),
(23, 'Univers'),
(24, 'Bataille'),
(25, 'Vintage'),
(26, 'Ecologie'),
(27, 'Aventure'),
(28, 'Enfant'),
(29, 'Japon'),
(30, 'Ecole'),
(31, 'Groupe'),
(32, 'Fille'),
(33, 'Intemporel'),
(34, 'Navet'),
(35, 'Nanard'),
(36, 'Société');

-- --------------------------------------------------------

--
-- Structure de la table `take_part_in`
--

DROP TABLE IF EXISTS `take_part_in`;
CREATE TABLE IF NOT EXISTS `take_part_in` (
  `media_id` int(11) NOT NULL,
  `work_id` smallint(6) NOT NULL,
  `human_id` int(11) NOT NULL,
  PRIMARY KEY (`media_id`,`work_id`,`human_id`),
  KEY `work_id` (`work_id`),
  KEY `human_id` (`human_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `take_part_in`
--

INSERT INTO `take_part_in` (`media_id`, `work_id`, `human_id`) VALUES
(1, 1, 10),
(2, 1, 10),
(3, 1, 10),
(4, 1, 10),
(5, 1, 10),
(6, 1, 10),
(16, 1, 17),
(14, 2, 2),
(15, 2, 12),
(7, 3, 19),
(8, 3, 20),
(9, 3, 18),
(10, 3, 18),
(11, 3, 18),
(12, 3, 18),
(1, 4, 3),
(2, 4, 3),
(3, 4, 4);

-- --------------------------------------------------------

--
-- Structure de la table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `human_id` int(11) NOT NULL,
  `user_email` varchar(255) DEFAULT NULL,
  `user_status` enum('Autorisé','Bloqué') DEFAULT NULL,
  `user_password` varchar(255) DEFAULT NULL,
  `user_date_creat` varchar(50) DEFAULT NULL,
  `city_id` smallint(6) NOT NULL,
  PRIMARY KEY (`human_id`),
  KEY `city_id` (`city_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `users`
--

INSERT INTO `users` (`human_id`, `user_email`, `user_status`, `user_password`, `user_date_creat`, `city_id`) VALUES
(6, NULL, 'Autorisé', NULL, NULL, 2),
(7, NULL, 'Autorisé', NULL, NULL, 2),
(9, NULL, 'Autorisé', NULL, NULL, 2),
(11, NULL, 'Bloqué', NULL, NULL, 3);

-- --------------------------------------------------------

--
-- Structure de la table `work`
--

DROP TABLE IF EXISTS `work`;
CREATE TABLE IF NOT EXISTS `work` (
  `work_id` smallint(6) NOT NULL,
  `work_name` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`work_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `work`
--

INSERT INTO `work` (`work_id`, `work_name`) VALUES
(1, 'Acteur'),
(2, 'Interprète'),
(3, 'Ecrivain'),
(4, 'Réalisateur');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `appreciation`
--
ALTER TABLE `appreciation`
  ADD CONSTRAINT `appreciation_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`),
  ADD CONSTRAINT `appreciation_ibfk_2` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`);

--
-- Contraintes pour la table `artist`
--
ALTER TABLE `artist`
  ADD CONSTRAINT `artist_ibfk_1` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`);

--
-- Contraintes pour la table `associated_with`
--
ALTER TABLE `associated_with`
  ADD CONSTRAINT `associated_with_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`),
  ADD CONSTRAINT `associated_with_ibfk_2` FOREIGN KEY (`work_id`) REFERENCES `work` (`work_id`);

--
-- Contraintes pour la table `book`
--
ALTER TABLE `book`
  ADD CONSTRAINT `book_ibfk_1` FOREIGN KEY (`book_id`) REFERENCES `media` (`media_id`);

--
-- Contraintes pour la table `categorized_by`
--
ALTER TABLE `categorized_by`
  ADD CONSTRAINT `categorized_by_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`),
  ADD CONSTRAINT `categorized_by_ibfk_2` FOREIGN KEY (`genre_id`) REFERENCES `genre` (`genre_id`);

--
-- Contraintes pour la table `city`
--
ALTER TABLE `city`
  ADD CONSTRAINT `city_ibfk_1` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`);

--
-- Contraintes pour la table `collection`
--
ALTER TABLE `collection`
  ADD CONSTRAINT `collection_ibfk_1` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`);

--
-- Contraintes pour la table `come_from`
--
ALTER TABLE `come_from`
  ADD CONSTRAINT `come_from_ibfk_1` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`),
  ADD CONSTRAINT `come_from_ibfk_2` FOREIGN KEY (`country_id`) REFERENCES `country` (`country_id`);

--
-- Contraintes pour la table `competed_in`
--
ALTER TABLE `competed_in`
  ADD CONSTRAINT `competed_in_ibfk_1` FOREIGN KEY (`ceremony_id`) REFERENCES `ceremony` (`ceremony_id`),
  ADD CONSTRAINT `competed_in_ibfk_2` FOREIGN KEY (`award_id`) REFERENCES `award` (`award_id`),
  ADD CONSTRAINT `competed_in_ibfk_3` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`);

--
-- Contraintes pour la table `composed_by`
--
ALTER TABLE `composed_by`
  ADD CONSTRAINT `composed_by_ibfk_1` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`),
  ADD CONSTRAINT `composed_by_ibfk_2` FOREIGN KEY (`band_id`) REFERENCES `band` (`band_id`);

--
-- Contraintes pour la table `contains`
--
ALTER TABLE `contains`
  ADD CONSTRAINT `contains_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`),
  ADD CONSTRAINT `contains_ibfk_2` FOREIGN KEY (`collect_id`) REFERENCES `collection` (`collect_id`);

--
-- Contraintes pour la table `is_associated_with`
--
ALTER TABLE `is_associated_with`
  ADD CONSTRAINT `is_associated_with_ibfk_1` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`),
  ADD CONSTRAINT `is_associated_with_ibfk_2` FOREIGN KEY (`tag_id`) REFERENCES `tag` (`tag_id`);

--
-- Contraintes pour la table `media`
--
ALTER TABLE `media`
  ADD CONSTRAINT `media_ibfk_1` FOREIGN KEY (`asv_id`) REFERENCES `asvalidation` (`asv_id`);

--
-- Contraintes pour la table `movie`
--
ALTER TABLE `movie`
  ADD CONSTRAINT `movie_ibfk_1` FOREIGN KEY (`movie_id`) REFERENCES `media` (`media_id`);

--
-- Contraintes pour la table `play`
--
ALTER TABLE `play`
  ADD CONSTRAINT `play_ibfk_1` FOREIGN KEY (`band_id`) REFERENCES `band` (`band_id`),
  ADD CONSTRAINT `play_ibfk_2` FOREIGN KEY (`song_id`) REFERENCES `song` (`song_id`);

--
-- Contraintes pour la table `produced_by`
--
ALTER TABLE `produced_by`
  ADD CONSTRAINT `produced_by_ibfk_1` FOREIGN KEY (`pc_id`) REFERENCES `production_company` (`pc_id`),
  ADD CONSTRAINT `produced_by_ibfk_2` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`);

--
-- Contraintes pour la table `song`
--
ALTER TABLE `song`
  ADD CONSTRAINT `song_ibfk_1` FOREIGN KEY (`song_id`) REFERENCES `media` (`media_id`);

--
-- Contraintes pour la table `take_part_in`
--
ALTER TABLE `take_part_in`
  ADD CONSTRAINT `take_part_in_ibfk_1` FOREIGN KEY (`work_id`) REFERENCES `work` (`work_id`),
  ADD CONSTRAINT `take_part_in_ibfk_2` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`),
  ADD CONSTRAINT `take_part_in_ibfk_3` FOREIGN KEY (`media_id`) REFERENCES `media` (`media_id`);

--
-- Contraintes pour la table `users`
--
ALTER TABLE `users`
  ADD CONSTRAINT `users_ibfk_1` FOREIGN KEY (`human_id`) REFERENCES `human` (`human_id`),
  ADD CONSTRAINT `users_ibfk_2` FOREIGN KEY (`city_id`) REFERENCES `city` (`city_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
