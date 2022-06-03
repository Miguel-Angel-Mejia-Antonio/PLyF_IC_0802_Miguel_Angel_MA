padre(pedro, luis).
padre(pedro, hugo).
padre(luis, ana).
padre(hugo, cesar).
hermano(luis,hugo).
primo(ana, cesar).
tio(luis, cesar).
tio(hugo, ana).

abuelo(X,Y):-
    padre(X,Z), padre(Z,Y).

padres(X,Y):-
    padre(X,Y), padre(X,Y).

hermanos(X,Y):-
    hermano(X,Y), hermano(X,Y).

primos(X,Y):-
    primo(X,Y), primo(X,Y).

sobrino(X,Y):-
    tio(X,Y), tio(X,Y).
