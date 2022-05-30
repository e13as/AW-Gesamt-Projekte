package de.awacademy.interfaces.geometrische_figuren_vorlage;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class StandardZeichnung {

    private Terminal terminal;

    public StandardZeichnung(Terminal terminal) {
        this.terminal = terminal;
    }


    public void zeichneFiguren(Rechteck[] rechtecke) throws IOException {

        for(Rechteck einRechteck : rechtecke) {

            for(Punkt punkt : einRechteck.zeichne()) {

                terminal.setCursorPosition(punkt.x, punkt.y);
                terminal.putCharacter('o');
            }
        }
        terminal.flush();
    }
}
