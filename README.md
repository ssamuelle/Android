# Android

Zadania z hodiny Android. Kazde zadanie je vo vlastnom priecinku.

## Git: posielanie kodu do repozitara

### Prvykrat na pocitaci

```bash
git clone https://github.com/ssamuelle/Android.git
cd Android
```

### Zaciatok prace

```bash
git pull
```

### Koniec prace: poslanie kodu

```bash
git status
git add .
git commit -m "Popis zmeny"
git push
```

### Uzitocne prikazy

| Prikaz | Co robi |
|---|---|
| `git status` | Ukaze, co sa zmenilo |
| `git log --oneline` | Historia commitov |
| `git mv subor.java priecinok/` | Presunie subor |
| `git remote -v` | Ukaze, kam je repo prepojene |
| `pwd` | V ktorom priecinku som |

### Jednorazove nastavenie mena

```bash
git config --global user.name "Tvoje Meno"
git config --global user.email "tvoj@email.sk"
```

### Co znamenaju hlasky

| Hlaska | Vyznam |
|---|---|
| `nothing to commit, working tree clean` | Nie je co ukladat, vsetko je scommitovane |
| `Everything up-to-date` | Nie je co posielat |
| `rejected` / `fetch first` | Na GitHube su zmeny, ktore nemam. Spusti `git pull` a potom `git push` |
| `No configured push destination` | Repo nie je prepojene, pouzi `git remote add origin ADRESA` |

### Poradie, ktore si pamatam

`pull` -> praca -> `add` -> `commit` -> `push`

> Terminal musi byt otvoreny v priecinku s repozitarom (over cez `pwd`).
