package Persistence

import Pet

class PetDAO: DAO<Int, Pet> {

    private val items: MutableMap<Int, Pet> = mutableMapOf()

    override fun createItem(item: Pet) {
        items.put(item.getKey(), item)
    }

    override fun updateItem(newItem: Pet, itemKey: Int) {
        items.replace(itemKey, newItem)
    }

    override fun getItem(itemKey: Int): Pet? = items.get(itemKey)


    override fun getAllItems(): List<Pet> = items.values.toList()

    override fun deleteItem(itemKey: Int) {
        items.remove(itemKey)
    }
}