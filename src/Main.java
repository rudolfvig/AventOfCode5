import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {

        NumberIdentificationFromLine numberIdentificationFromLine = new NumberIdentificationFromLine();

        MyFileScanner fileSc = new MyFileScanner("AdventOfCode5input.txt");
        ProblemSolver problemSolver = new ProblemSolver(fileSc.getLines());
        System.out.println(problemSolver.findTheMinimalLocation());
        //ArrayList<String> lines =  fileSc.getLines();
        //ArrayList<Long> seeds = numberIdentificationFromLine.setLineAndGetNumbers(lines.get(0));



    }
}