
package people;


public class Character {
    String name;
    int age;
    char gender;
    String phrase;
    
    public Character(String name, int age, char gender, String phrase){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.phrase = phrase;
    }
    
    public Character(){}
    
    public void saySomething(){
        System.out.println(x:this.phrase);
    }
}
