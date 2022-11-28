
import java.util.stream.IntStream;
import java.util.Arrays;

class FinalScore {
    private int[] points;

    public int[] getPoints() {
        return points;
    }

    public void setPoints(int[] points) {
        this.points = points;
    }

    private int min;
    private int max;
    private int result;

    FinalScore(int[] points) {
        this.points = points;
    }

    private int findMin(int points[]) {
        return Arrays.stream(points).min().getAsInt();
    }

    private int findMax(int points[]) {
        return Arrays.stream(points).max().getAsInt();
    }

    private int findSum(int points[]) {
        return Arrays.stream(points).sum();
    }

    public double ResultScore(int points[]){
        return ( findSum(points)-findMax(points)-findMin(points) )*1.0/(points.length-2);
    }

    public static void main(String[] args) {
        int[] grade = {3,2,5,5,5};
        FinalScore f1 = new FinalScore(grade);
        System.out.println(f1.ResultScore(grade));
    }
}