object question2 {

  def main(args:Array[String]){
    var first = profit(15);
    println("If ticket is 15 then profit is " + first);
    var second = profit(20);
    println("If ticket is 20 then profit is " + second);
    var third = profit(10);
    println("If ticket is 10 then profit is " + third);
  }
  
  def attendants(price:Int):Int={
    120+(15-price)/5*20;
  }
  
  def revenue(price:Int):Int={
    attendants(price)*price;
  }
  
  def cost(price:Int):Int={
    500+attendants(price)*3;
  }
  
  def profit(price:Int):Int={
    revenue(price)-cost(price)
  }
}