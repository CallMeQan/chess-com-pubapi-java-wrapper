package io.github.sornerol.chess.pubapi.client;

import io.github.sornerol.chess.pubapi.domain.leaderboards.LeaderboardEntry;
import io.github.sornerol.chess.pubapi.domain.leaderboards.Leaderboards;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LeaderboardsClientTest {

    @Test
    void getLeaderboards() {
        LeaderboardsClient client = new LeaderboardsClient();
        try {
            Leaderboards leaderboards = client.getLeaderboards();
            LeaderboardEntry entry = leaderboards.getDailyLeaderboard().get(0);
            System.out.println(entry.getName() + " | " + entry.getRank().toString());
            assertEquals(1, entry.getRank().intValue());
        } catch (IOException | ChessComPubApiException e) {
            throw new RuntimeException(e);
        }
    }
}