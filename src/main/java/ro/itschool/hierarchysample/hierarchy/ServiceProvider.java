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
@DiscriminatorValue("service_provider")
public class ServiceProvider extends User {
    private String serviceProviderName;
    private String serviceProviderPhone;
    private String specialization;

}