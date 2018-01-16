import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


class MathFunctionsTest {

    @ParameterizedTest
    @CsvSource({"0, 1", "3, 6", "5, 120"})
    void fact(int arg, int expected) {
        assertEquals(expected, MathFunctions.fact(arg));
    }

    @ParameterizedTest
    @CsvSource({"0, 1, 1", "3, 6, 9", "5, 120, 125"})
    void addition(int arg1, int arg2, int expected) {
        assertEquals(expected, MathFunctions.addition(arg1, arg2));
    }

    @ParameterizedTest
    @CsvSource({"0, 1, -1", "3, 6, -3", "5, 120, -115"})
    void deduction(int arg1, int arg2, int expected) {
        assertEquals(expected, MathFunctions.deduction(arg1, arg2));
    }
}