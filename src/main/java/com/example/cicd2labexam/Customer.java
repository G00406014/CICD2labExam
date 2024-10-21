package com.example.cicd2labexam;



import jakarta.persistence.Id;
import lombok.Data;

import java.lang.annotation.Documented;


@Data
@Documented(collection = "customers")
public class Customer {


    @Id
    private String id;
    private String name;
    private String email;


}



