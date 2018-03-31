package basicExamples

object LOOP extends App {
  var i = 0

  val stuff = for {i <- 1 to 10
                   if i % 3 == 0 || i % 5 == 0
                   sqr = i * i
                   j <- 'a' to 'c'} yield {
    i -> j
    // println(i+""+j)
  }
  println(stuff)

  /* for(i<-1 to 10;if i%3==0 || i%5==0;sqr=i*i;j<-'a' to 'c'){
     println(i+ " "+ j)
   }*/

}
