package g0902.model.Game.MapElements;

import g0902.model.Game.MapElements.Coins.PowerCoin;
import g0902.model.Game.MapElements.Coins.SmallCoin;
import g0902.model.Game.Map.Builders.MapBuilder;
import g0902.model.Game.Map.Builders.MapReader;
import g0902.model.Game.Map.Map;
import g0902.model.Game.MapElements.MovingElements.Pacman;
import g0902.model.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class PacmanTest extends Assertions{
    private Pacman pacman;

    @BeforeEach
    public void createPacman(){
        Position pos = new Position(3*8+1, 3*12-1);
        pacman = new Pacman(pos);
    }

    @Test
        //Tests if the pacman is being correctly read from the map.
    void readPacmanTest() throws IOException {
        MapBuilder mapbuilder = new MapReader();
        Map map = mapbuilder.createMap("mapTest2");
        assertEquals(map.getPacman().getPosition(), new Position(8,12));
    }


    @Test
        // Tests if the score is being updated correctly
    void increaseScoreTest(){
        pacman.increaseScore(PowerCoin.PowerCoinValue);
        assertEquals(200, pacman.getScore());
        pacman.increaseScore(SmallCoin.SmallCoinValue);
        assertEquals(210, pacman.getScore());
    }

    /*
    @Test
    void movePacmanTest(){
        pacman.setDirection(Direction.Up);
        Assertions.assertEquals(new Position(3*8+1-(50*20/1000), 3*12-1), pacman.moveNextDirection(20));
        pacman.nextDirection();
        Assertions.assertEquals(new Position(3*8+1-(50*20/1000), 3*12-1), pacman.moveCurrentDirection(20));
        Assertions.assertEquals(new Position(3*8+1, 3*12-1), pacman.getBeginPosition());
        Assertions.assertEquals(true, pacman.isOpen());
        pacman.setMouthOpen(false);
        Assertions.assertEquals(false, pacman.isOpen());
        pacman.setDirection(Direction.Down);
        Assertions.assertEquals(Direction.Down, pacman.getNextDirection());
        pacman.setPosition(new Position(1,1));
        Assertions.assertEquals(new Position(1,1), pacman.getPosition());
    }
    */

}