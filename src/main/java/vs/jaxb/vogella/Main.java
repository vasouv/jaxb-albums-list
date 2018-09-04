package vs.jaxb.vogella;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author vasouv
 */
public class Main {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        ArrayList<Track> incorruptibleTracklist = new ArrayList<>();
        incorruptibleTracklist.add(new Track(1, "Great Heathen Army", 5.19));
        incorruptibleTracklist.add(new Track(2, "Black Flag", 4.56));
        incorruptibleTracklist.add(new Track(3, "Raven Wing", 6.25));
        incorruptibleTracklist.add(new Track(4, "The Veil", 4.47));
        incorruptibleTracklist.add(new Track(5, "Seven Headed Whore", 3.00));

        ArrayList<Track> jomsvikingTrackList = new ArrayList<>();
        jomsvikingTrackList.add(new Track(1, "First Kill", 4.21));
        jomsvikingTrackList.add(new Track(2, "Wandered", 4.43));
        jomsvikingTrackList.add(new Track(3, "On a Sea of Blood", 4.05));

        Album incorruptible = new Album("Incorruptible", "Iced Earth", 2017, incorruptibleTracklist);
        Album jomsviking = new Album("Jomsviking", "Amon Amarth", 2016, jomsvikingTrackList);

        ArrayList<Album> myAlbums = new ArrayList<>();
        myAlbums.add(incorruptible);
        myAlbums.add(jomsviking);

        Discography vinylAlbums = new Discography(myAlbums);

        // Create JAXBContent and Marshaller
        JAXBContext context = JAXBContext.newInstance(Discography.class);
        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        // write to system out
        marshaller.marshal(vinylAlbums, System.out);

        // write to file discography.xml
        marshaller.marshal(vinylAlbums, new File("discography.xml"));

        // create Unmarshaller
        Unmarshaller unmarshaller = context.createUnmarshaller();

        // unmarshall to Discography object
        Discography unmarshalledDiscography = (Discography) unmarshaller.unmarshal(new FileReader("discography.xml"));

        // print discography contents
        System.out.println("\nDiscography contains: " + unmarshalledDiscography.getDiscography().size() + " albums");
        for (Album album : unmarshalledDiscography.getDiscography()) {
            System.out.printf("%s from %s has %d tracks%n", album.getTitle(), album.getBand(), album.getTracklist().size());
        }

    }

}
