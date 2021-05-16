package com.zti.SeminarBootData.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.GenerationType;

@Entity
public class Student {
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAlbum_nr() {
        return album_nr;
    }

    public void setAlbum_nr(Integer album_nr) {
        this.album_nr = album_nr;
    }

    public Student(String name, String surname, Integer album_nr) {
        this.name = name;
        this.surname = surname;
        this.album_nr = album_nr;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String surname;
    private Integer album_nr;

    protected Student(){}
    
}
