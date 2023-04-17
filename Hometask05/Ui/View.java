import Hometask05.model.FamilyTree;
import Hometask05.model.Human;
import Hometask05.presenter.Presenter;

public interface View
{
    void setPresenter(Presenter presenter);
    void start();
    void print(String text);
    void print(Human human);
    void print(FamilyTree<Human> FamilyFree);
    String scan();
}