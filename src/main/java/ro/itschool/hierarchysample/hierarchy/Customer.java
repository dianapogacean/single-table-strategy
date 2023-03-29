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
@DiscriminatorValue("customer")
public class Customer extends User {
    private String customerName;
    private String customerPhone;

}