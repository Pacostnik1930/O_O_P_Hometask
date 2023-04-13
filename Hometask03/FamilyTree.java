package Hometask03;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import Hometask03.Comporator.HumanIterator;

public class FamilyTree implements Serializable,Iterable<Human> //
{
    private static List<Human> familyTree;

    public FamilyTree()
    {
        familyTree = new ArrayList<>();
    }

    public static void addFamilyFree(Human human)
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

    public Human getByName(String nameHuman)
    {
        for (Human human: familyTree)
        {
            if (human.getName().equalsIgnoreCase(nameHuman))
            {
                return human;
            }
        }
        return null;
    }

    public static List<Human> getFamilyFree()
    {
        return familyTree;
    }

    @Override
    public Iterator<Human> iterator()
    {
        return new HumanIterator(familyTree);
        //return familyFree.iterator();         // вариант реализации без класса :)
    }

}