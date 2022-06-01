package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.player.Player;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class PlayerClientTest {

    @org.junit.jupiter.api.Test
    void getPlayerByUsername() {
        PlayerClient client = new PlayerClient();
        try {
            Player player = client.getPlayerByUsername("Hikaru");
            System.out.println(player.toString());
            assertFalse(player.isVerified());
        } catch (IOException | ChessComPubApiException e) {
            throw new RuntimeException(e);
        }
    }
}