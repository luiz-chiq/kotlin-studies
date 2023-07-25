import java.time.LocalDate

abstract class Pet(val name:String, val raca: String): Item<Int> {

    private val vaccines: MutableList<Vaccine> = mutableListOf()

    fun addVaccine(vaccine: Vaccine) {
        vaccines.add(vaccine)
    }
    fun getVaccines() : List<Vaccine>{
     return vaccines.toList()
    }
    fun addDose(name: String, date: LocalDate) {
        val vaccineFound = vaccines.find { vaccine -> vaccine.getLastDose().date == date && vaccine.name == name}
        vaccineFound?.let {
            it.addDose()
        }
    }



    override fun getKey(): Int = this.hashCode()
    override fun toString(): String {
        return "Pet(name='$name', raca='$raca', vaccines=$vaccines)"
    }
}
