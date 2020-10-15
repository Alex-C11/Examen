package Entidades;

public class Persona {
    int id;
    String name;
    String sex;
    int age;

    public Persona(){

    }
    public Persona(String name){
        this.name=name;
    }
    public Persona(String name, String sex){
        this.name=name;
        this.sex=sex;
        }
    public void laugh() {

        System.out.println(name+" jejejee");
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
