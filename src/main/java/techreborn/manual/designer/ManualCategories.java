package techreborn.manual.designer;

import javafx.scene.control.TreeItem;

import java.util.HashMap;

/**
 * Created by Mark on 05/04/2016.
 */
public class ManualCategories {

    //Top level
    public static TreeItem<String> contents;

    public static HashMap<String, TreeItem<String>> categories = new HashMap<>();

    public static TreeItem<String> createNewCategorie(String name){
        if(ManualCategories.categories.containsKey(name)){
            return ManualCategories.categories.get(name);
        }
        ManualCategories.categories.put(name, new TreeItem<>(name));
        ManualCategories.contents.getChildren().add(ManualCategories.categories.get(name));
        return ManualCategories.categories.get(name);
    }
}
