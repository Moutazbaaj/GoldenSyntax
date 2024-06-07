open class Endgegner(name: String, hp: Int) :
    Gegner(name, hp) {

    private var attackPowerIncrease: Int = 0


    // The curse of death attack
    private fun curseOfDeathAttack(): Int {
        val hero: Held = randomHero
        val damage: Int = (hero.maxHp * 0.1).toInt()
        while (hero.hp > hero.maxHp * 0.2) when (hero) {
            is Krieger, is Meerjungfrau, is Magier -> {
                println(
                    """
                    
                    ${underline}${yellow}$name${reset} curses 
                    '${underline}${blue}${hero.name}${reset}' 
                    ${red}10%${reset} of the HP will be taken in each time,
                    the curs Will be lifted when the HP of 
                    ${underline}${blue}${hero.name}${reset} is ${red}20%${reset} of the total HP 
                    
                """.trimIndent()
                )
                hero.hp -= damage
                println("${underline}${blue}${hero.name}${reset}, have ${red}${hero.hp}${reset} HP left.\n\n")
                Thread.sleep(1000)

                break
            }
        }
        return 0
    }

    // The army of death attack
    private fun armyOfDeathAttack(): Int {
        val damage = 20
        println(
            "\n${underline}${yellow}$name${reset} calls his army of death \n" +
                    "There raised from the ground Back to life again\n"
        )
        for (hero: Held in herosTeam) {
            println("\n${cyan}${underline}${hero.name}${reset} lost ${red}20${reset} HP\n")
            hero.receiveDamage(damage)
            Thread.sleep(1000)

        }
        return 0
    }

    // The electric shock attack
    private fun electricShock(): Int {
        val damage: Int = ((20..30).random())
        println("\n${underline}${yellow}$name${reset} attacks with a powerful electric shock, And He deal ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    // The gate of hell attack
    private fun gateOfHell(): Int {
        val damage: Int = ((10..40).random())
        println("\n${underline}${yellow}$name${reset} Got really angry so he decide to hit the ground with his rusty crutch..\n this opens a gate leading to hell, He deal ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    // The stone rain attack
    private fun stoneRain(): Int {
        val damage: Int = (5 + attackPowerIncrease)
        attackPowerIncrease += (5..10).random()
        println("\n${underline}${yellow}$name${reset} Return that attack back with Making the Sky Raining stones, He deal ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        attackPowerIncrease++
        return damage
    }

    // The Shadow Surge attack
    private fun shadowSurge(): Int {
        val damage: Int = ((10..35).random())
        println("\n${underline}${yellow}$name${reset} channels the forbidden energies of the shadows, unleashing a powerful 'Shadow Surge' " +
                "\nThis dark magic engulfs the battlefield, He deal ${red}$damage${reset} damage\n")
        Thread.sleep(1000)

        return damage
    }

    // Generates random attack from the final boss
    fun endgegnerRandomAttack(): Int {
        val actions = listOf(
            this::curseOfDeathAttack,
            this::armyOfDeathAttack,
            this::electricShock,
            this::gateOfHell,
            this::stoneRain,
            this::shadowSurge
        )
        val shuffledActions = actions.shuffled()
        return shuffledActions.random().invoke()
    }
}
