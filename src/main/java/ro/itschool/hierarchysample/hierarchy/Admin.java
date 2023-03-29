package ro.itschool.hierarchysample.hierarchy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@DiscriminatorValue("admin")
public class Admin extends User {
    private String adminName;
    private String adminRole;

    // Getters and Setters
}