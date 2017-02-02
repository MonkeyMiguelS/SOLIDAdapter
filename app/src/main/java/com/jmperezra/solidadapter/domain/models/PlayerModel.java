package com.jmperezra.solidadapter.domain.models;

public class PlayerModel {

    private final String name;
    private final String surname;
    private final String photo;
    private final int age;
    private final int num;
    private final TypePositionPlayer typePositionPlayer;

    public PlayerModel(String name, String surname, String photo, int age, int num, TypePositionPlayer typePositionPlayer) {
        this.name = name;
        this.surname = surname;
        this.photo = photo;
        this.age = age;
        this.num = num;
        this.typePositionPlayer = typePositionPlayer;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getNum() {
        return num;
    }

    public String getPhoto() {
        return photo;
    }

    public TypePositionPlayer getTypePositionPlayer() {
        return typePositionPlayer;
    }
}
