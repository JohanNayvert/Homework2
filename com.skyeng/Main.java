
public class Main {

    public static void main(String[] args) {
        // HomeWork_2.1
        // Task 2.1.1
        System.out.println("HomeWork_2.1");
        System.out.println("Task 2.1.1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // Task 2.1.2
        System.out.println("Task 2.1.2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // Task 2.1.3
        System.out.println("Task 2.1.3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println(" ");

        // Task 2.1.4
        System.out.println("Task 2.1.4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println(" ");

        // Task 2.1.5
        System.out.println("Task 2.1.5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println(" ");

        // Task 2.1.6
        System.out.println("Task 2.1.6");
        var oneBoxerWeight = 78.2;
        var twoBoxerWeight = 82.7;
        var generalWeight = oneBoxerWeight + twoBoxerWeight;
        System.out.println("Общий вес боксеров " + generalWeight + " кг");
        var differenceWeight = (twoBoxerWeight - oneBoxerWeight) % generalWeight;
        System.out.println("Разница в весе состовляет " + differenceWeight + " кг");
        System.out.println(" ");

        // Task 2.1.7
        System.out.println("Task 2.1.7");
        var differenceWeight1 = (twoBoxerWeight - oneBoxerWeight) % generalWeight;
        var differenceWeight2 = twoBoxerWeight - oneBoxerWeight;
        System.out.println("Разница в весе (вычитание) состовляет " + differenceWeight1 + " кг");
        System.out.println("Разница в весе (остаток от деления) состовляет " + differenceWeight2 + " кг");
        System.out.println(" ");

        // Task 2.1.8-1
        System.out.println("Task 2.1.8-1");
        var workHours = 640;
        var workerHours = 8;
        var amountWorker = workHours / workerHours;
        System.out.println("Всего работников в компании –" + amountWorker + " человек");
        System.out.println(" ");

        // Task 2.1.8-2
        System.out.println("Task 2.1.8-2");
        amountWorker = amountWorker + 94;
        var actualWorkHours = amountWorker * 8;
        System.out.println("Если в компании работает " + amountWorker + " человек, то всего " + actualWorkHours + " часов работы может быть поделено между сотрудниками");
        System.out.println("Complete HomeWork_2.1");
        System.out.println(" ");

        // HomeWork_2.2
        // Task 2.2.1
        System.out.println("HomeWork_2.2");
        System.out.println("Task 2.2.1");
        byte Byte = 1;
        System.out.println("Значение переменной Byte с типом byte равно " + Byte);
        short Short = 1;
        System.out.println("Значение переменной Short с типом short равно " + Short);
        int Int = 1;
        System.out.println("Значение переменной Int с типом int равно " + Int);
        long Long = 1;
        System.out.println("Значение переменной Long с типом long равно " + Long);
        float Float = 1f;
        System.out.println("Значение переменной Float с типом float равно " + Float);
        double Double = 1.0;
        System.out.println("Значение переменной Double с типом double равно " + Double);
        System.out.println(" ");

        // Task 2.2.2
        System.out.println("Task 2.2.2");
        float Float1 = 27.12F;
        long Long1 = 987_678_965_549L;
        double Double1 = 2.786;
        boolean Boolean1 = false;
        char Char1 = 569;
        short Short1 = -159;
        int Int1 = 27897;
        byte Bite1 = 67;
        System.out.println(" ");

        // Task 2.2.3
        System.out.println("Task 2.2.3");
        short studentsCountOneTeacher = 23;
        short studentsCountSecondTeacher = 27;
        short studentsCountThirdTeacher = 30;
        short totalSheets = 480;
        int studentsSheets = totalSheets/(studentsCountOneTeacher+studentsCountSecondTeacher+studentsCountThirdTeacher);
        System.out.println("На каждого ученика рассчитано " + studentsSheets + " листов бумаги");
        System.out.println(" ");

        // Task 2.2.4
        System.out.println("Task 2.2.4");
        int outputMachinePer2Min = 16;
        System.out.println("За 20 минут машина произвела бутылок " + (outputMachinePer2Min*10) + " штук");
        System.out.println("В сутки машина произвела бутылок " + (outputMachinePer2Min*720) + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + (outputMachinePer2Min*2160) + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + (outputMachinePer2Min*21600) + " штук");
        System.out.println(" ");

        // Task 2.2.5
        System.out.println("Task 2.2.5");
        int totalPaint = 120;
        int whitePaintOneClass = 2;
        int brownPaintOneClass = 4;
        int amountClass = totalPaint/(whitePaintOneClass+brownPaintOneClass);
        System.out.println("В школе, где " + amountClass + " классов, нужно " + (whitePaintOneClass*amountClass) + " банок белой краски и " + (brownPaintOneClass*amountClass) + " банок коричневой краски");
        System.out.println(" ");

        // Task 2.2.6
        System.out.println("Task 2.2.6");
        float weightOneBanana = 80f;
        float weight100MlMilk = 105f;
        float weightOneIceCream = 100f;
        float weightOneEgg = 70f;
        System.out.println((weightOneBanana*5+weight100MlMilk*2+weightOneIceCream*2+weightOneEgg*4)/1000);
        System.out.println(" ");

        // Task 2.2.7
        System.out.println("Task 2.2.7");
        float weightDrop = 7.0f;
        float weightDropInDay1 = 0.25f;
        float weightDropInDay2 = 0.5f;
        System.out.println("На похудение уйдет " + weightDrop/weightDropInDay1 + " дней если сбрасывать по 250 грамм в день");
        System.out.println("На похудение уйдет " + weightDrop/weightDropInDay2 + " дней если сбрасывать по 500 грамм в день");
        System.out.println(" ");

        // Task 2.2.8
        System.out.println("Task 2.2.8");
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;
        float salaryUp = 1.1f;
        System.out.println("Маша теперь получает " + salaryMasha*salaryUp + " рублей. Годовой доход вырос на " + (salaryMasha*salaryUp-salaryMasha)*12 + " рублей");
        System.out.println("Денис теперь получает " + salaryDenis*salaryUp + " рублей. Годовой доход вырос на " + (salaryDenis*salaryUp-salaryDenis)*12 + " рублей");
        System.out.println("Кристина теперь получает " + salaryKristina*salaryUp + " рублей. Годовой доход вырос на " + (salaryKristina*salaryUp-salaryKristina)*12 + " рублей");
        System.out.println(" ");

    }
}