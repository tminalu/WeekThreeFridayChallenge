import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {


        EducationalAchievement eduAch = new EducationalAchievement("BS", "Psychology", "University of Maryland", 2002);
        ArrayList<EducationalAchievement> eduAchList = new ArrayList<>();
        eduAchList.add(eduAch);
        ArrayList<String> jobDes = new ArrayList<>();
        jobDes.add("Duty 1");
        jobDes.add("Lorem ipsum");
        WorkExperience workExp = new WorkExperience("MC", "Business Analyst", jobDes, "Aug 05", "May 14");
        ArrayList<WorkExperience> workExpList = new ArrayList<>();
        workExpList.add(workExp);
        Skills skill1 = new Skills("Java", "Advanced");
        Skills skill2 = new Skills("PHP", "Intermediate");
        Skills skill3 = new Skills("Ruby on Rails", "Novice");
        Skills skill4 = new Skills("Perl", "Fundamental");
        ArrayList<Skills> skillList = new ArrayList<>();
        skillList.add(skill1);
        skillList.add(skill2);
        skillList.add(skill3);
        skillList.add(skill4);
        Resume resume = new Resume("John J Jingleheimer-Schmidt", "jjjschmidt@gmail.com", eduAchList, workExpList, skillList);
        System.out.println(resume.printReusme());
        // we can also let the user enter their resume info
        Scanner keyboard= new Scanner(System.in);
        String answer="";
        do {

            System.out.println("Enter your  name");
            String name=keyboard.nextLine();
            System.out.println("Enter your  email adress");
            String email=keyboard.nextLine();
            System.out.println("Enter your  degreeType");
            String degreeType=keyboard.nextLine();
            System.out.println("Enter your  major");
            String major=keyboard.nextLine();
            System.out.println("Enter your  university name");
            String universityName=keyboard.nextLine();
            System.out.println("Enter your  graduation Year ");
            int graduationYear=keyboard.nextInt();
            System.out.println("Enter your  company ");
            String company=keyboard.nextLine();
            System.out.println("Enter your  jobTitle ");
            String jobTitle=keyboard.nextLine();
            System.out.println("Enter your  startDate ");
            int startDate=keyboard.nextInt();
            System.out.println("Enter your  endDate ");
            int endDate=keyboard.nextInt();
            System.out.println("Enter your  skillName ");
            String skillName=keyboard.nextLine();
            System.out.println("Enter your  proficiency ");
            String proficiency=keyboard.nextLine();
            System.out.println("Do you want to continue (Yes/No)");
            String answer1=keyboard.nextLine();



        } while(!answer.equalsIgnoreCase("No"));


    }
}