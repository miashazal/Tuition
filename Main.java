import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Create a tuition center
        TuitionCenter center1 = new TuitionCenter(1, "KL Tuition Center", "Kuala Lumpur");
        
        // Create a headmaster for the tuition center
        HeadMaster headMaster1 = new HeadMaster(1, "Waini", center1);

        // Create a tutor for the tuition center
        Tutor tutor1 = new Tutor(1, "Damia", "0189230405", "Kuala Lumpur", "Bachelor's Degree", 3,
                new Date(), center1);
        
        // Add tutor to tuition center
        center1.getTutors().add(tutor1);
        
        // Create a student and assign them to a tutor in the tuition center
        Student student1 = new Student("Alia", "0193472038", "Kuala Lumpur", 2023, "SMK Wangsa Maju", List.of(80, 90, 95));
        tutor1.assignStudent(student1);
        
        // Get the average marks for the tuition center
        double avgMarks = center1.getAverageMarks();
        
        // Print the average marks
        System.out.println("Average marks for " + center1.getCenterName() + ": " + avgMarks);
    }

}
