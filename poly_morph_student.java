package programs;

class poly_morph_student extends poly_morph_trainer
{
 public static void main(String args[])	
 {
	 poly_morph_student obj1=new poly_morph_student();
	                    obj1.enter(0);
	                    obj1.enter(0, 0);
	                    obj1.enter(null);	                
 }
 
 public void enter(int trainer_salary)
 {
  int student_fee=10000;
  System.out.println("Student's fee: "+student_fee);
 }
 
 
 public void enter(int trainer_present_days,int trainer_absent_days)
 {
 int student_present_days=50;
 int student_absent_days=10;
  System.out.println("No of days present:"+ student_present_days +" "+":" +"No of days absent:"+ student_absent_days);
 }
 
 
 public void enter(String trainer_average_of_present)
 {
  String student_average_of_present="83.33%";
  System.out.println("Average: "+student_average_of_present);
 }
} 



