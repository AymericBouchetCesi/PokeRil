package fr.cesi.pokeril20.player;

import fr.cesi.pokeril20.action.Action;
import fr.cesi.pokeril20.creature.Creature;
import fr.cesi.pokeril20.skill.Skill;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public abstract class Player {

    protected String name = "HumanPlayer one";

    protected List<Creature> creatures = new ArrayList<>();

    /**
     * Récupère la valeur du champ name.
     *
     * @return name.
     */
    public String getName() {
        return name;
    }

    /**
     * Défini la nouvelle valeur de name.
     *
     * @param name La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Récupère la valeur du champ creatures.
     *
     * @return creatures.
     */
    public List<Creature> getCreatures() {
        return creatures;
    }

    /**
     * Défini la nouvelle valeur de creatures.
     *
     * @param creatures La nouvelle valeur.
     * @return L'instance (Pattern fluent)
     */
    public void setCreatures(List<Creature> creatures) {
        this.creatures = creatures;
    }

    public abstract Creature chooseCreature(List<Creature> creatures);

    public abstract Action chooseAction(List<Action> actions);

    public abstract Skill chooseSkill(List<Skill> skills);
}
