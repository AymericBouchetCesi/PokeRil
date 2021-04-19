package creature;

import fr.cesi.pokeril20.creature.Cat;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CatTest {
    Cat cat = new Cat();

    @Test
    public void isAlive() {
        System.out.println(cat.getLifePoints());
        assertTrue(cat.isAlive());

//        for (int i = 0; i<=9; i++) {
//            System.out.println(cat.getLifePoints());
//            assertTrue(cat.isAlive());
//        }
//
//        System.out.println(cat.getLifePoints());
//        assertFalse(cat.isAlive());
//
//        cat.setLifePoints(-12);
//        System.out.println(cat.getLifePoints());
//        assertFalse(cat.isAlive());
    }
}
