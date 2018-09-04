package vs.jaxb.vogella;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vasouv
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Album {

    private String title;
    private String band;
    private int year;

    @XmlElementWrapper(name = "tracklist")
    @XmlElement(name = "track")
    private ArrayList<Track> tracklist;

    public Album() {
    }

    public Album(String title, String band, int year, ArrayList<Track> tracklist) {
        this.title = title;
        this.band = band;
        this.year = year;
        this.tracklist = tracklist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Track> getTracklist() {
        return tracklist;
    }

    public void setTracklist(ArrayList<Track> tracklist) {
        this.tracklist = tracklist;
    }

    @Override
    public String toString() {
        return "Album{" + "title=" + title + ", band=" + band + ", year=" + year + ", tracklist=" + tracklist + '}';
    }

}
