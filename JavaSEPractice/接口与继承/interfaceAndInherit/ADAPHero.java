package interfaceAndInherit;

public class ADAPHero extends Hero implements Mortal {
    public ADAPHero(){
        super("");
    }
    @Override
    public void die() {
        System.out.println(name + " die");
    }
}
