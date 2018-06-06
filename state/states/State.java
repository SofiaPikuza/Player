package states;

import ui.Player;

/**
 * Загальний інтерфейс всіх станів
 * @author Sofia
 *
 */
public abstract class State {
    public Player player;

    /**
     * Контекст передає себе в конструктор стану, щоб стан міг звертатися до його даних і методів в майбутньому, якщо буде потрібно.
     */
    public State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();
}