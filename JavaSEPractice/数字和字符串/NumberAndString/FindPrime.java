package NumberAndString;

/**
 * 统计一千万内，共有多少个素数
 */
//埃氏筛
public class FindPrime {
    final int maxn = 10000001;
    int[] prime = new int[maxn];
    int pNum = 0;
    boolean[] judge = new boolean[maxn];
    public void init(){
        for(int i = 0;i < maxn;i++)
            judge[i] = false;
    }
    public void findPrime(){
        for(int i = 2;i < maxn;i++){
            if(judge[i] == false){
                pNum++;
                for(int j = i + i;j < maxn;j += i){
                    judge[j] = true;
                }
            }
        }
    }
    public static void main(String[] args){
        //System.out.println(Integer.MAX_VALUE);
        FindPrime findPrime = new FindPrime();
        findPrime.findPrime();
        System.out.println(findPrime.pNum);
    }
}
