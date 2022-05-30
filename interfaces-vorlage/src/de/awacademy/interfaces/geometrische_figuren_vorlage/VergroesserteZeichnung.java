package de.awacademy.interfaces.geometrische_figuren_vorlage;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

public class VergroesserteZeichnung {

    private Terminal terminal;

    public VergroesserteZeichnung(Terminal terminal) {
        this.terminal = terminal;
    }

    public void zeichneFiguren(Rechteck[] rechtecke) throws IOException {
        for (Rechteck einRechteck : rechtecke) {
            Punkt[] punkte = einRechteck.zeichne();

            for (Punkt punkt : punkte) {
                // Doppelte Größe zeichnen
                int x = punkt.x * 2;
                int y = punkt.y * 2;

                terminal.setCursorPosition(x, y);
                terminal.putCharacter('O');
                terminal.setCursorPosition(x + 1, y);
                terminal.putCharacter('O');
                terminal.setCursorPosition(x, y + 1);
                terminal.putCharacter('O');
                terminal.setCursorPosition(x + 1, y + 1);
                terminal.putCharacter('O');
            }
        }
        terminal.flush();

    }
}
