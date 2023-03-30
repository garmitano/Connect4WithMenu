package connect4.views.menu;

import connect4.models.Color;
import connect4.models.MinMaxPlayer;
import connect4.models.Turn;
import connect4.utils.menu.Option;

class IAPlayerOption extends Option{
    private Turn turn;
    private PlayersManager playersBuilder;

    public IAPlayerOption(PlayersManager playersBuilder) {
        super("IA player");

        this.playersBuilder = playersBuilder;
    }

    @Override
    public void interact() {
        this.playersBuilder.addPlayer(new MinMaxPlayer(Color.get(1), this.playersBuilder.getBoard()));

    }
}