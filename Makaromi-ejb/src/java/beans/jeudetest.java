package beans;

import entites.Address;
import entites.Artist;
import entites.Category;
import entites.Event;
import entites.Pricing;
import entites.Representation;
import entites.Seat;
import entites.Section;
import entites.UserReg;
import entites.Venue;
import java.util.GregorianCalendar;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

@Stateless
public class jeudetest implements jeudetestLocal {
 
 @PersistenceContext(unitName = "Makaromi-ejbPU")
 private EntityManager em;
  
 
 @Override
   public String createbd(){
       
       System.out.println("creatbd execute-------------------------------------->");

        Address ad1 = new Address("Zac du Cornillon Nord", "93200", "Saint-Denis");
        Address ad2 = new Address("Boulevard de Bercy", "75012", "PARIS");
        Address ad3 = new Address("bd serurier", "75019", "paris");
        Address ad4 = new Address("rue montaigne", "75005", "paris");
        Address ad5 = new Address("rue lefevre", "75002", "paris");
        Address ad6 = new Address("avenue leflandre", "75017", "paris");
        Address ad7 = new Address("boulevard de la bastille", "75012", "paris");
        Address ad8 = new Address("rue de l'ouest", "25065", "lyon");
        Address ad9 = new Address("P.O. Box 727, 6257 Cursus Road", "33006", "Prince Albert");
        Address ad10 = new Address("P.O. Box 576, 5805 Arcu. Rd.", "39-200", "Aurora");
        Address ad11 = new Address("Ap #979-195 Velit Road", "5443", "Norfolk County");
        Address ad12 = new Address("9571 Magna Av.", "77277", "Red Deer");
        Address ad13 = new Address("6510 Tristique Av.", "S9J 9G4", "Matagami");
        Address ad14 = new Address("382-568 Pretium St.", "31354", "Villers-la-Ville");
        Address ad15 = new Address("P.O. Box 610, 7900 Sem Road", "14-310", "Castelluccio Superiore");
        Address ad16 = new Address("846-791 Fusce Ave", "O72 3EH", "Peutie");
        Address ad17 = new Address("153-2157 Mauris Avenue", "851268", "Merdorp");
        Address ad18 = new Address("5333 Dui. Road", "918850", "Manukau");
        Address ad19 = new Address("395-1937 Nascetur St.", "30-051", "Garbsen");
        Address ad20 = new Address("Ap #335-387 Dui, Rd.", "74784", "Navadwip");
        Address ad21 = new Address("Ap #190-5326 Odio, Av.", "5831", "Sint-Joost-ten-Node");
        Address ad22 = new Address("8994 Purus, Road", "41117", "Piegaro");
        Address ad23 = new Address("P.O. Box 609, 8350 Sem Street", "80694", "Drayton Valley");
        Address ad24 = new Address("Ap #254-6553 Pede Avenue", "6400", "Houtave");
        Address ad25 = new Address("6524 Non, Rd.", "3068", "Motta Sant Anastasia");
        Address ad26 = new Address("1715 Nec, Avenue", "926691", "Eufemia a Maiella");
        Address ad27 = new Address("332-8613 Malesuada Rd.", "1234", "Freire");
        Address ad28 = new Address("5515 Sapien. Road", "37280", "Lake Cowichan");




        ////////////////////////////////////////////////////////////////user
        UserReg u1 = new UserReg(ad18,ad18,"Mr","Alfonso", "Morse", "17/07/1976", "Quisque.purus.sapien@magnisdis.org","admin", "root");
        UserReg u2 = new UserReg(ad19,ad19,"Mr","Ivor", "Ellison", "15/02/1961", "fermentum.metus.Aenean@dictummiac.edu", "Charles Calderon", "SZS94IXT1FV");
        UserReg u3 = new UserReg(ad20,ad20,"Mr","Clayton", "Frazier", "22/05/1977", "metus@risusQuisquelibero.net", "Igor Aguirre", "MKC72DCE9QM");
        UserReg u4 = new UserReg(ad21,ad21,"Mr","Cameron", "Ferguson", "19/01/1955", "pellentesque.massa.lobortis@odiosempercursus.com", "Laith Stout", "LXF47GGQ0RY");
        UserReg u5 = new UserReg(ad22,ad22,"Mr","Amir", "Buckley", "23/02/1977", "facilisis.eget.ipsum@risusDonec.net","Keane Jenkins", "WYI25PIO3LB");
        UserReg u6 = new UserReg(ad23,ad23,"Mr","Hector", "Johnston", "23/04/1954", "Sed.nec.metus@felispurus.net", "Elton Coffey", "VYL79NGF9TI");
        UserReg u7 = new UserReg(ad24,ad25,"Mr","Ivan", "Nicholson", "05/10/1996", "convallis.ante.lectus@nisl.ca", "Bernard Tyson", "WTV91HZB2TB");
        UserReg u8 = new UserReg(ad26,ad26,"Mr","Barrett", "Burt", "12/05/1959", "fringilla.purus@eleifendnunc.com", "Nissim Jackson", "AFD22JCH8JN");
        UserReg u9 = new UserReg(ad27,ad27,"Mr","Isaiah", "Hoffman", "10/07/1945", "eget.venenatis.a@penatibusetmagnis.edu", "Odysseus Valencia", "MMU44UUP9FC");
        UserReg u10 = new UserReg(ad28,ad28,"Mr","Ryan", "Prince", "20/05/1963", "eros@sed.com","Noah Wilder", "SGR98IAM7SM");
        

       //////////////////////////////////////////section
        Section s1 = new Section("Musique");
        Section s2 = new Section("Théâtre");
        Section s3 = new Section("Parc");
        Section s4 = new Section("Festival");
        Section s5 = new Section("Promotion");
        Section s6 = new Section("Musée");
        Section s7 = new Section("Sport");
       //////////////////////////////////////////acteur
        Artist a1 = new Artist("Mick", "Jagger", "Chanteur Rolling Stones", "");
        Artist a2 = new Artist("Keith", "Richards", "Guitariste Rolling Stones", "");
        Artist a3 = new Artist("Charlie", "Watts", "Batteur Rolling Stones", "");
        Artist a4 = new Artist("Ron", "Wood", "Guitariste Rolling Stones", "");
        Artist a5 = new Artist("Anthony", "Kiedis", "Chanteur Red Hot Chilli Peppers", "");
        Artist a6 = new Artist("Michael", "Balzary (Flea)", "Bassiste Red Hot Chilli Peppers", "");
        Artist a7 = new Artist("Chad", "Smith", "Batteur Red Hot Chilli Peppers", "");
        Artist a8 = new Artist("Andrew", "Taggart", "Dj Chainsmokers", "");
        Artist a9 = new Artist("Alex", "Pall", "Dj Chainsmokers", "");
        Artist a10 = new Artist("Andrew", "Taggart", "Dj Chainsmokers", "");
        Artist a11 = new Artist("Alex", "Pall", "Dj Chainsmokers", "");
        Artist a12 = new Artist("Beyonce", "Knowles Carter", "", "");
        Artist a13 = new Artist("Sting", "", "", "");
      ///////////////////////////////////////////evenement
        Event e1 = new Event("Concert Retour des Rolling Stones", "images/event1RollingStones.jpeg", (new GregorianCalendar(2017, 1, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Un retour fracassant des rois du rock n roll.", "un évènement à ne pas manquer");
        Event e2 = new Event("Concert parisien des Red Hot Chili Peppers", "images/event2RedHot.jpg", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Un groupe de légende.", "un évènement inoubliable");
        Event e3 = new Event("Tournée française de The Chainsmokers", "images/event3Chainsmokers.png", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Concert", "Une énergie incroyable");
        Event e4 = new Event("Tournée exceptionnelle de Beyonce", "images/event4Beyonce.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 5, 1).getTime()), "Tournée de concerts de la seule, l'unique QUEEN B", "Beyonce en forme olympique");
        Event e5 = new Event("Concert unique de Sting", "images/event5Sting.jpg", (new GregorianCalendar(2017, 6, 1).getTime()), (new GregorianCalendar(2017, 1, 7).getTime()), "Sting incroyable", "Le grand Sting en concert avec plein de duo et trio surprises");
        Event e6 = new Event("Finale Rugby TOP 14", "images/event6Rugby.jpg", (new GregorianCalendar(2017, 1, 2).getTime()), (new GregorianCalendar(2017, 2, 1).getTime()), "C'est LE match de la saison, celui que toutes les équipes de TOP 14 rêvent de jouer.", "Une finale qui promet d'être inoubliable");
        Event e7 = new Event("Handball PARIS 2017, 25 eme championnat du monde masculin", "images/event7Handball.jpg", (new GregorianCalendar(2017, 2, 3).getTime()), (new GregorianCalendar(2017, 2, 18).getTime()), "Elle ne pouvait rêver d'un meilleur calendrier.", "Regardez l'histoire s'écrire sous vos yeux");
        Event e8 = new Event("Finale coupe de la ligue", "images/event8LigueLyon.jpg", (new GregorianCalendar(2017, 3, 3).getTime()), (new GregorianCalendar(2017, 3, 3).getTime()), "A lyon une tribune sera réservée au familles et comprendra une offre de restauration.", " ");
        Event e9 = new Event("Mondial de hockey 2017", "images/event9Hockey.jpg", (new GregorianCalendar(2017, 2, 15).getTime()), (new GregorianCalendar(2017, 2, 30).getTime()), "La Finlande et la Biélorussie ouvriront les festivités à Paris.", " ");
        Event e10 = new Event("Hergé", "images/event10Herge.jpg", (new GregorianCalendar(2017, 1, 1).getTime()), (new GregorianCalendar(2017, 1, 15).getTime()), "On ne présente plus la carrière de Georges Remi, dit Hergé.", " ");
        Event e11 = new Event("Rembrandt intime", "images/event11Rembrandt.jpg", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 28).getTime()), "L'exposition est conçue autour des trois chefs-d'oeuvre du Musée Jacquemart-André.", " ");
        Event e12 = new Event("Bouchardon (1698-1762)Une idée du beau", "images/event12.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Edme Bouchardon fut considéré de son temps comme un artiste d'exception.", "une exposition du musée du Louvres");
        Event e13 = new Event("MAGRITTE LA TRAHISON DES IMAGES", "images/event13Magritte.jpg", (new GregorianCalendar(2016, 9, 25).getTime()), (new GregorianCalendar(2017, 8, 31).getTime()), "Exposition «Magritte, La trahison des images» pose un nouveau regard sur l'oeuvre.", "Magritte au centre pompidou !");
        Event e14 = new Event("Norman sur scène", "images/event14Norman.jpg", (new GregorianCalendar(2016, 9, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Norman, de « Norman fait des vidéos », arrive enfin sur scène avec son tout premier one-man show.", "un évènement à ne pas manquer");
        Event e15 = new Event("Romeo et Juliette", "images/event15.jpg", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Pièce légendaire du répertoire, Roméo et Juliette est devenue l'incarnation de l'histoire d'amour absolue.", " ");
        Event e16 = new Event("Les femmes savantes", "images/event16FemmeSavante.jpg", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 1, 4).getTime()), "Une comédie de moeurs jubilatoire au coeur d'une famille bourgeoise menée par trois femmes savantes.", "Une énergie incroyable");
        Event e17 = new Event("Richard III", "images/event17Richard3.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 1, 5).getTime()), "A leur naissance, des personnages comme Richard III semblent être de même constitution que nous.", " ");
        Event e18 = new Event("Madame Bovary", "images/event18MadameBovary.jpg", (new GregorianCalendar(2017, 6, 6).getTime()), (new GregorianCalendar(2017, 7, 7).getTime()), "Une pièce qui donne chair à la sensibilité, l'ironie et la force poétique de l'écriture de Flaubert.", " ");
        Event e19 = new Event("Disneyland Paris", "images/event19Disney.jpg", (new GregorianCalendar(2016, 12, 1).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Les flocons de neige scintillent sur le Parc Disneyland... ", "une expérience magique pour les petits comme pour les grands");
        Event e20 = new Event("Asterix", "images/event20Asterix.jpg", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Rire, bonne humeur, partage en famille et entre amis, en 2017, venez vivre des expériences sensationnelles au Parc Astérix.", " ");
        Event e21 = new Event("Zoo Parc de Beauval", "images/event21Zoo.jpg", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "A seulement 600 m du ZooParc de Beauval, le nouvel hôtel*** Les Pagodes de Beauval propose 128 chambres.", " ");
        Event e22 = new Event("Musillac 2017", "images/event22Musilac.jpg", (new GregorianCalendar(2017, 7, 7).getTime()), (new GregorianCalendar(2017, 7, 10).getTime()), "Cette année, le festival pop-rock n°1 de la région Rhône-Alpes fête ses 15 ans...et durera 4 Jours, du 13 au 16 juillet 2017.", " ");
        Event e23 = new Event("We love Green", "images/event23WeLoveGreen.jpg", (new GregorianCalendar(2017, 5, 26).getTime()), (new GregorianCalendar(2017, 5, 28).getTime()), " ", " ");
        Event e24 = new Event("Solidays", "images/event24Solidays.jpg", (new GregorianCalendar(2017, 8, 25).getTime()), (new GregorianCalendar(2017, 8, 28).getTime()), " ", " ");
       
        System.out.println("----------------------------------------------->instancie evenement" +e1);
       
         ///////////////////////////////////////////////venue
        Venue v1 = new Venue("Stade de France", "Stade", "images/venue1StadeFrance.jpg",ad1);
        Venue v2 = new Venue("Bercy", "Salle de concert", "images/venue2.jpg",ad2);
        Venue v3 = new Venue("Zenith", "Salle de concert", "images/venue3.gif",ad3);
        Venue v4 = new Venue("Olympia", "Salle de concert", "images/venue3.jpg",ad4);
        Venue v5 = new Venue("Hotel de ville", "Mairie", " ",ad5);
        Venue v6 = new Venue("Centre Pompidou", "Musée", " ",ad6);
        Venue v7 = new Venue("Louvre", "Musée", " ",ad7);
        Venue v8 = new Venue("Théâtre du Châtelet", "Théâtre", "images/venue7.jpg",ad8);
        Venue v9 = new Venue("Théâtre du Palais Royal", "Théâtre", "images/venue8.jpg",ad9);
        Venue v10 = new Venue("Théâtre du Rond-Point", "Théâtre", "images/venue9.jpg",ad10);
        Venue v11 = new Venue("Théâtre de la ville", "Théâtre", "images/venue10.jpg",ad11);
        Venue v12 = new Venue("Disneyland Paris", "Parc d'attraction", " ",ad12);
        Venue v13 = new Venue("Asterix", "Parc d'attraction", " ",ad13);
        Venue v14 = new Venue("Zoo de Beauval", "Zoo", " ",ad15);
        Venue v15 = new Venue("Parc de Seaux", "Parc", " ",ad16);
        Venue v16 = new Venue("Bois de Vincennes", "Bois", " ",ad17);
        Venue v17 = new Venue("Bois de Boulogne", "Bois", " ",ad18);

      ///////////////////////////////////////////////////tarif 
        Pricing p1 = new Pricing("tarif enfant",6,"");
        Pricing p2 = new Pricing("tarif handicapé",6,"");
        Pricing p3 = new Pricing("tarif demandeur d'emploi",6,"");
        Pricing p4 = new Pricing("tarif réduit",8,"");
        Pricing p5 = new Pricing("tarif senior",10,"");
        
      ///////////////////////////////////////////representation
        Representation r1 = new Representation(2000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()));
        Representation r2 = new Representation(2000,(new GregorianCalendar(2017, 1, 16, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 16, 19, 0).getTime()));
        Representation r3 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 17, 19, 0).getTime()));
        Representation r4 = new Representation(2000, (new GregorianCalendar(2017, 1, 17, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 18, 19, 0).getTime()));
        Representation r5 = new Representation(2000,(new GregorianCalendar(2017, 1, 19, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 19, 19, 0).getTime()));
        Representation r6 = new Representation(2000,(new GregorianCalendar(2017, 1, 20, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 20, 19, 0).getTime()));
        Representation r7 = new Representation(2000,(new GregorianCalendar(2017, 1, 21, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 21, 19, 0).getTime()));
        Representation r8 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 22, 19, 0).getTime()));
        Representation r9 = new Representation(2000, (new GregorianCalendar(2017, 1, 22, 19, 0).getTime()),(new GregorianCalendar(2017, 1, 23, 19, 0).getTime()));
        Representation r10 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 24, 19, 0).getTime()));
        Representation r11 = new Representation(5000,(new GregorianCalendar(2017, 1, 24, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 25, 19, 0).getTime()));
        Representation r12 = new Representation(5000,(new GregorianCalendar(2017, 1, 26, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 26, 19, 0).getTime()));
        Representation r13 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 27, 19, 0).getTime()));
        Representation r14 = new Representation(5000,(new GregorianCalendar(2017, 1, 27, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 28, 19, 0).getTime()));
        Representation r15 = new Representation(5000,(new GregorianCalendar(2017, 1, 15, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 29, 19, 0).getTime()));
        Representation r16 = new Representation(5000,(new GregorianCalendar(2017, 1, 29, 19, 0).getTime()), (new GregorianCalendar(2017, 1, 30, 19, 0).getTime()));
        Representation r17 = new Representation(5000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 1, 19, 0).getTime()));
        Representation r18 = new Representation(10000, (new GregorianCalendar(2017, 2, 1, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 2, 19, 0).getTime()));
        Representation r19 = new Representation(10000,(new GregorianCalendar(2017, 2, 3, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 3, 19, 0).getTime()));
        Representation r20 = new Representation(10000,(new GregorianCalendar(2017, 2, 4, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 4, 19, 0).getTime()));
        Representation r21 = new Representation(10000, (new GregorianCalendar(2017, 2, 2, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 2, 19, 0).getTime()));
        Representation r22 = new Representation(10000, (new GregorianCalendar(2017, 2, 3, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 3, 19, 0).getTime()));
        Representation r23 = new Representation(10000, (new GregorianCalendar(2017, 2, 4, 19, 0).getTime()),(new GregorianCalendar(2017, 2, 4, 19, 0).getTime()));
        Representation r24 = new Representation(10000,(new GregorianCalendar(2017, 2, 5, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 5, 19, 0).getTime()));
        Representation r25 = new Representation(10000,(new GregorianCalendar(2017, 2, 6, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 6, 19, 0).getTime()));
        Representation r26 = new Representation(10000,(new GregorianCalendar(2017, 2, 7, 19, 0).getTime()), (new GregorianCalendar(2017, 2, 7, 19, 0).getTime()));
      
