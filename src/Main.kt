fun main() {
    val shapes = mutableListOf<Shape>()
    
    val square = Square("Square")
    val circle = Circle("Circle")
    val triangle = Triangle("Triangle")
    val equilateralTriangle = EquilateralTriangle("Equilateral Triangle")

    // Prompt for dimensions
    println("Enter dimensions for the square (length and height):")
    val squareLength = readLine()!!.toDouble()
    val squareHeight = readLine()!!.toDouble()
    square.setDimensions(squareLength, squareHeight)

    println("Enter the radius of the circle:")
    val circleRadius = readLine()!!.toDouble()
    circle.setDimensions(circleRadius)

    println("Enter dimensions for the triangle (three sides):")
    val a = readLine()!!.toDouble()
    val b = readLine()!!.toDouble()
    val c = readLine()!!.toDouble()
    triangle.setDimensions(a, b, c)

    println("Enter the side of the equilateral triangle:")
    val side = readLine()!!.toDouble()
    equilateralTriangle.setDimensions(side)

    // Add shapes to list
    shapes.add(square)
    shapes.add(circle)
    shapes.add(triangle)
    shapes.add(equilateralTriangle)

    // Print results
    println("\nShape Details:")
    shapes.forEach {
        println("Name: ${it.name}")
        it.printDimensions()
        println("Area: ${it.getArea()}\n")
    }
}
