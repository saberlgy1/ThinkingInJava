package Generics;

import Generics.pets.Pet;

/**
 * @program: ThinkingInJava
 * @description:
 * @author: lgy
 * @create: 2019-07-18 19:11
 **/

public class ComparebalePet implements Comparable<Pet> {

    @Override
    public int compareTo(Pet o) {
        return 0;
    }
}

//class Cat extends ComparebalePet implements Comparable<Cat>{
//
//}
