abstract class Shape(_name: String) : Dimensionable {
    var name: String = _name

    open fun getArea(): Double {
        return 0.0
    }
}
