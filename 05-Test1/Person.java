class Person{
    private String name;
    private int age;
    static void lol(){ System.out.println("y6");}

    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age=age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public boolean isAdult(){
        if (age<18) {
            return false;
        } else {
            return true;
        }
    }

    public String toString(){
        return name+','+age;
    }
}