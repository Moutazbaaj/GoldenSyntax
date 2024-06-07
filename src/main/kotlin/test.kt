















/*


----------------------------------


 */
/*

/*



/*


    fun randomAttack(): Int {
        val actions = listOf(
            ::curseOfDeathAttack,
            ::armyOfDeathAttack,
            ::electricShock,
            ::gateOfHell,
            ::stoneRain,
        )
        val shuffledActions = actions.shuffled()
        val damage: Int = shuffledActions.first().invoke()
        return damage
    }



fun randomAttack(): Int {
        val actions = listOf(
            ::curseOfDeathAttack,
            ::armyOfDeathAttack,
            ::electricShock,
            ::gateOfHell,
            ::stoneRain,
            {
                helferRandomAttack()
            }
        )
        val shuffledActions = actions.shuffled()
        val damage: Int = shuffledActions.first().invoke()
        return damage

    }



    //sum the Dragon
    fun sumTheDragon(): Helfer? {
        println("$name summons a helper")
        return if (!sum) {
            sum = true
            Helfer()
        } else {
            null
        }
    }


 */

/*
fun fightLogic() {
    // Final Boss calls its helper to attack
    when {
        herosTeam.any { it.hp > 1 } -> {
            when {
                finalBoss.hp < 250 && helper.hp > 1 -> {

                    println(
                        """
                |
                |${finalBoss.name}
                |*
                |lost half of his HP and summoned
                |
                | ${helper.name}
                |
                |To fight instead of him
                |
            """.trimMargin()
                    )
                    Thread.sleep(1000)

                    if (fighter.hp > 0) {
                        printInfoHero(fighter)
                        printInfoEnemy(helper)
                        println("---------------------------")
                        Thread.sleep(1000)
                        performHeroAttack(fighter, helper)
                        Thread.sleep(1000)
                        printInfoEnemy(helper)
                        Thread.sleep(1000)
                        if (helper.hp > 1) {
                            performEnemyAttack(helper, fighter)
                            Thread.sleep(1000)
                            printInfoHero(fighter)
                            Thread.sleep(3000)

                        } else if (helper.hp < 1) {
                            println("${helper.name} is dead")
                        }
                        printSeparatorLines()
                        Thread.sleep(5000)
                    }

                    if (mermaid.hp > 0) {
                        printInfoHero(mermaid)
                        printInfoEnemy(helper)
                        println("---------------------------")
                        Thread.sleep(1000)
                        performHeroAttack(mermaid, helper)
                        Thread.sleep(1000)
                        printInfoEnemy(helper)
                        Thread.sleep(1000)
                        if (helper.hp > 1) {
                            performEnemyAttack(helper, mermaid)
                            Thread.sleep(3000)
                            printInfoHero(mermaid)

                        } else if (helper.hp < 1) {
                            println("${helper.name} is dead")
                        }
                        printSeparatorLines()
                        Thread.sleep(5000)
                    }

                    if (magician.hp > 0) {
                        printInfoHero(magician)
                        printInfoEnemy(helper)
                        println("---------------------------")
                        Thread.sleep(1000)
                        performHeroAttack(magician, helper)
                        Thread.sleep(1000)
                        printInfoEnemy(helper)
                        Thread.sleep(1000)
                        if (helper.hp > 1) {
                            performEnemyAttack(helper, magician)
                            Thread.sleep(3000)
                            printInfoHero(magician)

                        } else if (helper.hp < 1) {
                            println("${helper.name} is dead")
                        }

                        printSeparatorLines()
                        Thread.sleep(5000)
                    }
                }

                finalBoss.hp > 1 -> {

                    if (fighter.hp > 0) {
                        printInfoHero(fighter)
                        printInfoEnemy(finalBoss)
                        println("---------------------------")
                        Thread.sleep(1000)
                        performHeroAttack(fighter, finalBoss)
                        Thread.sleep(1000)
                        printInfoEnemy(finalBoss)
                        Thread.sleep(1000)
                        if (finalBoss.hp > 1) {
                            performEnemyAttack(finalBoss, fighter)
                            Thread.sleep(3000)
                            printInfoHero(fighter)

                        } else if (finalBoss.hp < 1) {
                            println("${finalBoss.name} is dead")
                        }
                        printSeparatorLines()
                        Thread.sleep(5000)
                    }

                    if (mermaid.hp > 0) {
                        printInfoHero(mermaid)
                        printInfoEnemy(finalBoss)
                        println("---------------------------")
                        Thread.sleep(1000)
                        performHeroAttack(mermaid, finalBoss)
                        Thread.sleep(1000)
                        printInfoEnemy(finalBoss)
                        Thread.sleep(1000)
                        if (finalBoss.hp > 1) {
                            performEnemyAttack(finalBoss, mermaid)
                            Thread.sleep(3000)
                            printInfoHero(mermaid)

                        } else if (finalBoss.hp < 1) {
                            println("${finalBoss.name} is dead")
                        }
                        printSeparatorLines()
                        Thread.sleep(7000)
                    }

                    if (magician.hp > 0) {
                        printInfoHero(magician)
                        printInfoEnemy(finalBoss)
                        println("---------------------------")
                        Thread.sleep(1000)
                        performHeroAttack(magician, finalBoss)
                        Thread.sleep(1000)
                        printInfoEnemy(finalBoss)
                        Thread.sleep(1000)
                        if (finalBoss.hp > 1) {
                            performEnemyAttack(finalBoss, magician)
                            Thread.sleep(3000)
                            printInfoHero(magician)

                        } else if (finalBoss.hp < 1) {
                            println("${finalBoss.name} is dead")
                        }
                        printSeparatorLines()
                        Thread.sleep(5000)
                    }
                }

            }
        }
        else -> gameSummaryLose()
    }
}

 */

