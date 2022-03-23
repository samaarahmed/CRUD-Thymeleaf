package se.lexicon.player_management_system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import se.lexicon.player_management_system.model.Player;
import se.lexicon.player_management_system.service.PlayerService;

@Controller
public class PlayerController {

    @Autowired
    PlayerService playerService;
    @GetMapping(value ="/" )
    public String viewHomePage(Model model){

        model.addAttribute("playerlist",playerService.getAllPlayers());
        return "home";
    }

    @GetMapping("/showNewPlayerForm")
    public String showNewPlayerForm(Model model) {
        Player player = new Player();
        model.addAttribute("player", player);
        return "player_form";
    }

    @PostMapping("/savePlayer")
    public String savePlayer(@ModelAttribute("player") Player player){

            playerService.savePlayer(player);
        return "redirect:/";

    }
}
