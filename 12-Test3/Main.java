public class Main {
    public static void main(String[] args) {
        String[] arr1 = {"Slupsk","Warszawa","Sopot","Kielce","Szczecin","Krakow"};
        Cities c1 = new Cities(arr1);
        
        System.out.println(c1.filter('K').getCitys()[1]);
    }
}
