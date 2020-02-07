import java.util.ArrayList;
public class Resume {
    private String name;
    private String emailAddress;
    private ArrayList<EducationalAchievement> educationalAchievements;
    private ArrayList<WorkExperience> workExperience;
    private ArrayList<Skills> skills;



    public Resume() {

    }
    public Resume(String name, String emailAddress, ArrayList<EducationalAchievement> educationalAchievement, ArrayList<WorkExperience> workExperiance, ArrayList<Skills> skills) {
        this.name = name;
        this.emailAddress = emailAddress;
        this.educationalAchievements = educationalAchievement;
        this.workExperience = workExperiance;
        this.skills = skills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public ArrayList<EducationalAchievement> getEducationalAchievements() {
        return educationalAchievements;
    }

    public void setEducationalAchievements(ArrayList<EducationalAchievement> educationalAchievements) {
        this.educationalAchievements = educationalAchievements;
    }

    public ArrayList<WorkExperience> getWorkExperience() {
        return workExperience;
    }

    public void setWorkExperience(ArrayList<WorkExperience> workExperience) {
        this.workExperience = workExperience;
    }

    public ArrayList<Skills> getSkills() {
        return skills;
    }

    public void setSkills(ArrayList<Skills> skills) {
        this.skills = skills;
    }

    public String printReusme(){
        return "============================================================= \n" +
                name + "\n" + emailAddress + "\n\n" +
                educationalAchievements + "\n\n" +
                workExperience + "\n\n" +
                skills;

    }
}