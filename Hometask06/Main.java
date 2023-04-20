import java.io.IOException;

public class Main
{
    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        FamilyTree<Human> familyTree = new FamilyTree<>();

        familyTree.addFamilyTree(new Human("Майк", "муж.", 37));
        familyTree.addFamilyTree(new Human("Алекс", "муж.", 35));
        familyTree.addFamilyTree(new Human("Аннет", "жен.", 27));
        familyTree.addFamilyTree(new Human("Сири", "муж.", 7, 
            familyTree.getByName("Аннет"), familyTree.getByName("алекс"))); 
        familyTree.addFamilyTree(new Human("Кейт", "жен.", 5, 
            familyTree.getByName("Аннет"), familyTree.getByName("алекс")));
        
        // Модуль MVP
        View view = new Console();
        IO serializ = new IO();
        HumanComporatorByAge sortAge =  new HumanComporatorByAge();
        new Presenter(view, familyTree, serializ, sortAge);
        view.start();
    }
    
}