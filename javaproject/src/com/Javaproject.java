/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;
import people.Character;

public class Javaproject {
    public static void main(String[] args){
        
        Character homero = new Character(name:"Homero", age:39, gender:"A", phrase:"a la grande le puse cuca");
        Character bart = new Character(name:"bartolomeo", age:10, gender:"M", prhase:"hay caramba");
        bart.saySomething();
        
        Character apu = new Character();
        apu.setName(name:"Apu");
        apu.setPhrase(phrase:"vuelvas prontos");
    }
    
}
