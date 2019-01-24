package Chapter9;
public class Exercise_06 {
    public static void main(String[] args){
        StopWatch stopWatch = new StopWatch();
        int[] a = new int[1000];
        for(int i = 0;i < 1000;i++){
            a[i] = (int)(Math.random() * 1000);
        }
        stopWatch.start();
        selectionSort(a);
        stopWatch.stop();
        System.out.println("the time is " + stopWatch.getElapsedTime());
    }
    public static void selectionSort(int[] a){
        for(int i = 0;i < a.length;i++){
            int k = i;
            for(int j = i + 1;j < a.length;j++){
                if(a[j] < a[k]){
                    k = j;
                }
            }
            if(k > i){
                int temp = a[i];
                a[i] = a[k];
                a[k] = temp;
            }
        }
    }
}
class StopWatch{
    private long startTime,endTime;
    StopWatch(){
        startTime = System.currentTimeMillis();
    }
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return endTime - startTime;
    }
}

