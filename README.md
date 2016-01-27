# LOG8430-TP1 : Mise en Oeuvre d'une Architecture Logicielle et Chargement Dynamique
## Option 1 : Gestion de fichier
Alexandre Chenieux - Thomas Neyraut - Alexandre Pereira

    Ce logiciel permet d'exécuter des commandes sur des dossiers et des fichiers. Une arborescence permet à l'utilisateur de naviguer à travers les dossiers et les fichiers. Pour pouvoir exécuter une commande l'utilisateur doit préalablement sélectionner un dossier ou un fichier. Initialement, la racine sélectionnée par le logiciel et le répertoire "Home" de l'utilisateur. Enfin via l'interface graphique, l'utilisateur peut choisir une autre racine pour l'arborescence.

    Certaines commandes ne peuvent être exécuter que pour des fichiers ou des dossiers. Dans ce cas, l'interface graphique s'adapte et certaines commandes sont "grisées" et désactivées. Si l'option "AutoRun" est activé, l'exécution des commandes accessibles est automatique dès la sélection d'un dossier ou d'un fichier. Enfin, un bouton clear permet d'effacer les différents résultats des commandes.

    Les commandes sont chargés automatiquement au lancement du logiciel via le dossier "commands" qui contient l'ensemble des fichiers .class définissant les commandes. L'utilisateur peut utiliser l'interface Command.java afin de concevoir ses propres commandes. Une fois une commande implémentée, il faut build le fichier afin d'obtenir le fichier .class et l'ajouter au dossier "commands". Si l'utilisateur le souhaite, il est possible de modifier le dossier "commands" au cours de l'exécution du logiciel. La liste des commandes se met automatiquement à jour.

### Have Fun !
