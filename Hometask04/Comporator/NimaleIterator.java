package Hometask04.Comporator;

import java.util.Iterator;
import java.util.List;

import Hometask04.Nimale;

public class NimaleIterator<T extends Nimale> implements Iterator<T>
{
    private int index;
    private List<T> humans;

    public NimaleIterator(List<T> humans)
    {
        this.humans = humans;
    }

    @Override
    public boolean hasNext() // есть ли следующий элемент
    {
        return humans.size() > index;
    }

    @Override
    public T next() // выдает элемент
    {
        return humans.get(index++);
    }

}