/*
var finalBossCallsHelper = false

fun main() {
    welcome(fighter, mermaid, magician)

    var round: Int = 1
    var currentHeroIndex = 0

    while (herosTeam.any { it.hp > 0 } && finalBoss.hp > 0) {
        println("\nRound $round\n")

        // Heroes' Turn
        println("Heroes' Turn:")
        val currentHero = herosTeam[currentHeroIndex]

        if (currentHero.hp > 0) {
            printInfoHero(currentHero)

            // Check if the enemy is the final boss or helper
            val enemy = if (finalBossCallsHelper && helper.hp > 0) helper else finalBoss

            val damage = performHeroAttack(currentHero, enemy)
            println("${currentHero.name} dealt $damage damage to ${getEnemyName()}.")

            // Display the remaining health of the final boss or helper
            if (!finalBossCallsHelper) {
                println("${finalBoss.name}'s remaining HP: ${finalBoss.hp}")
            } else {
                println("${helper.name}'s remaining HP: ${helper.hp}")
            }

            // Update enemy HP only if the enemy is the final boss
            if (!finalBossCallsHelper) {
                updateEnemyHP(damage,true)
                printEnemyHP(enemyTeam)
            }

            // Check if the final boss's HP is 50% or below
            if (finalBoss.hp <= finalBoss.maxHp * 0.5 && !finalBossCallsHelper) {
                finalBossCallsHelper = true
                println("${finalBoss.name} is calling for help!")
            }
        }

        Thread.sleep(500)

        // Check if enemies are defeated
        if (enemyTeam.all { it.hp <= 0 }) {
            println("Congratulations! Heroes defeated all enemies.")
            break
        }

        infoAfterRound(fighter, mermaid, magician)

        // Enemies' Turn
        println("\nEnemies' Turn:")
        for (enemy in enemyTeam) {
            // Skip the attack if the hero is defeated
            if (currentHero.hp <= 0) continue
            //performerAttack(enemy)
        }

        Thread.sleep(500)

        // Check if heroes are defeated
        if (herosTeam.all { it.hp <= 0 }) {
            println("Game over! All heroes are defeated.")
            break
        }

        // Helper's Turn
        if (finalBossCallsHelper && helper.hp > 0) {
            println("\nHelper's Turn:")
            //performerAttack(helper)
            Thread.sleep(500)

            // Check if the helper is defeated
            if (helper.hp <= 0) {
                println("${helper.name} is defeated!")
                finalBossCallsHelper = false
            }
        }

        // Move to the next hero in the next round
        currentHeroIndex = (currentHeroIndex + 1) % herosTeam.size

        round++
    }
}






fun getEnemyName(): String {
    return if (finalBoss.hp <= finalBoss.maxHp * 0.5) helper.name else finalBoss.name
}



fun updateEnemyHP(damage: Int, isFinalBoss: Boolean) {
    if (isFinalBoss) {
        finalBoss.hp = maxOf(0, finalBoss.hp - damage)
    } else {
        helper.hp = maxOf(0, helper.hp - damage)
    }
}
import kotlin.random.Random

fun main() {
    welcome(fighter, mermaid, magician)

    var round: Int = 1


    while (herosTeam.any { it.hp > 0 } && finalBoss.hp > 0) {
        println("\nHeroes' Turn:")
        println("\nRound '$round'\n")

        val helferAlive: Boolean = helper.hp >= 0
        val endgegnerAlive: Boolean = finalBoss.hp >= 0

        if (helper.hp > 0) {
            for (hero: Held in herosTeam) {
                if (hero.hp <= 0)
                    continue
                if (helferAlive) {
                    printInfoHero(hero)

                    val damage: Int = if (endgegnerAlive && finalBoss.hp <= finalBoss.maxHp * 0.5) {
                        performHeroAttack(hero, helper)
                    } else {
                        performHeroAttack(hero, finalBoss)
                    }

                    println("${hero.name} dealt $damage damage ")

                    finalBoss.hp = maxOf(0, finalBoss.hp - damage)
                    println()
                    printEnemyHP(enemyTeam)
                    println()
                }
            }

            Thread.sleep(500)
        }

        if (enemyTeam.all { it.hp <= 0 }) {
            println("Congratulations! Heroes defeated all enemies.")
            break
        }

        infoAfterRound(fighter, mermaid, magician)

        println("Enemies' Turn:")

        for (enemy: Gegner in enemyTeam) {

            if (helper.hp > 0) {
                if (endgegnerAlive && finalBoss.hp <= finalBoss.maxHp * 0.5) {
                    if (enemy is Endgegner) {
                        val randomHero: Held = herosTeam.filter { it.hp > 0 }.random()
                        val damage: Int = helper.helperRandomAttack()
                        println("${enemy.name} dealt $damage damage to ${randomHero.name} using the ${helper.name}.")
                        randomHero.hp -= damage
                    }
                } else {
                    val randomHero = herosTeam.filter { it.hp > 0 }.random()
                    val damage: Int = when (enemy) {
                        is Endgegner -> enemy.endgegnerRandomAttack()
                        else -> 0
                    }
                    println("${enemy.name} dealt $damage damage to ${randomHero.name}")
                    randomHero.hp -= damage
                }

                Thread.sleep(500)
            } else {

                if (endgegnerAlive && finalBoss.hp <= finalBoss.maxHp * 0.5) {
                    if (enemy is Endgegner) {
                        val randomHero: Held = herosTeam.filter { it.hp > 0 }.random()
                        val damage: Int = enemy.endgegnerRandomAttack()
                        println("${enemy.name} dealt $damage damage to ${randomHero.name}.")
                        randomHero.hp -= damage
                    }
                }

                Thread.sleep(500)
            }
        }

        if (herosTeam.all { it.hp <= 0 }) {
            println("Game over! All heroes are defeated.")
            printInfoHero(fighter)
            printInfoHero(mermaid)
            printInfoHero(magician)
            printInfoEnemy(finalBoss)
            printInfoEnemy(helper)
            break
        }

        round++
    }
}

 */



 */

