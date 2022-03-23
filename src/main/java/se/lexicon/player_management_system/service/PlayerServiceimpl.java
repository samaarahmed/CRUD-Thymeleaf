package se.lexicon.player_management_system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import se.lexicon.player_management_system.dao.PlayerDAO;
import se.lexicon.player_management_system.model.Player;

import java.util.List;

@Service
public class PlayerServiceimpl implements PlayerService{
    @Autowired
   private PlayerDAO playerDAO;
    @Override
    public List<Player> getAllPlayers() {
        return playerDAO.findAll();
    }

    @Override
    public void savePlayer(Player player) {
        this.playerDAO.save(player);
    }
}
