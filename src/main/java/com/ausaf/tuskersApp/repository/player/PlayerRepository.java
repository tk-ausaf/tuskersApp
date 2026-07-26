package com.ausaf.tuskersApp.repository.player;

import com.ausaf.tuskersApp.entity.Player;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends MongoRepository<Player, Integer> {
}
