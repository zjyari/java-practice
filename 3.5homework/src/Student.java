public class Student {
    private String studentID;
    private String studentName;
    private String[] extraActivities;

    public Student(String studentID, String studentName, int numberOfActivities) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.extraActivities = new String[numberOfActivities];
    }

    public void addExtraActivity(int index, String activity) {
        if (index >= 0 && index < extraActivities.length) {
            extraActivities[index] = activity;
        } else {
            System.out.println("Index out of bounds. Activity not added.");
        }
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String[] getExtraActivities() {
        return extraActivities;
    }

    public void setExtraActivities(String[] extraActivities) {
        this.extraActivities = extraActivities;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student ID: ").append(studentID).append("\n");
        sb.append("Student Name: ").append(studentName).append("\n");
        sb.append("Extra Activities: ");
        for (String activity : extraActivities) {
            sb.append(activity).append(", ");
        }
        if (extraActivities.length > 0) {
            sb.delete(sb.length() - 2, sb.length()); 
        }
        return sb.toString();
    }
}