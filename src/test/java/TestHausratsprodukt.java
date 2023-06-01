import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestHausratsprodukt {

    private static Versicherungsschutz vOptimal;
    private static Versicherungsschutz vKompakt;
    private static VersicherungsBerechner versicherungsBerechner;

    @BeforeEach
    public void setUp() {
        versicherungsBerechner = new VersicherungsBerechner();
        vOptimal = Versicherungsschutz.OPTIMAL;
        vKompakt = Versicherungsschutz.KOMPAKT;
    }

    @Test
    public void testBerechneVersicherungsSumme_Optimal_shouldReturnTrue() {
        assertEquals(vOptimal.getPreisPerQM() * 40, versicherungsBerechner.berechneVersicherungsSumme(vOptimal, 40));
    }

    @Test
    public void testBerechneVersicherungsSumme_Optimal_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> versicherungsBerechner.berechneVersicherungsSumme(vOptimal, -5));
    }

    @Test
    public void testBerechneVersicherungsSumme_shouldNotBeEqual_usingKompakt() {
        assertNotEquals(vKompakt.getPreisPerQM() * 40, versicherungsBerechner.berechneVersicherungsSumme(vOptimal, 40));
    }

    @Test
    public void testBerechneVersicherungsSumme_Kompakt_shouldReturnTrue() {
        assertEquals(vKompakt.getPreisPerQM() * 45, versicherungsBerechner.berechneVersicherungsSumme(vKompakt, 45));
    }

    @Test
    public void testBerechneVersicherungsSumme_Kompakt_shouldThrow() {
        assertThrows(IllegalArgumentException.class, () -> versicherungsBerechner.berechneVersicherungsSumme(vKompakt, -10));
    }

    @Test
    public void testBerechneVersicherungsSumme_shouldNotBeEqual_usingOptimal() {
        assertNotEquals(vOptimal.getPreisPerQM() * 40, versicherungsBerechner.berechneVersicherungsSumme(vKompakt, 45));
    }
}
