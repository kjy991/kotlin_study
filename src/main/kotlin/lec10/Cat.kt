package lec10

class Cat(
    species: String
) : Animal(species, 4) {
    override fun move() {
        println("고양이가 움직인다냥")
    }
}