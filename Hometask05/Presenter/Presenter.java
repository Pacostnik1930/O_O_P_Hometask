import Hometask05.model.FamilyFree;
import Hometask05.model.Human;
import Hometask05.ui.View;

public class Presenter
{
    private View view;
    FamilyTree<Human> familyConnect;

    public Presenter(View view, FamilyTree<Human> familyConnect)
    {
        this.familyConnect = familyConnect;
        this.view = view;
        view.setPresenter(this);
    }

    public void AddHumanNew()
    {
        System.out.print("Введите имя-> ");
        String name = view.scan();
        System.out.print("Введите пол(муж./жен.)-> ");
        String sex = view.scan();
        System.out.print("Введите возраст-> ");
        int age = Integer.parseInt(view.scan());
        System.out.println();
        familyConnect.addFamilyFree(new Human(name, sex, age));
        view.print("Новый член семьи добавлен !");
        view.print(familyConnect.getFamilyFree().get(familyConnect.getFamilyTree().size() - 1));
    }

    public void familyPrint()
    {
        view.print(familyConnect);
    }

    public void humanSearch()
    {
        System.out.print("Введите имя человека для поиска-> ");
        String name =  view.scan();
        System.out.println(name);
        Human chelovek = familyConnect.getByName(name);
        if (chelovek == null) view.print("Такого человека нет в семье !");
        else view.print(chelovek);
    }
}