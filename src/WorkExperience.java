import java.util.ArrayList;

public class WorkExperience {

    private String company;
    private String jobTitle;
    private ArrayList<String> jobDescription;
    private String startDate;
    private String endDate;

    public WorkExperience() {

    }

    public WorkExperience(String company, String jobTitle, ArrayList<String> jobdescription, String startDate, String endDate) {
        this.company = company;
        this.jobTitle = jobTitle;
        this.jobDescription = jobdescription;
        this.startDate = startDate;
        this.endDate = endDate;

    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public ArrayList<String> getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(ArrayList<String> jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {

        return ("Experience \n" + jobTitle + "\n" + company + ", " + startDate + " - " + endDate + "\n");
    }
}