/*

fun main() {

    infoAfterRound(fighter, magician, mermaid)


    println("\nThe Heros team starts the fight...\n")

    for (hero: Held in herosTeam) {
        val damage: Int = when (hero) {
            is Krieger -> hero.uppercutAttack()
            is Magier -> hero.magicBallAttack()
            is Meerjungfrau -> hero.screamAttack()
            else -> 0
        }

        println("Damage caused: $damage\n")
    }


    bag.printBagItems()


    println("${randomHero.name}: opened the bag")
    bag.use(randomHero)
    printInfoHero(randomHero)

    bag.printBagItems()


    printInfoHero(fighter)
    printInfoHero(magician)
    printInfoHero(mermaid)

    for (enemy: Gegner in enemyTeam) {
        val damage: Any = when (enemy) {
            is Endgegner -> enemy.endgegnerRandomAttack()
            else -> 0
        }
        println("Damage caused: $damage\n")
    }

    println()
    println()


    for (hero: Held in herosTeam) {
        val damage: Any = when (hero) {
            is Krieger -> attackKrieger()
            is Meerjungfrau -> attackMeerjungfrau()
            is Magier -> {
                //val selfHealDamage: Int = hero.selfHealing()
                //println("${hero.name} Healed himself with +$selfHealDamage\n")
                //selfHealDamage
            }

            else -> 0
        }

        println("Damage caused: $damage\n")
    }




    printInfoHero(fighter)
    printInfoHero(magician)
    printInfoHero(mermaid)



    for (enemy: Gegner in enemyTeam) {
        val damage: Any = when (enemy) {
            is Endgegner -> enemy.endgegnerRandomAttack()
            else -> 0
        }
        println("Damage caused: $damage\n")
    }
    println()





    for (hero: Held in herosTeam) {
        val damage: Any = when (hero) {
            is Krieger -> hero.archeryAttack()
            is Magier -> {
                //val healingDamage: Int = hero.healingRandomTeammate(herosTeam)
                val healedHero: Held = hero.healedHero!!
                // println("${hero.name} healed '${healedHero.name}' with +$healingDamage life points\n")
                //  healingDamage
            }

            is Meerjungfrau -> hero.tridentAttack()
            else -> 0
        }

        println("Damage caused: $damage\n")
    }



    printInfoHero(fighter)
    printInfoHero(magician)
    printInfoHero(mermaid)




    for (enemy: Gegner in enemyTeam) {
        val damage: Any = when (enemy) {
            is Endgegner -> enemy.endgegnerRandomAttack()
            else -> 0
        }
        println("Damage caused: $damage\n")
    }
    println()


    for (hero: Held in herosTeam) {
        val damage: Int = when (hero) {
            is Krieger -> hero.stompAttack()
            is Magier -> hero.invisibilityAttack()
            is Meerjungfrau -> hero.stinkyAttack()
            else -> 0
        }

        println("Damage caused: $damage\n")
    }



    printInfoHero(fighter)
    printInfoHero(magician)
    printInfoHero(mermaid)



    for (enemy: Gegner in enemyTeam) {
        val damage: Any = when (enemy) {
            is Endgegner -> enemy.endgegnerRandomAttack()
            else -> 0
        }
        println("Damage caused: $damage\n")
    }


    println()


    printInfoHero(fighter)
    printInfoHero(magician)
    printInfoHero(mermaid)

    /*
        attackKrieger()
        attackMagier()
        attackMeerjungfrau()
        helferRandomAttack()
        endgegnerRandomAttack()
    */


    for (hero: Held in herosTeam) {
        val damage: Any = when (hero) {
            is Krieger -> attackKrieger()
            is Magier -> attackMagier()
            is Meerjungfrau -> attackMeerjungfrau()
            else -> 0
        }

        println("Damage caused: $damage\n")
    }


    printInfoHero(fighter)
    printInfoHero(magician)
    printInfoHero(mermaid)}
