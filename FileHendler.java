package Project_MyFamilyTree;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;

public class FileHendler implements Serializable{
    //Human human;
    //FamilyTree humans;
    
    FileHendler fileHendler = new FileHendler();
   
    public void saveMethod(){
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("FamilyTree.out"));
            out.writeObject(fileHendler);
            out.close();
        }
    public void readMethod(){
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("FamilyTree.out"));
        fileHendler = (FileHendler) in.readObject();
    }
}
