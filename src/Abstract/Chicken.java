package Abstract;

import Interfake.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String getMakesound() {
        return "cuc cuc";
    }

    @Override
    public String HowtoEat() {
        return "ga ran";
    }

}