fun main() {

infoAfterRound(fighter, magician, mermaid)


println("\nThe Heros team starts the fight...\n")

for (hero: Held in herosTeam) {
    val damage: Int = when (hero) {
        is Krieger -> hero.uppercutAttack()
        is Magier -> hero.magicBallAttack()
        is Meerjungfrau -> hero.screamAttack()
        else -> 0
    }

    println("Damage caused: $damage\n")
}


bag.printBagItems()


println("${randomHero.name}: opened the bag")
bag.use(randomHero)
printInfoHero(randomHero)

bag.printBagItems()


printInfoHero(fighter)
printInfoHero(magician)
printInfoHero(mermaid)

for (enemy: Gegner in enemyTeam) {
    val damage: Any = when (enemy) {
        is Endgegner -> enemy.endgegnerRandomAttack()
        else -> 0
    }
    println("Damage caused: $damage\n")
}

println()
println()


for (hero: Held in herosTeam) {
    val damage: Any = when (hero) {
        is Krieger -> attackKrieger()
        is Meerjungfrau -> attackMeerjungfrau()
        is Magier -> {
            //val selfHealDamage: Int = hero.selfHealing()
            //println("${hero.name} Healed himself with +$selfHealDamage\n")
            //selfHealDamage
        }

        else -> 0
    }

    println("Damage caused: $damage\n")
}




printInfoHero(fighter)
printInfoHero(magician)
printInfoHero(mermaid)



for (enemy: Gegner in enemyTeam) {
    val damage: Any = when (enemy) {
        is Endgegner -> enemy.endgegnerRandomAttack()
        else -> 0
    }
    println("Damage caused: $damage\n")
}
println()





for (hero: Held in herosTeam) {
    val damage: Any = when (hero) {
        is Krieger -> hero.archeryAttack()
        is Magier -> {
            //val healingDamage: Int = hero.healingRandomTeammate(herosTeam)
            val healedHero: Held = hero.healedHero!!
           // println("${hero.name} healed '${healedHero.name}' with +$healingDamage life points\n")
          //  healingDamage
        }

        is Meerjungfrau -> hero.tridentAttack()
        else -> 0
    }

    println("Damage caused: $damage\n")
}



printInfoHero(fighter)
printInfoHero(magician)
printInfoHero(mermaid)




for (enemy: Gegner in enemyTeam) {
    val damage: Any = when (enemy) {
        is Endgegner -> enemy.endgegnerRandomAttack()
        else -> 0
    }
    println("Damage caused: $damage\n")
}
println()


for (hero: Held in herosTeam) {
    val damage: Int = when (hero) {
        is Krieger -> hero.stompAttack()
        is Magier -> hero.invisibilityAttack()
        is Meerjungfrau -> hero.stinkyAttack()
        else -> 0
    }

    println("Damage caused: $damage\n")
}



printInfoHero(fighter)
printInfoHero(magician)
printInfoHero(mermaid)



for (enemy: Gegner in enemyTeam) {
    val damage: Any = when (enemy) {
        is Endgegner -> enemy.endgegnerRandomAttack()
        else -> 0
    }
    println("Damage caused: $damage\n")
}


println()


printInfoHero(fighter)
printInfoHero(magician)
printInfoHero(mermaid)

/*
attackKrieger()
attackMagier()
attackMeerjungfrau()
helferRandomAttack()
endgegnerRandomAttack()
*/


for (hero: Held in herosTeam) {
    val damage: Any = when (hero) {
        is Krieger ->   attackKrieger()
        is Magier ->     attackMagier()
        is Meerjungfrau -> attackMeerjungfrau()
        else -> 0
    }

    println("Damage caused: $damage\n")
}


printInfoHero(fighter)
printInfoHero(magician)
printInfoHero(mermaid)


}





