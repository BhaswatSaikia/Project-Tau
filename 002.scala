object Eular2 extends App{

	def fib(cur_list:List[Int]):List[Int]={
		cur_list match{
			case h1::h2::t => if(h1+h2 > 4000000) h1::h2::t else fib(h1+h2::h1::h2::t)
			case _ => Nil
		}
	}
		
	println(fib(1::0::Nil).filter(_%2==0).sum)
}
