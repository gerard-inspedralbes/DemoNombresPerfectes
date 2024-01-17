import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NombresPerfectesTest {

    @Test
    void testEsPerfecte_noperfecte() {
        //Prepare
        int noPerfecte = 10;
        //Act
        boolean result = NombresPerfectes.esPerfecte(noPerfecte);
        //Assert
        assertFalse(result);
    }

    @Test
    void testEsPerfecte_perfecte() {
        //Prepare
        int perfecte = 496;
        //Act
        boolean result = NombresPerfectes.esPerfecte(perfecte);
        //Assert
        assertTrue(result);
    }
}