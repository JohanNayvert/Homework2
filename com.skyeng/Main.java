
public class Main {

    public static void main(String[] args) {
        // task 1
        System.out.println("task 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // task 2
        System.out.println("task 2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // task 3
        System.out.println("task 3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // task 4
        System.out.println("task 4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        // task 5
        System.out.println("task 5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        // task 6
        System.out.println("task 6");
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var generalWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес боксеров " + generalWeight + " кг");
        var differenceWeight = (twoBoxerWeight - oneBoxerWeight) % generalWeight;
        System.out.println("Разница в весе состовляет " + differenceWeight + " кг");
        System.out.println(" ");

        // task 7
        System.out.println("task 7");
        var differenceWeight1 = (twoBoxerWeight - oneBoxerWeight) % generalWeight;
        var differenceWeight2 = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Разница в весе (вычитание) состовляет " + differenceWeight1 + " кг");
        System.out.println("Разница в весе (остаток от деления) состовляет " + differenceWeight2 + " кг");
        System.out.println(" ");

        // task 8
        System.out.println("task 8");
        var workHours = 640;
        var workerHours = 8;
        var amountWorker = workHours / workerHours;
        System.out.println("Количество сотрудников " + amountWorker);
        System.out.println(" ");

        // task 9
        System.out.println("task 9");
        amountWorker = amountWorker + 94;
        var actualWorkHours = amountWorker * 8;
        System.out.println("Количество работочасов при увеличении штата " + actualWorkHours + " часов");
        System.out.println("Complete HomeWork_2");
    }
}