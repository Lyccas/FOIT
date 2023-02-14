-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- 

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";

--
-- Datenbank: `produkteundgruppen`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `produkt`
--

CREATE TABLE `produkt` (
  `ID_Produkt` int(11) NOT NULL,
  `bezeichnung` varchar(30) NOT NULL,
  `einkaufsdatum` date NOT NULL,
  `einkaufspreis` decimal(7,2) NOT NULL,
  `verkaufspreis` decimal(7,2) NOT NULL,
  `anzahl` int(3) NOT NULL,
  `ID_produktgruppe` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `produkt`
--

INSERT INTO `produkt` (`ID_Produkt`, `bezeichnung`, `einkaufsdatum`, `einkaufspreis`, `verkaufspreis`, `anzahl`, `ID_produktgruppe`) VALUES
(1, 'Stuhl Frida', '2001-02-26', '150.00', '200.00', 20, 1),
(2, 'Tisch Praktika', '2008-09-03', '500.00', '750.00', 4, 2),
(3, 'Schrank Harri', '2008-11-03', '1500.00', '2050.00', 2, 3),
(4, 'Sessel Deluxe', '2010-08-09', '295.00', '650.00', 15, 1),
(5, 'Bett Mandy', '2009-11-03', '800.00', '1450.00', 12, 5),
(6, 'Stuhl Hildegard', '2010-12-05', '180.00', '220.00', 9, 1),
(7, 'Stuhl Getrad', '2008-10-02', '200.00', '300.00', 8, 1),
(8, 'Tisch Frido', '2007-08-15', '580.00', '900.00', 12, 2),
(9, 'Sessel Exclusive', '2009-11-14', '240.00', '710.00', 13, 1),
(10, 'Schrank Bodo', '2012-01-20', '990.00', '1390.00', 14, 3),
(11, 'Schrank Rolli', '2009-10-18', '1200.00', '1850.00', 20, 3),
(12, 'Sessel Dreamy', '2006-05-09', '250.00', '590.00', 5, 1),
(13, 'Coach Linda', '2008-06-18', '2300.00', '3200.00', 8, 1),
(14, 'Coach Lara', '2010-08-01', '1900.00', '2400.00', 2, 1),
(15, 'Tisch Supi', '2002-10-12', '400.00', '690.00', 0, 2),
(16, 'Teppich Flip', '2006-11-11', '190.00', '320.00', 4, 4),
(17, 'Teppich Flop', '2008-10-10', '150.00', '250.00', 0, 4);

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `produktgruppe`
--

CREATE TABLE `produktgruppe` (
  `ID_produktgruppe` int(11) NOT NULL,
  `bezeichnung` varchar(50) NOT NULL,
  `erlaeuterung` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `produktgruppe`
--

INSERT INTO `produktgruppe` (`ID_produktgruppe`, `bezeichnung`, `erlaeuterung`) VALUES
(1, 'Sitzmöbel', 'Hier finden Sie alle Stühle sowie Sessel und Couchgarnituren für den Innen- und Außenbereich! '),
(2, 'Tische', 'Hier finden Sie alle Tische für den Innen- und Außenbereich!'),
(3, 'Aufbewahrung', 'Hier finden Sie alle Schränke und Aufbewahrungsmöbel für Ihren Haushalt.'),
(4, 'Teppiche', 'Alle was man auf den Boden legen kann!!!'),
(5, 'Schlafmöbel', 'Dieser Produktgruppe gehören alle Betten und bettähnliche Möbel (Liegen) gespeichert.');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `produktgruppe2`
--


--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `produkt`
--
ALTER TABLE `produkt`
  ADD PRIMARY KEY (`ID_Produkt`),
  ADD KEY `ID_produktgruppe` (`ID_produktgruppe`);

--
-- Indizes für die Tabelle `produktgruppe`
--
ALTER TABLE `produktgruppe`
  ADD PRIMARY KEY (`ID_produktgruppe`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `produkt`
--
ALTER TABLE `produkt`
  MODIFY `ID_Produkt` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT für Tabelle `produktgruppe`
--
ALTER TABLE `produktgruppe`
  MODIFY `ID_produktgruppe` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `produkt`
--
ALTER TABLE `produkt`
  ADD CONSTRAINT `produkt_ibfk_1` FOREIGN KEY (`ID_produktgruppe`) REFERENCES `produktgruppe` (`ID_produktgruppe`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
