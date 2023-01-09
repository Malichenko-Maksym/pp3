public class Isogram {
    public static boolean isogram(String texxt){
        boolean result = true;
        char[] array1 = texxt.toCharArray();

        for(int char1=0; char1<array1.length; char1+=1){
            int counter = 0;
            for(int char2=0; char2<array1.length; char2+=1){
                if(array1[char1]==array1[char2]){
                    counter+=1;
                }
            }
            if(counter>1){
                result=false;
                break;
            }
        }
        

        return result;
    }
}

