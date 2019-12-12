package com.barry.mockito.entity;

import lombok.Data;
import java.io.Serializable;
import java.util.Date;

@Data
public class User implements Serializable  {

    private static final long serialVersionUID = -4042311990399630591L;

    private String id;
    private String name;
    private String gender;
    private int age;
    private Date birthDay;
    private String address;

}
