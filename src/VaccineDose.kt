import java.time.LocalDate

class VaccineDose(val dose: Int, val totalDoses: Int) {
    var date = LocalDate.now()

    override fun toString(): String {
        return "dose=$dose/$totalDoses, date=$date"
    }


}