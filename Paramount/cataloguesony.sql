-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Client :  localhost
-- Généré le :  Lun 22 Avril 2019 à 17:10
-- Version du serveur :  5.7.11
-- Version de PHP :  5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `cataloguesony`
--

-- --------------------------------------------------------

--
-- Structure de la table `film_sony`
--

CREATE TABLE `film_sony` (
  `id` int(11) NOT NULL,
  `date_sortie` datetime NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `lien_image` varchar(255) DEFAULT NULL,
  `prix_visionnement` double NOT NULL,
  `titre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Contenu de la table `film_sony`
--

INSERT INTO `film_sony` (`id`, `date_sortie`, `description`, `lien_image`, `prix_visionnement`, `titre`) VALUES
(1, '2018-10-05 00:00:00', 'Venom est un film de super-héros américain réalisé par Ruben Fleischer', NULL, 10, 'Venom'),
(2, '2020-10-05 00:00:00', 'Venom 2 est un film de super-héros américain réalisé par Ruben Fleischer', NULL, 0, 'Venom2');

--
-- Index pour les tables exportées
--

--
-- Index pour la table `film_sony`
--
ALTER TABLE `film_sony`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT pour les tables exportées
--

--
-- AUTO_INCREMENT pour la table `film_sony`
--
ALTER TABLE `film_sony`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
