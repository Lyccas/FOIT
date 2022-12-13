-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Server-Version: 10.4.11-MariaDB
-- PHP-Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;


--
-- Tabellenstruktur für Tabelle `artikel`
--

CREATE TABLE `artikel` (
  `ArtikelNr` int(11) NOT NULL,
  `Artikelbezeichnung` varchar(50) NOT NULL,
  `LieferantenNr` int(11) NOT NULL,
  `KategorieNr` int(11) NOT NULL,
  `Liefereinheit` varchar(50) NOT NULL,
  `Einzelpreis` decimal(8,2) NOT NULL,
  `Lagerbestand` int(11) NOT NULL,
  `BestellteEinheiten` int(11) NOT NULL,
  `Mindestbestand` int(11) NOT NULL,
  `Auslaufartikel` varchar(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `artikel`
--

INSERT INTO `artikel` (`ArtikelNr`, `Artikelbezeichnung`, `LieferantenNr`, `KategorieNr`, `Liefereinheit`, `Einzelpreis`, `Lagerbestand`, `BestellteEinheiten`, `Mindestbestand`, `Auslaufartikel`) VALUES
(1, 'Chai', 1, 1, '10 Kartons x 20 Beutel', '18.00', 39, 0, 10, '0'),
(2, 'Chang', 1, 1, '24 x 12-oz-Flaschen', '19.00', 17, 40, 25, '0'),
(3, 'Aniseed Syrup', 1, 2, '12 x 550-ml-Flaschen', '10.00', 13, 70, 25, '0'),
(4, 'Chef Anton\'s Cajun Seasoning', 2, 2, '48 x 6-oz-Gläser', '22.00', 53, 0, 0, '0'),
(5, 'Chef Anton\'s Gumbo Mix', 2, 2, '36 Kartons', '21.00', 0, 0, 0, '1'),
(6, 'Grandma\'s Boysenberry Spread', 3, 2, '12 x 8-oz-Gläser', '25.00', 120, 0, 25, '0'),
(7, 'Uncle Bob\'s Organic Dried Pears', 3, 7, '12 x 1-lb-Packungen', '30.00', 15, 0, 10, '0'),
(8, 'Northwoods Cranberry Sauce', 3, 2, '12 x 12-oz-Gläser', '40.00', 6, 0, 0, '0'),
(9, 'Mishi Kobe Niku', 4, 6, '18 x 500-g-Packungen', '97.00', 29, 0, 0, '1'),
(10, 'Ikura', 4, 8, '12 x 200-ml-Gläser', '31.00', 31, 0, 0, '0'),
(11, 'Queso Cabrales', 5, 4, '1-kg-Paket', '21.00', 22, 30, 30, '0'),
(12, 'Queso Manchego La Pastora', 5, 4, '10 x 500-g-Packungen', '38.00', 86, 0, 0, '0'),
(13, 'Konbu', 6, 8, '2-kg-Karton', '6.00', 24, 0, 5, '0'),
(14, 'Tofu', 6, 7, '40 x 100-g-Packungen', '23.00', 35, 0, 0, '0'),
(15, 'Genen Shouyu', 6, 2, '24 x 250-ml-Flaschen', '15.00', 39, 0, 5, '0'),
(16, 'Pavlova', 7, 3, '32 x 500-g-Kartons', '17.00', 29, 0, 10, '0'),
(17, 'Alice Mutton', 7, 6, '20 x 1-kg-Dosen', '39.00', 0, 0, 0, '1'),
(18, 'Carnarvon Tigers', 7, 8, '16-kg-Paket', '62.00', 42, 0, 0, '0'),
(19, 'Teatime Chocolate Biscuits', 8, 3, '10 Kartons x 12 Stück', '9.00', 25, 0, 5, '0'),
(20, 'Sir Rodney\'s Marmalade', 8, 3, '30 Geschenkkartons', '81.00', 40, 0, 0, '0'),
(21, 'Sir Rodney\'s Scones', 8, 3, '24 Packungen x 4 Stück', '10.00', 3, 40, 5, '0'),
(22, 'Gustaf\'s Knäckebrod', 9, 5, '24 x 500-g-Packungen', '21.00', 104, 0, 25, '0'),
(23, 'Tunnbräd', 9, 5, '12 x 250-g-Packungen', '9.00', 61, 0, 25, '0'),
(24, 'Guarani Fantästica', 10, 1, '12 x 355-ml-Dosen', '4.00', 20, 0, 0, '1'),
(25, 'NuNuCa Nu-Nougat-Creme', 11, 3, '20 x 450-g-Gläser', '14.00', 76, 0, 30, '0'),
(26, 'Gummibärchen', 11, 3, '100 x 250-g-Beutel', '31.00', 15, 0, 0, '0'),
(27, 'Schoggi Schokolade', 11, 3, '100 x 100-g-Stück', '43.00', 49, 0, 30, '0'),
(28, 'Rässle Sauerkraut', 12, 7, '25 x 825-g-Dosen', '45.00', 26, 0, 0, '1'),
(29, 'Thüringer Rostbratwurst', 12, 6, '50 Beutel x 30 Würstchen', '123.00', 0, 0, 0, '1'),
(30, 'Nord-Ost Matjeshering', 13, 8, '10 x 200-g-Gläser', '25.00', 10, 0, 15, '0'),
(31, 'Gorgonzola Telino', 14, 4, '12 x 100-g-Packungen', '12.00', 0, 70, 20, '0'),
(32, 'Mascarpone Fabioli', 14, 4, '24 x 200-g-Packungen', '32.00', 9, 40, 25, '0'),
(33, 'Geitost', 15, 4, '500-g-Packung', '2.00', 112, 0, 20, '0'),
(34, 'Sasquatch Ale', 16, 1, '24 x 12-oz-Flaschen', '14.00', 111, 0, 15, '0'),
(35, 'Steeleye Stout', 16, 1, '24 x 12-oz-Flaschen', '18.00', 20, 0, 15, '0'),
(36, 'Inlagd Sill', 17, 8, '24 x 250-g -Gläser', '19.00', 112, 0, 20, '0'),
(37, 'Gravad lax', 17, 8, '12 x 500-g-Packungen', '26.00', 11, 50, 25, '0'),
(38, 'Cote de Blaye', 18, 1, '12 x 75-cl-Flaschen', '263.00', 17, 0, 15, '0'),
(39, 'Chartreuse verte', 18, 1, '750-ml-Flasche', '18.00', 69, 0, 5, '0'),
(40, 'Boston Crab Meat', 19, 8, '24 x 4-oz-Dosen', '18.00', 123, 0, 30, '0'),
(41, 'Jack\'s New England Clam Chowder', 19, 8, '12 x 12-oz-Dosen', '9.00', 85, 0, 10, '0'),
(42, 'Singaporean Hokkien Fried Mee', 20, 5, '32 x 1-kg-Packungen', '14.00', 26, 0, 0, '1'),
(43, 'Ipoh Coffee', 20, 1, '16 x 500-g-Dosen', '46.00', 17, 10, 25, '0'),
(44, 'Gula Malacca', 20, 2, '20 x 2-kg-Beutel', '19.00', 27, 0, 15, '0'),
(45, 'Ragede sild', 21, 8, '1-kg-Paket', '9.00', 5, 70, 15, '0'),
(46, 'Spegesild', 21, 8, '4 x 450-g-Gläser', '12.00', 95, 0, 0, '0'),
(47, 'Zaanse koeken', 22, 3, '10 x 4-oz-Kartons', '9.00', 36, 0, 0, '0'),
(48, 'Chocolade', 22, 3, '10 Packungen', '12.00', 15, 70, 25, '0'),
(49, 'Maxilaku', 23, 3, '24 x 50-g-Packungen', '20.00', 10, 60, 15, '0'),
(50, 'Valkoinen suklaa', 23, 3, '12 x 100-g-Riegel', '16.00', 65, 0, 30, '0'),
(51, 'Manjimup Dried Apples', 24, 7, '50 x 300-g-Packungen', '53.00', 20, 0, 10, '0'),
(52, 'Filo Mix', 24, 5, '16 x 2-kg-Kartons', '7.00', 38, 0, 25, '0'),
(53, 'Perth Pasties', 24, 6, '48 Stück', '32.00', 0, 0, 0, '1'),
(54, 'Tourtillas', 25, 6, '16 Pasteten', '7.00', 21, 0, 10, '0'),
(55, 'Pat chinois', 25, 6, '24 Kartons x 2 Pasteten', '24.00', 115, 0, 20, '0'),
(56, 'Gnocchi di nonna Alice', 26, 5, '24 x 250-g-Packungen', '38.00', 21, 10, 30, '0'),
(57, 'Ravioli Angelo', 26, 5, '24 x 250-g-Packungen', '19.00', 36, 0, 20, '0'),
(58, 'Escargots de Bourgogne', 27, 8, '24 Stück', '13.00', 62, 0, 20, '0'),
(59, 'Raclette Courdavault', 28, 4, '5-kg-Packung', '55.00', 79, 0, 0, '0'),
(60, 'Camembert Pierrot', 28, 4, '15 x 300-g-Stücke', '34.00', 19, 0, 0, '0'),
(61, 'Sirop d\'Arable', 29, 2, '24 x 500-ml-Flaschen', '28.00', 113, 0, 25, '0'),
(62, 'Tarte au sucre', 29, 3, '48 TÃ¶rtchen', '49.00', 17, 0, 0, '0'),
(63, 'Vegie-spread', 7, 2, '15 x 625-g-Gläser', '43.00', 24, 0, 5, '0'),
(64, 'Wimmers gute Semmelknödel', 12, 5, '20 Beutel x 4 Stück', '33.00', 22, 80, 30, '0'),
(65, 'Louisiana Fiery Hot Pepper Sauce', 2, 2, '32 x 8-oz-Flaschen', '21.00', 76, 0, 0, '0'),
(66, 'Louisiana Hot Spiced Okra', 2, 2, '24 x 8-oz-Gläser', '17.00', 4, 100, 20, '0'),
(67, 'Laughing Lumberjack Lager', 16, 1, '24 x 12-oz-Flaschen', '14.00', 52, 0, 10, '0'),
(68, 'Scottish Longbreads', 8, 3, '10 Kartons x 8 Stück', '12.00', 6, 10, 15, '0'),
(69, 'Gudbrandsdalsost', 15, 4, '10-kg-Paket', '36.00', 26, 0, 15, '0'),
(70, 'Outback Lager', 7, 1, '24 x 355-ml-Flaschen', '15.00', 15, 10, 30, '0'),
(71, 'Flätemysost', 15, 4, '10 x 500-g-Packungen', '21.00', 26, 0, 0, '0'),
(72, 'Mozzarella di Giovanni', 14, 4, '24 x 200 g-Packungen', '34.00', 14, 0, 0, '0'),
(73, 'Reod Kaviar', 17, 8, '24 x 150-g-Gläser', '15.00', 101, 0, 5, '0'),
(74, 'Longlife Tofu', 4, 7, '5-kg-Paket', '10.00', 4, 20, 5, '0'),
(75, 'Rönbräu Klosterbier', 12, 1, '24 x 0,5-l-Flaschen', '7.00', 125, 0, 25, '0'),
(76, 'Lakkalliri', 23, 1, '500-ml-Flasche', '18.00', 57, 0, 20, '0'),
(77, 'Original Frankfurter grüne Soße', 12, 2, '12 Kartons', '13.00', 32, 0, 15, '0');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `kategorie`
--

CREATE TABLE `kategorie` (
  `KategorieNr` int(11) NOT NULL,
  `Kategoriename` varchar(30) NOT NULL,
  `Beschreibung` text NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `kategorie`
--

INSERT INTO `kategorie` (`KategorieNr`, `Kategoriename`, `Beschreibung`) VALUES
(1, 'Getränke', 'Alkoholfreie Getränke, Kaffee, Tee, Bier'),
(2, 'Gewürze', 'Süße und saure Soßen, Gewürze'),
(3, 'Süßwaren', 'Desserts und Süßigkeiten'),
(4, 'Milchprodukte', 'Käsesorten'),
(5, 'Getreideprodukte', 'Brot, Kräcker, Nudeln, Müsli'),
(6, 'Fleischprodukte', 'Fleisch-Fertiggerichte'),
(7, 'Naturprodukte', 'Getrocknete Früchte, Tofu usw.'),
(8, 'Meeresfrüchte', 'Meerespflanzen und -früchte, Fisch');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `lieferant`
--

CREATE TABLE `lieferant` (
  `LieferantenNr` int(11) NOT NULL,
  `Firma` varchar(50) NOT NULL,
  `Kontaktperson` varchar(50) NOT NULL,
  `Position` varchar(50) NOT NULL,
  `Straße` varchar(50) NOT NULL,
  `Ort` varchar(50) NOT NULL,
  `Region` varchar(20) NOT NULL,
  `PLZ` varchar(20) NOT NULL,
  `Land` varchar(30) NOT NULL,
  `Telefon` varchar(30) NOT NULL,
  `Telefax` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `lieferant`
--

INSERT INTO `lieferant` (`LieferantenNr`, `Firma`, `Kontaktperson`, `Position`, `Straße`, `Ort`, `Region`, `PLZ`, `Land`, `Telefon`, `Telefax`) VALUES
(1, 'Exotic Liquids', 'Charlotte Cooper', 'Einkaufsmanager', '49 Gilbert St.', 'London', '', 'EC1 4SD', 'Großbritannien', '(71) 555-2222', ''),
(2, 'New Orleans Cajun Delights', 'Shelley Burke', 'Bestellungen-Sachbearbeiterin', 'P.O. Box 78934', 'New Orleans', 'LA', '70117', 'USA', '(100) 555-4822', ''),
(3, 'Grandma Kelly\'s Homestead', 'Regina Murphy', 'Vertriebsmitarbeiterin', '707 Oxford Rd.', 'Ann Arbor', 'MI', '48104', 'USA', '(313) 555-5735', '(313) 555-3349'),
(4, 'Tokyo Traders', 'Yoshi Nagase', 'Marketingmanager', '9-8 Sekimai\r\nMusashino-shi', 'Tokyo', '', '100', 'Japan', '(03) 3555-5011', ''),
(5, 'Cooperativa de Quesos \'Las Cabras\'', 'Antonio del Valle Saavedra ', 'Exportadministrator', 'Calle del Rosal 4', 'Oviedo', 'Asturias', '33007', 'Spanien', '(98) 598 76 54', ''),
(6, 'Mayumi\'s', 'Mayumi Ohno', 'Marketingrepräsentant', '92 Setsuko\r\nChuo-ku', 'Osaka', '', '545', 'Japan', '(06) 431-7877', ''),
(7, 'Pavlova, Ltd.', 'Ian Devling', 'Marketingmanager', '74 Rose St.\r\nMoonie Ponds', 'Melbourne', 'Victoria', '3058', 'Australien', '(03) 444-2343', '(03) 444-6588'),
(8, 'Specialty Biscuits, Ltd.', 'Peter Wilson', 'Vertriebsmitarbeiter', '29 King\'s Way', 'Manchester', '', 'M14 GSD', 'Großbritannien', '(26) 555-4448', ''),
(9, 'PB Knäckebröd AB', 'Lars Peterson', 'Vertriebsagent', 'Kaloadagatan 13', 'Göteborg', '', 'S-345 67', 'Schweden', '031-987 65 43', '031-987 65 91'),
(10, 'Refrescos Americanas LTDA', 'Carlos Diaz', 'Marketingmanager', 'Av. das Americanas 12.890', 'Sao Paulo', '', '5442', 'Brasilien', '(11) 555 4640', ''),
(11, 'Heli Süßwaren GmbH & Co. KG', 'Petra Winkler', 'Vertriebsmanager', 'Tiergartenstraße 5', 'Berlin', '', '10785', 'Deutschland', '(010) 9984510', ''),
(12, 'Plutzer Lebensmittelgroßmärkte AG', 'Martin Bein', 'Marketingmanager International', 'Bogenallee 51', 'Frankfurt', '', '60439', 'Deutschland', '(069) 992755', ''),
(13, 'Nord-Ost-Fisch Handelsgesellschaft mbH', 'Sven Petersen', 'Koordinator Auslandsmärkte', 'Frahmredder 112a', 'Cuxhaven', '', '27478', 'Deutschland', '(04721) 8713', '(04721) 8714'),
(14, 'Formaggi Fortini s.r.l.', 'Elio Rossi', 'Vertriebsmitarbeiter', 'Viale Dante, 75', 'Ravenna', '', '48100', 'Italien', '(0544) 60323', '(0544) 60603'),
(15, 'Norske Meierier', 'Beate Vileid', 'Marketingmanager', 'Hatlevegen 5', 'Sandvika', '', '1320', 'Norwegen', '(0)2-953010', ''),
(16, 'Bigfoot Breweries', 'Cheryl Saylor', 'Regionalvertreterin', '3400 - 8th Avenue\r\nSuite 210', 'Bend', 'OR', '97101', 'USA', '(503) 555-9931', ''),
(17, 'Svensk Sass AB', 'Michael Björn', 'Vertriebsmitarbeiter', 'Brovallavägen 231', 'Stockholm', '', 'S-123 45', 'Schweden', '08-123 45 67', ''),
(18, 'Aux joyeux eccläsiastiques', 'Guyaune Nodier', 'Vertriebsmanager', '203, Rue des Francs-Bourgeois', 'Paris', '', '75004', 'Frankreich', '(1) 03.83.00.68', '(1) 03.83.00.62'),
(19, 'New England Seafood Cannery', 'Robb Merchant', 'Großhandelsvertreter', 'Order Processing Dept.\r\n2100 Paul Revere Blvd.', 'Boston', 'MA', '02134', 'USA', '(617) 555-3267', '(617) 555-3389'),
(20, 'Leka Trading', 'Chandra Leka', 'Inhaberin', '471 Serangoon Loop, Suite #402', 'Singapore', '', '0512', 'Singapur', '555-8787', ''),
(21, 'Lyngbysild', 'Niels Petersen', 'Vertriebsmanager', 'Lyngbysild\r\nFiskebakken 10', 'Lyngby', '', '2800', 'Dänemark', '43844108', '43844115'),
(22, 'Zaanse Snoepfabriek', 'Dirk Luchte', 'Buchhaltung-Sachbearbeiter', 'Verkoop\r\nRijnweg 22', 'Zaandam', '', '9999 ZZ', 'Niederlande', '(12345) 1212', '(12345) 1210'),
(23, 'Karkki Oy', 'Anne Heikkonen', 'Produktmanager', 'Valtakatu 12', 'Lappeenranta', '', '53120', 'Finnland', '(953) 10956', ''),
(24, 'G\'day, Mate', 'Wendy Mackenzie', 'Vertriebsmitarbeiterin', '170 Prince Edward Parade\r\nHunter\'s Hill', 'Sydney', 'NSW', '2042', 'Australien', '(02) 555-5914', '(02) 555-4873'),
(25, 'Ma Maison', 'Jean-Guy Lauzon', 'Marketingmanager', '2960 Rue St. Laurent', 'Montreal', 'Quebec', 'H1J 1C3', 'Kanada', '(514) 555-9022', ''),
(26, 'Pasta Buttini s.r.l.', 'Giovanni Giudici', 'Bestellungen-Sachbearbeiter', 'Via dei Gelsomini, 153', 'Salerno', '', '84100', 'Italien', '(089) 6547665', '(089) 6547667'),
(27, 'Escargots Nouveaux', 'Marie Delamare', 'Vertriebsmanager', '22, rue H. Voiron', 'Montceau', '', '71300', 'Frankreich', '85.57.00.07', ''),
(28, 'Gaisturage', 'Eliane Noz', 'Vertriebsmitarbeiterin', 'Bat. B\r\n3, rue des Alpes', 'Annecy', '', '74000', 'Frankreich', '38.76.98.06', '38.76.98.58'),
(29, 'Forts d\'Äables', 'Chantal Goulet', 'Buchhaltung-Sachbearbeiterin', '148 rue Chasseur', 'Ste-Hyacinthe', 'Quass', 'J2S 7S8', 'Kanada', '(514) 555-2955', '(514) 555-2921');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `artikel`
--
ALTER TABLE `artikel`
  ADD PRIMARY KEY (`ArtikelNr`);

--
-- Indizes für die Tabelle `kategorie`
--
ALTER TABLE `kategorie`
  ADD PRIMARY KEY (`KategorieNr`);

--
-- Indizes für die Tabelle `lieferant`
--
ALTER TABLE `lieferant`
  ADD PRIMARY KEY (`LieferantenNr`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
