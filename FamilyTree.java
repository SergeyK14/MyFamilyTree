package Project_MyFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class FamilyTree {

    public Human human;
    public List<Human> humans;
    
    
   

    public FamilyTree (){
        humans = new ArrayList<>();
    }
    
    public void addHuman (Human human){
        humans.add (human);
    }

    // public void Childrens (List<Human> childrens){
    //     childrens = new ArrayList<>();
    // }
    
    // public void addChildrens (Human human){
    //     childrens.add (human);
    // }

    public Human findHuman(String name){
        for(Human human: humans){
            if (human.getName().equalsIgnoreCase(name)){
                return human;
            }
        }
        return null;
    }
    public String getHuman(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Human human: humans){
            stringBuilder.append(human);
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }
}
