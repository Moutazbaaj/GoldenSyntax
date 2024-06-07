class Meerjungfrau(name: String, hp: Int, maxHp: Int) : Held(name, hp, maxHp) {


    private var attackPowerIncrease: Int = 0

    //Scream Attack
    fun screamAttack(): Int {

        println("\n${underline}${blue}$name${reset} Screams really loud and make her enemy goose deaf, And She deal ${red}25${reset} damage\n")
        Thread.sleep(1000)

        return 25
    }

    //watter attack
    fun watterAttack(): Int {
        val damage: Int = ((20..30).random())
        println("\n${underline}${blue}$name${reset} attacks with a powerful water spell, And She deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    //Trident attack
    fun tridentAttack(): Int {
        val damage: Int = ((10..50).random())
        println("\n${underline}${blue}$name${reset} Uses her trident and stab the enemy with it , And She deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }


    //Stinky mud attack
    fun stinkyAttack(): Int {
        val damage : Int = (5 + attackPowerIncrease)
        attackPowerIncrease += (5..35).random()
        println("\n${underline}${blue}$name${reset} Launched a stinky attack using an old sticky mud , And She deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        attackPowerIncrease++
        return damage
    }


}