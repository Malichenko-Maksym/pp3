public class Student {
    
     //Wykaz atrybutów
     String imie; 
     int wiek;
     String IdCard;
     boolean IdCardValid;
     int semester ;
     double averageGrade;
     
     //Wykaz metod
     public void SayHello()
     {
         System.out.println("Hello");
     };
     public void DisplayName() {
         System.out.println("My name is "+imie);
     };
     public void DisplayAge() {
         System.out.println("My age is "+wiek);
     };
     public void DisplayInfo() {
         System.out.println("My name is "+imie+", current semestr is "+semester+
         ", average grade is "+averageGrade);
     };
     public void ChangeIdCardStatus() {
         IdCardValid = !IdCardValid; 
     };
     public void DisplayNameAndCard() {
         System.out.println("My name is "+imie+", ID card: "+IdCard+
         ", ID card valid: "+IdCardValid);
     };
    
     public static void main(String[] args) {
        Student s1 = new Student();
       s1.imie = "m";
        s1.IdCard = "221680";
        s1.IdCardValid = true;
        s1.DisplayNameAndCard();
        s1.ChangeIdCardStatus();
       s1.DisplayNameAndCard(); 
        s1.wiek = 18;
        s1.averageGrade = 4.8;
        s1.semester = 3;
        s1.DisplayInfo();
};
     }