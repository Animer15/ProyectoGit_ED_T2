------------------------------------------------------------------------
# Herencias o inheritance


### Sobre este proyecto
El objetivo de este proyecto es tratar las herencias de clases haciendo que se vean como formas geometricas, de forma que el proyecto se estructura en formas tridimensionales y dimensionales, como son el cilindro y el cubo o el triangulo y el cuadrado respectivamente tridimensionales y dimensionales.

Este proyecto ha sido realizado con
- Java
### Como descargarlo
- Para empezar a usar el proyecto, al no tratarse de una aplicacion que interactue activamente con el usuario, será necesario que se tenga un IDE a disposición.
- Tendremos que descargar el proyecto, hay varias formas, podemos `clonar`el proyecto desde `Git` y su terminal o podemos descargarlo desde la interfaz gráfica de `GitHub`, en cualquier caso el proyecto funcionará igual
	- Para clonar el proyecto desde la terminal debes abrir el lugar en el que guardaras el proyecto con `cd direccion en tu ordenador` y usar `git clone [direccion url] `y ya se descargará todo el proyecto
	- Para descargarlo desde la interfaz grafica debemos hacer click en el botón `code`y a **download zip** 	
![image](https://user-images.githubusercontent.com/79007014/109994085-40caa000-7d0d-11eb-9886-a555a72e8d2c.png)


---

### Como usarlo
- Realmente no tiene demasiada complicación el uso del proyecto, como ya he explicado arriba es una cadena de herencias en **JAVA** y para poder usarla en cualquier otro proyecto se va a necesitar un IDE que soporte el lenguaje de programación usado, NetBeans o Eclipse por ejemplo. En cualquier caso corre a cuenta del IDE que prefieras.
- Además vamos a asegurar que tenemos java instalado y su JDK. Para asegurarnos de que Java está instalado abriremos la terminal de Windows y escribiremos `java -version`, en caso de que no esté instalado debemos ir a la pagina de Oracle e instalarlo al igual que el JDK

Para mas información sobre el uso de la clase puedes acceder a la documentación de estas que vendrán junto con el proyecto

---
### Como contribuir
GitHub es conocido por su comunidad abierta y como contribuyen todos los usuarios en otros proyectos así que, si quieres contribuir se puede hacer asi :

1.  Haz una bifurcación del proyecto en tu ordenador
2.  Crea tu propia rama en tu repositorio(`git checkout -b feature/AmazingFeature`)
3.  Haz commit a tus cambios (`git commit -m 'Add some AmazingFeature'`)
4.  Haz Push a tu rama (`git push origin feature/AmazingFeature`)
5.  Abre una `"pull request"`, esto hará que todos puedan ver los cambios que propones y aprobarlos en caso de querer llevarlos a la rama principal
---
Este proyecto es una version en español de el usuario Patrik Patel en GitHub
---

### Instricciones Git y GitHub.
-- Para saber version y rama "Branche".
1. git --version //Para saber la version instalado.
2. git branch master // Rama principale.
3. git branch deriver // Creando una rama personal.
4. git branch -d 'derivado' o git br -d // Susponder la rama.
5. git branch // Para saber en que rama estoy.
6. git checkout nombre_de_mi_rama // Para saber mi posicion en mi rama. 
---

-- Para identificar a Git:
01. git config --global user.name "Animer15" // Mi nombre.
02. git config --global user.email "coreo@....." // Coreo electronico.
03. git config -l
04. git init // Nuevo referencial git dentro mi directorio.
05. git status // Saber que pasa dentro mi direcorio.
06. git add mi_fichero ou git add .// Añadir ficheros por un commit.
07. git commit --mensage o -m "Mi_mensage", Lansar un commit con un mensage de descripcion.
08. git log // listar todos las commits.
09. git diff // Saber cambios entre mi 1er y 2d version.
10. git diff master..deriver // Saber cambios realizar entre mi 1er y 2 version dentro las dos ramas.
---

Para eleminar parametros personal del usuario:
1. git config --global --unset user.name
2. git config --global --unset user.email
-- Eleminar todo una vez:
3. git config --global --unset-all
---

Para trabajar a Github:
1. git remote -v // Comprobar si tenemos una Remote.
2. git remote add Origin https://github.com/[username]/[nombre_dispositivo].git
3. git push origin master // Para añadir mi poyecto a "Github", Toma dos parametros.
	// Origin: Serbidor por defecto de Github.
	// master: El nombre de mi rama.
4. git pull origin master // Para recuperar mi trabajo en local.
5. git fetch // Para recuperar trabajo de otra persona.
---

