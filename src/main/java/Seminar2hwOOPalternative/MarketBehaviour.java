package Seminar2hwOOPalternative;

import java.util.List;

public interface MarketBehaviour extends QueueBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
