import java.io.File;

public class CodingChallengeDrive {
    public static void main(String[] args) {
        System.out.print("Please enter the directory to explore: ");
        String dir = System.console().readLine();
        System.out.println("Select a method to walk through the folders:");
        System.out.println("1 - for DFS");
        System.out.println("2 - for BFS");
        System.out.print("Your choice: ");
        String algo = System.console().readLine();
        System.out.println("Select how you want to display the files:");
        System.out.println("1 - for only the name");
        System.out.println("2 - for name, size, and date of last modification");
        System.out.print("Your choice: ");
        String displayMethod = System.console().readLine();

        CodingChallenge codingChallenge = new CodingChallenge();
        codingChallenge.setOutputManager(new OutputConsole());

        if (algo.equals("1")) {
            codingChallenge.setDirExplorer(new DirExplorerDfs());
        } else {
            codingChallenge.setDirExplorer(new DirExplorerBfs());
        }
        if (displayMethod.equals("1")) {
            codingChallenge.setFileDisplayer(new FileDisplayerSimple());
        } else {
            codingChallenge.setFileDisplayer(new FileDisplayerComplete());
        }

        System.out.println("Processing " + dir + " :");
        codingChallenge.run(new File(dir));
    }
}
