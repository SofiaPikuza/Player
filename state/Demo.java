
import ui.Player;
import ui.UI;

/**
 Демо клас
 **/
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
