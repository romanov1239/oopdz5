package familyTree.view.commands;

import familyTree.view.ConsoleUI;

public abstract class Command {
    String description;
    ConsoleUI consoleUI;

    public Command(familyTree.view.ConsoleUI consoleUI2) {
        this.consoleUI = consoleUI2;
    }

    public String getDescription() {
        return description;
    }

    public abstract void execute();
}
