package io.userinfo.client.model;

/**
 * This class represents a place returned by the userinfo.io API.
 *
 * @author Vincent DURMONT [vdurmont@gmail.com]
 */
public class Place {
    private String code;
    private String name;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override public String toString() {
        return "Place{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
