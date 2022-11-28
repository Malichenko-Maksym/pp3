public class MyArrays {
    public static int even(int[] array){
        int evenNumber = 0;
        for (int i=0; i<array.length-1; i++) {
            if(array[i]%2==0) { evenNumber+=1; }
        }
        return evenNumber;
    }

    public static int positiveOdd(int[] array){
        int positiveOddNumber = 0;
        for (int i=0; i<array.length-1; i++) {
            if((array[i]%2==0)&&(array[i]>0)) { positiveOddNumber+=1; }
        }
        return positiveOddNumber;
    }
}
