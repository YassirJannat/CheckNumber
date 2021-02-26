package m05nf1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class checkNumberTest {

	/*
	 *  comprovem que el signe sigui positiu
	 */
    @Test
    void testPositiu() {
        checkNumber checknumber;
        checknumber = new checkNumber(3);
        double resultatesperat, resultatactual;
        resultatactual = checknumber.comprovaSigne();
        resultatesperat = 1;
        assertEquals(resultatesperat, resultatactual, "error test positiu");
    }

    /*
	 * comprovem que el signe sigui negatiu
	 */
    
    @Test
    void testNegatiu() {
        checkNumber checknumber;
        checknumber = new checkNumber(-3);
        double resultatesperat, resultatactual;
        resultatactual = checknumber.comprovaSigne();
        resultatesperat = -1;
        assertEquals(resultatesperat, resultatactual, "error test negatiu");
    }

    /*
	 * comprovem que el signe sigui negatiu
	 */
    
    @Test
    void testZero() {
        checkNumber checknumber;
        checknumber = new checkNumber(0);
        double resultatesperat, resultatactual;
        resultatactual = checknumber.comprovaSigne();
        resultatesperat = 0;
        assertEquals(resultatesperat, resultatactual, "error test zero");
    }

}
