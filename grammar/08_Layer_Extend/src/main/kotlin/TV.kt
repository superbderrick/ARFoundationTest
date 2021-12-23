class TV  {
    var volume = 0

}

class TVRemote(val tv: TV) : Remote {

    override fun up() {
        tv.volume++
    }

    override fun down() {
        tv.volume--
    }

    override fun doubleUp() {
        tv.volume += 2
    }
}