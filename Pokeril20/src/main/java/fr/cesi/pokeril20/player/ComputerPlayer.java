package fr.cesi.pokeril20.player;

import fr.cesi.pokeril20.action.Action;
import fr.cesi.pokeril20.creature.Creature;
import fr.cesi.pokeril20.creature.CreatureFactory;
import fr.cesi.pokeril20.creature.CreaturePower;
import fr.cesi.pokeril20.creature.CreatureType;
import fr.cesi.pokeril20.skill.Skill;

import java.util.List;
import java.util.Random;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class ComputerPlayer extends Player {

    private static ComputerPlayer player;

    private ComputerPlayer() {
        creatures.add(CreatureFactory.create(CreatureType.REPTILE, CreaturePower.LOW));
        creatures.add(CreatureFactory.create(CreatureType.FELINE, CreaturePower.HIGH));
    }

    public static ComputerPlayer getInstance() {
        if (player == null) {
            player = new ComputerPlayer();
        }

        return player;
    }

    @Override
    public String toString() {
        return "ComputerPlayer{" +
                "name='" + name + '\'' +
                ", creatures=" + creatures +
                '}';
    }

    @Override
    public Creature chooseCreature(List<Creature> creatures) {
        return creatures.get(new Random().nextInt(creatures.size()));
    }

    @Override
    public Action chooseAction(List<Action> actions) {
        return actions.get(new Random().nextInt(actions.size()));
    }

    @Override
    public Skill chooseSkill(List<Skill> skills) {
        return skills.get(new Random().nextInt(skills.size()));
    }
}
