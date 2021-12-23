fun main(args: Array<String>) {
    println("Hello World!")

    val tv = TV()
    val remote: Remote = TVRemote(tv)
    println("Volume : ${tv.volume}")
    remote.up()

    println("After increasingVolume : ${tv.volume}")

    remote.doubleUp()

    println("After increasingVolume : ${tv.volume}")

    val ma = Cellist("Derrick" , 1989)
}