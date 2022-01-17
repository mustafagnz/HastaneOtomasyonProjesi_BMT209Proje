package com.company;

public class user
{
    private int id;
    int tc;
    String name;
    int password;
    public user(int id, int tc, String name, int password)
    {
        this.id=id;
        this.tc=tc;
        this.name=name;
        this.password=password;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTc() {
        return tc;
    }

    public void setTc(int tc) {
        this.tc = tc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
