-- phpMyAdmin SQL Dump
-- version 3.5.2.2
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 10. Dez 2013 um 19:50
-- Server Version: 5.5.27
-- PHP-Version: 5.4.7

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Datenbank: `mitarbeiterverwaltung`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `abteilung`
--

CREATE TABLE IF NOT EXISTS `abteilung` (
  `AbteilungNr` int(11) NOT NULL AUTO_INCREMENT,
  `Name` varchar(20) NOT NULL,
  `besteht_seit` date NOT NULL,
  PRIMARY KEY (`AbteilungNr`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Daten für Tabelle `abteilung`
--

INSERT INTO `abteilung` (`AbteilungNr`, `Name`, `besteht_seit`) VALUES
(1, 'Verkauf', '2012-09-04'),
(2, 'Einkauf', '2012-10-01'),
(3, 'Personal', '2013-10-04'),
(4, 'Produktion', '2012-11-06'),
(5, 'Lager', '2013-02-15'),
(6, 'Marketing', '2013-10-15');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `mitarbeiter`
--

CREATE TABLE IF NOT EXISTS `mitarbeiter` (
  `MitarbeiterNr` int(11) NOT NULL AUTO_INCREMENT,
  `AbteilungsNr` int(11) NOT NULL,
  `Name` varchar(20) NOT NULL,
  `Vorname` varchar(20) NOT NULL,
  `Geschlecht` enum('m','w') NOT NULL,
  `Staße&Nr` varchar(35) NOT NULL,
  `Wohnort` varchar(25) NOT NULL,
  PRIMARY KEY (`MitarbeiterNr`),
  KEY `AbteilungsNr` (`AbteilungsNr`),
  KEY `AbteilungsNr_2` (`AbteilungsNr`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=11 ;

--
-- Daten für Tabelle `mitarbeiter`
--

INSERT INTO `mitarbeiter` (`MitarbeiterNr`, `AbteilungsNr`, `Name`, `Vorname`, `Geschlecht`, `Staße&Nr`, `Wohnort`) VALUES
(1, 2, 'Mustermann', 'Max', 'm', 'Teststr.7', 'Wiesbaden'),
(2, 1, 'Jung', 'Jörg', 'm', 'Bahnhofstr.20', 'Idstein'),
(3, 2, 'Kraus', 'Thomas', 'm', 'Kleiststr. 5', 'Idstein'),
(4, 3, 'Wacker', 'Andreas', 'm', 'Reihenallee 3', 'Taunusstein-Hahn'),
(5, 2, 'Möller', 'Mia', 'w', 'Tanzstr. 6', 'Bad Camberg'),
(6, 6, 'Bocker', 'Bob', 'm', 'Alte Allee 15 ', 'Niedernhausen'),
(7, 5, 'Trussel', 'Kerstin', 'w', 'Wagenheberstr. 20', 'Wiesbaden'),
(8, 4, 'Meier', 'Anita', 'w', 'Lessingstr. 4', 'Bad Camberg'),
(9, 3, 'Kleiber', 'Thomas', 'm', 'Falterbachstr. 10', 'Taunusstein-Wehen'),
(10, 4, 'Alsas', 'Gabi', 'w', 'Weishaupt 8', 'Niedernhausen');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `projekt`
--

CREATE TABLE IF NOT EXISTS `projekt` (
  `ProjektNr` int(11) NOT NULL AUTO_INCREMENT,
  `Bezeichnung` varchar(80) NOT NULL,
  `Beginn` date NOT NULL,
  PRIMARY KEY (`ProjektNr`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=8 ;

--
-- Daten für Tabelle `projekt`
--

INSERT INTO `projekt` (`ProjektNr`, `Bezeichnung`, `Beginn`) VALUES
(1, 'Neuaustattung Büroräume', '2013-05-17'),
(2, 'Anwendungssoftware "Like" entwickeln', '2005-05-20'),
(3, 'Webseite ABC entwickeln', '2008-08-20'),
(4, 'Bürosoftware "Hey" erstellen', '2008-08-20'),
(5, 'Neuausstattung Bürokomplex', '2021-08-20'),
(6, 'Datenbank anlegen', '2013-05-17'),
(7, 'Webseite "XYZ" entwicklen', '2013-11-12');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `projektmitarbeiter`
--

CREATE TABLE IF NOT EXISTS `projektmitarbeiter` (
  `ProjektNr` int(11) NOT NULL,
  `MitarbeiterNr` int(11) NOT NULL,
  `Projektposition` varchar(30) NOT NULL,
  PRIMARY KEY (`ProjektNr`,`MitarbeiterNr`),
  KEY `MitarbeiterNr` (`MitarbeiterNr`),
  KEY `ProjektNr` (`ProjektNr`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `projektmitarbeiter`
--

INSERT INTO `projektmitarbeiter` (`ProjektNr`, `MitarbeiterNr`, `Projektposition`) VALUES
(1, 3, 'Projektmitarbeiter'),
(2, 2, 'Leiter'),
(3, 1, 'Teilprojektleiter'),
(4, 3, 'Leiter');

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `mitarbeiter`
--
ALTER TABLE `mitarbeiter`
  ADD CONSTRAINT `mitarbeiter_ibfk_1` FOREIGN KEY (`AbteilungsNr`) REFERENCES `abteilung` (`AbteilungNr`) ON UPDATE CASCADE;

--
-- Constraints der Tabelle `projektmitarbeiter`
--
ALTER TABLE `projektmitarbeiter`
  ADD CONSTRAINT `projektmitarbeiter_ibfk_1` FOREIGN KEY (`ProjektNr`) REFERENCES `projekt` (`ProjektNr`) ON UPDATE CASCADE,
  ADD CONSTRAINT `projektmitarbeiter_ibfk_2` FOREIGN KEY (`MitarbeiterNr`) REFERENCES `mitarbeiter` (`MitarbeiterNr`) ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
