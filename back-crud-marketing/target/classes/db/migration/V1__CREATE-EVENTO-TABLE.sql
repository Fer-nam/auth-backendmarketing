
CREATE TABLE eventos (
    id TEXT PRIMARY KEY UNIQUE NOT NULL,
    nome  TEXT NOT NULL ,
    descricao TEXT NOT NULL,
    img TEXT NOT NULL,
    urlEvento TEXT NOT NULL
);
