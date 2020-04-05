public class Maximum {
    //FIND THREE MAXINTEGER VALUE
    public static Integer maximumInteger(Integer[] maxInteger) {
        Integer maximum = 0;
        for (Integer index : maxInteger) {
            if (index.compareTo(maximum) > 0)
                maximum = index;
        }
        return maximum;
    }
    //FIND THREE MAXFLOATS VALUE
    public static Float maximumFloat(Float[] maxFloat){
        Float maximum = 0.0f;
        for (Float index : maxFloat)  {
            if (index.compareTo(maximum)>0)
                maximum = index;
        }
        return maximum;
    }

}

