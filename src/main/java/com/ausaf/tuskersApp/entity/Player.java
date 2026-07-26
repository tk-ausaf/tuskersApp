package com.ausaf.tuskersApp.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.bind.annotation.CrossOrigin;

@Data
@Document(collection = "players")
@CrossOrigin(origins = "*")
@NoArgsConstructor
public class Player {

    @Id
    Integer id;
    String name;

    public Player(int id, String stName) {
        this.id = id;
        this.name = stName;
    }

}
