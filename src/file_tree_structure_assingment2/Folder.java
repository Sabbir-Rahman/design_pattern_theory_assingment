package file_tree_structure_assingment2;

import java.util.ArrayList;
import java.util.List;

public class Folder implements innerNodeInterface {
    private final String name;
    private final String type;
    String returnData;

    List<nodeInterface> nodeInterfaceList = new ArrayList<>();

    Folder(String name, String type){
        this.name = name;
        this.type = type;
    }

    @Override
    public String getData() {
        returnData = "Foldername: " + this.name + " Type: " + this.type;
        return returnData;
    }

    public String getAllData() {
        StringBuilder stringData = new StringBuilder(this.name+" ->");
        for (nodeInterface nodeInterface : nodeInterfaceList){
            stringData.append(nodeInterface.getData()).append(" | ");
        }

        return stringData.toString();
    }

    @Override
    public void add(nodeInterface file) {
        nodeInterfaceList.add(file);
    }

    @Override
    public void remove(nodeInterface file) {
        nodeInterfaceList.remove(file);
    }

    @Override
    public void singleClick() {
        System.out.println(this.getData());
    }

    @Override
    public void doubleClick() {
        System.out.println(this.getAllData());
    }
}
