package connect4.views.menu;

import connect4.models.Board;
import connect4.models.Player;
import connect4.models.Turn;

public class PlayersManager{

    private Player[] players;
    private int current;
    private Turn turn;

    public PlayersManager(Turn turn){
        this.turn = turn;
        this.players = new Player[this.turn.getNumberPlayers()];
        this.current = 0;
    }

    public void addPlayer(Player player){
        assert current < this.turn.getNumberPlayers();

        this.players[current] = player;
        this.current ++;
    }

    public int getNumberPlayers(){
        return this.turn.getNumberPlayers();
    }

    public Board getBoard(){
        return this.turn.getBoard();
    }

    public void reset(){
        this.turn.reset(players);
    }

}
