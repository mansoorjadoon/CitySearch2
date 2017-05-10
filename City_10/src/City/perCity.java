package City;

import javax.persistence.*;




/**
 *
 * @author test
 */
@Entity
@Table(name="City")
public class perCity {

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Column(name="lat")
    double lat;
    @Column(name="lon")
    double lon;
    @Id
    @Column(name="Id")
    int id;
    @Column(name="country")
    String country;
    @Column(name="code")
    String code;

public perCity(){

}

    
        }