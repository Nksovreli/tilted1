fun main(){

    val p: Point = Point()
    val p_2: Point = Point()
    p.x = 1
    p.y = -15
    p_2.x = 5
    p_2.y = 15
    println(p.toString(p.x,p.y))
    println(p.equal(p.x,p_2.x))
    println(p.equal(p.y,p_2.y))
    println(p.move(p.x,p.y))


}
class Point {
    var x: Int = 0
    var y: Int = 0
    fun toString(abcista:Int,oordinatta:Int): String{
        val result = "$abcista:$oordinatta"
        return result
    }
    fun equal(x:Int,y:Int): Boolean {
        if (x == y){
            return true

        } else {
            return false
        }


    }
    fun move(abcista:Int,oordinatta:Int):String{

        if(oordinatta<0 || oordinatta == 0){
            var oordinatta_1 = oordinatta - oordinatta - oordinatta
            return "x gerdzis mimart simetriulia am wertilshi $abcista: $oordinatta_1"

        }else  {
            return "x gerdzis mimart simetriulia am wertilshi $abcista: -$oordinatta"
        }




    }
}