class UniversityMember {
    public void attendLecture() {
        System.out.println("Attending Lecture");
    }
}
interface Researcher {
    void conductLabResearch();
}
class UndergraduateStudent extends UniversityMember {
}
class GraduateResearchAssistant extends UniversityMember implements Researcher {
    public void conductLabResearch(){
        System.out.println("Conducting Lab Research");
    }
}
class  Professor extends UniversityMember implements Reserach {
    public void conductLabResearch(){

System.out.println("Professor Research");
    }
}
public class Main5 {

    public static void main(String[] args) {

        UndergraduateStudent student = new UndergraduateStudent();
        student.attendLecture();

        Professor professor = new Professor();
        professor.attendLecture();
        professor.conductLabResearch();
    }
}


