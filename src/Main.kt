import Persistence.PetDAO
import java.time.LocalDate

fun main() {
    val luiz = Person("luiz")
    val laura = Person("laura")

//    println(laura.getNickname())
//    laura.setNickname("laulis")
//    println(laura.getNickname())


    val vac1 = Vaccine("raiva", 2)
//    vac1.addDose()
//    println(vac1)
    val vac2 = Vaccine("raiva2", 2)
//    println(vac2)

    val petDAO = PetDAO()


    val gato1 = Cat("bixano", "laranja")
    val thor = Dog("thor", "cheetos")
    val apollo = Dog("apollo", "cheetos")
    val pingo = Dog("pingo", "salsicha")


    petDAO.createItem(gato1)
    petDAO.createItem(thor)
    petDAO.createItem(apollo)
    petDAO.createItem(pingo)

    println(petDAO.getAllItems())


//
//    thor.addVaccine(vac1)
//    println("vacinas antes")
//    println(thor.getVaccines())
//    thor.addDose("raiva",LocalDate.of(2023, 7, 22))
//    println("vacinas dps")
//    println(thor.getVaccines())
////
//    luiz.addPet(thor)
//    luiz.addPet(apollo)
//    laura.addPet(gato1)
//    laura.addPet(pingo)
//    luiz.addPet(pingo)
//    println(luiz.getPets())
//    luiz.removePet("pingo")
//    println(luiz.getPets())
//    println(laura.getPets())
}
