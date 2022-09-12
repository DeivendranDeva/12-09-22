package programs;

class poly_morph_trainer
{
  public void enter(int trainer_salary)
  {
   trainer_salary=20000;
   System.out.println("Trainer's salary: "+trainer_salary);
  }
  
  
  public void enter(int trainer_present_days,int trainer_absent_days)
  {
   trainer_present_days=56;
   trainer_absent_days=4;
   System.out.println("No of days present:"+trainer_present_days +" "+":" +"No of days absent:"+trainer_absent_days);
  }
  
  
  public void enter(String trainer_average_of_present)
  {
	  trainer_average_of_present="93.33%";
   System.out.println("Average: "+trainer_average_of_present);
  }
}



