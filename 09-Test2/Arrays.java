public class Arrays {
    public static boolean arr(int[] arr1, int[] arr2){
        if(count2dig(arr1)==count2dig(arr2)){
            return true;
        } else {
            return false;
        }
    }

    public static int count2dig(int[] arra){
        int counter = 0;
        for(int elem=0; elem<=arra.length-1; elem+=1){
            if((arra[elem]/10>=1) && (arra[elem]/10<=9)){
                counter++;
            }
        }
        return counter;
    }
}
