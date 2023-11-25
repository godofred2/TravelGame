package ui;
import model.Control;

import java.util.Scanner;

public class Main {
    private Control control;
    private Scanner sc;

    public Main() throws Exception {
        control = new Control();
        sc = new Scanner(System.in);
    }

    public static void main(String[] args) throws Exception {
        Main domi = new Main();
        System.out.println("IMPORTING THE DATA BASE");
        domi.importar();
        int option = -1;
        int graph = 0;
        do {
            option = domi.showMenu();
            domi.operation(option);
        } while (option != 0);
    }

    public int showMenu() {
        System.out.println("Menu: \n" +
                "(1) Exit \n" +
                "(2) show the faster routing to reach the destination. \n" +
                "(3) Check if it is possible to reach the destination from a point.");

        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }
    public int selecGraph(){
        System.out.println("Select the type of graph implementation for solve the problem: \n " +
                "(1) Adjacency list \n" +
                "(2) Adjacency matrix");

        int option = sc.nextInt();
        sc.nextLine();
        return option;
    }
    public void operation(int option) throws Exception {
        switch (option) {

            case 1:

                System.exit(0);
                break;
            case 2:
                int graph = selecGraph();
                System.out.println(control.travFromCali(graph));
                break;
            case 3:
                graph = selecGraph();
                System.out.println("Input the station from the red that you are located (KEY):");
                int point =  sc.nextInt();
                sc.nextLine();
                System.out.println(control.proveFinish(graph,point,47));
                break;
            default:
                System.out.println("Invalid input");

        }
    }

    public void importar() throws Exception{
        control.loadVertexDataBase();
        control.loadEdgeDataBase();
    }

}





