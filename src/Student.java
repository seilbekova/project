public class Student {
  private String name;
  private String id;
  private String major;
  private double gpa;
  private int credits;
   public Student(String name, String id,String major){

   this.name=name;
   this.id=id;
   this.major=major;
   this.gpa=0.0;
   this.credits=0;
   }
   public String getName(){
      return name;
   }
   public void setName(String name){
     this.name=name;
   }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getMajor() {
    return major;
  }

  public void setMajor(String major) {
    this.major = major;
  }

  public double getGpa() {
    return gpa;
  }

  public void setGpa(double gpa) {
    this.gpa = gpa;
  }

  public int getCredits() {
    return credits;
  }

  public void setCredits(int credits) {
    this.credits = credits;
  }
  public void updateGPA(double newGPA){
     if (newGPA>=0.0 && newGPA <=4.0){
       this.gpa=newGPA;
     }
  }
  public  void addCredits(int c){
     if (c>0){
       this.credits+=c ;
     }
  }
  public boolean isHonors(){
       return this.gpa>=3.5;
  }

    public String toString() {
        return String.format("Student[ID: %s, Name: %s, Major: %s, GPA: %.2f, Credits: %d, Honors: %s]",
                id, name, major, gpa, credits, isHonors() ? "Yes" : "No");
    }
}