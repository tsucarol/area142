import com.iterasys.Main;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaCalculatorTest {

    @Test
    public void squareAreaTest() {
        float side = 20.0f;
        float expectedResult = 400.0f;

        float resultObtained = Main.squareArea(side);

        assertEquals(expectedResult, resultObtained);
    }

    @ParameterizedTest//Data Driven
    @CsvSource(value = {
            "20, 10, 200.0",
            "4, 45, 180.0",
            "12.3, 7.5, 92.25",
    }, delimiter = ',')
    public void rectangleAreaDDT(float width, float length, float expectedResult) {
        float resultObtained = Main.rectangleArea(width, length);

        assertEquals(expectedResult, resultObtained);
    }

    @Test
    public void circleArea() {
        double radius = 8;
        double expectedResult = 201.06192982974676;

        double resultObtained = Main.circleArea(radius);

        assertEquals(expectedResult, resultObtained);
    }

    @ParameterizedTest // Data Driven with external CSV
    @CsvFileSource(resources = "csv/triangleArea.csv", numLinesToSkip = 1, delimiter = ',')
    public void triangleAreaCSV(float base, float height, float expectedResult) {
        float resultObtained = Main.triangleArea(base,height);

        assertEquals(expectedResult, resultObtained);
    }


}
