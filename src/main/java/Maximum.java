
public class Maximum<E extends Comparable<E>> {
    E firstValue;
    E secondValue;
    E thirdValue;

    //DEFAULT CONSTRUCTOR
    public Maximum() {
    }

    //PARAMETRIZED CONSTRUCTOR
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

    // EXTEND MAX METHOD AND TAKE THREE PARAMETERS
    public <E extends Comparable<E>> E findMaximum() {
        printMax(findMaximum(firstValue, secondValue, thirdValue));
        return (E) findMaximum(firstValue, secondValue, thirdValue);
    }

    //PRINT THE MAXIMUM
    public void printMax(E findMaximum) {
        System.out.println("Maximum is:" + findMaximum);
    }
}


