# Chess.com PubAPI Wrapper for Java
[![javadoc](https://javadoc.io/badge2/io.github.sornerol/chesscom-pubapi-wrapper/javadoc.svg)](https://javadoc.io/doc/io.github.sornerol/chesscom-pubapi-wrapper)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.github.sornerol/chesscom-pubapi-wrapper/badge.svg)](https://maven-badges.herokuapp.com/maven-central/io.github.sornerol/chesscom-pubapi-wrapper)

A Java wrapper for Chess.com's public data API (PubAPI)

# Quick Start
Follow these directions to get up-and-running with the Chess.com API wrapper.

## Add dependencies to Maven/Gradle
To get started, add `chesscom-pubapi-wrapper` to your project's dependencies.

### Sorry but mine is just a fork from main repo, which only has .jar file

## Create a new client
The API wrapper consists of different clients, which correspond to different API endpoints within Chess.com's PubAPI:
- ClubClient
- CountryClient
- DailyPuzzleClient
- LeaderboardsClient
- PlayerClient
- StreamersClient
- TeamMatchClient
- TournamentClient

A complete description of these clients is available in the [Javadocs](https://javadoc.io/doc/io.github.sornerol/chesscom-pubapi-wrapper).

For our example, let's create a new PlayerClient to retrieve information about a player:
```java
import io.github.sornerol.chess.pubapi.client.PlayerClient;
import io.github.sornerol.chess.pubapi.domain.player.Player;
import io.github.sornerol.chess.pubapi.exception.ChessComPubApiException;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws ChessComPubApiException, IOException {
        PlayerClient client = new PlayerClient();
        Player player = client.getPlayerByUsername("erik");

        System.out.println(player.toString());
    }
}
```
