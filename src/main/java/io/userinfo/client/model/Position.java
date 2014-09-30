package io.userinfo.client.model;

/**
 * This class represents a position returned by the userinfo.io API.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public class Position {
    private Double latitude;
    private Double longitude;
    private Double accuracy;

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(Double accuracy) {
        this.accuracy = accuracy;
    }
}
