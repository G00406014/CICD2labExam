package com.example.cicd2labexam;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.name;
import jakarta.validation.constraints.email;
import jakarta.validation.constraints.id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {


    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    private String id;
    @NotBlank(message = "First name must not be empty")
    @Min(message = "must be atleast 2 characthers")
    private String name;
    private String email;


}



