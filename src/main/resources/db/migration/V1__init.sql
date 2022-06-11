CREATE TABLE IF NOT EXISTS player (
    idplayer SERIAL,
    nombre VARCHAR (100),
    hora VARCHAR (20),
    cancha VARCHAR (55),
    PRIMARY KEY (idplayer)
);