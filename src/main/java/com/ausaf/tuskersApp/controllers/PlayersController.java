package com.ausaf.tuskersApp.controllers;

import com.ausaf.tuskersApp.entity.Player;
import com.ausaf.tuskersApp.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("players")
public class PlayersController {

    @Autowired
    private PlayerService playerService;

    @GetMapping("abc")
    public String abc() {
        return "abc";
    }

    @GetMapping
    public List<Player> getAllPlayers() {
        return playerService.getAllPlayers();
    }

    @PostMapping("addPlayer")
    public Boolean addPlayer(@RequestBody Player player) {
        return playerService.addPlayer(player);
    }
}
