package Abstract;

import Abstract.Animal;
import Abstract.Chicken;
import Abstract.Tiger;
import Interfake.Apple;
import Interfake.Edible;
import Interfake.Fruit;
import Interfake.Orange;

public class TestLopAnimail {
    public static void main(String[] args) {
        Animal[] animals= new Animal[2];
        animals[0]=new Chicken();
        animals[1]=new Tiger();
        for (Animal giaTri: animals) {
            System.out.println(giaTri.getMakesound());

            if ( giaTri instanceof Chicken){
                Edible edible = (Chicken) giaTri;
                System.out.println(edible.HowtoEat());
            }
        }

        Fruit[] fruits=new Fruit[2];
        fruits[0]= new Orange();
        fruits[1]= new Apple();
        for (Fruit giaTri2: fruits) {
            System.out.println(giaTri2.HowtoEat());
        }
    }
}
