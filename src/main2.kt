fun main(){

    val c=sum(10,20)

    //val d=difference(30,15)

    val e= division(20,2)

   // val pro=Product()

    //pro.product(10,13) **cant be accesed since protected

}

class Product{
    protected fun product(a:Int,b:Int)=a*b
}