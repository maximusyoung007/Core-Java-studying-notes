package interfaceAndInherit;

public class APHero extends Hero implements Mortal{
    public APHero(){
        super(" ");
    }
    @Override
    public void die() {
        System.out.println(name + "die");
    }
}
