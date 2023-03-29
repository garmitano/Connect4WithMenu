package connect4.views;

import connect4.models.PlayersBuilder;
import connect4.models.Turn;
import connect4.utils.menu.QuitMenu;

public class Connect4GameModeMenu extends QuitMenu{

    private Turn turn;
    private PlayersBuilder playersBuilder;
    
    public Connect4GameModeMenu(Turn turn){
        super("CONNECT4 Game Mode");
        this.turn = turn;
        this.playersBuilder = new PlayersBuilder();
    }

    protected void addOptions(){
        this.add(new HumansPlayersOption(null, this.turn, this.playersBuilder));
        this.add(new HumanPcPlayersOption(null, this.turn, this.playersBuilder));
        this.add(new PcPlayersOption(null, this.turn, this.playersBuilder));
    }
    
}
