public class Conversion
{
   public static double CelsiusToKelvin(double degree)
    {
        return degree + 273.15;
    }
    
    
    public static double KelvinToCelsius(double degree)
    {
        return degree - 273.15;
    }

    public static double FahrenheitToCelsius(double degree)
    {
        return (degree - 32)/1.80;
    }
    
    public static double FahrenheitToKelvin(double degree)
    {
        return (5/9)*(degree - 32) + 273.15;
    } 

    public static double CelsiusToFahrenheit(double degree)
    {
        return 1.80*degree + 32;
    }

    public static double KelvinToFahrenheit(double degree)
    {
        return 1.8*(degree - 273) + 32;
    }

     public static void main(String[] args) {
        System.out.println(CelsiusToKelvin(100));
        System.out.println(CelsiusToFahrenheit(100));
        System.out.println(KelvinToCelsius(0));
        System.out.println(FahrenheitToCelsius(100));
        System.out.println(FahrenheitToKelvin(100));
        
        System.out.println(KelvinToFahrenheit(0));
    }
    
}