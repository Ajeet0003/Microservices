package com.rating.service.entiries;

import javax.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "hotel")
public class Hotel {

    @Id
    @Column(name = "ID")
    private String id;
    @Column(name = "name",length = 20)
    private  String name;
    private String location;
    private String about;

  //  @Transient
   // private List<Rating> ratings =new ArrayList<>();

}
