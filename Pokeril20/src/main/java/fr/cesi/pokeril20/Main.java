package fr.cesi.pokeril20;

import fr.cesi.pokeril20.action.Action;
import fr.cesi.pokeril20.creature.Creature;
import fr.cesi.pokeril20.player.ComputerPlayer;
import fr.cesi.pokeril20.player.HumanPlayer;
import fr.cesi.pokeril20.player.Player;
import fr.cesi.pokeril20.skill.Skill;

import java.util.Arrays;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class Main {


    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }

    public void start() {
        Player player1 = HumanPlayer.getInstance();
        Player player2 = ComputerPlayer.getInstance();

        Creature creaturePlayer1 = player1.chooseCreature(player1.getCreatures());
        Creature creaturePlayer2 = player2.chooseCreature(player2.getCreatures());

        do {
            turn(player1, creaturePlayer1, creaturePlayer2);
            turn(player2, creaturePlayer2, creaturePlayer1);
        } while (creaturePlayer2.isAlive() && creaturePlayer1.isAlive());
    }

    /**
     * Le tour d'un joueur
     * @param player le joueur a qui c'est le tour
     * @param playerCreature la créature du joueur
     * @param enemyCreature la créature ennemy du joueur
     */
    private void turn(Player player, Creature playerCreature, Creature enemyCreature) {
        Action action = player.chooseAction(Arrays.asList(Action.values()));
        switch (action) {
            case ATTACK:
                playerCreature.attack(enemyCreature);
                break;
            case CHOOSE_SKILL:
                Skill skill1 = player.chooseSkill(playerCreature.getSkills());
                playerCreature.executeSkill(skill1, enemyCreature);
                break;
        }
    }
}
