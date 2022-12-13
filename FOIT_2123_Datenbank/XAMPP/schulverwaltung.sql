
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `schulverwaltung`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `klasse`
--

CREATE TABLE `klasse` (
  `klassenbezeichnung` char(6) NOT NULL,
  `raumNr` varchar(10) NOT NULL,
  `beginn` date NOT NULL,
  `ende` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `klasse`
--

INSERT INTO `klasse` (`klassenbezeichnung`, `raumNr`, `beginn`, `ende`) VALUES
('11FOSA', 'I-202', '2017-06-08', '2019-07-07'),
('11FOSB', 'I-405', '2017-06-08', '2019-07-07'),
('11HBFI', 'I-101', '2017-08-14', '2019-06-09'),
('12HBFI', 'I-102', '2016-08-12', '2018-05-09');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `schueler`
--

CREATE TABLE `schueler` (
  `schuelerID` int(11) NOT NULL,
  `vorname` varchar(50) NOT NULL,
  `nachname` varchar(50) NOT NULL,
  `gebDatum` date NOT NULL,
  `geschlecht` set('w','m','','') NOT NULL,
  `taGeld` decimal(5,2) NOT NULL,
  `klassenbezeichnung` char(6) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Daten für Tabelle `schueler`
--

INSERT INTO `schueler` (`schuelerId`, `vorname`, `nachname`, `gebDatum`, `geschlecht`, `taGeld`, `klassenbezeichnung`) VALUES
(1, 'Marta', 'Heinz', '2000-02-18', 'w', '100.00', '11HBFI'),
(2, 'Max', 'Mustermann', '1998-01-12', 'm', '125.00', '11HBFI'),
(3, 'Laura', 'Hurt', '1997-08-03', 'w', '80.00', '11FOSB'),
(4, 'Nele', 'Meyer', '1999-04-25', 'w', '200.00', '11FOSA'),
(7, 'Thea', 'Taly', '1996-03-12', 'w', '75.00', '11FOSB'),
(8, 'Daniel', 'Hell', '1998-02-15', 'm', '150.00', '11FOSA');

--
-- Indizes der exportierten Tabellen
--

--
-- Indizes für die Tabelle `klasse`
--
ALTER TABLE `klasse`
  ADD PRIMARY KEY (`klassenbezeichnung`);

--
-- Indizes für die Tabelle `schueler`
--
ALTER TABLE `schueler`
  ADD PRIMARY KEY (`schuelerId`),
  ADD KEY `klassenbezeichnung` (`klassenbezeichnung`);

--
-- AUTO_INCREMENT für exportierte Tabellen
--

--
-- AUTO_INCREMENT für Tabelle `schueler`
--
ALTER TABLE `schueler`
  MODIFY `schuelerId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- Constraints der exportierten Tabellen
--

--
-- Constraints der Tabelle `schueler`
--
ALTER TABLE `schueler`
  ADD CONSTRAINT `schueler_ibfk_1` FOREIGN KEY (`klassenbezeichnung`) REFERENCES `klasse` (`klassenbezeichnung`) ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
