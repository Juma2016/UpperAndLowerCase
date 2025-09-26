package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class UpperCaseTest {
    private UpperCase up;
    @BeforeEach
    void setup(){
        up=new UpperCase();
    }
    @Test
    void testConvertToUpperCaseThrow() {
        assertThrows(IllegalArgumentException.class, ()->up.convertToUpperCase(null));
        assertThrows(IllegalArgumentException.class, ()->up.convertToUpperCase(" "));
        assertThrows(IllegalArgumentException.class, ()->up.convertToUpperCase("   "));
    }

    @Test
    void testConvertToUpperCase(){
        assertEquals("HALLO", up.convertToUpperCase("hallo"));
        assertEquals("HALLO", up.convertToUpperCase("haLLo"));
        assertEquals("MAR IO", up.convertToUpperCase("maR Io"));
    }
}
