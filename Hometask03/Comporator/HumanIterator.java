package Hometask03.Comporator;

import java.util.Iterator;
import java.util.List;

import Hometask03.Human;

public class HumanIterator implements Iterator<Human>
{
    private int index;
    private List<Human> humans;

    public HumanIterator(List<Human> humans)
    {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() // есть ли следующий элемент
    {
        return humans.size() > index;
    }

    @Override
    public Human next() // выдает элемент
    {
        return humans.get(index++);
    }

}