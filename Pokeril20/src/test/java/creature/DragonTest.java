package creature;

import fr.cesi.pokeril20.creature.Dragon;
import org.junit.Test;

import static org.junit.Assert.*;

public class DragonTest {
    Dragon dragon = new Dragon();


    @Test
    public void isAlive() {
        System.out.println(dragon.getLifePoints());
        assertTrue(dragon.isAlive());

        dragon.setLifePoints(0);
        System.out.println(dragon.getLifePoints());
        assertFalse(dragon.isAlive());

        dragon.setLifePoints(-12);
        System.out.println(dragon.getLifePoints());
        assertFalse(dragon.isAlive());

        //-------------------------------------//

        Dragon dragonne = new Dragon();
        assertSame("Smaug", dragonne.getName());
        assertEquals(50, dragonne.getDamage());
        assertEquals(10, dragonne.getArmor());
        assertEquals(100, dragonne.getLifePoints());

        Dragon dragonnette = new Dragon();
        assertSame("Smaug", dragonnette.getName());
        assertEquals(50, dragonnette.getDamage());
        assertEquals(10, dragonnette.getArmor());
        assertEquals(100, dragonnette.getLifePoints());

//        assertTrue(dragonne.equals(dragonnette));

        dragonnette = null;
        assertNotSame(dragonne, dragonnette);

        dragonnette = dragonne;
        assertSame(dragonne, dragonnette);

        //assertTrue(0.2 + 0.1 == 0.3);
        System.out.println(0.2 + 0.1);
        System.out.println(0.2d + 0.1d);
        System.out.println(0.2f + 0.1f);
    }
}
