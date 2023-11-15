# OuardineControlJEE
## Introduction
Ce projet est une application de gestion qui permet de gérer des articles selon leurs categorie.
L'application a été développée en utilisant les technologies et outils suivantes :
Java : Langage de programmation polyvalent et orienté objet largement adopté pour le développement d'une variété d'applications, allant des solutions de bureau aux applications Web et mobiles. Sa popularité repose sur des caractéristiques telles que la portabilité, la robustesse, la sécurité et la facilité d'utilisation.

MySQL : Système de gestion de base de données relationnelle open source très répandu, MySQL est utilisé pour stocker, organiser et gérer efficacement de vastes ensembles de données. Il se distingue par sa stabilité, ses performances élevées et son large éventail de fonctionnalités, en faisant un choix privilégié pour divers types d'applications.

Hibernate : Framework de mapping objet-relationnel (ORM) en Java, Hibernate simplifie la communication entre les applications Java et les bases de données relationnelles. Il permet aux développeurs de travailler avec des objets Java plutôt qu'avec des requêtes SQL directes, simplifiant ainsi le processus de persistance des données de manière flexible.

Spring Boot : Projet du framework Spring, Spring Boot vise à simplifier la configuration et le déploiement des applications basées sur Spring. Il offre des outils et des conventions permettant de démarrer rapidement des applications avec peu de configuration manuelle. Spring Boot facilite également le développement grâce à des fonctionnalités telles que l'auto-configuration, qui configure automatiquement les composants en fonction des dépendances ajoutées.

JPA : Java Persistence API (JPA) est une spécification Java décrivant une interface de programmation pour la gestion de la persistance des données dans les applications Java. Elle offre une approche standardisée permettant aux développeurs de créer des applications Java capables de gérer de manière persistante des données relationnelles, simplifiant ainsi les interactions avec les bases de données.

Swagger : Ensemble d'outils open source facilitant la conception, la création, la documentation et la consommation de services web RESTful. Swagger automatise la génération de la documentation de l'API, améliorant la compréhension et l'utilisation des services web par d'autres développeurs. Il permet de décrire de manière claire et concise la structure et les fonctionnalités des API REST.
## Genration du base de données
<img width="570" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/2f141829-cfb5-47bb-92ad-2c967b326944"/>

## Endpoints
GET /api/v1/articles: Récupérer tous les articles.

GET /api/v1/articles/{id}: Récupérer un article par ID.

POST /api/v1/articles: Créer un nouvel article.

PUT /api/v1/articles/{id}: Mettre à jour un article par ID.

DELETE /api/v1/articles/{id}: Supprimer un article par ID.

GET  /api/v1/articles/categories : Récupérer les article d'une categorie.

GET /api/v1/categories: Récupérer toutes les catégories.

GET /api/v1/categorie/{{categorieId}}/sous-categoriesarticles : Récupérer toutes les souscatégories d'une categorie et c'est article.

GET /api/v1/categories/{id}: Récupérer une catégorie par ID.

POST /api/v1/categories: Créer une nouvelle catégorie.

PUT /api/v1/categories/{id}: Mettre à jour une catégorie par ID.

DELETE /api/v1/categories/{id}: Supprimer une catégorie par ID.
## Swagger
<img width="885" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/09796bfd-af9f-4118-b9a3-81919e4bcb43"/>
### Test quelque API

<img width="740" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/7f801862-ba7a-4e95-acc6-d44aef15767a"/>

<img width="664" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/98b6e02d-79ed-4639-a3bc-cbe4fcfec275"/>
<img width="663" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/2aa0d177-b7d7-40c5-b517-e366cbc795ed"/>
<img width="786" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/2b45a18b-fa06-4075-a513-0fc10bddf101"/>

<img width="773" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/8b54a445-312f-45bd-b258-a088ba5cdf70"/>
<img width="758" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/b53a5888-d39e-4db6-ba32-914067f3f07b"/>

<img width="835" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/73cec34b-39d3-43cc-90f7-3e5a684f7009"/>
#### Q7
<img width="820" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/a47aa893-f9e4-48f7-9141-1dbfe3e85e10"/
#### Q9
<img width="820" alt="image" src="https://github.com/NassimaOuardine/OuardineControlJEE/assets/147509426/ba39fa46-f146-4142-86bd-f9cbf2480602"/>


