object q4a extends App{
  def  normal(hours:Int):Int =hours*250;
  def ot(hours:Int):Int =hours*85;
  def total_salary(h1:Int,h2:Int):Int =normal(h1) + ot(h2);
  def tax(total_salary:Int):Double =total_salary *12/100;
  def  take_home_salary(h1:Int,h2:Int):Double =total_salary(h1,h2) - tax(total_salary(h1,h2));

  printf("take home salary: Rs %.2f",take_home_salary(40,30));

}