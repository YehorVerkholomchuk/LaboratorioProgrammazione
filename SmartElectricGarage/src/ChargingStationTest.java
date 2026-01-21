import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ChargingStationTest {
    @Test
    void shouldReturnFormattedStringWithStationData() {
        ChargingStation cs = new ChargingStation("123ABC", 5000);
        String expectedResult = "Station 123ABC (5000 kW)";
        String actualResult = cs.getDetails();
        assertEquals(expectedResult, actualResult, "Il messaggio deve essere uguale all'esempio");
    }
}