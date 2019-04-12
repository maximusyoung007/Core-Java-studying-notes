package ClassAndObject;

/**
 * 问题：h4所指向的对象和h2所指向的对象，是否是同一个对象？
 */
public class Reference {
    public String name;
    protected float hp;
    public static void main(String[] args){
        Reference h1 = new Reference();
        Reference h2 = new Reference();
        Reference h3;
        Reference h4;
        h3 = h1;
        h4 = h3;
    }
}
/**
 * h4指向h3，h3指向h1，h4最终指向对象1，
 * h2指向对象2
 * 故两者指向的不是同一个对象
 */
