public class Main
{
    public static void main(String[] args)
    {
        System.out.println("-------------");
        Human alex = new Human("Александр", "муж.", 35);
        Human anne = new Human("Аннет", "жен.", 18);
        Human mary = new Human("Мария", "жен.", 17);
        Human kate = new Human("Кейт", "жен.", 15);
        alex.addChild(mary);
        alex.addChild(anne);
        alex.addChild(kate);


        System.out.println(alex);           // инфо по объектам
        System.out.println(mary);
        System.out.println("-----------");
        /* System.out.println("-----------");
        System.out.println(anne);
        System.out.println("-----------");
        System.out.println(kate); */

        //System.out.println(Alex.printChildren()); // показать детей

        // Тест отношений
        Human siri = new Human("Siri", "жен.", 37);
        Human alice = new Human("Alice", "жен.", 17);
        siri.addChild(alice);
        System.out.println(siri);
        System.out.println(alice);

        alice.setAge(27);
        alice.addChild(mary);
        System.out.println(alice);

        IO save = new IO();     // объект класса поддерживающий два интерфейса
        alex.saveObj(save);     // передаем объект, с помощью которого и будет происходить запись.
        save.load("FreeFamily.data"); // загрузка данных (вывод в консоль если успешно!)



    }
}