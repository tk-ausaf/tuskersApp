package com.ausaf.tuskersApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@Document(collection = "users")
@CrossOrigin(origins = "*")
@NoArgsConstructor
public class User {

    @Id
    Integer id;
    String name;
    String password;

    public User(int id, String stName, String password) {
        this.id = id;
        this.name = stName;
        this.password = password;
    }

}
