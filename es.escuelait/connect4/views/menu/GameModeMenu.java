package connect4.views.menu;

import connect4.models.Turn;
import connect4.utils.menu.QuitMenu;

public class GameModeMenu extends QuitMenu{

    private PlayersManager playersManager;
    
    public GameModeMenu(Turn turn){
        super("CONNECT4 Modo de juego");
        this.playersManager = new PlayersManager(turn);
    }

    protected void addOptions(){
        this.add(new HumansPlayersOption(this.playersManager));
        this.add(new HumanPcPlayersOption(this.playersManager));
        this.add(new PcPlayersOption(this.playersManager));
    }
    
}
