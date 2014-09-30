package io.userinfo.client.model;

import org.joda.time.DateTime;

/**
 * This class represents an information on a user returned by the userinfo.io API.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public class Info {
    private DateTime requestDate;
    private String ipAddress;
    private Position position;
    private Place continent;
    private Place country;
    private Place city;

    public DateTime getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(DateTime requestDate) {
        this.requestDate = requestDate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Place getContinent() {
        return continent;
    }

    public void setContinent(Place continent) {
        this.continent = continent;
    }

    public Place getCountry() {
        return country;
    }

    public void setCountry(Place country) {
        this.country = country;
    }

    public Place getCity() {
        return city;
    }

    public void setCity(Place city) {
        this.city = city;
    }
}
