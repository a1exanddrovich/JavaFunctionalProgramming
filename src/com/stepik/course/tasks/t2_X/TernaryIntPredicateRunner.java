package com.stepik.course.tasks.t2_X;

public class TernaryIntPredicateRunner {

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = (arg1, arg2, arg3) -> !(arg1.equals(arg2) && arg1.equals(arg3));

}
