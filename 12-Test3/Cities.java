import java.util.ArrayList;
public class Cities {
    private String[] citys;

    public String[] getCitys() {
        return citys;
    }

    public void setCitys(String[] citys) {
        this.citys = citys;
    }

    public Cities(String[] citys) {
        this.citys = citys;
    }
    
    public Cities filter(char ch){
        ArrayList<String> a1 = new ArrayList<String>();
        
        for(int index=0; index<citys.length; index+=1){
            if(citys[index].charAt(0)==ch){
                a1.add(citys[index]);
            }
        }
        String[] newObject = a1.toArray(new String[0]);
         Cities result = new Cities(newObject);
         return result;
    }

    public String cities(){
        String result="";
        for(int index=0; index<citys.length; index+=1){
            result+=citys[index];
        }

        return result;
    }

}
