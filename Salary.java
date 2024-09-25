class Employee {
    double basic,da,hra,ma;
    Employee(double basic){
        this.basic = basic;
        this.da = 0.7 * basic;
        this.hra = 0.5 * basic;
        this.ma = 1000;
    }
    double Regular_Salary(){
        return basic + da + hra + ma;
    }
}
class Scientist extends Employee{
    double bonus_per_publication;
    int no_of_production;
    Scientist(double basic, double bonus_per_publication,int no_of_production){
        super(basic);
        this.bonus_per_publication = bonus_per_publication;
        this.no_of_production = no_of_production;
    }
    double Net_Bonus(){
        return Regular_Salary() + (bonus_per_publication * no_of_production);
    }
}
class Developer extends Employee{
    double bonus_per_patent;
    int no_of_patents;
    Developer(double basic, double bonus_per_patent,int no_of_patents){
        super(basic);
        this.bonus_per_patent = bonus_per_patent;
        this.no_of_patents = no_of_patents;
    }
    double Net_Bonus(){
        return Regular_Salary() + (bonus_per_patent * no_of_patents);
    }
}
class Project_Leader extends Employee{
    double bonus_per_project;
    int no_of_successful_projects;
    Project_Leader(double basic, double bonus_per_project,int no_of_successful_projects){
        super(basic);
        this.bonus_per_project = bonus_per_project;
        this.no_of_successful_projects = no_of_successful_projects;
    }
    double Net_Bonus(){
        return Regular_Salary() + (bonus_per_project * no_of_successful_projects);
    }
}
public class Salary{
    public static void main(String[] str){
        Scientist sc = new Scientist(10000, 500, 10);
        Developer dv = new Developer(20000, 900, 8);
        Project_Leader pl = new Project_Leader(30000, 1000, 20);
        System.out.println("Salary of Scientist : " + sc.Net_Bonus());
        System.out.println("Salary of Developer : " + dv.Net_Bonus());
        System.out.println("Salary of Project_Leader : " + pl.Net_Bonus());
    }
}

