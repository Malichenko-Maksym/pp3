public class Family {
    Person[] allPeople;

    public Family(Person[] allPeople) {
        this.allPeople = allPeople;
    }
    
    public int adults(){
        int adulnNum=0;
        for(int elem=0; elem<=allPeople.length-1; elem+=1){
            if(allPeople[elem].getAge()>=18){
                adulnNum++;
            } }
        return adulnNum;
     }
}
