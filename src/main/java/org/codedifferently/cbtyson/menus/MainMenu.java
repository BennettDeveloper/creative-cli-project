package org.codedifferently.cbtyson.menus;

import org.codedifferently.cbtyson.helpers.InputHandler;

public class MainMenu {

    public void promptMainMenu() {
        //Group-Differently
        //Structured Group Maker

        boolean inMainMenu = true;
        while(inMainMenu) {
            System.out.println("=============================================================");
            System.out.println();
            System.out.println("Welcome to Group Differently!");
            System.out.println("Please take a moment to assign a new group, or add new students!");
            System.out.println();
            System.out.println("=============================================================");

            System.out.println("1. Add new Student");
            System.out.println("2. Generate Group");
            System.out.println("3. View Students/Groups");
            System.out.println("4. Remove Students from Group");
            System.out.println("5. Exit");

            int inputCode = InputHandler.handleIntegerInput();

            switch(inputCode) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("Have a Nice Day!");
                    inMainMenu = false;
                    break;
            }
        }




    }
}
