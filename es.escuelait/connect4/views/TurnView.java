package connect4.views;

import connect4.models.HumanPlayer;
import connect4.models.MinMaxPlayer;

import connect4.models.PlayerVisitor;
import connect4.models.RandomPlayer;
import connect4.models.Turn;

public class TurnView implements PlayerVisitor {
    private final Turn turn;
    private PlayerView activePlayerView;

    public TurnView(final Turn turn) {
        super();
        this.turn = turn;
    }

    public void play() {
        this.turn.getActivePlayer().accept(this);
        this.turn.play(this.activePlayerView.getColumn());
    }

    public void writeResult() {
        if ((this.turn.getBoard()).isWinner()) {
            this.activePlayerView.showWinner();
        } else {
            MessageView.getInstance().writeln(Message.PLAYERS_TIED);
        }
    }

    public void visit(final HumanPlayer humanPlayer) {
        this.activePlayerView = new HumanPlayerView(humanPlayer);
    }

    public void visit(final RandomPlayer randomPlayer) {
        this.activePlayerView = new RandomPlayerView(randomPlayer);
    }

    public void visit(final MinMaxPlayer minMaxPlayer) {
        this.activePlayerView = new MinMaxPlayerView(minMaxPlayer);
    }
}
