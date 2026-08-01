package com.ausaf.tuskersApp.service;

import com.ausaf.tuskersApp.entity.Player;
import com.ausaf.tuskersApp.repository.player.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public boolean addPlayer(Player player) {
        String encryptedPassword = passwordEncoder.encode(player.getPassword());
        player.setPassword(encryptedPassword);
        playerRepository.save(player);
        return true;
    }

    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }

}
