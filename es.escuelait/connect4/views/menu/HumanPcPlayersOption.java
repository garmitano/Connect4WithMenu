package connect4.views.menu;

import connect4.models.Color;
import connect4.models.HumanPlayer;
import connect4.utils.menu.Option;

class HumanPcPlayersOption extends Option{
    private PlayersManager playersManager;

    public HumanPcPlayersOption(PlayersManager playersManager) {
        super("Jugar contra la PC");

        this.playersManager = playersManager;
    }

    @Override
    public void interact() {

        for(int i=0; i < this.playersManager.getNumberPlayers(); i++){
            if(i==0){
                this.playersManager.addPlayer(new HumanPlayer(Color.get(i), this.playersManager.getBoard()));
            }else{
                new SubMenuModoPc(Color.get(i), this.playersManager).interact();
            }
        }
        this.playersManager.reset();
    }
}