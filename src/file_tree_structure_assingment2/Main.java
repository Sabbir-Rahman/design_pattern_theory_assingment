package file_tree_structure_assingment2;

public class Main {


    public static void main(String[] args) {
	// write your code here
        File strategy = new File("Strategy Pattern", "ppt");
        File observer = new File("Observer Pattern",  "pdf");
        File midSyllabus = new File("Mid Syllabus", "doc");
        File Composite = new File("Composite Pattern", "ppt");
        File finalSyllabus = new File("Final Syllabus", "pdf");
        File assignment1 = new File("Assignment-1", "pdf");
        File assignment2 = new File("Assignment-2", "pdf");
        File readME = new File("readME", "text");
        Folder midExam = new Folder("Mid Exam", "Folder");
        Folder finalExam = new Folder("Final Exam", "Folder");
        Folder Lectures = new Folder("Lectures", "Folder");
        Folder assignments = new Folder("Assignments", "Folder");
        Folder DP= new Folder("Design Pattern", "Folder");

        midExam.add(strategy);
        midExam.add(observer);
        midExam.singleClick();

        midExam.doubleClick();

        midExam.add(midSyllabus);
        finalExam.add(Composite);
        Lectures.add(midExam);
        Lectures.add(finalExam);

        assignments.add(assignment1);
        assignments.add(assignment2);
        
        DP.add(Lectures);
        DP.add(readME);
        DP.add(assignments);

        DP.singleClick();
        DP.doubleClick();

        DP.remove(readME);
        DP.doubleClick();




    }
}
