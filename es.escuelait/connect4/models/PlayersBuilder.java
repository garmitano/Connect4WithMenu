package connect4.models;

public class PlayersBuilder{

    private Player[] players;
    private int current;

    public PlayersBuilder(){
        this.players = new Player[Turn.NUMBER_PLAYERS];
        this.current = 0;
    }

    public void addPlayer(Player player){
        assert current < Turn.NUMBER_PLAYERS;

        this.players[current] = player;
        this.current ++;
    }

    public Player[] getPlayers(){
        return this.players;
    }

}
