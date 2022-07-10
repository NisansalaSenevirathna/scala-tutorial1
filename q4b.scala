object q4b extends App{
  
  def attendess(price:Int): Int = 120 +(15-price)/5*20;
  def revenue(price :Int):Int = attendess(price)*price;
  def cost(price:Int):Int = 500 + attendess(price);
  def profit(price:Int):Int= revenue(price) - cost(price);

  print(profit(15), profit(10), profit(20));
}