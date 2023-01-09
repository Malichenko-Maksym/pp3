public class Logic {
    private boolean[] arr1;

    public Logic(boolean[] arr1) {
        this.arr1 = arr1;
    }

    public int opposite(){
        int counter = 0;

        for(int val1=1; val1<arr1.length-1; val1+=1){
            if(arr1[val1-1]==arr1[val1+1] && arr1[val1-1]!=arr1[val1]){
                counter+=1;
            }



        }

        return counter;
    } 
    
}
