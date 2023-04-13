package Hometask04.Comporator;

import java.util.Comparator;
import Hometask04.Human;

public class HumanComporatorByAge implements Comparator<Human>
{

    @Override
    public int compare(Human o1, Human o2)
    {
        return Integer.compare(o1.getAge(), o2.getAge());
    }

}
