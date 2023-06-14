import Center from "@/components/Center";
import styled from "styled-components";

const Bg = styled.div`
  padding: 50px 0;
`;
const Title = styled.h1`
  margin:0;
  font-weight:normal;
  font-size: 2rem;
`;
const Desc = styled.p`
  font-size: 1rem;
`;

export default function Impressum() {
    return (
        <Bg>
            <Center>
                <div>
                    <Title>Impressum</Title>
                    <Desc>
                        Angaben gemäß § 5 TMG <br/>
                        <br/>
                        Lukas Dombert <br/>
                        Erich-Kästner-Straße 6a <br/>
                        65232 Taunusstein <br/>
                        <br/>
                        <b>Vertreten durch:</b><br/>
                        Lukas Dombert <br/>
                        <br/>
                        <b>Kontakt:</b><br/>
                        Telefon: +49-15119436876 <br/>
                        E-Mail: lukasdombert2@gmail.com <br/>
                        <br/>
                        <b>Haftungsausschluss:</b><br/>
                        <br/>
                        <b>Haftung für Links</b><br/>
                        <br/>
                        Unser Angebot enthält Links zu externen Webseiten Dritter, auf deren Inhalte wir keinen Einfluss haben. Deshalb können wir für diese fremden Inhalte auch keine Gewähr übernehmen. Für die Inhalte der verlinkten Seiten ist stets der jeweilige Anbieter oder Betreiber der Seiten verantwortlich. Die verlinkten Seiten wurden zum Zeitpunkt der Verlinkung auf mögliche Rechtsverstöße überprüft. Rechtswidrige Inhalte waren zum Zeitpunkt der Verlinkung nicht erkennbar. Eine permanente inhaltliche Kontrolle der verlinkten Seiten ist jedoch ohne konkrete Anhaltspunkte einer Rechtsverletzung nicht zumutbar. Bei Bekanntwerden von Rechtsverletzungen werden wir derartige Links umgehend entfernen. <br/>
                        <br/>
                        <b>Datenschutz</b><br/>
                        <br/>
                        Die Nutzung unserer Webseite ist in der Regel ohne Angabe personenbezogener Daten möglich. Soweit auf unseren Seiten personenbezogene Daten (beispielsweise Name, Anschrift oder eMail-Adressen) erhoben werden, erfolgt dies, soweit möglich, stets auf freiwilliger Basis. Diese Daten werden ohne Ihre ausdrückliche Zustimmung nicht an Dritte weitergegeben. <br/>
                        Wir weisen darauf hin, dass die Datenübertragung im Internet (z.B. bei der Kommunikation per E-Mail) Sicherheitslücken aufweisen kann. Ein lückenloser Schutz der Daten vor dem Zugriff durch Dritte ist nicht möglich. <br/>
                        Der Nutzung von im Rahmen der Impressumspflicht veröffentlichten Kontaktdaten durch Dritte zur Übersendung von nicht ausdrücklich angeforderter Werbung und Informationsmaterialien wird hiermit ausdrücklich widersprochen. Die Betreiber der Seiten behalten sich ausdrücklich rechtliche Schritte im Falle der unverlangten Zusendung von Werbeinformationen, etwa durch Spam-Mails, vor. <br/>
                        <br/>
                        Website Impressum erstellt durch impressum-generator.de von der Kanzlei Hasselbach <br/>
                    </Desc>
                </div>
            </Center>
        </Bg>
    );
}