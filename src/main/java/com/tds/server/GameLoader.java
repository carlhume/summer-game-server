package com.tds.server;

public class GameLoader {

    public Game loadGame( long id ) {
        Game game = new Game();
        game.setId( id );
        return game;
    }

}
