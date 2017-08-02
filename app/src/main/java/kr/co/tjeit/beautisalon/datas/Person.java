package kr.co.tjeit.beautisalon.datas;

/**
 * Created by the on 2017-07-26.
 */

public abstract class Person {
    private String name;
    private int gender;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }
}
