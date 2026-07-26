package com.ausaf.tuskersApp.service;

import com.ausaf.tuskersApp.entity.Player;
import com.ausaf.tuskersApp.repository.player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    public boolean addPlayer(Player player) {
        playerRepository.save(player);
        return true;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
