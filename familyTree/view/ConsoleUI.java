package familyTree.view;

import familyTree.model.Service;
import familyTree.presenter.Presenter;

import java.util.Scanner;

public class ConsoleUI implements View {

    private static final String INPUT_ERROR = "Вы ввели неверное значение";
    private Scanner scanner;
    private Presenter presenter;
    private boolean work;
    // private MainMenu menu;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        presenter = new Presenter(this);
        work = true;
        // menu = new MainMenu(this);
    }
    @Override
    public void start(){
        System.out.println("Доброго времени суток!");
        while(work){
            System.out.println(
            "1. Получить список членов семьи\n"+
            "2. Отсортировать по имени\n"+
            "3. Отсортировать по дате рождения\n"+
            "4. Закончить работу"
            );
            System.out.println("Выберите действие: ");
            String choice =scanner.nextLine();
            switch(choice){
                case "1":
                getStudentsListInfo();
                break;
                case"2":
                sortByName();
                break;
                case"3":
                sortByBirthDate();
                break;
                case"4":
                finish();
                break;
                default:
                inputError();
            }

        }
        Service service=new Service();
        service.fileHandler();
    }
    // @Override
    // public void printAnswer(String text) {
    //     System.out.println(text);
    // }

    // @Override
    // public void start() {
    //     hello();
    //     while (work){
    //         printMenu();
    //         execute();
    //     }
    // }

    public void finish() {
        System.out.println("Приятно было пообщаться");
        work = false;
    }

    // public void sortByAge() {
    //     presenter.sortByAge();
    // }

    public void sortByName() {
        presenter.sortByName();
    }

    public void sortByBirthDate() {
        presenter.sortByBirthDate();
    }

    public void getStudentsListInfo() {
        presenter.getStudentsListInfo();
    }

    // public void addHuman() {
    //     System.out.println("Введите имя члена семьи");
    //     String name = scanner.nextLine();
    //     System.out.println("Укажите возраст студента");
    //     String ageString = scanner.nextLine();
    //     //сделать проверку ввода возраста
    //     int age = Integer.parseInt(ageString);
    //     presenter.addStudent(name, age);
    // }

    // private void hello(){
    //     System.out.println("Доброго времени суток!");
    // }

    // private void execute(){
    //     String line = scanner.nextLine();
    //     if (checkTextForInt(line)){
    //         int numCommand = Integer.parseInt(line);
    //         if (checkCommand(numCommand)){
    //             menu.execute(numCommand);
    //         }
    //     }
    // }

    // private boolean checkTextForInt(String text){
    //     if (text.matches("[0-9]+")){
    //         return true;
    //     } else {
    //         inputError();
    //         return false;
    //     }
    // }

    // private boolean checkCommand(int numCommand){
    //     if (numCommand < menu.getSize()){
    //         return true;
    //     } else {
    //         inputError();
    //         return false;
    //     }
    // }

    // private void printMenu(){
    //     System.out.println(menu.menu());
    // }

    private void inputError(){
        System.out.println(INPUT_ERROR);
    }
}
