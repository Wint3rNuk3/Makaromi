/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entites.Address;
import entites.Artist;
import entites.Category;
import entites.Event;
import entites.Orders;
import entites.Payment;
import entites.Pricing;
import entites.Representation;
import entites.Seat;
import entites.Section;
import entites.Status;
import entites.Ticket;
import entites.Venue;
import entites.UserReg;
import java.util.GregorianCalendar;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author cdi310
 */
@Stateless
public class jeudetest implements jeudetestLocal {

    @PersistenceContext(unitName = "Makaromi-ejbPU")
    private EntityManager em;

    @Override
    public void createbd() {
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
        Event e1 = new Event("Concert Retour des Rolling Stones", "http://www.gottahaverockandroll.com/ItemImages/000011/sep2013-340_lg.jpeg", (new GregorianCalendar(2017, 1, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Un retour fracassant des rois du rock n roll. Les années passent mais le son reste parfait", "un évènement à ne pas manquer");
        Event e2 = new Event("Concert parisien des Red Hot Chili Peppers", "http://concertposter.org/2012-June/RHCP-Paris2011-drop.jpg", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Un groupe de légende, un concert d'exception", "un évènement inoubliable");
        Event e3 = new Event("Tournée française de The Chainsmokers", "http://www.clubglow.com/blog/wp-content/uploads/2015/08/103115-476ECHO-chainsmokersfzt1-400x276.png", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Concert", "Une énergie incroyable");
        Event e4 = new Event("Tournée exceptionnelle de Beyonce", "http://i1.cdnds.net/13/50/618x800/music-beyonce-mrs-carter-world-tour-2014-poster.jpg", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 5, 1).getTime()), "Tournée de concerts de la seule, l'unique QUEEN B", "Beyonce en forme olympique");
        Event e5 = new Event("Concert unique de Sting", "http://tout-metz.com/wp-content/uploads/2012/08/sting_affiche2.jpg", (new GregorianCalendar(2017, 6, 1).getTime()), (new GregorianCalendar(2017, 1, 7).getTime()), "Sting incroyable", "Le grand Sting en concert avec plein de duo et trio surprises");
        Event e6 = new Event("Finale Rugby TOP 14", "http://www.francebillet.com/static/0/visuel/600/348/FINALE-RUGBY-TOP-14_3484231325263405917.jpg?1479454061000", (new GregorianCalendar(2017, 1, 2).getTime()), (new GregorianCalendar(2017, 2, 1).getTime()), "C'est LE match de la saison, celui que toutes les équipes de TOP 14 rêvent de jouer pour espérer soulever le Bouclier de Brennus?Après 26 journées de combat, des barrages, des demi-finales, qui succèdera au Racing 92 de Dan Carter et sera sacré Champion de France 2017 le 4 juin prochain? La finale du TOP 14 fait son grand retour au Stade de France à l?occasion du week-end de Pentecôte : ne manquez pas l'événement !", "Une finale qui promet d'être inoubliable");
        Event e7 = new Event("Handball PARIS 2017, 25 eme championnat du monde masculin", "http://www.francebillet.com/static/0/visuel/600/346/CHAMPIONNAT-DU-MONDE-DE-HAND_3468345825731877348.jpg?1477573054000", (new GregorianCalendar(2017, 2, 3).getTime()), (new GregorianCalendar(2017, 2, 18).getTime()), "Après 1970 et 2001 (pour les hommes) et 2007 (pour les femmes), la France organise pour la quatrième fois le Championnat du Monde. Elle ne pouvait rêver d'un meilleur calendrier au relais d?un cinquième titre planétaire, record toutes catégories, obtenu il y a à peine quelques mois au Qatar.", "Regardez l'histoire s'écrire sous vos yeux");
        Event e8 = new Event("Finale coupe de la ligue", "http://www.francebillet.com/static/0/visuel/600/347/FINALE-COUPE-DE-LA-LIGUE-2017_3476961719077401827.jpg?1478605101000", (new GregorianCalendar(2017, 3, 3).getTime()), (new GregorianCalendar(2017, 3, 3).getTime()), "A lyon une tribune sera réservée au familles et comprendra une offre de restauration, l'organisation d'une multitude d'animations, des services dédiés et de nombreuses surprises !", " ");
        Event e9 = new Event("Mondial de hockey 2017", "http://www.francebillet.com/static/0/visuel/grand/348/MONDIAL-HOCKEY-2017_3489202436012305251.jpg?1479996593000", (new GregorianCalendar(2017, 2, 15).getTime()), (new GregorianCalendar(2017, 2, 30).getTime()), "La Finlande et la Biélorussie ouvriront les festivités à Paris, juste avant la rencontre de la soirée qui opposera les champions du monde en titre, le Canada, à la République Tchèque. L'équipe de France viendra clôturer la 2ème journée de rencontres avec son premier match contre la Norvège dans un remake du match du dernier Tournoi de Qualification Olympique. ", " ");
        Event e10 = new Event("Hergé", "http://www.francebillet.com/static/0/visuel/600/340/HERGE--2016-2017_3400616965982293754.jpg?1469697808000", (new GregorianCalendar(2017, 1, 1).getTime()), (new GregorianCalendar(2017, 1, 15).getTime()), "On ne présente plus la carrière de Georges Remi, dit Hergé, auteur belge de bande dessinée principalement connu pour Les Aventures de Tintin. Souvent considéré comme « le père de la bande dessinée européenne », il est l?un des premiers auteurs francophones à reprendre le style américain de la bande dessinée à bulles. ", " ");
        Event e11 = new Event("Rembrandt intime", "http://www.francebillet.com/static/0/visuel/300/338/REMBRANDT-INTIME_3384978728407846685.jpg?1467807653000", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 28).getTime()), "L'exposition est conçue autour des trois chefs-d'oeuvre du Musée Jacquemart-André : les Pèlerins d'Emmaüs (1629), le Portrait de la princesse Amalia von Solms (1632), et le Portrait du Docteur Arnold Tholinx (1656). ", " ");
        Event e12 = new Event("Bouchardon (1698-1762)Une idée du beau", "http://www.francebillet.com/static/0/visuel/600/341/LOUVRE_3415892777709555559.jpg?1471532134000", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "Edme Bouchardon fut considéré de son temps comme un artiste d'exception. Présentant près de 270 oeuvres et organisée avec le Getty Museum à Los Angeles, cette exposition sera la première monographie d?envergure réalisée autour de son oeuvre et l'occasion de souligner qu'il fut l'un des principaux protagonistes du néoclassicisme.", "une exposition du musée du Louvres");
        Event e13 = new Event("MAGRITTE LA TRAHISON DES IMAGES", "http://www.francebillet.com/static/0/visuel/600/341/MAGRITTE---CENTRE-POMPIDOU_3417696887323044936.jpg?1471871647000", (new GregorianCalendar(2016, 9, 25).getTime()), (new GregorianCalendar(2017, 8, 31).getTime()), "Exposition «Magritte, La trahison des images» pose un nouveau regard sur l'oeuvre, le rapport à l'image et à la peinture de l'artiste belge René Magritte", "Magritte au centre pompidou !");
        Event e14 = new Event("Norman sur scène", "http://www.francebillet.com/static/0/visuel/600/334/NORMAN-AU-ZENITH_3342081312054718028.jpg?1462952162000", (new GregorianCalendar(2016, 9, 15).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Norman, de « Norman fait des vidéos », arrive enfin sur scène avec son tout premier one-man show. Cette nouvelle aventure scénique est une suite logique pour ce pionner du « web man show » qui a déjà réussi en quelques années à réunir plusieurs millions de fans, en postant des vidéos qu?il filme lui-même depuis sa chambre. ", "un évènement à ne pas manquer");
        Event e15 = new Event("Romeo et Juliette", "http://www.francebillet.com/static/0/visuel/grand/230/WILLIAM-SHAKESPEARE_2309502666313431296.jpg?1342617736000", (new GregorianCalendar(2016, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Pièce légendaire du répertoire, Roméo et Juliette est devenue, au fil du temps et des multiples adaptations dont elle a été l'objet, l?incarnation de l'histoire d'amour absolue. Or sous les couches de sédiments accumulés se cache un soleil noir fait de déliquescence politique, de haines familiales, de personnages complexes et insulaires, bien éloigné de la lecture romantique dans laquelle on l'a cantonnée.", " ");
        Event e16 = new Event("Les femmes savantes", "http://www.francebillet.com/static/0/visuel/600/329/SAVANTES_3295969886362179914.jpg?1457444342000", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 1, 4).getTime()), "Une comédie de moeurs jubilatoire au coeur d'une famille bourgeoise menée par trois femmes savantes, excessives et fiévreuses, repoussant les limites de la raison, entraînent toute la maisonnée dans le vertige de leur orgueil, mais, malgré leurs débordements, leurs ridicules, et leurs folies, infiniment attendrissantes. Catherine Hiegel réunit une distribution prestigieuse, 30 ans après l'avoir mis en scène avec la Comédie Française, au Théâtre de la Porte Saint-Martin et apporte un regard neuf sur ce grand classique du répertoire.", "Une énergie incroyable");
        Event e17 = new Event("Richard III", "http://www.francebillet.com/static/0/visuel/600/347/RICHARD-III-JPG_3476596840506551705.jpg?1478507639000", (new GregorianCalendar(2017, 3, 25).getTime()), (new GregorianCalendar(2017, 1, 5).getTime()), "A leur naissance, des personnages comme Richard III semblent être de même constitution que nous. Aussi chaque mot que le tyran prononce sur le plateau peut-il trouver son accord avec les sentiments du public, en éveillant les pulsions inavouées de chacun.", " ");
        Event e18 = new Event("Madame Bovary", "http://www.francebillet.com/static/0/visuel/600/344/MADAME-BOVARY_3449184254722259952.jpg?1475425174000", (new GregorianCalendar(2017, 6, 6).getTime()), (new GregorianCalendar(2017, 7, 7).getTime()), "Une pièce qui donne chair à la sensibilité, l'ironie et la force poétique de l'écriture de Flaubert, qui nous parle de nous, hommes et femmes d'aujourd'hui. Sur scène quatre chaises, à portée de main quelques instruments. Ce pourrait être la place d'un village, un coin de campagne ou la dernière table d'un banquet de noces sous les arbres au fond du verger.", " ");
        Event e19 = new Event("Disneyland Paris", "http://www.francebillet.com/static/0/visuel/600/347/DISNEY-1J-2P-NOEL_3476596840507927667.jpg?1478534053000", (new GregorianCalendar(2016, 12, 1).getTime()), (new GregorianCalendar(2017, 2, 15).getTime()), "Les flocons de neige scintillent sur le Parc Disneyland®... Vous ne rêvez pas, c?est enfin déjà Noël à Disneyland® Paris ! Plus besoin d?attendre pour célébrer Noël, dès le 11 novembre 2016, laissez-vous émerveiller par notre sapin et nos illuminations féériques pour des souvenirs gravés à jamais. Vivez des fêtes de fin d?année enchantées jusqu?au 8 janvier 2017, avec le spectacle nocturne Disney Dreams® ! fête Noël et La Parade de Noël Disney qui vous réservent de fantastiques surprises.", "une expérience magique pour les petits comme pour les grands");
        Event e20 = new Event("Asterix", "http://www.francebillet.com/static/0/visuel/600/345/PARC-ASTERIX_3451025524347854774.jpg?1475560893000", (new GregorianCalendar(2017, 12, 26).getTime()), (new GregorianCalendar(2017, 1, 14).getTime()), "Rire, bonne humeur, partage en famille et entre amis, en 2017, venez vivre des expériences sensationnelles au Parc Astérix.", " ");
        Event e21 = new Event("Zoo Parc de Beauval", "http://www.francebillet.com/static/0/visuel/600/324/ZOOPARC-DE-BEAUVAL_3242548485784297073.jpg?1451253799000", (new GregorianCalendar(2017, 2, 25).getTime()), (new GregorianCalendar(2017, 4, 1).getTime()), "A seulement 600 m du ZooParc de Beauval, le nouvel hôtel*** Les Pagodes de Beauval propose 128 chambres, un restaurant, ainsi qu'une piscine-lagon extérieure et des meubles et éléments de décoration authentiquement chinois. Avec l'hôtel Les Jardins de Beauval et la résidence hôtelière Les Hameaux de Beauval, ce complexe offre désormais une capacité totale de 240 chambres et 16 appartements, ainsi que de vastes espaces dédiés au tourisme d?affaires, l'ensemble garantissant un dépaysement total.", " ");
        Event e22 = new Event("Musillac 2017", "http://www.francebillet.com/static/0/visuel/600/349/MUSILAC-2017_3492493875611862296.jpg?1480351243000", (new GregorianCalendar(2017, 7, 7).getTime()), (new GregorianCalendar(2017, 7, 10).getTime()), "Cette année, le festival pop-rock n°1 de la région Rhône-Alpes fête ses 15 ans...et durera 4 Jours, du 13 au 16 juillet 2017.", " ");
        Event e23 = new Event("We love Green", "http://cdn-images.deezer.com/images/cover/586a3b7a7555cfaefd6577931e1a2f78/500x500.jpg", (new GregorianCalendar(2017, 5, 26).getTime()), (new GregorianCalendar(2017, 5, 28).getTime()), " ", " ");
        Event e24 = new Event("Solidays", "http://media.melty.fr/affiche-des-solidays-2009-image-235151-article-ajust_930.jpg", (new GregorianCalendar(2017, 8, 25).getTime()), (new GregorianCalendar(2017, 8, 28).getTime()), " ", " ");

        ///////////////////////////////////////////////venue
        Venue v1 = new Venue("Stade de France", "Stade", "http://www.premiertickets.ie/event_map/1301318244_Stade-de-France-Premier-Tickets_medium.jpg");
        Venue v2 = new Venue("Bercy", "Salle de concert", "http://www.stadefrance.com/sites/stadefrance.com/files/styles/stadium_map/public/field/image/stadium-popup/plan-3d-billetterie-rihanna.jpg");
        Venue v3 = new Venue("Zenith", "Salle de concert", "http://www.about-tracy-chapman.net/wp-content/uploads/2009-paris-zenith-map.gif");
        Venue v4 = new Venue("Olympia", "Salle de concert", "http://lespagesdorothee.com/Olympia2010-plan-salle.jpg");
        Venue v5 = new Venue("Hotel de ville", "Mairie", " ");
        Venue v6 = new Venue("Centre Pompidou", "Musée", " ");
        Venue v7 = new Venue("Louvre", "Musée", " ");
        Venue v8 = new Venue("Théâtre du Châtelet", "Théâtre", "http://www.parisconcerts-tickets.com/img/38809Theatre-du-Chatelet-Scenic-Seating-Chart-C2.jpg");
        Venue v9 = new Venue("Théâtre du Palais Royal", "Théâtre", "http://media.ticketmaster.com/tm/en-au/tmimages/venue/maps/aus/39996s_a.gif");
        Venue v10 = new Venue("Théâtre du Rond-Point", "Théâtre", "http://www.music-opera.com/img/places/4059-map.jpg");
        Venue v11 = new Venue("Théâtre de la ville", "Théâtre", "http://www.theatrederoanne.fr/fileadmin/_processed_/d/f/csm_Plan_Theatre_Zone_47b8a2af87.jpg");
        Venue v12 = new Venue("Disneyland Paris", "Parc d'attraction", " ");
        Venue v13 = new Venue("Asterix", "Parc d'attraction", " ");
        Venue v14 = new Venue("Zoo de Beauval", "Zoo", " ");
        Venue v15 = new Venue("Parc de Seaux", "Parc", " ");
        Venue v16 = new Venue("Bois de Vincennes", "Bois", " ");
        Venue v17 = new Venue("Bois de Boulogne", "Bois", " ");

        ///////////////////////////////////////////representation
        Representation r1 = new Representation(2000, (new GregorianCalendar(2017, 1, 15, 19, 0).getTime()));
        Representation r2 = new Representation(2000, (new GregorianCalendar(2017, 1, 16, 19, 0).getTime()));
        Representation r3 = new Representation(2000, (new GregorianCalendar(2017, 1, 17, 19, 0).getTime()));
        Representation r4 = new Representation(2000, (new GregorianCalendar(2017, 1, 18, 19, 0).getTime()));
        Representation r5 = new Representation(2000, (new GregorianCalendar(2017, 1, 19, 19, 0).getTime()));
        Representation r6 = new Representation(2000, (new GregorianCalendar(2017, 1, 20, 19, 0).getTime()));
        Representation r7 = new Representation(2000, (new GregorianCalendar(2017, 1, 21, 19, 0).getTime()));
        Representation r8 = new Representation(2000, (new GregorianCalendar(2017, 1, 22, 19, 0).getTime()));
        Representation r9 = new Representation(2000, (new GregorianCalendar(2017, 1, 23, 19, 0).getTime()));
        Representation r10 = new Representation(5000, (new GregorianCalendar(2017, 1, 24, 19, 0).getTime()));
        Representation r11 = new Representation(5000, (new GregorianCalendar(2017, 1, 25, 19, 0).getTime()));
        Representation r12 = new Representation(5000, (new GregorianCalendar(2017, 1, 26, 19, 0).getTime()));
        Representation r13 = new Representation(5000, (new GregorianCalendar(2017, 1, 27, 19, 0).getTime()));
        Representation r14 = new Representation(5000, (new GregorianCalendar(2017, 1, 28, 19, 0).getTime()));
        Representation r15 = new Representation(5000, (new GregorianCalendar(2017, 1, 29, 19, 0).getTime()));
        Representation r16 = new Representation(5000, (new GregorianCalendar(2017, 1, 30, 19, 0).getTime()));
        Representation r17 = new Representation(5000, (new GregorianCalendar(2017, 2, 1, 19, 0).getTime()));
        Representation r18 = new Representation(10000, (new GregorianCalendar(2017, 2, 2, 19, 0).getTime()));
        Representation r19 = new Representation(10000, (new GregorianCalendar(2017, 2, 3, 19, 0).getTime()));
        Representation r20 = new Representation(10000, (new GregorianCalendar(2017, 2, 4, 19, 0).getTime()));
        Representation r21 = new Representation(10000, (new GregorianCalendar(2017, 2, 2, 19, 0).getTime()));
        Representation r22 = new Representation(10000, (new GregorianCalendar(2017, 2, 3, 19, 0).getTime()));
        Representation r23 = new Representation(10000, (new GregorianCalendar(2017, 2, 4, 19, 0).getTime()));
        Representation r24 = new Representation(10000, (new GregorianCalendar(2017, 2, 5, 19, 0).getTime()));
        Representation r25 = new Representation(10000, (new GregorianCalendar(2017, 2, 6, 19, 0).getTime()));
        Representation r26 = new Representation(10000, (new GregorianCalendar(2017, 2, 7, 19, 0).getTime()));

        ////////////////////////////////////////address
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

        /////////////////////////////pricing
        Pricing p1 = new Pricing("tarif enfant");
        Pricing p2 = new Pricing("tarif handicapé");
        Pricing p3 = new Pricing("tarif demandeur d'emploi");
        Pricing p4 = new Pricing("tarif réduit");
        Pricing p5 = new Pricing("tarif senior");

        ////////////////////////////ticket
        ////////////////////////////user
        UserReg u1 = new UserReg("Alfonso", "Morse", "17/07/1976", "Quisque.purus.sapien@magnisdis.org", "amet ante. Vivamus non", "Fletcher Stewart", "DQY41KXO1MT");
        UserReg u2 = new UserReg("Ivor", "Ellison", "15/02/1961", "fermentum.metus.Aenean@dictummiac.edu", "aliquet. Phasellus fermentum convallis ligula. Donec luctus aliquet", "Charles Calderon", "SZS94IXT1FV");
        UserReg u3 = new UserReg("Clayton", "Frazier", "22/05/1977", "metus@risusQuisquelibero.net", "consequat", "Igor Aguirre", "MKC72DCE9QM");
        UserReg u4 = new UserReg("Cameron", "Ferguson", "19/01/1955", "pellentesque.massa.lobortis@odiosempercursus.com", "leo. Vivamus nibh dolor, nonummy ac, feugiat non, lobortis quis,", "Laith Stout", "LXF47GGQ0RY");
        UserReg u5 = new UserReg("Amir", "Buckley", "23/02/1977", "facilisis.eget.ipsum@risusDonec.net", "ante bibendum ullamcorper. Duis cursus, diam", "Keane Jenkins", "WYI25PIO3LB");
        UserReg u6 = new UserReg("Hector", "Johnston", "23/04/1954", "Sed.nec.metus@felispurus.net", "diam lorem, auctor quis, tristique ac, eleifend vitae, erat. Vivamus", "Elton Coffey", "VYL79NGF9TI");
        UserReg u7 = new UserReg("Ivan", "Nicholson", "05/10/1996", "convallis.ante.lectus@nisl.ca", "libero at auctor ullamcorper, nisl arcu", "Bernard Tyson", "WTV91HZB2TB");
        UserReg u8 = new UserReg("Barrett", "Burt", "12/05/1959", "fringilla.purus@eleifendnunc.com", "In scelerisque scelerisque dui. Suspendisse", "Nissim Jackson", "AFD22JCH8JN");
        UserReg u9 = new UserReg("Isaiah", "Hoffman", "10/07/1945", "eget.venenatis.a@penatibusetmagnis.edu", "ut, nulla. Cras eu tellus eu augue porttitor interdum.", "Odysseus Valencia", "MMU44UUP9FC");
        UserReg u10 = new UserReg("Ryan", "Prince", "20/05/1963", "eros@sed.com", "et arcu imperdiet ullamcorper. Duis at lacus. Quisque", "Noah Wilder", "SGR98IAM7SM");
        UserReg u11 = new UserReg("Herman", "Galloway", "21/12/1963", "urna@magnamalesuada.com", "nec, leo. Morbi neque tellus,", "Roth Grant", "QMX57ONO1PY");
        UserReg u12 = new UserReg("Fuller", "Turner", "22/06/1982", "quam@Nunclaoreetlectus.ca", "luctus et ultrices posuere cubilia Curae; Phasellus ornare.", "Harlan Kirby", "BOT40EBR5TU");
        UserReg u13 = new UserReg("Curran", "Coleman", "02/04/1939", "augue.eu.tellus@hendrerit.com", "ac tellus. Suspendisse sed dolor.", "Lance Valentine", "FXK91RUA6RJ");
        UserReg u14 = new UserReg("Abraham", "Mcguire", "10/10/1946", "vel@volutpat.org", "laoreet,libero", "Hiram Heath", "SFI96TCO0UF");
        UserReg u15 = new UserReg("William", "Marks", "02/10/1959", "arcu@nec.com", "faucibus leo, in lobortis tellus justo sit amet nulla. Donec", "Garth Weber", "IAO77GAF2CH");
        UserReg u16 = new UserReg("John", "Gould", "29/07/1997", "nisi.a@Duisami.ca", "egestas nunc sed libero. Proin sed turpis nec mauris", "Tarik Livingston", "KHC56NQP9OY");
        UserReg u17 = new UserReg("Carson", "Barton", "26/03/1943", "mi.ac.mattis@aliquetnec.org", "nec, leo. Morbi neque", "Eaton Hewitt", "HFQ35UXJ4AN");
        UserReg u18 = new UserReg("Akeem", "Kaufman", "19/02/1971", "dolor.quam.elementum@metusVivamus.edu", "a, scelerisque sed, sapien. Nunc pulvinar arcu et pede.", "Ethan Brewer", "PGL94JHT1LM");
        UserReg u19 = new UserReg("Cedric", "Stark", "26/09/1983", "ut@non.org", "Ut sagittis lobortis mauris. Suspendisse aliquet molestie tellus. Aenean egestas", "Harrison Strong", "JWU43ASM7PT");
        UserReg u20 = new UserReg("Dexter", "Dotson", "24/08/1959", "ultricies.ligula@musProinvel.com", "montes, nascetur", "Derek Swanson", "JVT77DPD9NF");
        UserReg u21 = new UserReg("Neville", "Bolton", "02/04/1973", "porttitor@tortorNunccommodo.ca", "torquent per conubia nostra, per inceptos hymenaeos. Mauris ut quam", "Macon Vargas", "BYF59YYV1JP");
        UserReg u22 = new UserReg("Isaac", "Nguyen", "27/08/1966", "magna@aliquetdiam.edu", "et magnis dis parturient montes, nascetur", "Barrett Vargas", "ORH17KGC3BI");
        UserReg u23 = new UserReg("Rooney", "Daugherty", "21/06/1988", "vestibulum@tristiquesenectuset.net", "egestas lacinia. Sed congue, elit sed consequat", "Magee Landry", "UPO70VTD1RO");
        UserReg u24 = new UserReg("Felix", "Dudley", "21/05/1937", "tristique.aliquet@temporerat.org", "Nullam enim. Sed nulla ante, iaculis", "Zachary Mclaughlin", "JDP32SWN6KD");
        UserReg u25 = new UserReg("Quinlan", "Shelton", "31/10/1940", "per.conubia@posuere.ca", "tincidunt", "Walter Acosta", "CSP75DQC0NM");
        UserReg u26 = new UserReg("Brian", "Hoover", "29/10/1950", "justo.Proin@Nullatempor.edu", "a nunc. In at pede. Cras vulputate velit", "Rashad Phillips", "ZFT24GZY8QT");

        ///////////////////////////payment
        Payment pa1 = new Payment("CB", new GregorianCalendar(2017, 1, 25).getTime(), true);
        Payment pa2 = new Payment("Cheque culture", new GregorianCalendar(2017, 2, 3).getTime(), true);
        Payment pa3 = new Payment("CB", new GregorianCalendar(2017, 3, 6).getTime(), true);
        Payment pa4 = new Payment("Cheque", new GregorianCalendar(2017, 6, 5).getTime(), false);
        Payment pa5 = new Payment("Cheque culture", new GregorianCalendar(2017, 9, 11).getTime(), true);
        Payment pa6 = new Payment("CB", new GregorianCalendar(2017, 1, 25).getTime(), true);
        Payment pa7 = new Payment("Cheque", new GregorianCalendar(2017, 2, 1).getTime(), false);
        Payment pa8 = new Payment("Cheque culture", new GregorianCalendar(2017, 2, 2, 19, 0).getTime(), true);
        Payment pa9 = new Payment("CB", new GregorianCalendar(2017, 1, 25).getTime(), true);
        Payment pa10 = new Payment("Cheque", new GregorianCalendar(2017, 1, 15).getTime(), false);
        Payment pa11 = new Payment("Cheque culture", new GregorianCalendar(2017, 1, 2).getTime(), true);
        Payment pa12 = new Payment("CB", new GregorianCalendar(2017, 1, 25).getTime(), true);
        Payment pa13 = new Payment("Cheque", new GregorianCalendar(2017, 1, 26).getTime(), false);
        Payment pa14 = new Payment("Cheque culture", new GregorianCalendar(2017, 1, 03).getTime(), true);
        Payment pa15 = new Payment("CB", new GregorianCalendar(2017, 4, 22).getTime(), true);
        Payment pa16 = new Payment("Cheque", new GregorianCalendar(2017, 5, 19).getTime(), false);
        Payment pa17 = new Payment("Cheque culture", new GregorianCalendar(2017, 8, 2).getTime(), true);
        Payment pa18 = new Payment("Cheque", new GregorianCalendar(2017, 2, 1).getTime(), false);

        ///////////////////////////////////////////categorie
        Category c1 = new Category("A");
        Category c2 = new Category("B");
        Category c3 = new Category("C");
        Category c4 = new Category("D");
        Category c5 = new Category("Premier Balcon");
        Category c6 = new Category("Deuxième Balcon");
        Category c7 = new Category("Fosse");
        Category c8 = new Category("Corbeille");
        Category c9 = new Category("Orchestre");

        /////////////////////////////////////////////seat
        Seat se1 = new Seat("1");
        Seat se2 = new Seat("2");
        Seat se3 = new Seat("3");
        Seat se4 = new Seat("4");
        Seat se5 = new Seat("5");
        Seat se6 = new Seat("6");
        Seat se7 = new Seat("7");
        Seat se8 = new Seat("8");
        Seat se9 = new Seat("9");
        Seat se10 = new Seat("10");
        Seat se11 = new Seat("11");
        Seat se12 = new Seat("12");
        Seat se13 = new Seat("13");
        Seat se14 = new Seat("14");
        Seat se15 = new Seat("15");
        Seat se16 = new Seat("16");
        Seat se17 = new Seat("17");
        Seat se18 = new Seat("18");
        Seat se19 = new Seat("19");
        Seat se20 = new Seat("20");
        Seat se21 = new Seat("21");
        Seat se22 = new Seat("22");
        Seat se23 = new Seat("23");
        Seat se24 = new Seat("24");
        Seat se25 = new Seat("25");
        Seat se26 = new Seat("26");

        ///////////////////////////////////////////ticket
        Ticket t1 = new Ticket(1141, 75, 5.5f, "Estrada", "Imogene", "lorem.ac.risus@accumsaninterdumlibero.ca");
        Ticket t2 = new Ticket(308, 120, 5.5f, "Meadows", "Ila", "Aliquam.erat.volutpat@Cumsociis.co.uk");
        Ticket t3 = new Ticket(632, 25, 5.5f, "Ortega", "Geraldine", "habitant.morbi.tristique@Nullasemper.com");
        Ticket t4 = new Ticket(811, 30, 5.5f, "Goodwin", "Jena", "montes.nascetur.ridiculus@Etiam.com");
        Ticket t5 = new Ticket(3547, 70, 5.5f, "Spears", "Tashya", "gravida.molestie.arcu@consequatpurus.com");
        Ticket t6 = new Ticket(5546, 90, 5.5f, "Brown", "Quyn", "ridiculus.mus.Proin@Integervulputate.org");
        Ticket t7 = new Ticket(7321, 110, 5.5f, "Compton", "Aaron", "dolor@augueac.edu");
        Ticket t8 = new Ticket(9, 100, 5.5f, "Wiley", "Vivien", "ipsum.dolor.sit@tortorNunc.ca");
        Ticket t9 = new Ticket(8339, 95, 5.5f, "Knowles", "Lydia", "ante.Nunc@quam.com");
        Ticket t10 = new Ticket(406, 80, 5.5f, "Marquez", "Hayden", "inceptos.hymenaeos@Loremipsumdolor.com");
        Ticket t11 = new Ticket(8330, 100, 5.5f, "Serrano", "Cameron", "Quisque.purus.sapien@urnajustofaucibus.com");
        Ticket t12 = new Ticket(1754, 100, 5.5f, "Lane", "Amos", "Donec.tempor.est@molestie.edu");
        Ticket t13 = new Ticket(9729, 105, 5.5f, "Adams", "Prescott", "Cras.dolor.dolor@tincidunt.co.uk");
        Ticket t14 = new Ticket(4426, 200, 5.5f, "Terrell", "Minerva", "consectetuer.cursus@enimEtiamimperdiet.edu");
        Ticket t15 = new Ticket(9602, 110, 5.5f, "Cleveland", "Rina", "mollis.Integer.tincidunt@vulputate.edu");
        Ticket t16 = new Ticket(8216, 120, 5.5f, "Tyler", "Rahim", "orci@laciniavitaesodales.edu");
        Ticket t17 = new Ticket(7114, 100, 5.5f, "Burns", "Cleo", "erat@nostra.com");
        
        
        //////////////////////////////////////status
        Status st1 = new Status("Disponible");
        Status st2 = new Status("Indisponible");
        Status st3 = new Status("Réglé");
        Status st4 = new Status("En cours de règlement");
        Status st5 = new Status("Disponible");
        Status st6 = new Status("Validé");
        Status st7 = new Status("Non validé");
        Status st8 = new Status("Réservé");
        Status st9 = new Status("Non réservé");
        
        //////////////////////////////////////order
        Orders o1 = new Orders("");
        Orders o2 = new Orders("");
        Orders o3 = new Orders("");
        Orders o4 = new Orders("");
        Orders o5 = new Orders("");
        Orders o6 = new Orders("");
        Orders o7 = new Orders("");
        Orders o8 = new Orders("");
        Orders o9 = new Orders("");
        Orders o10 = new Orders("");
        Orders o11= new Orders("");
        Orders o12 = new Orders("");
        Orders o13 = new Orders("");
        Orders o14= new Orders("");
        Orders o15 = new Orders("");
        Orders o16= new Orders("");
        Orders o17 = new Orders("");
        Orders o18= new Orders("");
        Orders o19= new Orders("");
        Orders o20= new Orders("");
        
        
        
        

        ////////////////////////////////////////////////creation 
        
        ///////////////////////////////////////////lien status / event
        st1.getEvents().add(e1);
        st1.getEvents().add(e2);
        st1.getEvents().add(e3);
        st1.getEvents().add(e4);
        st1.getEvents().add(e5);
        st1.getEvents().add(e6);
        st1.getEvents().add(e7);
        st1.getEvents().add(e8);
        st1.getEvents().add(e9);
        st1.getEvents().add(e10);
        st1.getEvents().add(e11);
        st1.getEvents().add(e12);
        st1.getEvents().add(e13);
        st1.getEvents().add(e14);
        st2.getEvents().add(e15);
        st1.getEvents().add(e16);
        st1.getEvents().add(e17);
        st1.getEvents().add(e18);
        st1.getEvents().add(e19);
        st1.getEvents().add(e20);
        st2.getEvents().add(e21);
        st1.getEvents().add(e22);
        st1.getEvents().add(e23);
        st2.getEvents().add(e24);
    
        ///////////////////////////////////////////lien status / payment        
        st3.getPayment().add(pa1);
        st3.getPayment().add(pa2);
        st4.getPayment().add(pa3);
        st3.getPayment().add(pa4);
        st4.getPayment().add(pa5);
        st3.getPayment().add(pa6);
        st3.getPayment().add(pa7);
        st4.getPayment().add(pa8);
        st3.getPayment().add(pa9);
        st3.getPayment().add(pa10);
             
                
        ///////////////////////////////////////////lien status / seat
        st8.getSeat().add(se1);
        st9.getSeat().add(se2);
        st9.getSeat().add(se3);
        st9.getSeat().add(se4);
        st9.getSeat().add(se5);
        st9.getSeat().add(se6);
        st8.getSeat().add(se7);
        st9.getSeat().add(se8);
        st9.getSeat().add(se9);
        st8.getSeat().add(se10);
        st9.getSeat().add(se11);
        st9.getSeat().add(se12);
        st9.getSeat().add(se13);
        st9.getSeat().add(se14);
        st9.getSeat().add(se15);
        st8.getSeat().add(se16);
        st9.getSeat().add(se17);
        st9.getSeat().add(se18);
        st8.getSeat().add(se19);
        st9.getSeat().add(se20);
        st9.getSeat().add(se21);
        st9.getSeat().add(se22);
        st9.getSeat().add(se23);
        st9.getSeat().add(se24);
        st8.getSeat().add(se25);
        st9.getSeat().add(se26);
       
       
        
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
