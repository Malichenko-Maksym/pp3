
public class Number {
    private int system;

    public int getSystem() {
        return system;
    }

    public void setSystem(int system) {
        this.system = system;
    }

    private String value;

    public Number(int system, String value) {
        this.system = system;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

   public int get10(){
    int result = 0;
    try{ result = Integer.parseInt(value, system); }
    catch(Exception e){ result = -1;}
    return result;
   } 

}
