package factory_method;

import factory_method.character.interfaces.Character;
import factory_method.character_factory.impl.ArcherFactory;
import factory_method.character_factory.impl.WarriorFactory;
import factory_method.character_factory.impl.WizardFactory;

/**
 * Suppose you are working on a video game that involves several types of characters, including wizards, warriors, and archers.
 * Each character has a name, a health level, a damage level, and a special ability.
 * The wizards can cast spells, the warriors can block attacks, and the archers can shoot arrows.
 *
 * You have been tasked with implementing a factory method to create these characters.
 */

public class Main {
    public static void main(String[] args) {
        ArcherFactory archerFactory = new ArcherFactory();
        Character venty = archerFactory.createCharacter("Venty",20000,1500);
        Character ganyu = archerFactory.createCharacter("Ganyu",25000,2500);
        Character tartaglia = archerFactory.createCharacter("Tartaglia",23000,2000);

        WarriorFactory warriorFactory = new WarriorFactory();
        Character ayaka = warriorFactory.createCharacter("Ayaka",18000,1600);
        Character ayato = warriorFactory.createCharacter("Ayato",28000,2300);
        Character jean = warriorFactory.createCharacter("Jean",15000,1800);

        WizardFactory wizardFactory = new WizardFactory();
        Character mona = wizardFactory.createCharacter("Mona",15000,2300);
        Character klee = wizardFactory.createCharacter("Klee",16000,2800);
        Character yanfei = wizardFactory.createCharacter("Yanfei",1800,2400);

        tartaglia.specialAbility();
        jean.specialAbility();
        mona.specialAbility();

    }
}
