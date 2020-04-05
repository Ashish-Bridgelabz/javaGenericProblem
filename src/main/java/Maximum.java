//public class Maximum {

public class Maximum<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;

    //DEFAULT CONSTRUCTOR
    public Maximum() {
    }

    //PARAMRTRIZED CONSTRUCTOR
    public Maximum(E firstValue, E secondValue, E thirdValue) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.thirdValue = thirdValue;
    }

    //GENERIC METHOD FOR FINDING MAXIMUM THREE ELEMENTS
    public E findMaximum(E firstValue, E secondValue, E thirdValue) {
        if (firstValue.compareTo(secondValue) > 0 && firstValue.compareTo(thirdValue) > 0)
            return firstValue;
        else if (secondValue.compareTo(thirdValue) > 0 && secondValue.compareTo(firstValue) > 0)
            return secondValue;
        else
            return thirdValue;
    }


    // INTERNAL CALL FIND MAXIMUM NUMBER
    public <E extends Comparable<E>> E findMaximum() {
        printMax(findMaximum(firstValue, secondValue, thirdValue));
        return (E) findMaximum(firstValue, secondValue, thirdValue);
    }

    public void printMax(E findMaximum) {
        System.out.println("Maximum is:" + findMaximum);
    }
}

