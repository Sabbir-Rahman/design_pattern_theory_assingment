package file_tree_structure_assingment2;

public class File implements nodeInterface {
    String name;
    String type;
    String returnData;

    File(String name,String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String getData() {
        returnData = "Filename: " + this.name + " Type: " + this.type;
        return returnData;
    }

    @Override
    public void singleClick() {
        System.out.println(this.getData());

    }

    @Override
    public void doubleClick() {

        System.out.println("File is opened");

    }
}
