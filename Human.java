package Project_MyFamilyTree;

import java.util.ArrayList;
import java.util.List;

public class Human {
    public String name;
    private String birthday;
    private Gender gender;
    public Human father;
    public Human mother;
    public List<Human> childrens;
    private int glodal_id;
    private static int id;
    



    public void setName (String name){
        this.name = name;
    }
    public String getName (){
        return name;
    }
    public void setBirthday (String birthday){
        this.birthday = birthday;
    } 
    public String getBirthday (){
        return birthday;
    }
    public void setGender (Gender gender){
        this.gender = gender;
    }
    public Gender getGender (){
        return gender;
    }
    public void setFather (Human father){
        this.father = father;
    }
    public Human getFather (){
        return father;
    }
    public void setMother (Human mother){
        this.mother = mother;
    }
    public Human getMother (){
        return mother;
    }
    public void Childrens (List<Human> childrens){
        childrens = new ArrayList<>();
    }
    public void addChildrens (Human human){
        childrens.add (human);
    }
    public String getChildrens(){
        StringBuilder stringBuilder = new StringBuilder();
        for(Human human: childrens){
            stringBuilder.append(human.getName());
            stringBuilder.append(human.getBirthday());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public Human(String name, String birthday, Gender gender, Human father, Human mother, List<Human> childrens){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.father = father;
        this.mother = mother;
        this.childrens = childrens;
        id = glodal_id++;
    }

    // public Human(String name, String birthday, Gender gender, Human father, Human mother){
    //     this.name = name;
    //     this.birthday = birthday;
    //     this.gender = gender;
    //     this.father = father;
    //     this.mother = mother;
    // }

    // public Human(String name, String birthday, Gender gender, List<Human> childrens){
    //     this.name = name;
    //     this.birthday = birthday;
    //     this.gender = gender;
    //     this.childrens = childrens;
    // }

    public Human(String name, String birthday, Gender gender){
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
    }

    public Human(){
    }


    @Override
    public String toString() {
        return "id:" + id + '\n'
        + "Имя:" + name + '\n'
        + "Дата рождения: " + birthday + '\n'
        + "Пол: " + gender + '\n'
        + "Отец: " + father.getName() + ", " + father.getBirthday() + '\n'
        + "Mать: " + mother.getMother() + ", " + mother.getBirthday() + '\n'
        + "Дети: " + childrens.getChildrens();
    }
}
