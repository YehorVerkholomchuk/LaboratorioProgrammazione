import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class AutonomousTest {
    @Test
    void shouldReturnFalseWhenBatteryIsBelowThreshold() {
        TeslaModelS tms = new TeslaModelS("2026", 19);
        boolean expectedResult = false;
        boolean actualResult = tms.canActivateAutopilot();
        assertEquals(expectedResult, actualResult, "L'autopilota deve essere disabilitato se il livello di batteria sia inferiore a 20");
    }

    @Test
    void shouldReturnTrueWhenBatteryIsAtThreshold() {
        TeslaModelS tms = new TeslaModelS("2026", 20);
        boolean expectedResult = true;
        boolean actualResult = tms.canActivateAutopilot();
        assertEquals(expectedResult, actualResult, "L'autopilota deve essere abilitato se il livello di batteria è maggiore-uguale a 20");
    }
}