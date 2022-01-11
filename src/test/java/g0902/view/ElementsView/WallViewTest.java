package g0902.view.ElementsView;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;
import g0902.model.Elements.Coins.PowerCoin;
import g0902.model.Elements.Wall;
import g0902.model.Position;
import g0902.view.ElementsView.Coins.PowerCoinView;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;

public class WallViewTest {
    private Screen screen;
    private TextGraphics tg;
    WallView view;
    @BeforeEach
    void setUp() throws IOException {
        Position position=mock(Position.class);
        screen = mock(Screen.class);
        tg = mock(TextGraphics.class);
        view=new WallView(new Wall(position, 39, 39), tg);
        view.setGraphics(tg);
    }

    @Test
    public void InsDrawTest() throws IOException {
        view.draw();
        Mockito.verify(tg, Mockito.times(1)).setBackgroundColor(any());}
}