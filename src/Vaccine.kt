class Vaccine(val name: String, val totalDoses: Int) {

    val doses: MutableList<VaccineDose> = mutableListOf(VaccineDose(1, totalDoses))

    fun addDose(){
        if (totalDoses == doses.size)
            return println("Cannot add a dose, all doses have already been given.")
        doses.add(VaccineDose(doses.size + 1, totalDoses))
    }

    fun getLastDose(): VaccineDose {
        return doses.last()
    }

    override fun toString(): String {
        return "Vaccine(name='$name', ${getLastDose()})"
    }


}