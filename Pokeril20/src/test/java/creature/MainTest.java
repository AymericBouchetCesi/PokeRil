package creature;

import fr.cesi.pokeril20.creature.Creature;
import fr.cesi.pokeril20.skill.Heal;
import org.junit.Test;

import static fr.cesi.pokeril20.creature.CreatureFactory.create;
import static fr.cesi.pokeril20.creature.CreaturePower.HIGH;
import static fr.cesi.pokeril20.creature.CreatureType.FELINE;
import static fr.cesi.pokeril20.creature.CreatureType.REPTILE;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MainTest {
    @Test
    public void test(){
        Creature bob = create(REPTILE, HIGH);

        Creature boby = create(REPTILE, HIGH);

        Creature bobo = create(FELINE, HIGH);

        int hp = boby.getLifePoints();

        assertEquals(bob.getLifePoints(), boby.getLifePoints());
        bob.attack(boby);
        assertTrue(hp > boby.getLifePoints());

        //----------------------------//

        System.out.println(bobo.getLifePoints());
        bobo.executeSkill(bobo.getSkills().get(1), boby);
        System.out.println(bobo.getLifePoints());


        //----------------------------//



    }
}
