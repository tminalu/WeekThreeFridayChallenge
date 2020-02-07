public class Skills {

    private String skillName;
    private String proficiency;

    public Skills(){

    }
    public Skills(String skillsName, String proficiency){
        this.skillName=skillsName;
        this.proficiency=proficiency;

    }


    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }

    @Override
    public String toString() {
        return "Skills \n" + skillName + "," + proficiency;
    }

}
