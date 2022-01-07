package main.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class MetricType {

    @Id
    @Column(name = "tech_name")
    private String techName;

    @Column(name = "display_name", length = 1024)
    private String displayName;

    @Column(name = "is_user_metric")
    private boolean isUserMetric;

    @Column(name = "is_active")
    private boolean isActive = true;

    public String toString(){
        return techName+" "+displayName+" "+isUserMetric+" "+isActive;
    }

}
