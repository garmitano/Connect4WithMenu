package connect4.views;

import connect4.models.Color;
import connect4.models.RandomPlayer;
import connect4.models.PlayersBuilder;
import connect4.models.Turn;
import connect4.utils.menu.Option;

class PcPlayersOption extends Option{
    private Turn turn;
    private PlayersBuilder playersBuilder;

    public PcPlayersOption(String title, Turn turn, PlayersBuilder playersBuilder) {
        super("IA");
        this.turn = turn;
        this.playersBuilder = playersBuilder;
    }

    @Override
    public void interact() {
        for(int i=0; i < this.turn.getNumberPlayers(); i++){
            this.playersBuilder.addPlayer(new RandomPlayer(Color.get(i), this.turn.getBoard()));
        }
        this.turn.reset(playersBuilder.getPlayers());
}
}