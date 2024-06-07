class Helfer(name: String, hp: Int) : Gegner(name, hp) {

    private var attackPowerIncrease: Int = 0


    //the hellfire attack
    private fun hellfire(): Int {
        println("${yellow}${underline}\n$name${reset} Returning the attack by throwing a fir ball on , He deals ${red}25${reset} damage\n")
        Thread.sleep(1000)

        return 25
    }

    //the Wind of death attack
    private fun windOfDeath(): Int {
        val randomDame: Int = (15..30).random()
        println("\n${yellow}${underline}$name${reset} He waves his giant wings and attack back , He deals ${red}$randomDame${reset} damage\n")
        Thread.sleep(1000)

        return randomDame
    }

    //The Breath of fire Attack
    private fun breathOfFire(): Int {
        val damage: Int = (10..30).random()
        println("\n${yellow}${underline}$name${reset} gets frustrated and sad because his boss being defeated\n, he decide to burn everything around, deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    //the Devil's claw attack
    private fun devilsClaw(): Int {
        val damage = (10 + attackPowerIncrease)
        attackPowerIncrease += (1..5).random()
        println("\n${yellow}${underline}$name${reset} Launches his attack and made the sky Raining stones, He deals ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        attackPowerIncrease++
        return damage
    }

    fun helperRandomAttack(): Int {
        val actions = listOf(
            ::hellfire,
            ::windOfDeath,
            ::breathOfFire,
            ::devilsClaw,
        )
        val shuffledActions = actions.shuffled()
        return shuffledActions.first().invoke()
    }


}

