import Hometask05.model.FamilyFree;
import Hometask05.model.Human;
import Hometask5.presenter.Presenter;
import Hometask05.ui.Console;
import Hometask05.ui.View;

public class Main
{
    public static void main(String[] args)
    {
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

        // Модуль MVP
        View view = new Console();
        new Presenter(view, familyTree);
        view.start();
    }

}
