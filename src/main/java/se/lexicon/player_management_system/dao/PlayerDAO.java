package se.lexicon.player_management_system.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.player_management_system.model.Player;

@Repository
public interface PlayerDAO extends JpaRepository<Player,Long>{

}
