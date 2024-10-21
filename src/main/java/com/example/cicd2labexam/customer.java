package com.example.cicd2labexam;



import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Firstname;
import jakarta.validation.constraints.Lastname;
import jakarta.validation.constraints.id;
import jakarta.validation.constraints.eircode;
import jakarta.validation.constraints.number;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.processing.Pattern;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class customer {


    @Id
    @Pattern(regexp = "^ [A - ZA -ZO - 5] {1,6} $")
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private String id;
    @NotBlank(message = "First name must not be empty")
    @Min(message = "must be at least 2 characthers")
    private String Firstname;
    private String Lastname;
    private String eircode;
    private Double number;


}



