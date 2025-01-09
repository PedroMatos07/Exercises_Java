In a combat game, each player controls a champion. Each champion has a name, attack power, armor, and health. The combat between two champions is organized in turns, where in each turn, both champions attack each other. You need to create a program to instantiate two champions, then execute N turns of combat, showing the state of each champion after every turn, as shown in the examples. If, during a turn, one of the champions dies (health reaches zero), the combat should end. At the end of the combat, display "END OF COMBAT".

The rule for champion A receiving damage from champion B is as follows:

Champion A's health should be reduced by champion B's attack power, after subtracting champion A's armor. The resulting health cannot go below zero.

Regardless of champion A's armor, champion A must lose at least 1 health point.
