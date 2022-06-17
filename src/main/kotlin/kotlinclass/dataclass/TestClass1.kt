package kotlinclass.dataclass

data class TestClass1 (var a1:Int, var a2:Int){
    var a3 = 0
    init {
        println("init")
    }

    constructor(a1:Int,a2:Int,a3:Int) : this(a1,a2){
        this.a3 = a3
    }

    fun testMethod(){
        println("test Method")
    }
}