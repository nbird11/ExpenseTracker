public class Program {

    public static void displayTitle() {
        System.out.println("");
        System.out.println("  ______                                  _______             _             ");
        System.out.println(" |  ____|                                |__   __|           | |            ");
        System.out.println(" | |__  __  ___ __   ___ _ __  ___  ___     | |_ __ __ _  ___| | _____ _ __ ");
        System.out.println(" |  __| \\ \\/ / '_ \\ / _ \\ '_ \\/ __|/ _ \\    | | '__/ _` |/ __| |/ / _ \\ '__|");
        System.out.println(" | |____ >  <| |_) |  __/ | | \\__ \\  __/    | | | | (_| | (__|   <  __/ |   ");
        System.out.println(" |______/_/\\_\\ .__/ \\___|_| |_|___/\\___|    |_|_|  \\__,_|\\___|_|\\_\\___|_|   ");
        System.out.println("             | |                                                            ");
        System.out.println("             |_|                                                            ");
    }

    public static int getAction() {
        System.out.println("\n");
        System.out.println("  1. Display all data");
        System.out.println("  2. Add expense record");
        System.out.println("  3. Add income record");
        System.out.println("  4. Get monthly insights");
        System.out.println("  5. Get monthly tithing");
        System.out.println("  0. Quit program");
        System.out.println("");
        System.out.print("> ");

        int choice = Integer.parseInt(System.console().readLine());
        return choice;
    }

    public static void main(String[] args) {
        CSVInteractor.InitFile();
        displayTitle();
        boolean quit = false;
        while (!quit) {
            switch (getAction()) {
                case 1:
                    CSVInteractor.DisplayData();
                    break;
                case 2:
                    CSVInteractor.AddExpense();
                    break;
                case 3:
                    CSVInteractor.AddIncome();
                    break;
                case 4:
                    CSVInteractor.GetInsights();
                    break;
                case 5:
                    CSVInteractor.GetTithing();
                    break;
                case 0:
                    quit = true;
                    break;
                default:
                    System.out.println("ERROR:  Invalid action");
            }
        }
    }
}
