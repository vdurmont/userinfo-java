package io.userinfo.client;

import io.userinfo.client.model.Info;
import io.userinfo.client.model.Place;
import io.userinfo.client.model.Position;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import retrofit.RetrofitError;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(JUnit4.class)
public class UserInfoTest {
    private static final double DOUBLE_DELTA = .001;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void getInfo_returns_the_userinfo() {
        // GIVEN
        String ipAddress = "192.77.237.95";

        // WHEN
        Info info = UserInfo.getInfo(ipAddress);

        // THEN
        assertEquals(ipAddress, info.getIpAddress());
        assertNotNull(info.getRequestDate());

        // Position
        Position position = info.getPosition();
        assertEquals(37.7758, position.getLatitude(), DOUBLE_DELTA);
        assertEquals(-122.4128, position.getLongitude(), DOUBLE_DELTA);
        assertNull(position.getAccuracy());

        // Continent
        Place continent = info.getContinent();
        assertEquals("NA", continent.getCode());
        assertEquals("North America", continent.getName());

        // Country
        Place country = info.getCountry();
        assertEquals("US", country.getCode());
        assertEquals("United States", country.getName());

        // Continent
        Place city = info.getCity();
        assertEquals("94103", city.getCode());
        assertEquals("San Francisco", city.getName());
    }

    @Test
    public void getInfo_with_an_unknown_ip_address_returns_the_userinfo() {
        // GIVEN
        String ipAddress = "127.0.0.1";

        // WHEN
        Info info = UserInfo.getInfo(ipAddress);

        // THEN
        assertEquals(ipAddress, info.getIpAddress());
        assertNotNull(info.getRequestDate());

        // Position
        Position position = info.getPosition();
        assertNull(position.getLatitude());
        assertNull(position.getLongitude());
        assertNull(position.getAccuracy());

        // Continent
        Place continent = info.getContinent();
        assertNull(continent.getCode());
        assertNull(continent.getName());

        // Country
        Place country = info.getCountry();
        assertNull(country.getCode());
        assertNull(country.getName());

        // Continent
        Place city = info.getCity();
        assertNull(city.getCode());
        assertNull(city.getName());
    }

    @Test
    public void getInfo_with_a_malformed_ip_address_returns_the_userinfo() {
        // GIVEN
        String ipAddress = "I think I'm malformed..";

        // THEN
        this.expectedException.expect(RetrofitError.class);

        // WHEN
        UserInfo.getInfo(ipAddress);
    }
}
