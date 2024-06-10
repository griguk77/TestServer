package com.gukasyan.testserver.models;

import jakarta.persistence.*;

@Table(name = "textResult")
@Entity
public class TextResult {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int test_id;
    private int beginPoint;
    private int endPoint;
    private String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTest_id() {
        return test_id;
    }

    public void setTest_id(int test_id) {
        this.test_id = test_id;
    }

    public int getBeginPoint() {
        return beginPoint;
    }

    public void setBeginPoint(int beginPoint) {
        this.beginPoint = beginPoint;
    }

    public int getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(int endPoint) {
        this.endPoint = endPoint;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "TextResult{" +
                "id=" + id +
                ", test_id=" + test_id +
                ", beginPoint=" + beginPoint +
                ", endPoint=" + endPoint +
                ", text='" + text + '\'' +
                '}';
    }
}
