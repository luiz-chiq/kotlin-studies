class Person(val name: String) {

    private var nickname: String = ""

//    fun getNickname(): String {
//        return nickname
//    }
//    fun setNickname(value: String) {
//        nickname = value
//    }

    private val pets: MutableList<Pet> = mutableListOf()

    fun getPets(): MutableList<Pet>{
        return pets.toMutableList();
    }

    fun addPet(pet: Pet){
        pets.add(pet)
    }

    fun removePet(petName: String){
        pets.forEach { pet -> if(pet.name.equals(petName)) pets.remove(pet)}
    }

    fun printList() {
        for (pet : Pet in pets) {
            println(pet.toString())
        }
    }
}