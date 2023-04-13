package Hometask04;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Hometask04.Comporator.NimaleIterator;

public class FamilyTree<T extends Nimale> implements Iterable<T>
{
    private List<T> familyTree;

    public FamilyTree()
    {
        familyTree = new ArrayList<>();
    }

    public void addFamilyTree(T human)
    {
        if (!familyTree.contains(human))
        {
            familyTree.add(human);
            if (human.getMather() != null)
            {
                human.getMather().addChild(human);
            }
            if (human.getFather() != null)
            {
                human.getFather().addChild(human);
            }
        }
    }

    @Override
    public String toString()
    {
        String res = "В семье " + familyTree.size() + " человек:\n";
        for (int i = 0; i < familyTree.size(); i++)
        {
            res += (i+1) + ") " + familyTree.get(i).toString() + "\n";
        }
        return res;
    }

    public T getByName(String nameHuman)
    {
        for (T human: familyTree)
        {
            if (human.getName().equalsIgnoreCase(nameHuman))
            {
                return human;
            }
        }
        return null;
    }

    public List<T> getFamilyTree()
    {
        return familyTree;
    }

    @Override
    public Iterator<T> iterator()
    {
        return new NimaleIterator<T>(familyTree);
        // return familyFree.iterator();
    }

}