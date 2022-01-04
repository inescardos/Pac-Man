package view.ElementsView.Ghosts;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TerminalSize;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import model.Elements.Ghosts.Ghost;
import model.Elements.Ghosts.Types.Orange;
import view.ElementsView.View;

import java.io.IOException;


public class OrangeView extends GhostView {
    private Orange orange;

    public OrangeView(Ghost orange, TextGraphics graphics) {
        super(graphics);
        this.orange = (Orange) orange;
    }

    @Override
    public void draw() throws IOException {
        String[] ghostDraw;

        if (!orange.getFrightenedModeOn()) {

            ghostDraw = chooseView(orange);

            int y = 0;
            for (String s : ghostDraw) {
                for (int x = 0; x < s.length(); x++) {
                    switch (s.charAt(x)) {
                        case '#' ->  graphics.setBackgroundColor(TextColor.Factory.fromString("#FFB852"));
                        case '0' ->  graphics.setBackgroundColor(TextColor.Factory.fromString("#FFFFFF"));
                        case '1' ->  graphics.setBackgroundColor(TextColor.Factory.fromString("#2121DE"));
                        default  ->  graphics.setBackgroundColor(TextColor.Factory.fromString("#000000"));

                    }

                    graphics.fillRectangle(new TerminalPosition(
                                    orange.getPosition().getCol() + x * 2 + 1, orange.getPosition().getRow() + y + 1),
                            new TerminalSize(2, 1), ' ');
                }
                y++;
            }
        } else {
            FrightenedView frightenedView = new FrightenedView(orange, graphics);
            frightenedView.draw();
        }
    }

}
