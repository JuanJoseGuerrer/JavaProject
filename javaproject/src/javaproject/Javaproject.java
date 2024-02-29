/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;


public class Javaproject {
    public static void main(String[] args){
        
        character homero = new character(name:"Homero", age:39, gender:"A", phrase:"a la grande le puse cuca");
        character bart = new character(name:"bartolomeo", age:10, gender:"M", prhase:"hay caramba");
    }
}

class character{
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
    
}

