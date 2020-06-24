package easy;

/**
 * Created by Xander on 2018-10-12.
 */
public class No461HammingDistance {
    public static void main(String[] args) {
        int x=1;
        int y=4;
        System.out.println(new No461HammingDistance().hammingDistance(x,y));;
    }
    public int hammingDistance(int x, int y) {
        int z=x^y;
        int count=0;
        while(z>0){
            z=z&(z-1);
            count++;
        }
        return count;
    }
}
