package connect4.views.menu;

import connect4.models.Color;
import connect4.models.RandomPlayer;
import connect4.models.Turn;
import connect4.utils.menu.Option;

class RandomPlayerOption extends Option{
    private PlayersManager playersManager;

    public RandomPlayerOption(PlayersManager playersManager) {
        super("Random");
        this.playersManager = playersManager;
    }

    @Override
    public void interact() {
        this.playersManager.addPlayer(new RandomPlayer(Color.get(1), this.playersManager.getBoard()));
    }
}