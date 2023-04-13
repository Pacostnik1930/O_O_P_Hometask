package Hometask04;

//import HomeWork4.comporator.HumanComporatorByAge;
public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\n\t 3 семинар: отработка комментариев");
        System.out.println("\t         -------------");

        FamilyTree<Human> familyFree = new FamilyTree<>();

        familyFree.addFamilyTree(new Human("Алекс", "муж.", 35));
        familyFree.addFamilyTree(new Human("Аннет", "жен.", 27));
        familyFree.addFamilyTree(new Human("Сири", "муж.", 7,
            familyFree.getByName("Аннет"), familyFree.getByName("алекс"))); // equalsIgnoreCase
        familyFree.addFamilyTree(new Human("Кейт", "жен.", 5,
            familyFree.getByName("Аннет"), familyFree.getByName("алекс")));
        //теперь родителей можно добавлять переменными(в предыдущем задании так) либо методом getByName !
        //родители добовлются автоматически ( и дети родителям тоже )

        familyFree.addFamilyTree(new Human("Алиса", "жен.", 3));
        familyFree.getByName("Алекс").addChild(familyFree.getByName("Алиса"));
        //конструкция говорит о том что Алекс завел ребекна на стороне :D

        //familyFree.getFamilyFree().sort(new HumanComporatorByAge()); // сортировка


        System.out.println(familyFree);                                // печать семьи
        System.out.println("Родитель Алекс | " +
            familyFree.getByName("Алекс").printChildren()); // печать детей объекта

        /* for (Human human : familyFree.getFamilyFree())
        {
            System.out.println(human);
        } */

/*         String name = scannerStr(); //УДАЛИТЬ
        int age = Integer.parseInt(name);
        System.out.println(age); */

    }

/*     public static String scannerStr()
    {
        Scanner sc = new Scanner(System.in); //УДАЛИТЬ
        String str = sc.nextLine();
        sc.close();
        return str;
    } */
}
