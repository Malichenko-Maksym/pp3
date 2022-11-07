public class Statistics {
  
    public static int numberOfItems (int start, int finish)
    {
        return finish-start+1;
    }

    public static int sumOfNumbers (int start, int finish)
    {
        int sum = 0;
        for (int number=start; number<=finish ;number++) {
            sum= sum + number;
        }
        return sum;
    }

    public static double arithmeticMean (int start, int finish)
    {
        return Statistics.sumOfNumbers(start, finish)/Statistics.numberOfItems(start, finish);
    }



    public static void main(String[] args) {
        System.out.println(numberOfItems(3,6));
        System.out.println(sumOfNumbers(0,10));
        System.out.println(arithmeticMean(5,7));
        
    }
}