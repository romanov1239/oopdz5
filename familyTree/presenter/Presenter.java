package familyTree.presenter;

import familyTree.model.FamilyTree;
import familyTree.model.Service;
import familyTree.model.human.Gender;
import familyTree.model.human.Human;
import familyTree.view.ConsoleUI;
import familyTree.view.View;

public class Presenter {
    private View view;
    private Service service;
    private FamilyTree<Human> familyTree;

    public Presenter(View view) {
        this.view = view;
        service=new Service();
        familyTree=service.testTree();

    }

    public void getStudentsListInfo() {
        service.getStudentsListInfo();
    }

    public void sortByBirthDate() {
        service.sortByBirthDate();
    }

    public void sortByName() {
        service.sortByName();  
    }

}
