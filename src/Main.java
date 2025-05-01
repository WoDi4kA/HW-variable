//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println();

        System.out.println(dog + 4);
        System.out.println(cat + 4);
        System.out.println(paper + 4);
        System.out.println();

        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);
        System.out.println();

        var friend = 19;
        System.out.println("About friend:");
        System.out.println(friend);
        var friend1 = 19 + 2;
        System.out.println(friend1);
        var friend2 = friend1 / 7;
        System.out.println(friend2);
        System.out.println();

        var frog = 3.5;
        System.out.println("About frog:");
        System.out.println(frog);
        var frog1 = 3.5 * 10;
        System.out.println(frog1);
        var frog2 = frog1 / 3.5;
        System.out.println(frog2);
        var frog3 = frog2 + 4;
        System.out.println(frog3);
        System.out.println();

        System.out.println("About boxers weight:");
        var firstWeight = 78.2;
        var secondWeight = 82.7;
        System.out.println(secondWeight - firstWeight + "кг");
        System.out.println();

        System.out.println("About boxers different:");
        System.out.println(secondWeight % firstWeight);
        System.out.println();

        System.out.println("Task 8:");
        var generalHours = 640;
        var privateHours = 8;
        var count = generalHours / privateHours;
        System.out.println("Всего работников в комании - " + count + " челоек");
        var count1 = count + 94;
        var newPrivateHours = generalHours / count1;
        System.out.println("Если в компании работает " + count1 + " человек, то всего " + newPrivateHours + " часов работы может быть поделено между сотрудниками");
    }
}