-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Erstellungszeit: 14. Nov 2019 um 09:31
-- Server-Version: 10.1.37-MariaDB
-- PHP-Version: 7.3.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `autohandel`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `auto`
--

CREATE TABLE `auto` (
  `AutoNr` int(10) NOT NULL DEFAULT '0',
  `Bezeichnung` varchar(50) COLLATE utf8_bin NOT NULL,
  `Preis` decimal(10,2) DEFAULT NULL COMMENT 'in Euro',
  `ModellreihenNr` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

--
-- Daten für Tabelle `auto`
--

INSERT INTO `auto` (`AutoNr`, `Bezeichnung`, `Preis`, `ModellreihenNr`) VALUES
(77, 'Mercedes CLK 200, Cabrio', '39000.00', 1),
(78, 'Mercedes SLK, 200', '42000.00', 2),
(79, 'Mercedes CLS 280', '60000.00', 1),
(80, 'Mercedes SLR McLaren', '480000.00', 2),
(81, 'Mercedes S-Klasse, 320 CDI', '71000.00', 2),
(82, 'BMW x6', '50000.00', 3),
(84, 'BMW 320i Cabrio', '52000.00', 6),
(85, 'BMW 530 5er', '60000.00', 4),
(86, 'BMW 525 d A Touring', '45000.00', 4),
(87, 'Audi Q5 2.0', '43000.00', 9),
(88, 'Audi A6 2.0', '42000.00', 8),
(89, 'Ferrrari F430', '150000.00', 10),
(90, 'Porsche Boxster', '41000.00', 11),
(91, 'Porsche 911 Carrera', '86000.00', 11),
(92, 'BMW 320i', '49000.00', 6),
(93, 'Mercedes CLS 250', '58000.00', 1),
(94, 'Ferrari F300', '124000.00', 10),
(95, 'Audi A6 2.0', '41000.00', 8),
(96, 'BMW x6 Turbo', '52500.00', 3),
(97, 'Merdeses SLK, 220', '44500.00', 2),
(98, 'Porsche Boxster Turbo', '43000.00', 11),
(99, 'Audi Q5 2.5', '49000.00', 9),
(100, 'Mercedes CLK 200', '37000.00', 1),
(101, 'Audi A5 Spezial', '37000.00', 7),
(102, 'Opel GT', '35000.00', 12),
(103, 'Audi Q5 Diesel', '45500.00', 9),
(104, 'Audi A6 2.0', '43000.00', 8),
(105, 'BMW 525 d A Touring', '46500.00', 4),
(106, 'Porsche 911 Carrera ', '82500.00', 11),
(107, 'Merdeses SLK, 220', '39500.00', 2),
(108, 'BMW 320i', '48500.00', 6),
(109, ' Audi Q5', '42000.00', 9),
(110, 'Porsche Boxster Turbo', '42500.00', 11),
(111, 'Porsche 911 Carrera', '87500.00', 11),
(112, 'Mercedes CLK 200, Cabrio', '41500.00', 1),
(113, 'Opel GT Spezial', '39500.00', 12);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `autokauf_kunde`
--

CREATE TABLE `autokauf_kunde` (
  `AutoNr` int(10) NOT NULL,
  `KdNr` smallint(5) NOT NULL DEFAULT '0',
  `Kaufdatum` date DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin COMMENT='Welcher Kunde hat weches Auto gekauft?' ROW_FORMAT=FIXED;

--
-- Daten für Tabelle `autokauf_kunde`
--

INSERT INTO `autokauf_kunde` (`AutoNr`, `KdNr`, `Kaufdatum`) VALUES
(77, 100, '2009-01-22'),
(78, 701, '2009-03-10'),
(79, 805, '2009-02-10'),
(80, 809, '2009-01-26'),
(81, 810, '2009-02-11'),
(82, 200, '2009-02-25'),
(83, 701, '2009-01-13'),
(84, 105, '2009-02-09'),
(85, 108, '2009-03-13'),
(86, 711, '2009-03-19'),
(87, 800, '2009-03-02'),
(88, 803, '2008-12-22'),
(89, 804, '2008-12-10'),
(90, 100, '2009-03-11'),
(91, 806, '2009-01-27'),
(92, 807, '2009-03-23'),
(93, 809, '2009-02-09'),
(94, 101, '2008-12-09'),
(95, 207, '2009-02-18'),
(96, 710, '2009-02-27'),
(97, 108, '2008-12-23'),
(98, 700, '2009-01-06'),
(99, 710, '2009-03-25'),
(100, 700, '2008-12-30'),
(101, 804, '2009-01-30'),
(102, 809, '2009-02-17'),
(103, 803, '2009-01-06'),
(104, 101, '2008-12-10'),
(105, 711, '2009-02-03'),
(106, 804, '2009-01-14'),
(107, 803, '2009-01-20'),
(108, 807, '2009-02-17'),
(109, 200, '2009-03-01'),
(110, 802, '2009-03-02'),
(111, 108, '2009-02-10'),
(112, 800, '2009-02-10'),
(113, 810, '2009-02-12');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kunde`
--

CREATE TABLE `kunde` (
  `KdNr` smallint(5) NOT NULL DEFAULT '0',
  `Name` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `Vorname` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `Strasse` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `PLZ` varchar(5) CHARACTER SET latin1 DEFAULT NULL,
  `Ort` varchar(30) CHARACTER SET latin1 DEFAULT NULL,
  `Telefon` varchar(20) CHARACTER SET latin1 DEFAULT NULL,
  `Telefon2` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '"- "',
  `Handy` varchar(20) COLLATE utf8_bin NOT NULL DEFAULT '"-"',
  `Geschlecht` char(1) CHARACTER SET latin1 DEFAULT NULL,
  `Kundenbetreuer` varchar(30) COLLATE utf8_bin NOT NULL,
  `Tel_Kundenbetreuer` varchar(30) COLLATE utf8_bin NOT NULL,
  `Filiale` varchar(30) COLLATE utf8_bin NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin ROW_FORMAT=DYNAMIC;

--
-- Daten für Tabelle `kunde`
--

INSERT INTO `kunde` (`KdNr`, `Name`, `Vorname`, `Strasse`, `PLZ`, `Ort`, `Telefon`, `Telefon2`, `Handy`, `Geschlecht`, `Kundenbetreuer`, `Tel_Kundenbetreuer`, `Filiale`) VALUES
(100, 'Meier', 'Inge', 'Amselweg 11', '53101', 'Bonn', '0228/124578', '0228/124580', '0178-34567812', 'w', 'Meiner', '06434-3545677', 'Hessen-Mitte'),
(101, 'Schneider', 'Ute', 'Hauptstr. 17', '50012', 'Köln', '0221/215211', '0223/121983', 'keine Angabe', 'w', 'Lach', '03456-1234355', 'NRW'),
(105, 'Berg', 'Anton', 'Am Funkturm 156', '65203', 'Wiesbaden', '0611/928792', '', '0160/982342', 'm', 'Meiner', '06434-3545677', 'Hessen-Mitte'),
(108, 'Wasser', 'Ute', 'Weststr. 20', '52074', 'Aachen', '0241/875554', '', '0150/1433378', 'w', 'König', '05464-567786', 'Dtld-Nord'),
(200, 'Huber', 'Sepp', 'Bodenseestr. 123', '81243', 'München', '089/8744397', '089/8744398', '', 'm', 'Bob', '0345-76666545', 'Dtld-Ost'),
(207, 'Schmitz', 'Hans', 'Siegburger Str. 51', '50679', 'Köln', '0221/814447', '', '', 'm', 'König', '05464-567786', 'Dtld-Nord'),
(209, 'Schmidt', 'Jürgen', 'Osdorfer Weg 7', '22607', 'Hamburg', '040/899899', '040/899900', '', 'm', 'Meiner', '06434-3545677', 'Hessen-Mitte'),
(611, 'Kammer', 'Ulrike', 'Hauptstr. 171', '52146', 'Würselen', '02405/712217', '', '', 'w', 'Lach', '03456-1234355', 'NRW'),
(700, 'Klein', 'Kurth', 'Jollystr. 99', '76137', 'Karlsruhe', '0721/9812124', '', '0781/98234577', 'm', 'König', '05464-567786', 'Dtld-Nord'),
(701, 'Huber', 'Anke', 'Gabelsberger Str. 70', '86199', 'Augsburg', '0821/98666', '', '', 'w', 'Bob', '0345-76666545', 'Dtld-Ost'),
(710, 'Schmidt', 'Beate', 'Klosterstr. 1', '40211', 'Düsseldorf', '0211/363636', '', '0170-8522245', 'w', 'Bob', '0345-76666545', 'Dtld-Ost'),
(711, 'Bauer', 'Klaus', 'Spielhagenstr. 113', '30107', 'Hannover', '0511/833883', '', '0176/9634578', 'm', 'Meiner', '06434-3545677', 'Hessen-Mitte'),
(800, 'Meier', 'Anton', 'Tiroler Weg 32', '79111', 'Freiburg', '0761/443444', '', '0178/8346574', 'm', 'König', '05464-567786', 'Dtld-Nord'),
(802, 'Meier', 'Doris', 'Hauptstr.32', '98528', 'Suhl', '03681/440044', '', '', 'w', 'Lach', '03456-1234355', 'NRW'),
(803, 'Schmidt', 'Barbara', 'Rößlerstr. 33', '09120', 'Chemnitz', '0371/525212', '', '0171/8923412', 'w', 'Lach', '03456-1234355', 'NRW'),
(804, 'Walczak', 'Hildegard', 'Altleubnitz 21', '01219', 'Dresden', '0351/788285', '', '', 'w', 'König', '05464-567786', 'Dtld-Nord'),
(805, 'Schmitz', 'Klaus', 'Vogelsanger Str.77', '50666', 'Köln', '0221/561112', '0221/561120', '', 'm', 'Bob', '0345-76666545', 'Dtld-Ost'),
(806, 'Lausen', 'Werner', 'Münstereifeler Str. 22', '53879', 'Euskirchen', '02251/868657', '', '', 'm', 'Bob', '0345-76666545', 'Dtld-Ost'),
(807, 'Görner', 'Heidrun', 'Waldstr. 97', '51145', 'Köln-Porz', '02203/912778', '', '0150/236556', 'w', 'Lach', '03456-1234355', 'NRW'),
(809, 'Preuß', 'Karl', 'Peter-Paul-Str. 67', '52249', 'Eschweiler', '02403/151515', '', '0160/2394401', 'm', 'Meiner', '06434-3545677', 'Hessen-Mitte'),
(810, 'Messner', 'Bärbel', 'Levenstr. 88', '50259', 'Pulheim', '02238/980021', '', '0155/2385944', 'w', 'Meiner', '06434-3545677', 'Hessen-Mitte');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `modellreihe`
--

CREATE TABLE `modellreihe` (
  `ModellreihenNr` int(11) NOT NULL,
  `Modellbezeichnung` varchar(255) COLLATE utf8_bin NOT NULL,
  `aktuellerBestand` int(11) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Daten für Tabelle `modellreihe`
--

INSERT INTO `modellreihe` (`ModellreihenNr`, `Modellbezeichnung`, `aktuellerBestand`) VALUES
(1, 'Mercedes C-Klasse', 20),
(2, 'Mercedes S-Klasse', 15),
(3, 'BMW x-Serie', 25),
(4, 'BMW 5er-Serie', 10),
(5, 'BMW 6er-Serie', 15),
(6, 'BMW sonstige', 12),
(7, 'Audi 5er', 20),
(8, 'Audi 6er', 15),
(9, 'Audi sonstige', 8),
(10, 'Ferrari', 4),
(11, 'Porsche', 10),
(12, 'sonstige Fahrzeuge', 5);

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `auto`
--
ALTER TABLE `auto`
  ADD PRIMARY KEY (`AutoNr`);

--
-- Indizes für die Tabelle `autokauf_kunde`
--
ALTER TABLE `autokauf_kunde`
  ADD PRIMARY KEY (`AutoNr`,`KdNr`);

--
-- Indizes für die Tabelle `kunde`
--
ALTER TABLE `kunde`
  ADD PRIMARY KEY (`KdNr`);

--
-- Indizes für die Tabelle `modellreihe`
--
ALTER TABLE `modellreihe`
  ADD PRIMARY KEY (`ModellreihenNr`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `autokauf_kunde`
--
ALTER TABLE `autokauf_kunde`
  MODIFY `AutoNr` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=114;

--
-- AUTO_INCREMENT für Tabelle `modellreihe`
--
ALTER TABLE `modellreihe`
  MODIFY `ModellreihenNr` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
