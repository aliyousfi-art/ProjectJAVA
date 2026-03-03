# 🐉 Dungeon Crawler – Java Console Game

## 📖 Présentation

**Dungeon Crawler** est un jeu simple en **console Java**, inspiré de l’univers des jeux de plateau **Donjons & Dragons**.

Le joueur crée un personnage puis avance sur un **plateau de 64 cases** en lançant un dé virtuel jusqu’à atteindre la dernière case.

Ce projet a été réalisé afin de pratiquer les **fondamentaux de la programmation orientée objet en Java** : création de classes, objets, encapsulation et organisation d’un projet.

---

# 🎯 Objectifs pédagogiques

Ce projet permet de mettre en pratique :

* les variables
* les conditions (`if`)
* les boucles (`while`)
* les méthodes
* les classes et objets
* les constructeurs
* les getters et setters
* l'encapsulation
* l'organisation d'un projet Java
* l'interaction utilisateur via la console

---

# 🏗️ Architecture du projet

Le projet est organisé dans le package principal :

```text
fr.campus.dungecrawler
```

Structure du projet :

```text
src/
└── fr/
    └── campus/
        └── dungecrawler/
            ├── Main.java
            │
            ├── game/
            │   ├── Game.java
            │   ├── Board.java
            │   └── Dice.java
            │
            ├── character/
            │   └── Player.java
            │
            ├── equipment/
            │   ├── OffensiveEquipment.java
            │   └── DefensiveEquipment.java
            │
            └── setting/
                └── Menu.java
```

---

# 📦 Description des classes

### Main

Point d’entrée du programme.
Cette classe lance le jeu.

---

### Game

Contient la logique principale du jeu :

* création du personnage
* démarrage de la partie
* déplacement du joueur sur le plateau

---

### Menu

Gère l’interface utilisateur dans la console :

* affichage du menu
* récupération des choix de l’utilisateur

---

### Player

Représente le personnage du joueur.

Attributs principaux :

* type du personnage (Warrior ou Wizard)
* nom
* niveau de vie
* niveau d’attaque
* équipement offensif

---

### Board

Représente le plateau de jeu composé de **64 cases**.

---

### Dice

Simule le lancer d’un dé aléatoire entre **1 et 6**.

---

### OffensiveEquipment

Représente un équipement offensif :

* arme
* sort

Exemples :

* Sword
* Fireball

---

### DefensiveEquipment

Représente un équipement défensif :

* Shield
* Potion

---

# 🎮 Règles du jeu

1. Le joueur crée un personnage :

   * choix du type (**Warrior** ou **Wizard**)
   * choix du nom

2. Le personnage possède :

   * des points de vie
   * un niveau d’attaque
   * un équipement

3. Le joueur commence sur la **case 1 du plateau**.

4. À chaque tour :

   * un dé est lancé
   * le joueur avance sur le plateau

5. Le plateau contient **64 cases**.

6. Lorsque le joueur atteint la dernière case :

```
Bravo ! Vous avez terminé le plateau !
```

La partie est alors terminée.

---

# ▶️ Compilation et exécution

## 1️⃣ Cloner le repository

```bash
git clone https://github.com/aliyousfi-art/ProjectJAVA.git
```

Entrer dans le projet :

```bash
cd ProjectJAVA
```

---

## 2️⃣ Compiler le projet

Depuis le dossier **src** :

```bash
javac fr/campus/dungecrawler/**/*.java
```

---

## 3️⃣ Lancer le jeu

```bash
java fr.campus.dungecrawler.Main
```

---

# 🖥️ Exemple d’exécution

```
Bienvenue dans Dungeon Crawler !

1 - Nouveau Personnage
2 - Quitter le jeu

Choisissez le type du personnage :
Warrior

Quel est le nom du personnage ?
Coco

Personnage créé :
| Type: Warrior | Name: Coco | LifeLevel: 10 | AttackLevel: 10 |

La partie commence !

Vous avez fait : 4
Vous êtes sur la case : 5 / 64
...
Bravo ! Vous avez terminé le plateau !
```

---

# 📊 Diagramme UML

Le projet est accompagné d’un **diagramme UML** représentant :

* les différentes classes
* leurs attributs
* leurs méthodes
* les relations entre elles

Ce diagramme est disponible dans le repository.

---

# 🛠 Technologies utilisées

* **Java**
* **Programmation Orientée Objet**
* **Console CLI**
* **Git / GitHub**

---

# 👨‍💻 Auteur

Projet réalisé par **Ali Yousfi** dans le cadre d’un exercice de programmation Java.