---------------------------------------------
    for (hero: Held in herosTeam) {
    val damage: Int = hero.aktion2()

    when {
        hero == magician -> {
            println("healing +$damage\n ")
            magician.hp += damage
        }

        else -> {
            println("Damage caused $damage\n")
        }
    }
}




---------------------------------------------
    for (hero: Held in herosTeam) {
    val damage: Int = hero.aktion3()

    when (hero) {
        is Magier -> {
            val healedHero: Held = hero.healedHero!!
            if (healedHero != null) {
                println("${healedHero.name} healed with +$damage\n")
                healedHero.hp += damage
                println("${healedHero.name}'s updated health: ${healedHero.hp}\n")
            }
        }

        else -> {
            println("${hero.name} caused $damage Damage\n")
        }
    }
}

/*
fun printEnemyHP(enemies: List<Gegner>) {
    println("Enemies' HP:")
    for (enemy in enemies) {
        println("${enemy.name}: ${enemy.hp}")
    }
}
fun printHeroHP(heroes: List<Held>) {
    println("Heroes' HP:")
    for (hero in heroes) {
        println("${hero.name}: ${hero.hp}")
    }
}
fun helferRandomAttack(): Int {
    return helper.helperRandomAttack()
}

fun endgegnerRandomAttack(): Int {
    return finalBoss.endgegnerRandomAttack()
}


finalBoss.hp = maxOf(0, finalBoss.hp - damage)


 */
 //printInfo(fighter)
//printInfo(archer)




 */

/*

//Healing a random teammate
fun healing(herosTeam: List<Held>) {
        val damage: Int = healingRandomTeammate(herosTeam)

        when (healedHero) {
            is Krieger, is Meerjungfrau ->  {
                println("${healedHero!!.name} healed with +$damage\n")
                healedHero!!.hp += damage
                println("${healedHero!!.name}'s updated health: ${healedHero!!.hp}\n")
            }

            else -> {
                println("No healing target or unsupported hero type\n")
            }
        }
    }

    --------------------------------------
println("$name Jumps high And attacks the enemy from the sky")
    val randomDame: Int = (10..40).random()
    return randomDame
}
 */


 */