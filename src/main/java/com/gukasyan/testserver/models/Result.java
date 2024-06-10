package com.gukasyan.testserver.models;

import jakarta.persistence.*;

@Table(name = "result")
@Entity
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String testName;
    private String userName;
    private int points;
    private String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestName(String testName) {
        this.testName = testName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id=" + id +
                ", testName='" + testName + '\'' +
                ", userName='" + userName + '\'' +
                ", points=" + points +
                ", date='" + date + '\'' +
                '}';
    }
}
