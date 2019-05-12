package com.awesome2048.Game;

import com.awesome2048.Score.Score;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;

@RestController
public class GameController {

    @PostMapping("/move")
    public Game postMove(@RequestBody Score newScore, HttpServletRequest request) throws IOException {

    }

    @PostMapping("/new-game")
    public Game newGame(@RequestBody Score newScore, HttpServletRequest request) throws IOException {
    }
}
