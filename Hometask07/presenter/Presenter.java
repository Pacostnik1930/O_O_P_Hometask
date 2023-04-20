public class Presenter 
{
    private View view;
    private IO serializ;
    private FamilyTree<Human> familyConnect;
    private HumanComporatorByAge sortAge;

    public Presenter(View view, FamilyTree<Human> familyConnect, IO serializ, HumanComporatorByAge sortAge) 
    {
        this.familyConnect = familyConnect;
        this.view = view;
        this.serializ = serializ;
        this.sortAge = sortAge;
        view.setPresenter(this);
    }

    public void addHumanNew(String name, String sex, int age)
    {        
        familyConnect.addFamilyTree(new Human(name, sex, age));
        view.print("Новый член семьи добавлен !");
    }

    public void familyPrint() 
    {
        String family = familyConnect.toString();
        view.print(family);       
    }

    public void humanSearch(String name) 
    {
        Human chelovek = familyConnect.getByName(name);
        if (chelovek == null) view.print("Такого человека нет в семье !");
        
        else 
        {
            String human = chelovek.toString();
            view.print(human);
        }
    }

    public void saveFamily()
    {
        familyConnect.saveObj(serializ);
        view.print("Семейное древо сохранено !");
    }

    public void loadFamily()
    {
        serializ.load("TreeFamily.data");
    }

        public void sortFamily(int choice)
        {
            if (choice == 1) { familyConnect.getFamilyTree().sort(null); }
            else             { familyConnect.getFamilyTree().sort(sortAge); }
            view.print("Сортировка завершена !");
        }
}