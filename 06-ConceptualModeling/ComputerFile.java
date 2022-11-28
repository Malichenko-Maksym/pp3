public class ComputerFile {
    int size;
    String name;
    String creationDate;

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size > 0) {
            this.size = size;
        } else {
            System.out.println("Wrong size!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    ComputerFile(int size, String name, String creationDate) {

        if (size > 0) {
            this.size = size;
            this.name = name;
            this.creationDate = creationDate;
        } else {
            System.out.println("Wrong size!");
        }
    }
}
