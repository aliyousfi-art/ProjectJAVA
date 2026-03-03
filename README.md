# 🐉 Dungeon Crawler – Projet Java (inspiré de Donjons & Dragons)

## 📖 Description du projet

Ce projet est un **jeu en console développé en Java**, inspiré de l’univers des jeux de plateau **Donjons & Dragons**.

Le joueur crée un personnage et progresse sur un plateau en lançant un dé virtuel jusqu’à atteindre la dernière case.

L’objectif de ce projet est de mettre en pratique les **bases de la programmation orientée objet (POO)** en Java en structurant le code en plusieurs classes responsables chacune d’un rôle précis.

---

# 🎯 Objectifs pédagogiques

Ce projet permet de pratiquer les concepts fondamentaux de la programmation Java :

* utilisation des variables
* conditions (`if`, `switch`)
* boucles (`while`, `for`)
* tableaux
* méthodes et fonctions
* programmation orientée objet
* création de classes
* instanciation d’objets
* encapsulation (getters / setters)
* organisation du code

---

# 🏗️ Architecture du projet

Le projet est organisé selon le package :

```
fr.campus.dungecrawler
```

Structure principale :

```
src/
└── fr/campus/dungecrawler
    ├── Main.java
    ├── Game.java
    ├── Player.java
    ├── Board.java
    ├── Dice.java
    ├── Menu.java
    ├── OffensiveEquipment.java
    └── DefensiveEquipment.java
```

### Description des classes

**Main**

* Point d’entrée du programme
* Lance le jeu

**Game**

* Contient la logique principale du jeu
* Gère le déroulement de la partie

**Player**

* Représente le personnage du joueur
* Contient :

  * nom
  * type (Warrior / Wizard)
  * niveau de vie
  * niveau d’attaque

**Board**

* Représente le plateau de jeu
* Contient 64 cases

**Dice**

* Simule le lancer d’un dé

**Menu**

* Affiche les menus
* Gère les interactions utilisateur

**OffensiveEquipment**

* Représente une arme ou un sort

**DefensiveEquipment**

* Représente un bouclier ou une potion

---

# 🎮 Règles du jeu (version basique)

1. Le joueur crée un personnage :

   * choix du type (**Guerrier** ou **Magicien**)
   * choix du nom

2. Un menu permet ensuite de :

   * afficher les informations du personnage
   * modifier les informations
   * démarrer la partie
   * quitter le jeu

3. Déroulement de la partie :

* Le joueur commence sur la **case 1**
* À chaque tour, un **dé virtuel est lancé**
* Le personnage avance sur le plateau

4. Le plateau contient **64 cases**

5. Lorsque le joueur atteint la dernière case :

* la partie est terminée
* il peut recommencer ou quitter le jeu

*(Cette première version ne contient pas encore d’ennemis ni de combats.)*

---

# ▶️ Lancer le projet

1. Cloner le repository

```
git clone https://github.com/aliyousfi-art/ProjectJAVA.git
```

2. Ouvrir le projet dans un IDE :

* IntelliJ IDEA
* Eclipse
* Visual Studio Code

3. Lancer le fichier :

```
Main.java
```

Le jeu s’exécutera dans la **console**.

---

# 📊 Diagramme UML

Un **diagramme de classes UML** a été réalisé afin de représenter :

* les classes du projet
* leurs attributs
* leurs méthodes
* les relations entre elles

Ce diagramme évolue en même temps que le projet.

---

# 📦 Livrables du projet

Ce repository contient :

* le code source Java
* le diagramme UML
* les classes commentées
* un glossaire des syntaxes Java utilisées

---

# 👨‍💻 Auteur

Projet réalisé dans le cadre d’un exercice de programmation Java.

