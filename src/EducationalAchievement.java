public class EducationalAchievement {

    private String degreeType;
    private String major;
    private String universityName;
    private int graduationYear;

    public EducationalAchievement(){

    }
    public EducationalAchievement(String degreeType, String major, String universityName, int graduationYear){
        this.degreeType=degreeType;
        this.major=major;
        this.universityName=universityName;
        this.graduationYear=graduationYear;
    }

    public String getDegreeType() {
        return degreeType;
    }

    public void setDegreeType(String degreeType) {
        this.degreeType = degreeType;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getGraduationYear() {
        return graduationYear;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    @Override
    public String toString() {
        return ( "Education \n" + degreeType + " in " + major +"," + "\n" + universityName + "," + graduationYear);

    }
}