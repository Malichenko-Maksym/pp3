class File {
    private String name;
    private int size;
    private Folder placedIn;

    public String getName() {
        return name;
    }

    public void rename(String name) {
        this.name = name;
    }

    

    public int getSize() {
        return size;
    }

    public File(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public void append(int extraSize){
        if (extraSize>0){
            size+=extraSize;
        } else {
            System.out.println("Not possible to append");
        }
    }

    public void displayFile(){
        System.out.println(name+": "+size+" bites");
    }
}