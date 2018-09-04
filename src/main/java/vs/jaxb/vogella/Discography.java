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
@XmlRootElement(name = "vinyl-discography")
@XmlAccessorType(XmlAccessType.FIELD)
public class Discography {

    @XmlElementWrapper(name = "albums")
    @XmlElement(name = "album")
    private ArrayList<Album> discography;

    public Discography() {
    }

    public Discography(ArrayList<Album> discography) {
        this.discography = discography;
    }

    public ArrayList<Album> getDiscography() {
        return discography;
    }

    public void setDiscography(ArrayList<Album> discography) {
        this.discography = discography;
    }

}
