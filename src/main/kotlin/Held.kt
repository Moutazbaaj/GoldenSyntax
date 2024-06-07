open class Held(var name: String, var hp: Int, var maxHp: Int) {


    // function to subtract damage from all heroes together '' Endgegner:armyOfDeathAttack ''
    fun receiveDamage(damageAmount: Int) {
        hp -= damageAmount
    }
}



