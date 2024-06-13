import java.util.ArrayList;
import java.util.Comparator;

public class ProblemSolver {

    ArrayList<String> lines;
    ArrayList<Long> seeds;

    public ProblemSolver(ArrayList<String> lines) {
        this.lines = lines;
        NumberIdentificationFromLine numberIdentificationFromLine = new NumberIdentificationFromLine();
        this.seeds = numberIdentificationFromLine.setLineAndGetNumbers(lines.get(0));
    }

    public ArrayList<Long> findSeedsLocations() {
        ArrayList<Long> locations = new ArrayList<>();
        for (Long seed : seeds) {
            //System.out.println("-----new seed: " + seed + "-------");
            locations.add(findSeedCorrespondingLocation(seed));

        }
        return locations;
    }

    private Long findSeedCorrespondingLocation(Long seed){
        NumberIdentificationFromLine nifl = new NumberIdentificationFromLine();
        boolean gotDestination = false;

        Long location = seed;
        for (int i = 1; i < lines.size(); i++){
            String line = lines.get(i);
            ArrayList<Long> mapElementNumbers = nifl.setLineAndGetNumbers(line);
            if(mapElementNumbers.size() == 3){
                MapElement mapElement = new MapElement(
                        mapElementNumbers.get(0), mapElementNumbers.get(1), mapElementNumbers.get(2));
                if(mapElement.findDestination(location) != -1L && !gotDestination){
                    location = mapElement.findDestination(location);
                    gotDestination = true;
                }
            }
            else{
                gotDestination = false;
            }
            //System.out.println("location: " + location);
        }
        return location;
    }

    public long findTheMinimalLocation(){
        return findSeedsLocations().stream()
                .min(Comparator.naturalOrder())
                .get();
    }
}

