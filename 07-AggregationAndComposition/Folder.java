import java.util.*;

public class Folder {
    private String name;
    private int size = 0;
    private int numberOfFiles = 0;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public int getNumberOfFiles() {
        return numberOfFiles;
    }

    private ArrayList<File> files = new ArrayList<File>();

    public ArrayList<File> getFiles() {
        return files;
    }

    public Folder(String name, File[] files) {
        this.name = name;
        this.numberOfFiles = files.length;
        for (File fil : files) {
            this.size += fil.getSize();
            this.files.add(fil);
        }
    }

    public Folder(String name, File file) {
        this.name = name;
        addFile(file);
    }

    public Folder(String name) {
        this.name = name;
    }

    public void displayFiles(){
        System.out.println("Folder name: "+getName()+"\n"+"Files:");
        Iterator<File> it = files.iterator();
        while(it.hasNext()) {
            it.next().displayFile();
          }
    }

    public void addFile(File file){
        this.numberOfFiles = 1;
        this.size += file.getSize();
        this.files.add(file);
    }

    public void deleteFile(String name){
        for(int index=0; index<files.size(); index+=1){
            if(name==files.get(index).getName()){
                files.remove(index);
            }
        }
    }
 

    public static void main(String[] args) {
        File f1= new File("gg", 765);
        File f2= new File("eroa", 561);
        File[] arr= {f1,f2};
        Folder fol1 = new Folder("Max", arr);
        fol1.displayFiles();
        File f3= new File("q", 1);
        fol1.addFile(f3);
        fol1.displayFiles();
        fol1.deleteFile("eroa");
        fol1.displayFiles();
    }
}
