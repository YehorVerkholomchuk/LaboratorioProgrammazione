import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class SmartLibraryTest {
    @Test
    void shouldIncreasePopularityWhenPointsArePositive() {
        //Arrange
        PhysicalBook pb = new PhysicalBook("Book 1", 80, "Fantasy shelf");
        int param = 10;
        int expectedResult = 90;
        //Act
        int actualResult = pb.boostPopularity(param);
        //Assert
        assertEquals(expectedResult, actualResult, "L'indice di famosità deve essere incrementato se il valore del parametro è positivo");
    }

    @Test
    void shouldCapPopularityAtOneHundred() {
        //Arrange
        PhysicalBook pb = new PhysicalBook("Book 1", 80, "Fantasy shelf");
        int param = 21;
        int expectedResult = 100;
        //Act
        int actualResult = pb.boostPopularity(param);
        //Assert
        assertEquals(expectedResult, actualResult, "L'indice di famosità non deve superare il 100 anche con input elevato");
    }

    @Test
    void shouldNotChangePopularityWhenPointsAreNegative() {
        //Arrange
        PhysicalBook pb = new PhysicalBook("Book 1", 80, "Fantasy shelf");
        int param = -10;
        int expectedResult = 80;
        //Act
        int actualResult = pb.boostPopularity(param);
        //Assert
        assertEquals(expectedResult, actualResult, "L'indice di famosità deve rimanere invariato se il valore del parametro è negativo");
    }

    @Test
    void shouldReturnFalseWhenPopularityIsBelowThreshold() {
        //Arrange
        EBook eb = new EBook("Book 2", 29);
        boolean expectedResult = false;
        //Act
        boolean actualResult = eb.isAvailableForOffline();
        //Assert
        assertEquals(expectedResult, actualResult, "L'offline deve essere bloccato se l'indice di famosità è inferiore a 30%");
    }

    @Test
    void shouldReturnTrueWhenPopularityIsAtThreshold() {
        //Arrange
        EBook eb = new EBook("Book 2", 30);
        boolean expectedResult = true;
        //Act
        boolean actualResult = eb.isAvailableForOffline();
        //Assert
        assertEquals(expectedResult, actualResult, "L'offline deve essere permesso se l'indice di famosità è almeno 30%");
    }

    @Test
    void shouldIncreaseSizeWhenResourceIsAdded() {
        //Arrange
        SmartLibrary sl = new SmartLibrary();
        PhysicalBook param = new PhysicalBook("Book 3", 60, "Horror shelf");
        sl.addResource(param);
        int expectedResult = 1;
        //Act
        int actualResult = sl.getResourceCount();
        //Assert
        assertEquals(expectedResult, actualResult, "La quantità dei libri deve aumentarsi dopo l'aggiunta del libro");
    }

    @Test
    void shouldOnlyReturnDownloadableResources() {
        //Arrange
        SmartLibrary sl = new SmartLibrary();
        PhysicalBook firstParam = new PhysicalBook("Book 4", 60, "Horror shelf");
        EBook secondParam = new EBook("Book 5", 20);
        sl.addResource(firstParam);
        sl.addResource(secondParam);
        int expectedResult = 1;
        //Act
        
        int actualResult = sl.getResourceCount();
        //Assert
        assertEquals(expectedResult, actualResult, "La quantità dei libri deve aumentarsi dopo l'aggiunta del libro");
    }
}