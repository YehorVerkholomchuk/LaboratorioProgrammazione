import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ElectricVehicleTest {
    @Test
    void shouldIncreaseBatteryLevelWhenAmountIsPositive() {
        ElectricTruck et = new ElectricTruck("Cybertruck", 40, 1700);
        int param = 10;
        int expectedResult = 50;
        int actualResult = et.charge(param);
        assertEquals(expectedResult, actualResult, "Il livello della batteria deve essere incrementato se il valore del parametro è positivo");
    }

    @Test
    void shouldNotChangeBatteryLevelWhenAmountIsNegative() {
        ElectricTruck et = new ElectricTruck("Cybertruck", 40, 1700);
        int param = -10;
        int expectedResult = 40;
        int actualResult = et.charge(param);
        assertEquals(expectedResult, actualResult, "Il livello della batteria deve rimanere uguale se il valore del parametro è negativo");
    }

    @Test
    void shouldCapBatteryAtOneHundredWhenOvercharged() {
        ElectricTruck et = new ElectricTruck("Cybertruck", 90, 1700);
        int param = 20;
        int expectedResult = 100;
        int actualResult = et.charge(param);
        assertEquals(expectedResult, actualResult, "Il livello della batteria può essere ricaricato fino a 100");
    }
}