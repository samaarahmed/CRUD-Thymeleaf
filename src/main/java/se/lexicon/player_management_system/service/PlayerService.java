package se.lexicon.player_management_system.service;

import se.lexicon.player_management_system.model.Player;

import java.util.List;

public interface PlayerService {

    List<Player> getAllPlayers();
    void savePlayer(Player player);
}
