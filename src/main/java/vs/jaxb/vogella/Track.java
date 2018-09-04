package vs.jaxb.vogella;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author vasouv
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
class Track {

    @XmlAttribute
    private int trackNo;
    private String title;
    private double duration;

    public Track() {
    }

    public Track(int trackNo, String title, double duration) {
        this.trackNo = trackNo;
        this.title = title;
        this.duration = duration;
    }

    public int getTrackNo() {
        return trackNo;
    }

    public void setTrackNo(int trackNo) {
        this.trackNo = trackNo;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Track{" + "title=" + title + ", duration=" + duration + '}';
    }

}
