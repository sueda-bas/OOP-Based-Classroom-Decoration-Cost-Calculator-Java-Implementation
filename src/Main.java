import java.util.ArrayList;
import java.util.List;

/**
 * The Main class contains the main method to run the application. It constructs classrooms and decorations,
 * decorates classrooms, calculates costs, and writes the results to an output file.
 */
public class Main {

    /**
     * The main method of the application.
     *
     * @param args Command-line arguments containing input and output file paths
     */
    public static void main(String[] args) {
        Director director = new Director();
        List<Classroom> classrooms = new ArrayList<>();
        List<Decoration> decorations = new ArrayList<>();

        // Read item information from txt
        String [] itemFile = FileInput.readFile(args[0],true);
        for(String line : itemFile){
            String[] infos = line.split("\t");
            String itemType = infos[0];
            if(itemType.equals("CLASSROOM")){
                director.constructClassroom(classrooms, infos);
            }else{
                director.constructDecoration(decorations, infos);
            }
        }
        // Read decoration information from txt
        String[] decorationFile = FileInput.readFile(args[1],true);
        // Decorate classrooms, calculate costs, and write results to an output file
        int totalCost = 0;
        for (String line : decorationFile){
            String[] infos = line.split("\t");
            Classroom classroomToBeDecorate = null;
            Decoration wallDecoration = null;
            Decoration floorDecoration = null;
            int countOfTilesWall = 0;
            int countOfTilesFloor = 0;
            int wallArea = 0;
            String decorationType = null;
            boolean isTile = false;
            int cost1 = 0;
            int cost2 = 0;

            // Find the classroom to be decorated
            for (Classroom classroom : classrooms){
                if(classroom.getName().equals(infos[0])){
                    classroomToBeDecorate = classroom;
                }
            }

            // Find decorations for walls and floors
            for (Decoration decoration : decorations){
                if(decoration.getName().equals(infos[1])){
                    wallDecoration = decoration;
                    decorationType = wallDecoration.getType();
                    if(wallDecoration.getType().equals("Tile")){
                        isTile = true;
                        countOfTilesWall = wallDecoration.calculateCountOfTilesOnWall(classroomToBeDecorate);
                    }else{
                        wallArea = (int) Math.ceil(classroomToBeDecorate.calculateWallArea(classroomToBeDecorate.getWidth(),classroomToBeDecorate.getLength(),classroomToBeDecorate.getHeight()));
                    }
                    cost1 = wallDecoration.calculateCostOfWall(classroomToBeDecorate);
                }if(decoration.getName().equals(infos[2])){
                    floorDecoration = decoration;
                    countOfTilesFloor = floorDecoration.calculateCountOfTilesOnFloor(classroomToBeDecorate);
                    cost2 = floorDecoration.calculateCostOfFloor(classroomToBeDecorate);
                }
            }
                    // Calculate decoration cost and write to file
                    int decorationCost = cost1 + cost2;
                    totalCost += decorationCost;
                    if(isTile){
                        FileOutput.writeToFile(args[2],"Classroom " + classroomToBeDecorate.getName()
                                + " used " + countOfTilesWall + " Tiles for walls and used " + countOfTilesFloor
                                + " Tiles for flooring, these costed " + decorationCost + "TL.",true,true);
                    }else{
                        FileOutput.writeToFile(args[2],"Classroom " + classroomToBeDecorate.getName()
                                + " used " + wallArea + "m2 of " + decorationType + " for walls and used "
                                + countOfTilesFloor + " Tiles for flooring, these costed " + decorationCost + "TL.",true,true);
                    }

        }
        // Write total price to file
        FileOutput.writeToFile(args[2],"Total price is: " + totalCost + "TL." ,true,false);
        }
    }
