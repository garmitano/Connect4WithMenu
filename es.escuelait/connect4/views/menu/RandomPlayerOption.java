package connect4.views.menu;

import connect4.models.Color;
import connect4.models.RandomPlayer;
import connect4.utils.menu.Option;

class RandomPlayerOption extends Option{
    private PlayersManager playersManager;
    private Color color;

    public RandomPlayerOption(Color color, PlayersManager playersManager) {
        super("Random");
        this.playersManager = playersManager;
        this.color = color;
    }

    @Override
    public void interact() {
        this.playersManager.addPlayer(new RandomPlayer(this.color, this.playersManager.getBoard()));
    }
}