public class Study {
    private String course;
    private String information;


    public Study(String information) {
        this.information = information;
        this.course = information;
    }

    public String printCourse() {
        return this.course;
    }

}
