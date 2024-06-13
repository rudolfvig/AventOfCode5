import java.util.ArrayList;



public class Main {
    public static void main(String[] args) {
        NumberIdentificationFromLine nifl = new NumberIdentificationFromLine();
        //System.out.println(nifl.setLineAndGetNumbers("10 3322 666666655 jklfdj dfkdljfd54 fjdlkfj433"));
        MyFileScanner fileSc = new MyFileScanner("AdventOfCode5input.txt");
        ArrayList<String> lines =  fileSc.getLines();
        for (String line : lines){
            System.out.println(line);
        }


    }
}