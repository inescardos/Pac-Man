package g0902.model.Elements.Ghosts.MoveMode.TargetStrategies;

import g0902.model.Elements.Direction;
import g0902.model.Elements.Ghosts.MoveMode.ChaseMode.TargetStrategys.AggressiveTargetStrategy;
import g0902.model.Elements.Ghosts.MoveMode.ChaseMode.TargetStrategys.AmbushTargetStrategy;
import g0902.model.Elements.Pacman;
import g0902.model.Maps.Builders.MapReader;
import g0902.model.Maps.Map;
import g0902.model.Position;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.mockito.Mockito.mock;

public class AmbushTargetStrategyTest {
    @Test
    void getTarget() throws IOException {
        Position position=mock(Position.class);
        AmbushTargetStrategy a=new AmbushTargetStrategy();
        MapReader mapReader=new MapReader();
        Map map=mapReader.createMap("mapTest");
        Assertions.assertEquals(new Position(40, 12), a.getTarget(position, map));
        Pacman pacman=map.getPacman();
        pacman.setDirection(Direction.Up);
        pacman.nextDirection();
        map.setPacman(pacman);
        Assertions.assertEquals(new Position(-24, 60), a.getTarget(position, map));
        pacman.setDirection(Direction.Left);
        pacman.nextDirection();
        map.setPacman(pacman);
        Assertions.assertEquals(new Position(8, -36), a.getTarget(position, map));
        pacman.setDirection(Direction.Right);
        pacman.nextDirection();
        map.setPacman(pacman);
        Assertions.assertEquals(new Position(8, 60), a.getTarget(position, map));

    }
}