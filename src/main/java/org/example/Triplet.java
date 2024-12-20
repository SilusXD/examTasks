package org.example;

public class Triplet<A>
{
    private final A first;
    private final A second;
    private final A third;

    public Triplet(A first, A second, A third)
    {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    public boolean containsObject(A object)
    {
        return first == object || second == object || third == object;
    }

    public A findMinElement() {
        if (first instanceof Comparable && second instanceof Comparable && third instanceof Comparable) {
            A min = first;
            if (((Comparable<A>) second).compareTo(min) < 0) {
                min = second;
            }
            if (((Comparable<A>) third).compareTo(min) < 0) {
                min = third;
            }
            return min;
        }
        throw new IllegalArgumentException("Элементы не реализуют интерфейс Comparable");
    }

    public double sumOfElements()
    {
        if (first instanceof Number && second instanceof Number && third instanceof Number) {
            return ((Number) first).intValue() +
                    ((Number) second).intValue() +
                    ((Number) third).intValue();
        }
        throw new IllegalArgumentException("Элементы не являются числами");
    }

    @Override
    public String toString()
    {
        return first + " " + second + " " + third;
    }
}
