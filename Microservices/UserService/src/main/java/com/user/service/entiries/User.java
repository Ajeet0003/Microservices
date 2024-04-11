package com.user.service.entiries;

import javax.persistence.*;
import lombok.Data;
import org.springframework.context.i18n.SimpleTimeZoneAwareLocaleContext;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "micro_users")
public class User {

    @Id
    @Column(name = "ID")
    private String userId;
    @Column(name = "name",length = 20)
    private  String name;
    private String email;
    private String about;

    @Transient
    private List<Rating> ratings =new ArrayList<>();

}
