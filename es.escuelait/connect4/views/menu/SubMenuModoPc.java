package connect4.views.menu;

import connect4.utils.menu.Menu;

public class SubMenuModoPc extends Menu{

    private PlayersManager playersBuilder;
    
    public SubMenuModoPc(PlayersManager playersManager){
        super("Tipo de modo PC");
        this.playersBuilder = playersManager;
    }

    protected void addOptions(){
        this.add(new RandomPlayerOption(this.playersBuilder));
        this.add(new IAPlayerOption(this.playersBuilder));
    }
    
}
