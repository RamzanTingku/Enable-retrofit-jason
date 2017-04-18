package com.example.ramzanullah.enable_retrofit_jason.model;

/**
 * Created by RamzanUllah on 18-Apr-17.
 */

public class User {

    private Integer id;
    private String name;
    private String mobile;

    /**
     * No args constructor for use in serialization
     */
    public User() {
    }

    /**
     * @param id
     * @param name
     * @param mobile
     */
    public User(Integer id, String name, String mobile) {
        super();
        this.id = id;
        this.name = name;
        this.mobile = mobile;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

}


