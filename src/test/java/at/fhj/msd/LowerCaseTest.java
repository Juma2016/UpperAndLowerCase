package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LowerCaseTest {
    private LowerCase lc;
    @BeforeEach
    void setup(){
        lc=new LowerCase();
    }

    @Test
    void testConvertToLowerCaseThrow() {
        assertThrows(IllegalArgumentException.class ,()->lc.convertToLowerCase(""));
        assertThrows(IllegalArgumentException.class, ()->lc.convertToLowerCase(null));
        assertThrows(IllegalArgumentException.class, ()->lc.convertToLowerCase("   "));
    }
    @Test
    void testConvertToLowerCase(){
        assertEquals("hallo", lc.convertToLowerCase("HALLO"));
        assertEquals("hallo", lc.convertToLowerCase("HaLlO"));
        assertEquals("mario",lc.convertToLowerCase("MariO"));
    }
}
