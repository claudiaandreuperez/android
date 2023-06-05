package com.example.treball

class JugadorProvider {
    companion object {
        val jugadors_españa = listOf<Jugador>(
            Jugador("gavi","Gavi", "18", "170 cm", "60","España"),
            Jugador("pedri","Pedri", "19", "175 cm", "65","España"),
            Jugador("alba","Jordi ALba", "35", "175 cm", "75","España")
        )
        val jugadors_japo = listOf<Jugador>(
            Jugador("japones.png", "S.Gonda", "25", "170 cm", "70", "Japo"),
            Jugador("japones.png", "T.Tomiyasu", "27", "176 cm", "74", "Japo"),
            Jugador("japones.png", "M. Yoshida", "34", "174 cm", "72", "Japo"),

            )
        val jugadors_brazil = listOf<Jugador>(
            Jugador("japones.png", "Neymar", "32", "170 cm", "70", "Brazil"),
            Jugador("japones.png", "Alves", "40", "176 cm", "74", "Brazil"),
            Jugador("japones.png", "Vinicius", "23", "174 cm", "72", "Brazil"),

            )
    }
}