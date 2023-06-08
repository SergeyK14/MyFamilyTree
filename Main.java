package Project_MyFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Main {
    Human human_1 = new Human("Иванов Сергей Максимович", "01.11.1988", Gender.man);
    Human human_2 = new Human("Иванов Максим Константинович", "06.08.1959", Gender.man);
    Human human_3 = new Human("Иванова Лариса Петровна", "16.09.1961", Gender.woman);
    Human human_4 = new Human("Иванова Ксения Сергеевна", "04.12.2014", Gender.woman);
    Human human_5 = new Human("Иванов Данила Сергеевич", "29.10.2017", Gender.man);
    Human human_6 = new Human("Иванова Ирина Александровна", "18.11.1991", Gender.woman);
    
    human_1.setFather(human_2);
    human_1.setMother(human_3);
    human_4.setFather (human_1);
    human_4.setMother (human_6);
    human_5.setFather (human_1);
    human_5.setMother (human_6);

    
    List<Human> childrens_1 = new ArrayList<>();
    human_1.addChildrens (human_4);
    human_1.addChildrens (human_5);

    List<Human> childrens_2 = new ArrayList<>();
    human_2.addChildrens (human_1);
    human_3.addChildrens (human_1);

    FamilyTree humans = new FamilyTree();
    humans.addHumans (human_1, human_2, human_3, human_4, human_5);
    
    human_1.findHuman ("Иванов Сергей Максимович");
    
    System.out.println(human_1.getHuman (humans));
}
