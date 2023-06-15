package Project_MyFamilyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class FileHendler implements Saveable{
    Human human;
    FamilyTree humans;
    
    FileHendler fileHendler = new FileHendler();
   
    public void saveMethod() {
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FamilyTree.out"));
        objectOutputStream.writeObject(humans);
        objectOutputStream.writeObject(human_1);
        objectOutputStream.close();
        }
    public void readMethod(){
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("FamilyTree.out"));
        FamilyTree humans_Restored = (FamilyTree) objectInputStream.readObject();
        Human human1_Restored = (Human) objectInputStream.readObject();
        objectInputStream.close();
    }
}


        
        