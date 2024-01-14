package com.myblog.myblog4.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Blogapi")
public class Lead {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;
    private String Name;
    private String Title;
    private String City;
    private String Content;

}
