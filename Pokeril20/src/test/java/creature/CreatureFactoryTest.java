package creature;

import fr.cesi.pokeril20.creature.Creature;
import org.junit.Test;

import static fr.cesi.pokeril20.creature.CreaturePower.HIGH;
import static fr.cesi.pokeril20.creature.CreaturePower.LOW;
import static fr.cesi.pokeril20.creature.CreatureType.FELINE;
import static fr.cesi.pokeril20.creature.CreatureFactory.create;
import static fr.cesi.pokeril20.creature.CreatureType.REPTILE;
import static org.junit.Assert.*;

public class CreatureFactoryTest {
    @Test
    public void creatureFactoryTest() {
        Creature bob = create(FELINE, HIGH);
        assertEquals("Garfield", bob.getName());
        assertEquals(62, bob.getDamage());
        assertEquals(80, bob.getLifePoints());
        assertEquals(10, bob.getArmor());

        Creature bobo = create(REPTILE, LOW);
        assertEquals("Smaug", bobo.getName());
        assertEquals(50/2, bobo.getDamage());
        assertEquals(100/2, bobo.getLifePoints());
        assertEquals(10/2, bobo.getArmor());

        assertNotEquals(bob, bobo);

        bobo = bob;
        assertEquals(bob, bobo);

        bobo = null;
        assertNotEquals(bob, bobo);

    }
}