/////////////////////////////////////////////////ad tarif representation
       r1.getTarifs().add(p3);
       r1.getTarifs().add(p2);
       r1.getTarifs().add(p1);
       
       r2.getTarifs().add(p3);
       r2.getTarifs().add(p2);
       r2.getTarifs().add(p1);
       
       r3.getTarifs().add(p3);
       r3.getTarifs().add(p2);
       r3.getTarifs().add(p1);
       
       r4.getTarifs().add(p3);
       r4.getTarifs().add(p2);
       r4.getTarifs().add(p1);
       
       r5.getTarifs().add(p3);
       r5.getTarifs().add(p2);
       r5.getTarifs().add(p1);
       
       r6.getTarifs().add(p3);
       r7.getTarifs().add(p2);
       r8.getTarifs().add(p1);
       ///////////////////////////////////////////////////////ajout des lieu au representation
       r1.setMyvenue(v1);
       r2.setMyvenue(v2);
       r3.setMyvenue(v3);
       
       r4.setMyvenue(v1);
       r5.setMyvenue(v2);
       r6.setMyvenue(v3);
       
       r7.setMyvenue(v1);
       r8.setMyvenue(v2);
       r9.setMyvenue(v3);
       r10.setMyvenue(v4);
       
       
     ////////////////////////////////////////////////creation representation-evenement 
       e1.getRepresentationsev().add(r1);
       e1.getRepresentationsev().add(r2);
       e1.getRepresentationsev().add(r3);
       e1.getRepresentationsev().add(r4);
       
       e2.getRepresentationsev().add(r1);
       e3.getRepresentationsev().add(r2);
       e4.getRepresentationsev().add(r3);
       e5.getRepresentationsev().add(r4);
       e6.getRepresentationsev().add(r5);
       e7.getRepresentationsev().add(r6);
       e8.getRepresentationsev().add(r7);
       e9.getRepresentationsev().add(r8);
       e10.getRepresentationsev().add(r9);
      
      //////////////////////////////////////////////////////// 
       e1.getArtists().add(a1);
       e1.getArtists().add(a2);
       e1.getArtists().add(a3);
       e1.getArtists().add(a4);
       
       e2.getArtists().add(a5);
       e2.getArtists().add(a6);
       e2.getArtists().add(a7);
       
       e3.getArtists().add(a8);
       e3.getArtists().add(a9);
       e3.getArtists().add(a10);
       e3.getArtists().add(a11);
       
       e4.getArtists().add(a12);
       e5.getArtists().add(a13);
       

       ///////////////////////////////////////////////////////affectation de la section a l'evenement
       e1.setSection(s1);
       e2.setSection(s1);
       e3.setSection(s1);       
       e4.setSection(s1);
       e5.setSection(s1);
       
       e6.setSection(s7);
       e7.setSection(s7);
       e8.setSection(s7);
       e9.setSection(s7);
       
       e10.setSection(s6);
       e11.setSection(s6);
       e12.setSection(s6);
       e13.setSection(s6);
       
       e14.setSection(s2);
       e15.setSection(s2);
       e16.setSection(s2);
       e17.setSection(s2);
       e18.setSection(s2);
       
       e19.setSection(s3);
       e20.setSection(s3);
       e21.setSection(s3);
       
       e22.setSection(s4);
       e23.setSection(s4);
       e24.setSection(s4);
       
      

       ///////////////////////////////////////////////////////persist evenement et user
       em.persist(e1);
       em.persist(e2);
       em.persist(e3);
       em.persist(e3);
       em.persist(e4);
       em.persist(e5);
       em.persist(e6);
       em.persist(e7);
       em.persist(e8);
       em.persist(e9);
       
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        em.persist(s5);
        em.persist(s6);
        em.persist(s7);
        
       em.persist(u1);
       em.persist(u2);
       em.persist(u3);
       em.persist(u4);
       em.persist(u5);
       em.persist(u6);
       em.persist(u7);
       em.persist(u8);
       em.persist(u9);
       em.persist(u10);
       
       
       
       
       
       //////////////////////////////////////////////////////////persist
       em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.persist(e7);
        em.persist(e8);
        em.persist(e9);
        em.persist(e10);
        em.persist(e11);
        em.persist(e12);
        em.persist(e13);
        em.persist(e14);
        em.persist(e15);
        em.persist(e16);
        em.persist(e17);
        em.persist(e18);
        em.persist(e19);
        em.persist(e20);
        em.persist(e21);
        em.persist(e22);
        em.persist(e23);
        em.persist(e24);
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        em.persist(s5);
        em.persist(s6);
        em.persist(s7);
        em.persist(u1);
        em.persist(u2);
        em.persist(u3);
        em.persist(u4);
        em.persist(u5);
        em.persist(u6);
        em.persist(u7);
        em.persist(u8);
        em.persist(u9);
        em.persist(u10);
        em.persist(ad1);
        em.persist(ad2);
        em.persist(ad3);
        em.persist(ad4);
        em.persist(ad5);
        em.persist(ad6);
        em.persist(ad7);
        em.persist(ad8);
        em.persist(ad9);
        em.persist(ad10);
        em.persist(ad11);
        em.persist(ad12);
        em.persist(ad13);
        em.persist(ad14);
        em.persist(ad15);
        em.persist(ad16);
        em.persist(ad17);
        em.persist(ad18);
        em.persist(ad19);
        em.persist(ad20);
        em.persist(ad21);
        em.persist(ad22);
        em.persist(ad23);
        em.persist(ad24);
        em.persist(ad25);
        em.persist(ad26);
        em.persist(ad27);
        em.persist(ad28);
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(a4);
        em.persist(a5);
        em.persist(a6);
        em.persist(a7);
        em.persist(a8);
        em.persist(a9);
        em.persist(a10);
        em.persist(a11);
        em.persist(a12);
        em.persist(a13);
        em.persist(v1);
        em.persist(v2);
        em.persist(v3);
        em.persist(v4);
        em.persist(v5);
        em.persist(v6);
        em.persist(v7);
        em.persist(v8);
        em.persist(v9);
        em.persist(v10);
        em.persist(v11);
        em.persist(v12);
        em.persist(v13);
        em.persist(v14);
        em.persist(v15);
        em.persist(v16);
        em.persist(v17);
        em.persist(r1);
        em.persist(r2);
        em.persist(r3);
        em.persist(r4);
        em.persist(r5);
        em.persist(r6);
        em.persist(r7);
        em.persist(r8);
        em.persist(r9);
        em.persist(r10);
        em.persist(r11);
        em.persist(r12);
        em.persist(r13);
        em.persist(r14);
        em.persist(r15);
        em.persist(r16);
        em.persist(r17);
        em.persist(r18);
        em.persist(r19);
        em.persist(r20);
        em.persist(r21);
        em.persist(r22);
        em.persist(r23);
        em.persist(r24);
        em.persist(r25);
        em.persist(r26);
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);

      ///////////////////////////////////////////////////////////requete
        String mess ="les evenement du stade de france-----------------------------------------> ";
        String req031 = "select distinct e from Event e"
                + " join e.representationsev r where r.myvenue.name = :paramvenu";
        Query qr031 = em.createQuery(req031);
        qr031.setParameter("paramvenu", "Stade de France");
        qr031.setMaxResults(3);
        qr031.setFirstResult(0);
        List<Event> ls = qr031.getResultList();
        for(Event e : ls){
            mess = mess+"<br>"+e.getName();
        }
        
       //" select s from Soigneur s "
         //       + "join s.animaux a where a.id= :paramId";
      /* 
        String req031 = " select s from Soigneur s "
                + "join s.animaux a where a.id= :paramId";
        Query qr031 = em.createQuery(req031);
        qr031.setParameter("paramId", idAnimal);
        ls = qr031.getResultList();
        for(Soigneur s : ls){
            System.out.println(s);
        }
       
     */
    return mess;
   }
}
    
    /*
        ////////////////////////////////////////////////creation 
        ///////////////////////////////////////////lien status / event
        e1.getStatus().add(st1);
        e2.getStatus().add(st2);
        e3.getStatus().add(st1);
        e4.getStatus().add(st1);
        e5.getStatus().add(st1);
        e6.getStatus().add(st1);
        e7.getStatus().add(st1);
        e8.getStatus().add(st1);
        e9.getStatus().add(st1);
        e10.getStatus().add(st1);
        e11.getStatus().add(st1);
        e12.getStatus().add(st2);
        e13.getStatus().add(st1);
        e14.getStatus().add(st1);
        e15.getStatus().add(st1);
        e16.getStatus().add(st1);
        e17.getStatus().add(st2);
        e18.getStatus().add(st1);
        e19.getStatus().add(st1);
        e20.getStatus().add(st2);
        e21.getStatus().add(st1);
        e22.getStatus().add(st1);
        e23.getStatus().add(st2);
        e24.getStatus().add(st1);

        ///////////////////////////////////////////lien status / payment        
        pa1.getStatus().add(st3);
        pa2.getStatus().add(st4);
        pa3.getStatus().add(st3);
        pa4.getStatus().add(st3);
        pa5.getStatus().add(st3);
        pa6.getStatus().add(st3);
        pa7.getStatus().add(st4);
        pa8.getStatus().add(st3);
        pa9.getStatus().add(st3);
        pa10.getStatus().add(st3);

        ///////////////////////////////////////////lien status / seat
        se1.getStatus().add(st8);
        se2.getStatus().add(st8);
        se3.getStatus().add(st9);
        se4.getStatus().add(st8);
        se5.getStatus().add(st8);
        se6.getStatus().add(st8);
        se7.getStatus().add(st9);
        se8.getStatus().add(st8);
        se9.getStatus().add(st8);
        se10.getStatus().add(st8);
        se11.getStatus().add(st9);
        se12.getStatus().add(st8);
        se13.getStatus().add(st8);
        se14.getStatus().add(st8);
        se15.getStatus().add(st9);
        se16.getStatus().add(st8);
        se17.getStatus().add(st8);
        se18.getStatus().add(st8);
        se19.getStatus().add(st9);
        se20.getStatus().add(st8);
        se21.getStatus().add(st8);
        se22.getStatus().add(st8);
        se23.getStatus().add(st9);
        se24.getStatus().add(st8);
        se25.getStatus().add(st8);
        se26.getStatus().add(st8);

        ///////////////////////////////////////////lien status / order
        o1.getStatus().add(st6);
        o2.getStatus().add(st6);
        o3.getStatus().add(st6);
        o4.getStatus().add(st6);
        o5.getStatus().add(st6);
        o6.getStatus().add(st6);
        o7.getStatus().add(st6);
        o8.getStatus().add(st7);
        o9.getStatus().add(st6);
        o10.getStatus().add(st6);
        o11.getStatus().add(st6);
        o12.getStatus().add(st7);
        o13.getStatus().add(st6);
        o14.getStatus().add(st6);
        o15.getStatus().add(st6);
        o16.getStatus().add(st6);
        o17.getStatus().add(st7);
        o18.getStatus().add(st6);
        o19.getStatus().add(st6);
        o20.getStatus().add(st7);

        //////////////////////////////////////////lien order / payment
        o1.getStatus().add(pa1);
        o2.getStatus().add(pa2);
        o3.getStatus().add(pa3);
        o4.getStatus().add(pa4);
        o5.getStatus().add(pa5);
        o6.getStatus().add(pa6);
        o7.getStatus().add(pa7);
        o8.getStatus().add(pa8);
        o9.getStatus().add(pa9);
        o10.getStatus().add(pa10);
        o11.getStatus().add(pa11);
        o12.getStatus().add(pa12);
        o13.getStatus().add(pa13);
        o14.getStatus().add(pa14);
        o15.getStatus().add(pa15);
        o16.getStatus().add(pa16);
        o17.getStatus().add(pa17);
        o18.getStatus().add(pa18);

        ///////////////////////////////////////////lien order / adress        
        o1.getAddressBil().add(ad13);
        o2.getAddressBil().add(ad14);
        o3.getAddressBil().add(ad15);
        o4.getAddressBil().add(ad16);
        o5.getAddressBil().add(ad17);
        o6.getAddressBil().add(ad18);
        o7.getAddressBil().add(ad19);
        o8.getAddressBil().add(ad20);
        o9.getAddressBil().add(ad21);
        o10.getAddressBil().add(ad22);
        o11.getAddressBil().add(ad23);
        o12.getAddressBil().add(ad24);
        o13.getAddressBil().add(ad25);
        o14.getAddressBil().add(ad26);
        o15.getAddressBil().add(ad27);
        o16.getAddressBil().add(ad28);

        o1.getAddressDel().add(ad13);
        o2.getAddressDel().add(ad14);
        o3.getAddressDel().add(ad15);
        o4.getAddressDel().add(ad16);
        o5.getAddressDel().add(ad17);
        o6.getAddressDel().add(ad18);
        o7.getAddressDel().add(ad19);
        o8.getAddressDel().add(ad20);
        o9.getAddressDel().add(ad21);
        o10.getAddressDel().add(ad22);
        o11.getAddressDel().add(ad23);
        o12.getAddressDel().add(ad24);
        o13.getAddressDel().add(ad25);
        o14.getAddressDel().add(ad26);
        o15.getAddressDel().add(ad27);
        o16.getAddressDel().add(ad28);

        //////////////////////////////////////////lien order / ticket
        o1.getTicketsOrder().add(t1);
        o2.getTicketsOrder().add(t2);
        o3.getTicketsOrder().add(t3);
        o4.getTicketsOrder().add(t4);
        o5.getTicketsOrder().add(t5);
        o6.getTicketsOrder().add(t6);
        o7.getTicketsOrder().add(t7);
        o8.getTicketsOrder().add(t8);
        o9.getTicketsOrder().add(t9);
        o10.getTicketsOrder().add(t10);
        o11.getTicketsOrder().add(t11);
        o12.getTicketsOrder().add(t12);
        o13.getTicketsOrder().add(t13);
        o14.getTicketsOrder().add(t14);
        o15.getTicketsOrder().add(t15);
        o16.getTicketsOrder().add(t16);
        o17.getTicketsOrder().add(t17);

        ////////////////////////////////////////lien order / user
        o1.getUser().add(u1);
        o2.getUser().add(u2);
        o3.getUser().add(u3);
        o4.getUser().add(u4);
        o5.getUser().add(u5);
        o6.getUser().add(u6);
        o7.getUser().add(u7);
        o8.getUser().add(u8);
        o9.getUser().add(u9);
        o10.getUser().add(u10);
        o11.getUser().add(u11);
        o12.getUser().add(u12);
        o13.getUser().add(u13);
        o14.getUser().add(u14);
        o15.getUser().add(u15);
        o16.getUser().add(u16);
        o17.getUser().add(u17);

        //////////////////////////////////////////////lien ticket/seat
        t1.getSeat().add(se1);
        t2.getSeat().add(se2);
        t3.getSeat().add(se3);
        t4.getSeat().add(se4);
        t5.getSeat().add(se5);
        t6.getSeat().add(se6);
        t7.getSeat().add(se7);
        t8.getSeat().add(se8);
        t9.getSeat().add(se9);
        t10.getSeat().add(se10);
        t11.getSeat().add(se11);
        t12.getSeat().add(se12);
        t13.getSeat().add(se13);
        t14.getSeat().add(se14);
        t15.getSeat().add(se15);
        t16.getSeat().add(se16);
        t17.getSeat().add(se17);

        ///////////////////////////////////////////////lien seat/representation
        se1.getRepresentation().add(r1);
        se2.getRepresentation().add(r1);
        se3.getRepresentation().add(r1);
        se4.getRepresentation().add(r1);
        se5.getRepresentation().add(r1);
        se6.getRepresentation().add(r1);
        se7.getRepresentation().add(r2);
        se8.getRepresentation().add(r2);
        se9.getRepresentation().add(r2);
        se10.getRepresentation().add(r2);
        se11.getRepresentation().add(r2);
        se12.getRepresentation().add(r2);
        se13.getRepresentation().add(r2);
        se14.getRepresentation().add(r3);
        se15.getRepresentation().add(r3);
        se16.getRepresentation().add(r4);
        se17.getRepresentation().add(r5);

        ////////////////////////////////////////lien representation/event
        r1.getEvent().add(e1);
        r2.getEvent().add(e1);
        r3.getEvent().add(e1);
        r4.getEvent().add(e1);
        r5.getEvent().add(e2);
        r6.getEvent().add(e2);
        r7.getEvent().add(e2);
        r8.getEvent().add(e3);
        r9.getEvent().add(e3);
        r10.getEvent().add(e3);
        r11.getEvent().add(e4);
        r12.getEvent().add(e4);
        r13.getEvent().add(e5);
        r14.getEvent().add(e5);
        r15.getEvent().add(e5);
        r16.getEvent().add(e5);
        r17.getEvent().add(e6);
        r18.getEvent().add(e6);
        r19.getEvent().add(e6);
        r20.getEvent().add(e6);
        r21.getEvent().add(e6);
        r22.getEvent().add(e6);
        r23.getEvent().add(e7);
        r24.getEvent().add(e7);

        /////////////////////////////////lien representation/venue
        r1.getMyvenue().add(v1);
        r2.getMyvenue().add(v1);
        r3.getMyvenue().add(v1);
        r4.getMyvenue().add(v1);
        r5.getMyvenue().add(v2);
        r6.getMyvenue().add(v3);
        r7.getMyvenue().add(v3);
        r8.getMyvenue().add(v3);
        r9.getMyvenue().add(v4);
        r10.getMyvenue().add(v4);
        r11.getMyvenue().add(v5);
        r12.getMyvenue().add(v5);
        r13.getMyvenue().add(v5);
        r14.getMyvenue().add(v5);
        r15.getMyvenue().add(v6);
        r16.getMyvenue().add(v6);
        r17.getMyvenue().add(v6);
        r18.getMyvenue().add(v6);
        r19.getMyvenue().add(v6);
        r20.getMyvenue().add(v6);

        ////////////////////////////////////lien venue/adress
        v1.getMyadd().add(ad1);
        v2.getMyadd().add(ad2);
        v3.getMyadd().add(ad3);
        v4.getMyadd().add(ad4);
        v5.getMyadd().add(ad5);
        v6.getMyadd().add(ad6);
        v7.getMyadd().add(ad7);
        v8.getMyadd().add(ad8);
        v9.getMyadd().add(ad9);
        v10.getMyadd().add(ad10);
        v11.getMyadd().add(ad11);
        v12.getMyadd().add(ad12);

        ///////////////////////////////////lien user / address
        u1.getAddFacturation().add(ad13);
        u2.getAddFacturation().add(ad14);
        u3.getAddFacturation().add(ad15);
        u4.getAddFacturation().add(ad16);
        u5.getAddFacturation().add(ad17);
        u6.getAddFacturation().add(ad18);
        u7.getAddFacturation().add(ad19);
        u8.getAddFacturation().add(ad20);
        u9.getAddFacturation().add(ad21);
        u10.getAddFacturation().add(ad22);
        u11.getAddFacturation().add(ad23);
        u12.getAddFacturation().add(ad24);
        u13.getAddFacturation().add(ad25);
        u14.getAddFacturation().add(ad26);
        u15.getAddFacturation().add(ad27);
        u16.getAddFacturation().add(ad28);

        u1.getAddLivraison().add(ad13);
        u2.getAddLivraison().add(ad14);
        u3.getAddLivraison().add(ad15);
        u4.getAddLivraison().add(ad16);
        u5.getAddLivraison().add(ad17);
        u6.getAddLivraison().add(ad18);
        u7.getAddLivraison().add(ad19);
        u8.getAddLivraison().add(ad20);
        u9.getAddLivraison().add(ad21);
        u10.getAddLivraison().add(ad22);
        u11.getAddLivraison().add(ad23);
        u12.getAddLivraison().add(ad24);
        u13.getAddLivraison().add(ad25);
        u14.getAddLivraison().add(ad26);
        u15.getAddLivraison().add(ad27);
        u16.getAddLivraison().add(ad28);

        ////////////////////////////////////lien section / event
        e1.getSection().add(s1);
        e2.getSection().add(s1);
        e3.getSection().add(s1);
        e4.getSection().add(s1);
        e5.getSection().add(s1);
        e6.getSection().add(s7);
        e7.getSection().add(s7);
        e8.getSection().add(s7);
        e9.getSection().add(s7);
        e10.getSection().add(s6);
        e11.getSection().add(s6);
        e12.getSection().add(s6);
        e13.getSection().add(s6);
        e14.getSection().add(s2);
        e15.getSection().add(s2);
        e16.getSection().add(s2);
        e17.getSection().add(s2);
        e18.getSection().add(s2);
        e19.getSection().add(s3);
        e20.getSection().add(s3);
        e21.getSection().add(s3);
        e22.getSection().add(s4);
        e23.getSection().add(s4);

        s1.getEvent().add(e1);
        s1.getEvent().add(e2);
        s1.getEvent().add(e3);
        s1.getEvent().add(e4);
        s1.getEvent().add(e5);
        s7.getEvent().add(e6);
        s7.getEvent().add(e7);
        s7.getEvent().add(e8);
        s7.getEvent().add(e9);
        s6.getEvent().add(e10);
        s6.getEvent().add(e11);
        s6.getEvent().add(e12);
        s6.getEvent().add(e13);
        s2.getEvent().add(e14);
        s2.getEvent().add(e15);
        s2.getEvent().add(e16);
        s2.getEvent().add(e17);
        s2.getEvent().add(e18);
        s3.getEvent().add(e19);
        s3.getEvent().add(e20);
        s3.getEvent().add(e21);
        s4.getEvent().add(e22);
        s4.getEvent().add(e23);

        ////////////////////////////////////lien artist / event
        a1.getEvents().add(e1);
        a2.getEvents().add(e1);
        a3.getEvents().add(e1);
        a4.getEvents().add(e1);
        a5.getEvents().add(e2);
        a6.getEvents().add(e2);
        a7.getEvents().add(e2);
        a8.getEvents().add(e3);
        a9.getEvents().add(e3);
        a10.getEvents().add(e3);
        a11.getEvents().add(e3);
        a12.getEvents().add(e4);
        a13.getEvents().add(e5);

        //////////////////////////////////lien seat / category
        se1.getCategorySeat().add(c1);
        se2.getCategorySeat().add(c1);
        se3.getCategorySeat().add(c1);
        se4.getCategorySeat().add(c2);
        se5.getCategorySeat().add(c2);
        se6.getCategorySeat().add(c3);
        se7.getCategorySeat().add(c3);
        se8.getCategorySeat().add(c3);
        se9.getCategorySeat().add(c4);
        se10.getCategorySeat().add(c4);
        se11.getCategorySeat().add(c5);
        se12.getCategorySeat().add(c5);
        se13.getCategorySeat().add(c5);
        se14.getCategorySeat().add(c6);
        se15.getCategorySeat().add(c6);
        se16.getCategorySeat().add(c7);
        se17.getCategorySeat().add(c7);
        se18.getCategorySeat().add(c8);
        se19.getCategorySeat().add(c8);
        se20.getCategorySeat().add(c9);
        se21.getCategorySeat().add(c9);
        se22.getCategorySeat().add(c9);
        se23.getCategorySeat().add(c9);
        se24.getCategorySeat().add(c9);
        se25.getCategorySeat().add(c9);
        se26.getCategorySeat().add(c9);

        ////////////////////////////////////lien ticket / pricing
        t1.getPricing().add(p1);
        t2.getPricing().add(p2);
        t3.getPricing().add(p3);
        t4.getPricing().add(p4);
        t5.getPricing().add(p5);
        t6.getPricing().add(p1);
        t7.getPricing().add(p2);
        t8.getPricing().add(p3);
        t9.getPricing().add(p4);

        em.persist(e1);
        em.persist(e2);
        em.persist(e3);
        em.persist(e4);
        em.persist(e5);
        em.persist(e6);
        em.persist(e7);
        em.persist(e8);
        em.persist(e9);
        em.persist(e10);
        em.persist(e11);
        em.persist(e12);
        em.persist(e13);
        em.persist(e14);
        em.persist(e15);
        em.persist(e16);
        em.persist(e17);
        em.persist(e18);
        em.persist(e19);
        em.persist(e20);
        em.persist(e21);
        em.persist(e22);
        em.persist(e23);
        em.persist(e24);
        em.persist(s1);
        em.persist(s2);
        em.persist(s3);
        em.persist(s4);
        em.persist(s5);
        em.persist(s6);
        em.persist(s7);
        em.persist(u1);
        em.persist(u2);
        em.persist(u3);
        em.persist(u4);
        em.persist(u5);
        em.persist(u6);
        em.persist(u7);
        em.persist(u8);
        em.persist(u9);
        em.persist(u10);
        em.persist(u11);
        em.persist(u12);
        em.persist(u13);
        em.persist(u14);
        em.persist(u15);
        em.persist(u16);
        em.persist(u17);
        em.persist(u18);
        em.persist(u19);
        em.persist(u20);
        em.persist(u21);
        em.persist(u22);
        em.persist(u23);
        em.persist(u24);
        em.persist(u25);
        em.persist(u26);
        em.persist(ad1);
        em.persist(ad2);
        em.persist(ad3);
        em.persist(ad4);
        em.persist(ad5);
        em.persist(ad6);
        em.persist(ad7);
        em.persist(ad8);
        em.persist(ad9);
        em.persist(ad10);
        em.persist(ad11);
        em.persist(ad12);
        em.persist(ad13);
        em.persist(ad14);
        em.persist(ad15);
        em.persist(ad16);
        em.persist(ad17);
        em.persist(ad18);
        em.persist(ad19);
        em.persist(ad20);
        em.persist(ad21);
        em.persist(ad22);
        em.persist(ad23);
        em.persist(ad24);
        em.persist(ad25);
        em.persist(ad26);
        em.persist(ad27);
        em.persist(ad28);
        em.persist(a1);
        em.persist(a2);
        em.persist(a3);
        em.persist(a4);
        em.persist(a5);
        em.persist(a6);
        em.persist(a7);
        em.persist(a8);
        em.persist(a9);
        em.persist(a10);
        em.persist(a11);
        em.persist(a12);
        em.persist(a13);
        em.persist(v1);
        em.persist(v2);
        em.persist(v3);
        em.persist(v4);
        em.persist(v5);
        em.persist(v6);
        em.persist(v7);
        em.persist(v8);
        em.persist(v9);
        em.persist(v10);
        em.persist(v11);
        em.persist(v12);
        em.persist(v13);
        em.persist(v14);
        em.persist(v15);
        em.persist(v16);
        em.persist(v17);
        em.persist(r1);
        em.persist(r2);
        em.persist(r3);
        em.persist(r4);
        em.persist(r5);
        em.persist(r6);
        em.persist(r7);
        em.persist(r8);
        em.persist(r9);
        em.persist(r10);
        em.persist(r11);
        em.persist(r12);
        em.persist(r13);
        em.persist(r14);
        em.persist(r15);
        em.persist(r16);
        em.persist(r17);
        em.persist(r18);
        em.persist(r19);
        em.persist(r20);
        em.persist(r21);
        em.persist(r22);
        em.persist(r23);
        em.persist(r24);
        em.persist(r25);
        em.persist(r26);
        em.persist(p1);
        em.persist(p2);
        em.persist(p3);
        em.persist(p4);
        em.persist(p5);
        em.persist(pa1);
        em.persist(pa2);
        em.persist(pa3);
        em.persist(pa4);
        em.persist(pa5);
        em.persist(pa6);
        em.persist(pa7);
        em.persist(pa8);
        em.persist(pa9);
        em.persist(pa10);
        em.persist(pa11);
        em.persist(pa12);
        em.persist(pa13);
        em.persist(pa14);
        em.persist(pa15);
        em.persist(pa16);
        em.persist(pa17);
        em.persist(pa18);
        em.persist(c1);
        em.persist(c2);
        em.persist(c3);
        em.persist(c4);
        em.persist(c5);
        em.persist(c6);
        em.persist(c7);
        em.persist(c8);
        em.persist(c9);
        em.persist(t1);
        em.persist(t2);
        em.persist(t3);
        em.persist(t4);
        em.persist(t5);
        em.persist(t6);
        em.persist(t7);
        em.persist(t8);
        em.persist(t9);
        em.persist(t10);
        em.persist(t11);
        em.persist(t12);
        em.persist(t13);
        em.persist(t14);
        em.persist(t15);
        em.persist(t16);
        em.persist(t17);
        em.persist(o1);
        em.persist(o2);
        em.persist(o3);
        em.persist(o4);
        em.persist(o5);
        em.persist(o6);
        em.persist(o7);
        em.persist(o8);
        em.persist(o9);
        em.persist(o10);
        em.persist(o11);
        em.persist(o12);
        em.persist(o13);
        em.persist(o14);
        em.persist(o15);
        em.persist(o16);
        em.persist(o17);
        em.persist(o18);
        em.persist(o19);
        em.persist(o20);
        em.persist(st1);
        em.persist(st2);
        em.persist(st3);
        em.persist(st4);
        em.persist(st5);
        em.persist(st6);
        em.persist(st7);
        em.persist(st8);
        em.persist(st9);

    }
}
            */

  