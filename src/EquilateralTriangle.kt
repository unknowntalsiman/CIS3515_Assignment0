class EquilateralTriangle(name: String) : Shape(name) {
    private var side: Double = 0.0

    fun setDimensions(side: Double) {
        this.side = side
    }

    override fun printDimensions() {
        println("Side: $side")
    }

    override fun getArea(): Double {
        return (Math.sqrt(3.0) / 4) * side * side
    }
}
