-- phpMyAdmin SQL Dump
-- version 4.5.4.1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Apr 29, 2019 at 06:13 PM
-- Server version: 5.7.11
-- PHP Version: 5.6.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `catalogueparamount`
--

-- --------------------------------------------------------

--
-- Table structure for table `filmparamount`
--

CREATE TABLE `filmparamount` (
  `id` int(11) NOT NULL,
  `date_sortie` datetime NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `lien_image` varchar(255) DEFAULT NULL,
  `prix_visionnement` double NOT NULL,
  `titre` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `filmparamount`
--

INSERT INTO `filmparamount` (`id`, `date_sortie`, `description`, `lien_image`, `prix_visionnement`, `titre`) VALUES
(1, '2010-04-24 00:00:00', 'A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.', 'http://cdn.collider.com/wp-content/uploads/Inception-movie-poster-4.jpg', 11, 'Inception'),
(2, '2008-06-18 00:00:00', 'When the menace known as The Joker emerges from his mysterious past, he wreaks havoc and chaos on the people of Gotham. The Dark Knight must accept one of the greatest psychological and physical tests of his ability to fight injustice.', 'http://host.trivialbeing.org/up/tdk-may17-joker-poster-large.jpg', 11, 'The Dark Knight'),
(3, '2018-07-27 00:00:00', 'Two years after Solomon Lane\'s capture,[N 1] the remnants of his organization, The Syndicate, have reorganized.', 'https://www.tomcruisefan.com/gallery/albums/albums/movies/mission-impossible-6/Poster/MI-6-Posters-005.jpg', 11, 'Mission: Impossible – Fallout');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `filmparamount`
--
ALTER TABLE `filmparamount`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `filmparamount`
--
ALTER TABLE `filmparamount`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
