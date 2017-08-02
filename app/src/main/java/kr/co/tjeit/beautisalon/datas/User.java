package kr.co.tjeit.beautisalon.datas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by the on 2017-07-26.
 */

public class User implements Serializable {

    private String name;
    private int gender;
    private Calendar birthday;
    private ArrayList<Designer> likeDesigners;
    private String profilePicturePath;

    // Constructor도 생성

    public User() {

    }

    public User(String name, int gender, Calendar birthday, ArrayList<Designer> likeDesigners, String path) {
        this.name = name;
        this.gender = gender;
        this.birthday = birthday;
        this.likeDesigners = likeDesigners;
        this.profilePicturePath = path;

    }

    public String getProfilePicturePath() {
        return profilePicturePath;
    }

    public void setProfilePicturePath(String profilePicturePath) {
        this.profilePicturePath = profilePicturePath;
    }

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

    public Calendar getBirthday() {
        return birthday;
    }

    public void setBirthday(Calendar birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Designer> getLikeDesigners() {
        return likeDesigners;
    }

    public void setLikeDesigners(ArrayList<Designer> likeDesigners) {
        this.likeDesigners = likeDesigners;
    }


    // implement Serializable
    // User 클래스 객체들이
    // intent.putExtra -> intent에 첨부되어 전송될수 있도록 하는 구문
}
