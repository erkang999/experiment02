package com.kang.dao;

public class s_student {
  private Integer  id;
  private String  name;
  private Integer  hours;
  private Integer  sid;

    public s_student() {
    }

    @Override
    public String toString() {
        return "s_student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hours=" + hours +
                ", sid=" + sid +
                '}';
    }

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

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public s_student(Integer id, String name, Integer hours, Integer sid) {
        this.id = id;
        this.name = name;
        this.hours = hours;
        this.sid = sid;
    }
}
