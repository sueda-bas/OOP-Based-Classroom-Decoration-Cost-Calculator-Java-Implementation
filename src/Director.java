import java.util.ArrayList;
import java.util.List;
/**
 * The Director class is responsible for constructing instances of Classroom and Decoration objects
 * based on the provided information.
 */
public class Director {
    /**
     * Constructs a classroom object and adds it to the list of classrooms.
     *
     * @param classrooms     The list of classrooms to add the constructed classroom object
     * @param classroomInfos Array containing information about the classroom
     */
    public void constructClassroom(List<Classroom> classrooms, String[] classroomInfos){
        String name = classroomInfos[1];
        String shape = classroomInfos[2];
        String width = classroomInfos[3];
        String length = classroomInfos[4];
        String height = classroomInfos[5];
        Classroom classroom = new ClassroomBuilder(shape)
                .setName(name)
                .setWidth(Double.parseDouble(width))
                .setLength(Double.parseDouble(length))
                .setHeight(Double.parseDouble(height))
                .build();
        classrooms.add(classroom);
    }
    /**
     * Constructs a decoration object and adds it to the list of decorations.
     *
     * @param decorations    The list of decorations to add the constructed decoration object
     * @param decorationInfos Array containing information about the decoration
     */
    public void constructDecoration(List<Decoration> decorations, String[] decorationInfos){
        String name = decorationInfos[1];
        String type = decorationInfos[2];
        String price = decorationInfos[3];
        String area = "";
        if(decorationInfos.length == 5){
            area = decorationInfos[4];
        }
        if(type.equals("Tile")){
            Decoration decoration = new DecorationBuilder()
                    .setName(name)
                    .setType(type)
                    .setPrice(Float.parseFloat(price))
                    .setArea(Float.parseFloat(area))
                    .build();
            decorations.add(decoration);
        }else{
            Decoration decoration = new DecorationBuilder()
                    .setName(name)
                    .setType(type)
                    .setPrice(Float.parseFloat(price))
                    .build();
            decorations.add(decoration);
        }

    }
}
