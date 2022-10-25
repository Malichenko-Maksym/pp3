
public class Person
{
   String name;
   double weight;
   double height;
   
   
    public Person(String personName)
    {
        name = personName;
    }
    
    
    public Person(String personName, double weig, double heig)
    {
        name = personName;
        weight = weig;
        height = heig;
    }

    public void setWeightAndHeight(double weig, double heig)
    {
        weight = weig;
        height = heig;
    }
    
    public void calculateBMI()
    {
        
    } 
    
}
