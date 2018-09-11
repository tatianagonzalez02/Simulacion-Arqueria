/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.util.ArrayList;

/**
 *
 * @author USER-LENOVO
 */
public class Person {
    private int id=1;
    private String name;
    private int age;
    private EnumGender gender;
    private int resistence;
    private int precision;
    private int experience;
    private float lucky;//suerte
    private ArrayList<Launching> listLaunching;

    public Person(String name, EnumGender gender, int age, int resistence, 
            int precision, int experience, float lucky) {
        this.id +=1;
        this.name = name;
        this.gender=gender;
        this.age = age;
        this.resistence = resistence;
        this.precision = precision;
        this.experience = experience;
        this.lucky = lucky;
        this.listLaunching=new ArrayList<>();
    }

    public ArrayList<Launching> getListLaunching() {
        return listLaunching;
    }

    public void setListLaunching(ArrayList<Launching> listLaunching) {
        this.listLaunching = listLaunching;
    }

    
    public EnumGender getGender() {
        return gender;
    }

    public void setGender(EnumGender gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getResistence() {
        return resistence;
    }

    public void setResistence(int resistence) {
        this.resistence = resistence;
    }

    public int getPrecision() {
        return precision;
    }

    public void setPrecision(int precision) {
        this.precision = precision;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public float getLucky() {
        return lucky;
    }

    public void setLucky(float lucky) {
        this.lucky = lucky;
    }
    
    
}
