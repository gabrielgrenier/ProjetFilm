-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Mer 24 Avril 2019 à 20:52
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `cataloguefilmmarvel`
--

-- --------------------------------------------------------

--
-- Structure de la table `film`
--

CREATE TABLE `film` (
  `id` int(11) NOT NULL,
  `date_sortie` datetime NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `lien_image` varchar(255) DEFAULT NULL,
  `prix_visionnement` double NOT NULL,
  `titre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `film`
--

INSERT INTO `film` (`id`, `date_sortie`, `description`, `lien_image`, `prix_visionnement`, `titre`) VALUES
(4, '2019-04-22 00:00:00', 'La fin des héros', 'http://t1.gstatic.com/images?q=tbn:ANd9GcSzYzZ8fnuDOmDN2dmhVFHoPwTZozfcjtlvsf3zdjzfgduLR0jy', 11.5, 'Avengers : Endgame'),
(5, '2017-11-03 00:00:00', 'La fin d\'Asgard', 'http://www.movienewsletters.net/photos/256906R1.jpg', 10.5, 'Thor Ragnarok');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `film`
--
ALTER TABLE `film`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `film`
--
ALTER TABLE `film`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
