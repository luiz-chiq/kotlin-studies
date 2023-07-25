package Persistence

interface DAO<K, V> {
    fun createItem(item: V)
    fun updateItem(newItem: V, itemKey: K)
    fun getItem(itemKey: K): V?
    fun getAllItems(): List<V>
    fun deleteItem(itemKey: K)
}
