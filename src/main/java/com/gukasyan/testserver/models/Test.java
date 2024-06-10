package com.gukasyan.testserver.models;


import jakarta.persistence.*;

@Table(name = "test")
@Entity
public class Test {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private String declTest;
    private int queCount;

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

    public String getDeclTest() {
        return declTest;
    }

    public void setDeclTest(String declTest) {
        this.declTest = declTest;
    }

    public int getQueCount() {
        return queCount;
    }

    public void setQueCount(int queCount) {
        this.queCount = queCount;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", declTest='" + declTest + '\'' +
                ", queCount=" + queCount +
                '}';
    }
}
