package connect4.views;

import connect4.models.Color;
import connect4.models.HumanPlayer;
import connect4.models.RandomPlayer;
import connect4.models.PlayersBuilder;
import connect4.models.Turn;
import connect4.utils.menu.Option;

class HumanPcPlayersOption extends Option{
    private Turn turn;
    private PlayersBuilder playersBuilder;

    public HumanPcPlayersOption(String title, Turn turn, PlayersBuilder playersBuilder) {
        super("CONTRA LA PC");
        this.turn = turn;
        this.playersBuilder = playersBuilder;
    }

    @Override
    public void interact() {
        this.playersBuilder.addPlayer(new HumanPlayer(Color.get(0), this.turn.getBoard()));
        for(int i=1; i < this.turn.getNumberPlayers(); i++){
            this.playersBuilder.addPlayer(new RandomPlayer(Color.get(i), this.turn.getBoard()));
        }
        this.turn.reset(playersBuilder.getPlayers());
    }
}