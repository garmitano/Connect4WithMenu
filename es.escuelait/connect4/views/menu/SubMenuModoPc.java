package connect4.views.menu;

import connect4.models.Color;
import connect4.utils.menu.Menu;

public class SubMenuModoPc extends Menu{

    private PlayersManager playersBuilder;
    private Color color;
    
    public SubMenuModoPc(Color color, PlayersManager playersManager){
        super("Tipo de modo PC");
        this.playersBuilder = playersManager;
        this.color = color;
    }

    protected void addOptions(){
        this.add(new RandomPlayerOption(color, this.playersBuilder));
        this.add(new IAPlayerOption(color, this.playersBuilder));
    }
    
}
