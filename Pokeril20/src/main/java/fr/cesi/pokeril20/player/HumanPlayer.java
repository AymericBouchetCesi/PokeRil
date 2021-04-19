package fr.cesi.pokeril20.player;

import fr.cesi.pokeril20.action.Action;
import fr.cesi.pokeril20.creature.Creature;
import fr.cesi.pokeril20.creature.CreatureFactory;
import fr.cesi.pokeril20.creature.CreaturePower;
import fr.cesi.pokeril20.creature.CreatureType;
import fr.cesi.pokeril20.skill.Skill;

import java.util.List;
import java.util.Scanner;

/**
 * @author Adrien HAUTOT (adrien.hautot@erudo.fr)
 */
public class HumanPlayer extends Player {

    private static HumanPlayer player;

    private HumanPlayer() {
        creatures.add(CreatureFactory.create(CreatureType.REPTILE, CreaturePower.LOW));
        creatures.add(CreatureFactory.create(CreatureType.FELINE, CreaturePower.HIGH));
    }

    public static HumanPlayer getInstance() {
        if (player == null) {
            player = new HumanPlayer();
        }

        return player;
    }


    @Override
    public String toString() {
        return "HumanPlayer{" +
                "name='" + name + '\'' +
                ", creatures=" + creatures +
                '}';
    }

    @Override
    public Creature chooseCreature(List<Creature> creatures) {
        Scanner sc = new Scanner(System.in);
        int saisie = -1;
        do {
            System.out.println("Quelle créature souhaitez vous choisir?");

            for (int i = 0; i < creatures.size(); i++) {
                System.out.println(i + " : " + creatures.get(i).describe());
            }

            saisie = sc.nextInt();
            if (saisie < 0 || saisie >= creatures.size()) {
                System.out.println("Saisie incorrecte");
            }
            sc.nextLine();
        } while (saisie < 0 || saisie >= creatures.size());

        return creatures.get(saisie);
    }

    @Override
    public Action chooseAction(List<Action> actions) {
        Scanner sc = new Scanner(System.in);
        int saisie = -1;
        do {
            System.out.println("Quelle action souhaitez vous choisir?");

            for (int i = 0; i < actions.size(); i++) {
                System.out.println(i + " : " + actions.get(i).describe());
            }

            saisie = sc.nextInt();
            if (saisie < 0 || saisie >= actions.size()) {
                System.out.println("Saisie incorrecte");
            }
            sc.nextLine();
        } while (saisie < 0 || saisie >= actions.size());

        return actions.get(saisie);
    }

    @Override
    public Skill chooseSkill(List<Skill> skills) {
        Scanner sc = new Scanner(System.in);
        int saisie = -1;
        do {
            System.out.println("Quelle compétence souhaitez vous choisir?");

            for (int i = 0; i < skills.size(); i++) {
                System.out.println(i + " : " + skills.get(i).describe());
            }

            saisie = sc.nextInt();
            if (saisie < 0 || saisie >= skills.size()) {
                System.out.println("Saisie incorrecte");
            }
            sc.nextLine();
        } while (saisie < 0 || saisie >= skills.size());

        return skills.get(saisie);
    }
}
