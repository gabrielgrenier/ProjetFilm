-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 29, 2019 at 01:39 AM
-- Server version: 5.7.11
-- PHP Version: 5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `cataloguecenturyfox`
--

-- --------------------------------------------------------

--
-- Table structure for table `film_century_fox`
--

CREATE TABLE `film_century_fox` (
  `id` int(11) NOT NULL,
  `date_sortie` datetime NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `lien_image` varchar(255) DEFAULT NULL,
  `prix_visionnement` double NOT NULL,
  `titre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `film_century_fox`
--

INSERT INTO `film_century_fox` (`id`, `date_sortie`, `description`, `lien_image`, `prix_visionnement`, `titre`) VALUES
(1, '2016-04-09 00:00:00', 'Film de deadpool 2', 'https://i.pinimg.com/originals/2a/83/7b/2a837b32e324ce1c90e9c7142984e2b7.jpg', 11.5, 'DeadPool 2'),
(2, '2016-04-09 00:00:00', 'Film de deadpool', 'https://images-na.ssl-images-amazon.com/images/I/91qmrdkBViL._SY606_.jpg', 9, 'DeadPool'),
(3, '2016-04-09 00:00:00', 'Film Logan', 'https://images-na.ssl-images-amazon.com/images/I/51Qkwjbm3IL.jpg', 12, 'Logan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `film_century_fox`
--
ALTER TABLE `film_century_fox`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `film_century_fox`
--
ALTER TABLE `film_century_fox`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
