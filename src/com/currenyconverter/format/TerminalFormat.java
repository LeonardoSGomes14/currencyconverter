package com.currenyconverter.format;

public class TerminalFormat {

        public static void TerminalForm() {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        public static void center(String txt) {
            int terminalWidth = 80;
            int bSpace = (terminalWidth - txt.length()) / 2;
            String space = " ".repeat(bSpace);
            System.out.println(space + txt);
        }
    }

